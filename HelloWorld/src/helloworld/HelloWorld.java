/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mbhenry0
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
        ArrayList<String>lines=new ArrayList<String>();
        System.out.println("hello World");
        FileReader F= new FileReader(args[0]);
        BufferedReader Read= new BufferedReader(F);
        String Line="";
        while((Line=Read.readLine())!=null){
            lines.add(Line);
        }
        for(String S:lines){
            System.out.println("__--->%S%n"+ S);
        }
    }
        catch(FileNotFoundException FNF){
            System.err.println("File Not Found");
        }
        catch(IOException io){
            System.err.println("Error");
        }
    
}
}
