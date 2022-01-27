package com.company;
import java.util.*;

public class Main {
    static class OOMObject{

    }

    public static void main(String[] args) {
	// write your code here
        List <OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
