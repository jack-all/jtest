package com.company;

import java.lang.reflect.Method;
import java.util.*;

class Test{
    Integer age = 10;
    String name = new String("test1");

    String getName(){
        return this.name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return this.age;
    }

}

class Test1 extends Test{
    Integer oldage = 10;

    public Integer getAge1(){
        return (this.oldage + this.age);
    }

    @Override
    public void setAge(Integer age){
        this.age = age + this.oldage;
    }
}

public class Main {


    public static void main(String[] args) {
	// write your code here
        List<String> int1 = new ArrayList<String>(Arrays.asList("s1","s2","s3","s2"));


        for(int i = 0; i < int1.size(); i++){
            if("s2".equals(int1.get(i))){
                int1.set(i,"s22");
            }
        }

        Test t1 = new Test();
        Class c1 = t1.getClass();
        /*
        Method[] m1 = c1.getMethods();
        for(Method m : m1){
            System.out.println("****"+m.getName()+"****");
        }

         */
        try {
            Method m1 = c1.getMethod("getAge");
            Object o = m1.invoke(t1);
            System.out.println("*****" + o);

        }catch (Exception e){
            System.out.print("dddd");
            e.printStackTrace();
        }


/*
        for(String e: int1){
            if("s2".equals(e)){
                int1.remove(e);
            }
        }

*/
        System.out.println(int1+":"+c1);
    }
}
