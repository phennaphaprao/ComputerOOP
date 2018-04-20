/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Scanner;

/**
 *
 * @author MY
 */
public class Computer {
    static Scanner a = new Scanner(System.in);

public static void login(){
Scanner b = new Scanner(System.in) ;
String User = "nile019";
String Pass = "019";
String iUser , iPass ; 

System.out.println("===============Customer's name===============");
System.out.print("Username>>>> ");
iUser = b.nextLine();
System.out.print("Password>>>> ");
iPass = b.nextLine();
while(!(iUser.equals(User)&&(iPass.equals(Pass)))){
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Login failed. Please try again. XXXXXXXXXXXXXXXXXXXXXXX");

System.out.print("Username>>>> ");
iUser = b.nextLine();
System.out.print("Password>>>> ");
iPass = b.nextLine();
}
System.out.println("--------------Login successfully--------------");
}

public static void way(){   
int a1;
System.out.println("***********Welcome To Computer shop***********\n");
System.out.println("   Press 1.Computer");
System.out.println("   Press 2.Computer appliances");
System.out.println();
System.out.print("Plese enter number >>>>> ");
a1 = a.nextInt();
    if (a1==1){
        pc p = new pc();
        p.way2();
    
    }
    else if (a1==2){
      Equipment E = new Equipment();
      E.appliances();
      E.sala();
      
    }
    end a = new end();
    a.en();
}

 
    //----------------------------------------------------------------------------

    
    public static void main(String[] args) {
          brandnote i = new brandnote("PRAONILE");
          i.print();
          login();
          way();
    
    }
    
}
