/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author fcarella
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Collection Interface

        // A collection can be a List or a Set or another collection.
        // here we create an ArrayList collection of objects
        // create a collection object called numbers.  It'll hold numbers, duh
        Collection numbers=new ArrayList();

        // what kind of numbers?  Any kind.
        // create an integer and a double
        Double d=new Double(2.2);
        Integer i=new Integer(2);

        // you can add objects of different types to the collection.
        // an object of a given type is upcasted to an Object, so a collection holds objects of type Object, regardless of what the original type was.
        //
        numbers.add(d);
        numbers.add(i);

        // traversing a collection

        // method 1 using a for each loop
        for(Object number:numbers){
            System.out.println(number);
        }

        // method 2 using iterators
        Iterator it=numbers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // Set.  Cannot contain duplicates

        Set<String> s = new HashSet<String>();
        if (!s.add("Gille Larock"))
            System.out.println("Duplicate detected: " + "Gille Larock already added");
        if (!s.add("Noell Hall"))
            System.out.println("Duplicate detected: " + "Noel Hall already added");
        if (!s.add("Noell Hall"))
            System.out.println("Duplicate detected: " + "Noel Hall already added");

        System.out.println(s.size() + " distinct words: " + s);


        // Lists
        // create and traverse a list
        List numberList=new ArrayList();
        numberList.add(new Integer(1));
        numberList.add(new Double(4.4));
        // traverse with a for each loop
        for(Object o:numberList)
            System.out.println(o);

        // traverse with iterators
        it=numberList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // traverse with a for loop
        // List interface supports get()
        for(int k=0;k<numberList.size();k++)
            System.out.println(numberList.get(k));

        // Lists can contain duplicates

        List names=new ArrayList();
        names.add("Noel Hall");
        names.add("Gilles Larock");
        names.add("Gilles Larock");// no error


        // problem!  When we get objects from a collection we need to cast them back to they're original type.

        // use generics
        // namesList can ONLY contain Strings
        List<String> namesList=new ArrayList<String>();
        namesList.add("Noel Hall");
        namesList.add("Gilles Larock");
        namesList.add("Gilles Larock");// no error
        // traverse the list
        for(String ss:namesList)
            System.out.println(ss);

        //
        List<Double> realNumbers=new ArrayList<Double>();
        realNumbers.add(new Double(3.3));
        // cant add ann integer, get compile error
//        realNumbers.add(new Integer(8));

    }

}
