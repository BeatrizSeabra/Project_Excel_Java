/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.findworkbooksfiles;

import csheets.ext.findworkbooksfiles.ui.JFrameWorkbookSearchResults;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Class that receives the directory and the extension pattern to find workbook
 * files on the directory. The search will be done by a thread. The results will
 * be sent to a JFrame.
 *
 * @author Luís Abreu 1120546
 */
public class FolderMonitor {

    public FolderMonitor() {
    }

    /**
     * Method that takes as arguments the "startingDirectory" where you want to
     * search for workbook files, and a parameter "pattern" which is a regex
     * expression that indicates the file extension. The method searches for
     * workbook files on the directory and its subdirectories. As files are
     * found the results will be shown in a JFrame. This method runs on a
     * parallel thread and automatically updates the results list every second .
     *
     * @param startingDirectory
     * @param pattern
     */
    public void FolderMonitor(final File startingDirectory, final String pattern, JFrameWorkbookSearchResults workbookSearchResults){

        class ParallelSearch implements Runnable {

            File startingDirectory;
            String pattern;
            JFrameWorkbookSearchResults workbookSearchResults;
            ArrayList<File> array = new ArrayList();

            public ParallelSearch(final File startingDirectory, final String pattern, JFrameWorkbookSearchResults workbookSearchResults) {
                this.pattern = pattern;
                this.startingDirectory = startingDirectory;
                this.workbookSearchResults = workbookSearchResults;
            }

            @Override
            public void run() {
                Stack<File> stack = new Stack<File>();
                stack.push(startingDirectory);
                while (!stack.isEmpty()) {
                    File child = stack.pop();
                    if (child.isDirectory()) {
                        File[] sub = child.listFiles(new FileFilter() {
                            @Override
                            public boolean accept(File pathname) {
                                return (pathname.isDirectory() || pathname.getName().matches(pattern));
                            }
                        });
                        if (!(sub == null)) {
                            for (File fileDirectory : sub) {
                                stack.push(fileDirectory);
                            }
                        }
                    } else if (child.isFile()) {
                        array.add(child);

                    }
                }
                workbookSearchResults.clearInformation();
                for (File f : array) {
                    workbookSearchResults.updateInformation(f);
                }
                array.clear();
                run();
            }
        }
        Thread thread = new Thread(new ParallelSearch(startingDirectory, pattern, workbookSearchResults));
        thread.start();
    }
}
