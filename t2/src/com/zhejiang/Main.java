package com.zhejiang;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int i1 = 11;
        Integer in1 = i1;
        int i2 = in1;
        int[] a1 = new int[5];

        for(int i = 0;i < a1.length;i++){
            a1[i] = i+1;
        }

        int index = 0;
        for(int v: a1){
            //System.out.println(String.format("v[%d]:%d",index,v));
            index++;
        }
        //容器（cllection）
        //Set treeSet,HashSet,LinkHashSet
        Set<Integer> s1 = new HashSet<>();
        //add
        s1.add(11);
        s1.add(22);
        s1.add(33);
        s1.add(33);
        for(Integer i:s1){
            //System.out.println("s:"+i);
        }
        //edit,get

        //del
        s1.remove(0);
        for(Integer i:s1){
            //System.out.println("sd:"+i);
        }

        //Array list,Vector,LinkedList
        List<Integer> l1 = new LinkedList<>();
        //add
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(33);
        for(Integer i:l1){
            //System.out.println("l:"+i);
        }
        //edit,get
        for(int i = 0;i < l1.size();i++){
            if(l1.get(i)==33){
                l1.set(i,44);
            }
        }
        //del
        l1.remove(0);
        for(Integer i:l1){
            //System.out.println("ld:"+i);
        }



        //LinkedList,PriorityQueue

        //Map
        //TreeMap,HashMap,HashTable,LinkdHashMap
        HashMap<Integer,String> m1 = new HashMap<>();
        //add
        m1.put(11,new String("s1"));
        m1.put(22,new String("s2"));
        m1.put(33,new String("s3"));
        //edit
        m1.forEach((k,v)->System.out.println("m1:"+k+":"+v));
        m1.forEach((k,v)->{
            if(v.equals("s3")){
                m1.replace(k,"s4");
            }
        });
        m1.forEach((k,v)->System.out.println("m2:"+k+":"+v));
        //del
        AtomicInteger delKey = new AtomicInteger();
        m1.forEach((k,v)->{
           if(v.equals("s1")){
               delKey.set(k);
           }
        });
        System.out.println("d:"+delKey);
        m1.remove(delKey.get());
        m1.forEach((k,v)->System.out.println("m3:"+k+":"+v));
        //get
        System.out.println("m4:"+m1.get(22));

    }
}
