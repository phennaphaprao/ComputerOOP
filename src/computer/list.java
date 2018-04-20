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
abstract class list {
    static Scanner m = new Scanner (System.in);
    int mouse,monitor,printer ;
    int mouse1=2000,mouse2=790,mouse3=560,mouse4=0;
    int monitor1=2060,monitor2=3520,monitor3=4200,monitor4=5400,monitor5=0;
    int printer1=4990,printer2=1620,printer3=3090, printer4=6350,printer5=0;
    
    
    public void mouse(){
        do{
        System.out.println("=================MOUSE==================");
        System.out.println("1.OPTICAL MOUSE PREDATOR Cestus 500         ====> 2000 THB");
        System.out.println("2.OPTICAL MOUSE CORSAIR Harpoon RGB         ====> 790  THB");
        System.out.println("3.OPTICAL MOUSE COOLERMASTER Mastermouse S  ====> 560  THB");
        System.out.println("4.No select");
        System.out.print("Enter number : ");
        mouse = m.nextInt();
    }while(mouse1!=1&&mouse!=2&&mouse!=3&&mouse!=4);  
        }
    public void monitor(){ 
        do{
        System.out.println("=================MONITOR==================");
        System.out.println("1.LED 18.5 =====> 2060 THB");
        System.out.println("2.LEB 24.0 =====> 3520 THB");
        System.out.println("3.LED 27.0 =====> 4200 THB");
        System.out.println("4.LED 32.0 =====> 5400 THB");
        System.out.println("5.No select");
        System.out.print("Enter number : ");
        monitor = m.nextInt();
    }while(monitor!=1&&monitor!=2&&monitor!=3&&monitor!=4&&monitor!=5);
        }
    public void printer(){
         do{
        System.out.println("=================PRINTER==================");
        System.out.println("1.CANON SELPHY CP 1300 Black =====> 4990 THB");
        System.out.println("2.CANON PIXMA IP2770         =====> 1620 THB");
        System.out.println("3.CANON PIXMA IP7270         =====> 3090 THB");
        System.out.println("4.CANON PIXMA IX6870         =====> 6350 THB");
        System.out.println("5.No select");
        System.out.print("Enter number : ");
        printer = m.nextInt();
    }while(printer!=1&&printer!=2&&printer!=3&&printer!=4&&printer!=5);
     
        }
    abstract void sala();
}
