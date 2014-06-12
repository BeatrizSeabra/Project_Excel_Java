
package csheets.ext.beanshell;

import bsh.EvalError;
import bsh.Interpreter;
/**
 *
 * @author Fabio Carvalho 1121228
 */

public class BsInterpreter {
        
   Interpreter i = new Interpreter();  // Instancia o interpretador
       
    public String Execute(String macro) throws EvalError{

        //obtem o resultado do script
        try{
            i.eval("script="+macro);
        }catch(EvalError evlx)
        {
            return macro;
        }
        return i.get("script").toString();
    }
}