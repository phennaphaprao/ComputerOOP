/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer ;

/**
 *
 * @author MY
 */
import java.util.Scanner;
public class Equipment extends list {
            public String parts1 = "mouse" ;
            public String parts2 = "monitor";
            public String parts3 = "Printer";
            static Scanner p = new Scanner(System.in); 
            static int p1 ;
            static int sum,sum1,sum2,sum3 ;
             
    public void appliances(){
                super.mouse();
                super.monitor();
                super.printer();

                }  
//    }

   
            @Override
    public void sala() {
        System.out.println("==================== BILL ====================");
        
        switch(super.mouse){
        case 1 :
            System.out.println("Mouse    "+this.mouse1+" THB");
            sum1 = this.mouse1;
            break;
        
        case 2 :
            System.out.println("Mouse    " +this.mouse2+" THB");
            sum1 = this.mouse2;
            break;
        
        case 3 :
            System.out.println("Mouse    "+this.mouse3+" THB");
            sum1 = this.mouse3;
                break;
        
        case 4 :
            System.out.println("Mouse    "+this.mouse4+" THB");
            sum1 = this.mouse4;
                break;
        }
          //---------------------------------------------------
        switch(super.monitor){
        case 1 :
            System.out.println("Monitor  "+this.monitor1+" THB");
            sum2 = this.monitor1;
                break;
        case 2 :
            System.out.println("Monitor   "+this.monitor2+" THB");
            sum2 = this.monitor2;
                break;
        case 3 :
            System.out.println("Monitor   "+this.monitor3+" THB");
            sum2 = this.monitor3;
                break;
        case 4 :
            System.out.println("Monitor   "+this.monitor4+" THB");
            sum2 = this.monitor4;
                break;
        case 5 :
            System.out.println("Monitor   "+this.monitor5+" THB");
            sum2 = this.monitor5;
                break;
        }
          //----------------------------------------------------
        switch(super.printer){
        case 1 :
            System.out.println("Printer   "+this.printer1+" THB");
            sum3 = this.printer1;
                break;
        case 2 :
            System.out.println("Printer   "+this.printer2+" THB");
            sum3 = this.printer2;
                break;
        case 3 :
            System.out.println("Printer   "+this.printer3+" THB");
            sum3 = this.printer3;
                break;
        case 4 :
            System.out.println("Printer   "+this.printer4+" THB");
            sum3 = this.printer4;
                break;
        case 5 :
            System.out.println("Printer   "+this.printer5+" THB");
            sum3 = this.printer5;
                break;
        }
         sum = sum1+sum2+sum3;
    System.out.println("Total is "+ sum + " THB");
    
   
    }
}
    

