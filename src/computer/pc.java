/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author MY
 */

import java.util.Scanner;
public class pc {
    static int a ; 
    static Scanner a1 = new Scanner(System.in);
   
    public void way2(){ 
        do{
    System.out.println("press 1 : PC");
    System.out.println("press 2 : Notebook");
    System.out.print("   Enter number >>> ");
    a = a1.nextInt();
    if (a==1){
        System.out.println();
        System.out.println("press 1 : Computer Set");
        System.out.println("press 2 : Custom PC");
        System.out.print("   Enter number >>> ");
        
        a = a1.nextInt();
        do{
        if (a==1){
            Computerset cs = new Computerset();
            cs.aa();    
        
            }
        else if (a==2){
            custompc cp = new custompc();
            cp.custom();
            }
        }while(a!=1 && a!=2);

        
    }
    else if (a==2){
        brandNotebook g = new brandNotebook();
        g.notbook1();
        g.salary();
    }
}while(a!=1 && a!=2);

}
}
