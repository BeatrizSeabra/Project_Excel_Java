/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findworkbooksfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileFilter;

/**
 * Class that receive the directory and the extension pattern to find for workbooks
 * files on the directory, and results the list with the founded files.
 * @author 1090675 - Tiago Pereira
 */
public class FindWorkbooksFiles {
    
    /**
     * Method that takes as arguments the "startingDirectory" where you want to search for 
     * the workbooks files, and a parameter "pattern" with the desired file extension. 
     * It's a recursive method that searches for workbooks files on the directory and on 
     * the subdirectories, lastly returns a list with founded files.
     * @param startingDirectory
     * @param pattern
     * @return listingFiles
     * @throws java.lang.NullPointerException
     */
    public List<File> findWorkbooksFiles(final File startingDirectory, final String pattern)
            throws java.lang.NullPointerException
    {
        List<File> listingFiles = new ArrayList<>();
        try
        {            
            if (startingDirectory.isDirectory()) 
            {
                File[] sub = startingDirectory.listFiles(new FileFilter() 
                {
                    @Override
                    public boolean accept(File pathname) 
                    {  
                        return pathname.isDirectory() || pathname.getName().matches(pattern);
                    }
                });
                for (File fileDirectory: sub)
                {
                    if (fileDirectory.isDirectory()) 
                    {
                        // add on list<File> a sub directory of the main directory,
                        // using an recursive method to find again on the others subdirectories
                        listingFiles.addAll(findWorkbooksFiles(fileDirectory, pattern));
                    }
                    else 
                    {
                        // add on list<File>, a valid workbook file
                        listingFiles.add(fileDirectory);
                    }
                }
            }
       }
       catch(NullPointerException e)
       {     
           e.getMessage();
       }
       return listingFiles;
    }
  
}