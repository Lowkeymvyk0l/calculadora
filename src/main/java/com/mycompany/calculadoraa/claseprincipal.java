/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraa;

import java.util.Scanner;

/**
 *
 * @author mayke
 */
    public class claseprincipal {
    private int numero1;
    private int numero2;

    public claseprincipal(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void leernumero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        while (!sc.hasNextInt()) sc.next();
        int num1 = sc.nextInt();
        int num2;
        System.out.print("Enter number 2: ");
        
           while (!sc.hasNextInt()) sc.next();
         num2 = sc.nextInt();
        this.setNumero1(num1);
        this.setNumero2(num2);
        
}

public void menu(){
    String condicion="";
    
    int condicion1=0;
    Scanner sc = new Scanner(System.in);
    while (condicion1==0){
    System.out.println("menu");
    System.out.println("1=suma");
    System.out.println("2=resta");
    System.out.println("3=multiplicacion");
    System.out.println("4=division");
    System.out.println("5=resto");
    System.out.print("ingresa una opcion:");
    int opcion=sc.nextInt();
    
    this.leernumero();
    Operaciones operaciones = new Operaciones(this.getNumero1() ,this.getNumero2());
    int n;
    if(opcion==1){
        n=operaciones.suma();
        System.out.println("resultado: "+n);
    }
    else if(opcion==2){
        n=operaciones.resta();
        System.out.println("resultado: "+n);
    }
    else if(opcion==3){
        n=operaciones.multiplicacion(); 
        System.out.println("resultado: "+n);
    }
    else if(opcion==4){
        if(operaciones.getNum2()==0){
        System.out.println("ingrese un denominador diferente a 0");
    
    }
        else { n=operaciones.division(); 
        System.out.println("resultado: "+n);}
        
    }
    else if(opcion==5){
       n=operaciones.resto();
       System.out.println("resultado: "+n);
    }
    
    else if (opcion==6){
        condicion1=1;
    
    
    
    
    
    
    
    }
            
    }}}
        
        
        
    
    





    
    
