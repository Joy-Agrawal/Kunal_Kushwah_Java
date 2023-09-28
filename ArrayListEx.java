package KunalKushwahJava;

import java.lang.module.FindException;
import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(57);
        list.add(65);
        list.add(77);
        list.add(1001);
        System.out.println(list);
//        updating list item at a particular index
        list.set(0,151);
        System.out.println(list);
//        removing list item at any particular index
        list.remove(2);
        System.out.println(list);
        // Taking input from user
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        //Acces list item at particular index
        System.out.println(list.get(5));
        System.out.println(list.contains(65));
        int [] arr={10,20,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(arr));
    }

}
