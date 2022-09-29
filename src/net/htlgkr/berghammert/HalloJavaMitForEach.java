package net.htlgkr.berghammert;

import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Java");
        list.add("Mit");
        list.add("For");
        list.add("Each");
        /*
        for (String s: list
             ) {
            System.out.println(s);
        }

         */
        //list.forEach(s -> System.out.println(s));
        list.forEach(System.out::print);
    }
}
