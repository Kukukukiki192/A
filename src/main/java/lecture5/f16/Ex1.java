/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5.f16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author fcarella
 */
public class Ex1 {

    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        List<String> list2=new ArrayList();
        List list3=new Vector();
        Collection<Integer> list4=new ArrayList<>();
        
        // I can put any object in list1
        list1.add(new String("Firstname"));
        list1.add(new String("Firstname"));
        list1.add(10);
        list1.add(new Double(123.45));
        
        // cant do it, list 2 is parameterized
        // I can only put strings in there
        list2.add(new String("Firstname"));
        list2.add(new String("Firstname"));
//        list2.add(10);
//        list2.add(new Double(123.45));

//    if(list1.isEmpty())

//        List list5=new List();

        // iterate thru list via an index
        Integer sum=new Integer(0);
        for(int i=0;i<list1.size();i++){
            Object o=list1.get(i);
            if(o instanceof Integer)
                sum+=(Integer)(o);
            System.out.println(o);
            System.out.println("sum="+sum);

        }
        
        // iterate thru list via a for each loop (no index)
        for(String s:list2){
            System.out.println("s="+s);
        }


        // iterate thru list via an Iterator
        Iterator<String> it=list2.iterator();
        while(it.hasNext()){
            String s=it.next();
        }
        
        
    }
    
}
