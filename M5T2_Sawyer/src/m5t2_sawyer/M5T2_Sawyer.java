/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5t2_sawyer;

import java.util.Scanner;

/**
 *
 * @author sawyerc6398
 */
public class M5T2_Sawyer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Greets user
        System.out.println("Hello, User.");
        
        
        // ask for name
        String name; 
        Scanner key_input = new Scanner (System.in);
        System.out.println("What's your name?");
        name = key_input.next();
        
        // ask for age;
        System.out.println("How old are you?");
        int age = key_input.nextInt();
        
        
        // repeat inputs
        System.out.println("Nice to meet you " + name);
        System.out.println("You are " + age + " years old.");
    }
    
}
