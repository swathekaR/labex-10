/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class file {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)   {
       Scanner in=new Scanner(System.in);
        System.out.println("ENTER FILENAME:");
        String filename =in.next();
         File file=new File(filename);
         if(!file.exists())
         {
             System.out.println("file doesnot exists");
         }
         else
         {
              System.out.println("Type of the file:"+filename);
               System.out.println("Length of file:"+file.length()+"bytes");
               System.out.println("File is readable:"+file.canRead());
        System.out.println("File is writable:"+file.canWrite());
    }
         
             
         }
        
                     
             
         }
   
        // TODO code application logic here
        

   