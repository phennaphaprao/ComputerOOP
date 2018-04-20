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
public class custompc {
    
static int Mainboard;
static int CPU;
static int HDD;
static int RAM;
static int POWSUB;
static int Case;
static int Ggraphiccard;
static int e ;
static Scanner w = new Scanner(System.in);
static double sum ; 
static Scanner q = new Scanner(System.in);
static double sum1,sum2,sum3,sum4,sum5 ;
    public static void custom(){
    do{
    System.out.println("aaa");
    
    do  {
    System.out.println("Mainboard");
    System.out.println("1.BIOSTAR A68N-5600 + CPU AMD A10-4655 (Quad-core2.0) ---> 2250 THB");
    System.out.println("2.ASROCK J3355M + CPU Celeron Dual-Core Up to 2.5GHz  ---> 2070 THB");
    System.out.println("3 no");
    System.out.print("Enter number ===> ");
    Mainboard = q.nextInt();
    }while(Mainboard!=1 && Mainboard!=2 && Mainboard!=3);
    do {
    System.out.println("CPU");
    System.out.println("1.CPU AMD A6-9500 (STrek)  ---> 1930 THB");
    System.out.println("2.CPU AMD A10-9700E (STrek)---> 2990 THB");
    System.out.println("3.CPU AMD Ryzen3 1200      ---> 3250 THB");
    System.out.println("4 no");
    System.out.print("Enter number ===> ");
    CPU = q.nextInt();
    }while(CPU!=1 && CPU!=2 && CPU!=3);
    do {
    System.out.println("HDD");
    System.out.println("1.160 GB SATA-II Seagate (8MB, Import)  ---> 840  THB ");
    System.out.println("2.320 GB SATA-II Seagate (8MB, Import)  ---> 1140 THB");
    System.out.println("3 no");
    System.out.print("Enter number ===> ");
    HDD = q.nextInt();
    }while(HDD!=1 && HDD!=2 && HDD!=3);
    do {
    System.out.println("POWSUB");
    System.out.println("1.PSU (80+ Bronze) AeroCool KCAS 500W. ---> 1600 THB");
    System.out.println("2.PSU (80+ Bronze) AeroCool KCAS 700W. ---> 2100 THB");
    System.out.println("3 no");
    System.out.print("Enter number ===> ");
    POWSUB = q.nextInt();
    }while(POWSUB!=1 && POWSUB!=2 && POWSUB!=3);
    do {
    System.out.println("Case");
    System.out.println("1.normal       ---> 1450 THB");
    System.out.println("2 water system ---> 3500 THB");
    System.out.println("3 no");
    System.out.print("Enter number ===> ");
    Case = q.nextInt();
    }while(Case!=1 && Case!=2 && Case!=3);
    do {
    System.out.println("Ggraphiccard");
    System.out.println("1.4GB GDDR5 AMD RX 560 SAPPHIRE PULSE        ---> 5890 THB");
    System.out.println("2.2GB GDDR5 AMD RX 550 PowerColor RED Dragon ---> 2980 THB");
    System.out.println("3.4GB GDDR5 AMD RX 560 ASUS STRIX Gaming EVO ---> 6790 THB");
    System.out.println("4 no");
    System.out.print("Enter number ===> ");
    Ggraphiccard = q.nextInt();
    }while(Ggraphiccard!=1 && Ggraphiccard!=2 && Ggraphiccard!=3);
    
    //--------------------------------------------------------------------------------------------------------
    System.out.print("Press 1 OK // Press 2 select New");
    System.out.print("Enter number ===> ");
    e = w.nextInt();
    }while(e!=2);
    System.out.println("============================Bill============================");
    switch (Mainboard){
        case 1 : 
             System.out.println("1.BIOSTAR A68N-5600 + CPU AMD A10-4655 (Quad-core2.0)  2250 THB");
             sum1 = 2250;
             break;
        case 2 :
             System.out.println("2.ASROCK J3355M + CPU Celeron Dual-Core Up to 2.5GHz   2070 THB");
             sum1 = 2070 ; 
             break;
        case 3 :
            System.out.println("No select");
            sum1 = 0 ; 
            break;
    }
    switch (Mainboard){
        case 1 : 
            System.out.println("1.CPU AMD A6-9500 (STrek)                                1930 THB");
            sum2 = 1930;
            break;
        case 2 :
            System.out.println("2.CPU AMD A10-9700E (STrek)                              2990 THB");
            sum2 = 2990;
            break;
        case 3 :
            System.out.println("3.CPU AMD Ryzen3 1200                                    3250 THB");
            sum2 = 3250;
            break;   
        case 4 :
            System.out.println("No select");
            sum2 = 0 ; 
            break;
    
    }
    switch (HDD){
        case 1 : 
            System.out.println("1.160 GB SATA-II Seagate (8MB, Import)                   840  THB ");
            sum3 = 840;
            break;
        case 2 :
            System.out.println("2.320 GB SATA-II Seagate (8MB, Import)                   1140 THB");
            sum3 = 1140;
            break;
        case 3 :
            System.out.println("No select");
            sum3 = 0 ; 
            break;
    }
    switch (Case){
        case 1 : 
            System.out.println("1.normal                                                 1450 THB");
            sum4 = 1450;
            break;
        case 2 :
            System.out.println("2 water system                                           3500 THB");
            sum4 = 3500;
            break;
        case 3 :
            System.out.println("No select");
            sum4 = 0 ; 
            break;
    }
    switch (POWSUB){
        case 1 : 
            System.out.println("1.PSU (80+ Bronze) AeroCool KCAS 500W.                   1600 THB");
    
            sum4 = 1600;
            break;
        case 2 :
            System.out.println("2.PSU (80+ Bronze) AeroCool KCAS 700W.                   2100 THB");
            sum4 = 2100;
            break;
        case 3 :
            System.out.println("No select");
            sum4 = 0 ; 
            break;
    }
    switch (Ggraphiccard){
        case 1 : 
            System.out.println("1.4GB GDDR5 AMD RX 560 SAPPHIRE PULSE                    5890 THB");
            sum5 = 5890;
            break;
        case 2 :
            System.out.println("2.2GB GDDR5 AMD RX 550 PowerColor RED Dragon             2980 THB");
            sum5 = 2980;
            break;
        case 3 :
            System.out.println("3.4GB GDDR5 AMD RX 560 ASUS STRIX Gaming EVO             6790 THB");
            sum5 = 6790 ; 
            break;
        case 4 :
            System.out.println("No select");
            sum5 = 0 ; 
            break;
    }
    double sum = sum1+sum2+sum3+sum4+sum5;
    System.out.println("Total is "+ sum+ "THB");
   
}

}

