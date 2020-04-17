/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homeworklab5;

import java.util.Scanner;

/**
 *
 * @author Luke
 */
public class LargerThanN {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = in.nextInt();
        int[] array1 = {10,  20, 30, 40, 13, 43};
        largerThanN(array1,n);
        
        
    }
     public static void largerThanN(int[] array1, int n) {
        System.out.println("Number that are greater than " + n + " are:");
        for (int i = 0; i<array1.length; i++) {
            if (array1[i]>n)
                System.out.println(array1[i]);
        }
    }
}
