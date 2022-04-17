///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lecture5.exercises.ex1;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.Vector;
////import lab4.q2.Car;
//
///**
// *
// * @author fred
// */
//class App {
//
//    public App() {
//    }
//
//    void run() {
//        ArrayList numbers=new ArrayList();
//        Collection numbersVector=new Vector();
//
//        int x=10;
//        Integer x2=new Integer(20);
//        Double x3=new Double(2.3);
//        Float x4=new Float(1.2);
//        Long x5=1111111111L;
//        String name="Joe";
//
//        numbers.add(x);
//        numbers.add(x2);
//        numbers.add(x3);
//        numbers.add(x4);
//        numbers.add(x5);
//        numbers.add(name);
//
//        // parameterized types
//        Collection<Integer> marbleBags=new ArrayList<Integer>();
//        marbleBags.add(new Integer(10));
//        marbleBags.add(new Integer(12));
//        marbleBags.add(new Integer(16));
//        marbleBags.add(new Integer(20));
//        marbleBags.add(new Integer(120));
////        marbleBags.add(new Integer(10.5));
//
//        Collection usedCarlot=new ArrayList<Car>();
//        Car mustang=new Car("Ford", "Mustang");
//        Car camaro=new Car("Chevy","Camaro");
//
//        for(int i=0;i<numbers.size();i++){
//            System.out.println(numbers.get(i));
//        }
//        Iterator it=numbers.iterator();
//
//        while(it.hasNext()){
//            Object num = it.next();
//            System.out.println(num);
//        }
//
//        for(Object o:numbers)
//            System.out.println(o);
//
//        Object num3=numbers.get(2);
//        numbers.remove(num3);
//
//        for(Object o:numbers)
//            System.out.println(o);
//
//
//    }
//
//}
