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
import java.util.List;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class that receives the directory and the extension pattern to find workbook
 * files on the directory. The search will be done by a thread. The results will
 * be sent to a JFrame as files are found.
 *
 * @author Diogo Moreira (1120339)
 */
public class AdvancedWorkbookSearch {

    public AdvancedWorkbookSearch() {
    }

    /**
     * Method that takes as arguments the "startingDirectory" where you want to
     * search for workbook files, and a parameter "pattern" with the desired
     * file extension. It's a recursive method that searches for workbook files
     * on the directory and its subdirectories. As files are found the results
     * will be shown in a JFrame. This method runs on a parallel thread.
     *
     * @param startingDirectory
     * @param pattern
     */
    public void advancedWorkbookSearch(final File startingDirectory, final String pattern, JFrameWorkbookSearchResults workbookSearchResults) {

        class ParallelSearch implements Runnable {

            File startingDirectory;
            String pattern;
            JFrameWorkbookSearchResults workbookSearchResults;

            public ParallelSearch(final File startingDirectory, final String pattern, JFrameWorkbookSearchResults workbookSearchResults) {
                this.pattern = pattern;
                this.startingDirectory = startingDirectory;
                this.workbookSearchResults = workbookSearchResults;
            }

            @Override
            public void run() {
                boolean flag=false;
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
                        workbookSearchResults.updateInformation(child);
                        flag=true;
                    }
                }
                if(!flag){
                    JOptionPane.showMessageDialog(null,"No workbooks were found in this directory!");
                }
            }
        }
        Thread thread = new Thread(new ParallelSearch(startingDirectory, pattern, workbookSearchResults));
        thread.start();
    }
}
