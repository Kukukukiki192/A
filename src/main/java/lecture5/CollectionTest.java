/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import lecture4.car.Car;

/**
 *
 * @author fcarella
 */
public class CollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List numbers=new ArrayList();
        Integer n1=new Integer(10);
        Double n2=new Double(2.2);
        String s="hello";
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(s);

        for(Object number:numbers){
            System.out.println(number);
        }
        for(int j=0;j<numbers.size();j++){
            System.out.println(numbers.get(j));
        }

        Iterator it=numbers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Generics
        List<String> names=new ArrayList<String>();
        for(int i=0;i<10;i++){
            names.add("Firstname"+i+" Lastname"+i);
        }

        for(String name:names){
            System.out.println(name);
        }


    }

}
