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
public class InvalidTestScoreException extends Exception{
    public InvalidTestScoreException(String errorMessage){
        super(errorMessage);
    }
}
