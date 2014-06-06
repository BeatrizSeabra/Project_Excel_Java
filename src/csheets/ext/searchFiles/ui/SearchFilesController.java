/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.searchFiles.ui;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1120564MarcoEstves
 */
public class SearchFilesController {

    /**
     * Este metodo invoca outro metodo e receb os ficheiros, e depois retorna o
     * nome dos ficheiros ou directorios que recebeu.
     */
    public static String[] searchNames(String pattern, String dir) {
        File dirr = new File(dir);
        File[] files = searchFiles(pattern, dirr);
        String[] paths = new String[files.length];
        //O seguinte codigo serve para pesquisar ficheiros dentro dos directorios do directorio indicado.
        //Nao esta correctamente implementado.
        /*File[] filesDirs = dirr.listFiles();
        List tempFiles = null;
        for (int i = 0; i < filesDirs.length; ++i) {
            File tempFile = filesDirs[i];
            String filename = tempFile.getName();
            if (filename.contains(pattern)) {
                tempFiles.add(filename);
            }
            if (tempFile.isDirectory() && !filename.equals(".") && !filename.equals("..")) {
                searchNames(pattern, filename);
            }
        }*/
        for (int i = 0; i < files.length; ++i) {
            if (files[i].isDirectory()) {
                paths[i] = files[i].getName() + "-------------------- Is a Directory!!";
            } else {
                paths[i] = files[i].getName();
            }
        }
        if (paths == null || paths.length == 0) {
            JOptionPane.showMessageDialog(null, "No files", "Search Results", JOptionPane.ERROR_MESSAGE);
        }
        return paths;
    }

    /**
     * Este metodo e utilizado para pesquisar dos ficheiros cujo nome obdece a
     * um padrao escolhido pelo utilizador(pattern), dentro de um directorio
     * tambem escolhido pelo utilizador(dir).
     */
    public static File[] searchFiles(final String pattern, File dir) {

        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.contains(pattern);
            }
        };
        File[] files = dir.listFiles(filter);
        return files;
    }
}
