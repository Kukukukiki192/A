/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fcarella
 */
public class ArrayListObjectPersistence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Generics
        List<String> names=new ArrayList<String>();
        for(int i=0;i<10;i++){
            names.add("Firstname"+i+" Lastname"+i);
        }

        for(String name:names){
            System.out.println(name);
        }
        try {
            FileOutputStream saveFile = new FileOutputStream("ArraylistObjectPersistence.sav");
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(names);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArrayListObjectPersistence.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArrayListObjectPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<String> namesIn = null;
        try {
            FileInputStream saveFileIn = new FileInputStream("ArraylistObjectPersistence.sav");
            ObjectInputStream restore = new ObjectInputStream(saveFileIn);
            namesIn = (ArrayList<String>) restore.readObject();
        } catch (Exception ex) {
            Logger.getLogger(ArrayListObjectPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------");
        for(String name:namesIn){
            System.out.println(name);
        }
        System.out.println("-----------------------------------");
    }

}
