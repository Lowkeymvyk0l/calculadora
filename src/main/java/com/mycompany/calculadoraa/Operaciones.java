/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraa;

/**
 *
 * @author mayke
 */
public class Operaciones {
    int num1;
    int num2;

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int suma(){
        return this.num1+this.num2;
    }
    public int resta(){
        return this.num1-this.num2;
    }  
    public int division(){
        return this.num1/this.num2;
    }  
    public int multiplicacion(){
        return this.num1*this.num2;
    }  
    public int resto(){
        return this.num1%this.num2;
    }  
    }
