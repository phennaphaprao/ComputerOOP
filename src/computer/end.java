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
public class end {
    static int l ;
    public void en(){
      
         Scanner L = new Scanner(System.in);
            System.out.println("************************************************************");
            System.out.println("Press 1 Menu // Press 2 End program");
            System.out.print("Select number >> ");
            l = L.nextInt();
       
      if(l==1){
      Computer c = new Computer();
            Computer.way();
      }else if(l==2){
         System.out.print("=====================END PROGRAME=====================");
      }
    }
}

