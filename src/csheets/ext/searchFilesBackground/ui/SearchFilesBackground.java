package csheets.ext.searchFilesBackground.ui;

import java.io.File;
import java.io.FileFilter;
import java.util.Stack;

/**
 *
 * @author i120388
 */
public class SearchFilesBackground {

    public SearchFilesBackground() {
    }
    
    //METODO RESPONSAVEL PELA CRIACAO DA THREAD E DA PESQUISA DE FICHEIROS NOS DIRETORIOS E SUBDIRETORIOS
    public void searchFilesBackground(final String pattern, final String dir, UIExtensionSearchFilesBackground extension){
        
        class ParallelSearch implements Runnable {
            
            String pattern;
            String dir;
            String[]results;
             UIExtensionSearchFilesBackground extension;

            public ParallelSearch(String pattern, String dir, UIExtensionSearchFilesBackground extension) {
                this.pattern = pattern;
                this.dir = dir;
                this.extension=extension;
            }
            
            public String[] getResults(){
                return results;
            }
            
            @Override
            public void run() {
                extension.cleanList();
                boolean flag=false;
                Stack<File> stack = new Stack<File>();
                File startingDirectory=new File(dir);
                stack.push(startingDirectory);
                while (!stack.isEmpty()) {
                    File child = stack.pop();
                    if (child.isDirectory()) {
                        File[] sub = child.listFiles(new FileFilter() {
                            @Override
                            public boolean accept(File pathname) {
                                return (pathname.isDirectory() || pathname.getName().matches(pattern+".cls"));
                            }
                        });
                        if (!(sub == null)) {
                            for (File fileDirectory : sub) {
                                stack.push(fileDirectory);
                            }
                        }
                    } else if (child.isFile()) {
                        extension.addFileName(child.getName());
                        flag=true;
                    }
                }
                if(flag==false){
                    extension.noFileFound();
                }
            }
            
        }
        ParallelSearch parallel=new ParallelSearch(pattern,dir,extension);
        Thread thread=new Thread(parallel);
        thread.start();
        try{
            thread.join();
        }catch(InterruptedException ex){
            
        }
             
    }

}
