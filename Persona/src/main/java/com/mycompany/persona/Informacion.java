/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.persona;
import java.util.Scanner;
public class Informacion {
    
    public static void main(String[] args) {
       int count = 1;
       Scanner scan = new Scanner(System.in);
       Persona personas[] = new Persona[count];
        boolean salir = false;
        while(!salir){
        Menu();
        String opcion = scan.nextLine();
        switch(opcion){
            case "0":
                System.out.println("\nBye, El programa finalizo");
           salir=true;
                break;
            case "1":
                Registro(personas,count);
                break;
            case "2":
                Mostrar(personas);
                break;
        }
        }
    }   
 public static void Registro(Persona personas[],int contador){
 boolean seguir = false;
 Scanner scan = new Scanner(System.in);
 Scanner scaNum = new Scanner(System.in);      
 for(int i=0; i<personas.length; i++){
   for(int j=0; j<personas.length; j++){
 while(!seguir){
 System.out.println("Ingresa tu Nombre");
 String nombre = scan.nextLine();
 System.out.println("Ingresa tu Apellido");
 String apellido = scan.nextLine();
 System.out.println("Ingresa tu DPI");
 int dpi = scaNum.nextInt();
 System.out.println("Ingresa tu NIT");
 int nit = scaNum.nextInt();
 System.out.println("Desea ingresar un nuevo registro -> [si] o [no]");
 String SN = scan.nextLine();
personas[i] = new Persona(nombre,apellido,dpi,nit);
 if(SN.equals("Si") || SN.equals("si")){contador++;
 }else{break; 
 }
 }
  }
 }
 }
 public static void Menu(){
 System.out.println("\t\n--------- Menu ---------");
 System.out.println("\n1. Ingresar datos de persona");
 System.out.println("2. Mostrar datos de persona");
 System.out.println("0. Salir");
 System.out.println("\nElige una opcion");
 }
public static void Mostrar(Persona personas[]){
for(int i=0; i<personas.length; i++){
    System.out.println(
            "\nNombre: "+personas[i].getNombre()
            +"\napellido: "+personas[i].getApellido()
            +"\nDPI: "+personas[i].getDpi()
            +"\nNIT: "+personas[i].getNit());
}
}
}
