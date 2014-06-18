/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchFilesByContent.ui;

import csheets.ext.searchFilesBackground.ui.UIExtensionSearchFilesBackground;
import java.io.File;
import java.io.FileFilter;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class SearchFilesByContent {
    
    public SearchFilesByContent() {
    }
    
    public void searchFilesBackground(final String pattern, final String dir, UIExtensionSearchFilesBackground extension) {

        class ParallelSearch implements Runnable {

            String content;
            String pattern = ".txt";
            String dir;
            String[] results;
            UIExtensionSearchFilesBackground extension;

            public ParallelSearch(String pattern, String dir, UIExtensionSearchFilesBackground extension) {
                this.pattern = pattern;
                this.dir = dir;
                this.extension = extension;
            }

            public String[] getResults() {
                return results;
            }

            @Override
            public void run() {
                //extension.cleanList();
                boolean flag = false;
                Stack<File> stack = new Stack<File>();
                File startingDirectory = new File(dir);
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
                        extension.addFileName(child.getName());
                        flag = true;
                    }
                }
                if (flag == false) {
                    extension.noFileFound();
                }
                JOptionPane.showMessageDialog(null, "File Search Finished!", "Search", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        ParallelSearch parallel = new ParallelSearch(pattern, dir, extension);
        Thread thread = new Thread(parallel);
        thread.start();

    }

    
    
    
    
}
