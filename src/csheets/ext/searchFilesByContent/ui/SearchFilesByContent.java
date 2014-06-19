/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchFilesByContent.ui;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class SearchFilesByContent {
    
    public SearchFilesByContent() {
    }
    
    public void searchFilesByContent(final String content, final String dir, UIExtensionSearchFilesByContent extension) {

        class ParallelSearch implements Runnable {

            String content;
            String pattern = "[a-z ]*\\.txt";
            String dir;
            String[] results;
            UIExtensionSearchFilesByContent extension;

            public ParallelSearch(String content, String dir, UIExtensionSearchFilesByContent extension) {
                this.content = content;
                this.dir = dir;
                this.extension = extension;
            }

            public String[] getResults() {
                return results;
            }

            @Override
            public void run() {
                extension.cleanList();
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
                        try {
                            if(hasContent(child, content)){
                                extension.addFileName(child.getName());
                                flag = true;
                            }
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(SearchFilesByContent.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if (flag == false) {
                   extension.noFileFound();
                    System.out.println("files not found");
                }
                JOptionPane.showMessageDialog(null, "File Search Finished!", "Search", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        ParallelSearch parallel = new ParallelSearch(content, dir, extension);
        Thread thread = new Thread(parallel);
        thread.start();

    }
    private boolean hasContent(File ref, String content) throws FileNotFoundException{
        
        Scanner scanner = new Scanner(ref);
       if (scanner.findWithinHorizon(content, 0) != null) {
            return true;
        }
       scanner.close();
    return false;
    }
    }
