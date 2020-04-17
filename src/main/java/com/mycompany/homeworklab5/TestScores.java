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
public class TestScores {
    double testScores(Double array1[]) throws Exception {
        double sum = 0;
        double average;
        for (int i = 0; i<array1.length; i++)
                if (array1[i] < 0 || array1[i] > 100)
                    throw new InvalidTestScoreException("A test score is negative or above 100");
            else
                sum = sum + array1[i];
                    average = sum/array1.length;
    return average;
    }
}
