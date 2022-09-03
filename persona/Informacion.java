/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.persona;
import java.util.Scanner;
public class Informacion {
    
    public class Global {
    static Persona personas[] = new Persona[1];
    static Persona ListaPersonas[] = new Persona[1];
}
    public static void main(String[] args) {
    Persona personas[] = Global.personas;
    Persona ListaPersonas[]=Global.ListaPersonas;
       Scanner scan = new Scanner(System.in);
       Scanner scaNum = new Scanner(System.in);
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
for(int i=0; i<personas.length; i++){
System.out.print("Maximo de 10 registros lleva: ");
   System.out.println(i+1);
 System.out.println("\nIngresa tu Nombre");
 String nombre = scan.nextLine();
 System.out.println("Ingresa tu Apellido");
 String apellido = scan.nextLine();
 System.out.println("Ingresa tu DPI");
 Long dpi = scaNum.nextLong();
 System.out.println("Ingresa tu NIT");
 int nit = scaNum.nextInt();
 System.out.println("Desea ingresar un nuevo registro -> [si] o [no ->Enter]");
 String SN = scan.nextLine();
personas[i] = new Persona(nombre,apellido,dpi,nit);
if(SN.equals("Si") || SN.equals("si")){
ListaPersonas=new Persona[personas.length];
for(int j=0; j<personas.length; j++){
  ListaPersonas[j]=personas[j];}
  personas=new Persona[personas.length+1];
  for(int k=0; k<personas.length-1; k++){
  personas[k]=ListaPersonas[k];}
}
  else if(i<=10){break;}
else{break;
 }

} 
                //Registro();
                break;
            case "2":
            System.out.println("------- Personas Registradas -------");
for(int i=0; i<personas.length; i++){
    System.out.println(
            "\nNombre: "+personas[i].nombre+
      "\tApellido: "+personas[i].apellido+
      "\tDPI: "+personas[i].dpi+
      "\tNIT:"+personas[i].nit);
}
                //Mostrar();
                break;
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
    }
    
 /*public static void Registro(){
 Persona personas[] = Global.personas;
 Persona ListaPersonas[]=Global.ListaPersonas;
 Scanner scan = new Scanner(System.in);
 Scanner scaNum = new Scanner(System.in);      
 for(int i=0; i<personas.length; i++){
System.out.print("Maximo de 10 registros lleva: ");
   System.out.println(i+1);
 System.out.println("\nIngresa tu Nombre");
 String nombre = scan.nextLine();
 System.out.println("Ingresa tu Apellido");
 String apellido = scan.nextLine();
 System.out.println("Ingresa tu DPI");
 long dpi = scaNum.nextLong();
 System.out.println("Ingresa tu NIT");
 int nit = scaNum.nextInt();
 System.out.println("Desea ingresar un nuevo registro -> [si] o [no ->Enter]");
 String SN = scan.nextLine();
personas[i] = new Persona(nombre,apellido,dpi,nit);
if(SN.equals("Si") || SN.equals("si")){
ListaPersonas=new Persona[personas.length];
for(int j=0; j<personas.length; j++){
  ListaPersonas[j]=personas[j];}
  personas=new Persona[personas.length+1];
  for(int k=0; k<personas.length-1; k++){
  personas[k]=ListaPersonas[k];}
}
  else if(i<=10){break;}
else{break; 
 }
}
 }
public static void Mostrar(){
Persona[] personas = Global.personas;
for(int i=0; i<personas.length; i++){
    System.out.println(
            "\n"+personas[i].nombre+"\t\t"
            +personas[i].apellido+"\t\t"
            +personas[i].dpi+"\t"
            +personas[i].nit+"\n\n");
}
}*/


