/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homeworklab5;

/**
 *
 * @author Luke
 */
public class TestData {
    double getTotal(double[] array1){
        double sum = 0;
        for (int i = 0; i < array1.length; i++)
            sum = sum + array1[i];
           return sum;       
    }
    
    double getAverage(double[] array1) {
        double sum = 0;
        double average;
        for (int i = 0; i<array1.length; i++)
            sum = sum + array1[i];
                average = sum/array1.length;
           return average;                         
    }
    double getHighest(double[] array1) {
        double highest = 0;
        for (int i = 0; i < array1.length; i++)
            if (array1[i] > highest)
                highest = array1[i];
                return highest;
    }
    double getLowest(double[] array1) {
        double lowest = 0;
        for (int i=0;i<array1.length;i++)
            if (array1[i] < lowest)
                lowest = array1[i];
        return lowest;           
    }
}
