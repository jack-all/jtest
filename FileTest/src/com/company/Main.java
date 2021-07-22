package com.company;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        URL url = new URL("http://www.baidu.com");

        InputStream is = url.openStream();

        InputStreamReader isr = new InputStreamReader(is,"UTF-8");

        BufferedReader br = new BufferedReader(isr);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        File f1 = new File("E:\\p4\\t1\\fabric.p4");
        if(f1.exists()){
            if(f1.isFile()){
                System.out.println("F:"+f1.getName());
                FileInputStream in = new FileInputStream(f1);
                byte[] buffer = new byte[1024];
                in.read(buffer,0,buffer.length);
                System.out.println(new String(buffer,"UTF-8"));

            }
            else{
                for(File f:f1.listFiles()){
                    System.out.println("F："+f.getName());
                }
            }
        }
    }
}
