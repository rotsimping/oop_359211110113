package ooplat5;

import java.util.ArrayList;

public class myArrayList {
    public static void main (String[] args){
        //ArrayList
        ArrayList list = new ArrayList();
        String name = "JOY";
        list.add(name);
        System.out.println(list);
        list.add("SA");
        list.add("MOS");
        System.out.println(list);
        list.add(2,"YU");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("MOS");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("SA"));


    }//main
}//class