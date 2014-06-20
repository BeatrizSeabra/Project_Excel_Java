package csheets.ext.editMacro.compiler;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author i120388
 */
public class Macros implements Serializable {

    private ArrayList<Macro> macros;

    public Macros() {
        macros = new ArrayList<>();
    }

    public ArrayList<Macro> getMacros() {
        return macros;
    }

    public void add(Macro macro) {
        macros.add(macro);
    }

    public void remove(Macro macro) {
        macros.remove(macro);
    }

    public void write() throws IOException {
        ObjectOutputStream out;  
        out = new ObjectOutputStream(new FileOutputStream(new File("macros.m")));
        out.writeObject(macros);
        out.close();
    }

    public void read() throws IOException, ClassNotFoundException {
        
        ObjectInputStream in;
        in = new ObjectInputStream(new FileInputStream(new File("macros.m")));
        macros.addAll((ArrayList<Macro>) in.readObject());
        in.close();
    }
}
