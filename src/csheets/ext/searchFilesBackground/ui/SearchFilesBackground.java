package csheets.ext.searchFilesBackground.ui;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author i120388
 */
public class SearchFilesBackground {

    public SearchFilesBackground() {
    }
    
    //METODOS AUXILIARES

    /*
     Metodo base implementado no use case 76 que permite pesquisar ficheiros cujo o nome obedece a uma padrao(pattern),
     atraves de expressoes regulares, no diretorio(dir).
     Alteracao no metodo de comparacao de nomes, em vez de verificar se contem o pattern, verfica se obedece a uma expressao regular.
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

    /**
     * Este metodo que invoca um metodo e recebe todos os ficheiros encontrados
     * e retorna o nome desses. Caso nao encontre nenhum ficheiro retorna null.
     */
    public static String[] searchNames(String pattern, String dir) {
        File dirr = new File(dir);
        File[] files = searchFiles(pattern, dirr);
        if (files == null || files.length == 0 || dir == null || dir.length() == 0) {
            return null;
        }
        String[] paths = new String[files.length];

        for (int i = 0; i < files.length; ++i) {
            paths[i] = files[i].getName();
        }

        if (paths == null || paths.length == 0) {
            return null;
        }
        return paths;
    }
    
    //METODO RESPONSAVEL PELA CRIACAO DA THREAD
    public String[] searchFilesBackground(final String pattern, final String dir){
        
        class ParallelSearch implements Runnable {
            
            String pattern;
            String dir;
            String[]results;

            public ParallelSearch(String pattern, String dir) {
                this.pattern = pattern;
                this.dir = dir;
            }
            
            public String[] getResults(){
                return results;
            }
            
            @Override
            public void run() {
                results=searchNames(pattern, dir);
            }
            
        }
        
        ParallelSearch parallel=new ParallelSearch(pattern,dir);
        Thread thread=new Thread(parallel);
        thread.start();
        
        return parallel.getResults();        
    }

}
