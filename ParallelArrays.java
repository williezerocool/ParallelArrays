/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallelarrays;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class ParallelArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
       Scanner kb = new Scanner(System.in);
       String names[] = {"hinton", "hardiman", "jhonson", "hooper", "goku"};
       double gradeAvg[] = {89.9, 97.9, 99.9, 45.2, 100.0};
       int id[] = {1, 2, 3, 4, 5};
       
       for(int i=0; i <5; i++){
       
           System.out.println(names[i] + " " + gradeAvg[i] + " " + id[i]);
       }
       
       System.out.print("ID number to find: ");
       int input = kb.nextInt();
       
       
       if(input == 1){
       
           System.out.println("Name: "+ names[0] + "\n" + "GPA: "+ gradeAvg[0] + "\n"+ "STUDENT ID: " + id[0]);
       }else if(input == 2){
       
           System.out.println("Name: "+ names[1] + "\n" + "GPA: "+ gradeAvg[1] + "\n"+ "STUDENT ID: " + id[1]);
       }else if(input == 3){
       
           System.out.println("Name: "+ names[2] + "\n" + "GPA: "+ gradeAvg[2] + "\n"+ "STUDENT ID: " + id[2]);
       }else if(input == 4){
       
           System.out.println("Name: "+ names[3] + "\n" + "GPA: "+ gradeAvg[3] + "\n"+ "STUDENT ID: " + id[3]);
       }else if(input == 5){
       
           System.out.println("Name: "+ names[4] + "\n" + "GPA: "+ gradeAvg[4] + "\n"+ "STUDENT ID: " + id[4]);
       }else{
       
           System.out.println("that is not a valid ID");
       }
       
       
       
       
    }
    
}
