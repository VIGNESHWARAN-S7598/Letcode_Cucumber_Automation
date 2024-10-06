package PageObjects;

import io.cucumber.java.sl.In;

import java.util.*;
import java.util.stream.Collectors;

public class Amazon {
    public static void main(String[] args) {

        String a[] = {"1 2 50", "1 3 70", "1 3 20", "2 2 17","2 9 4","1 5 23"};
        List<List<String>> b = new ArrayList<>();
        List<List<String>> e = new ArrayList<>();
        List<String> f = new ArrayList<>();
        List<String> g = new ArrayList<>();
        int thresHold = 4;
        for (int i = 0; i < a.length; i++) {
            b.add(List.of(a[i].split(" ")));
            e.add(b.get(i).stream().distinct().collect(Collectors.toList()));
        }
        for(int i = 0; i < e.size(); i++) {
            f=e.get(i);
            for(int j=0;j<f.size();j++){
                g.add(f.get(j));
            }
        }
        Map<String,Long>tm=g.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(e);
        System.out.println(g);
        System.out.println(tm);
        for(Map.Entry<String,Long> el: tm.entrySet()) {
                if(el.getValue()>=thresHold) {
                    System.out.println(el.getKey() + "  " + el.getValue());
                }
            }

        }


    }



//4      → logs[] size n = 4
//        1 2 50 → logs = ["1 2 50", "1 7 70", "1 3 20", "2 2 17"]
//        1 7 70
//        1 3 20
//        2 2 17
//        2