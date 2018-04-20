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
public class brandNotebook extends generation{
    
    

            private String brand1 = "ASUS" ;
            private String brand2 = "acer";
            private String brand3 = "DEll";
            private String brand4 = "msi";
            static Scanner q = new Scanner(System.in); 
            static int q1 ;
   

    public void notbook1(){
        do{System.out.println("===========Brand Notebook===========");
           System.out.println("   Press 1 "+brand1);
           System.out.println("   Press 2 "+brand2);
           System.out.println("   Press 3 "+brand3);
           System.out.println("   Press 4 "+brand4);
           System.out.print(" Enter number : ");
           q1 = q.nextInt();
        }while(q1!=1 && q1!=2 && q1!=3 && q1!=4);
        
        
        if(q1==1){
            super.ASUS();
            
        }else if(q1==2){
            super.ACER();
            
        }else if(q1==3){
            super.DELL();
            
        }else if(q1==4){
            super.MSI();
        }    
        }

    
    public void salary() {
        
        System.out.println("==================== BILL ====================");
        if(this.q1==1&&super.asus==1){
            System.out.println("Notebook brand >>> "+this.brand1);
            System.out.println("ASUS generation >>> Asus E402NA-GA239T ");
            System.out.println("price is "+super.Asus1+" THB");
        }else if(this.q1==1&&super.asus==2){
            System.out.println("Notebook brand >>> "+this.brand1);
            System.out.println("ASUS generation >>> Asus X555QG-XX157T ");
            System.out.println("price is "+super.Asus2+" THB");
        }else if(this.q1==1&&super.asus==3){
            System.out.println("Notebook brand >>> "+this.brand1);
            System.out.println("ASUS generation >>> Asus K550IK-GO017T ");
            System.out.println("price is "+super.Asus3+" THB");
        }else if(this.q1==1&&super.asus==4){
            System.out.println("Notebook brand >>> "+this.brand1);
            System.out.println("ASUS generation >>> Asus Zenbook UX370UA-C4178T Touch ");
            System.out.println("price is "+super.Asus4+" THB");
        }
        else if(this.q1==2&&super.asus==1){
            System.out.println("Notebook brand >>> "+this.brand2);
            System.out.println("ACER generation >>> Acer Aspire E5-474G-56YN ");
            System.out.println("price is "+super.Acer1+" THB");
        }else if(this.q1==2&&super.asus==2){
            System.out.println("Notebook brand >>> "+this.brand2);
            System.out.println("ACER generation >>> Acer Aspire E5-571-372Z ");
            System.out.println("price is "+super.Acer2+" THB");
        }else if(this.q1==2&&super.asus==3){
            System.out.println("Notebook brand >>> "+this.brand2);
            System.out.println("ACER generation >>> Acer Aspire E5-573G-52WX ");
            System.out.println("price is "+super.Acer3+" THB");
        }else if(this.q1==2&&super.asus==4){
            System.out.println("Notebook brand >>> "+this.brand2);
            System.out.println("ACER generation >>> Acer Aspire E5-572G-78HY ");
            System.out.println("price is "+super.Acer4+" THB");
        }
        else if(this.q1==3&&super.asus==1){
            System.out.println("Notebook brand >>> "+this.brand3);
            System.out.println("DELL generation >>> Dell Inspiron 11-3147 ");
            System.out.println("price is "+super.Dell1+" THB");
        }else if(this.q1==3&&super.asus==2){
            System.out.println("Notebook brand >>> "+this.brand3);
            System.out.println("DELL generation >>> Dell Inspiron 15-5547 ");
            System.out.println("price is "+super.Dell2+" THB");
        }else if(this.q1==3&&super.asus==3){
            System.out.println("Notebook brand >>> "+this.brand3);
            System.out.println("DELL generation >>> Dell XPS 13-L321X ");
            System.out.println("price is "+super.Dell3+" THB");
        }else if(this.q1==3&&super.asus==4){
            System.out.println("Notebook brand >>> "+this.brand3);
            System.out.println("DELL generation >>> Dell Inspiron 15-7548 ");
            System.out.println("price is "+super.Dell4+" THB");
        }
        else if(this.q1==4&&super.asus==1){
            System.out.println("Notebook brand >>> "+this.brand4);
            System.out.println("MSI generation >>> MSI GL62M 7RDX-1496XTH ");
            System.out.println("price is "+super.Msi1+" THB");
        }else if(this.q1==4&&super.asus==2){
            System.out.println("Notebook brand >>> "+this.brand4);
            System.out.println("MSI generation >>> MSI GE60 2PC APACHE ");
            System.out.println("price is "+super.Msi2+" THB");
        }else if(this.q1==4&&super.asus==3){
            System.out.println("Notebook brand >>> "+this.brand4);
            System.out.println("MSI generation >>> MSI GL62M 7RDX-1248XTH ");
            System.out.println("price is "+super.Msi3+" THB");
        }else if(this.q1==4&&super.asus==4){
            System.out.println("Notebook brand >>> "+this.brand4);
            System.out.println("MSI generation >>> MSI GL62M 7REX ");
            System.out.println("price is "+super.Msi4+" THB");
        }
  
    }
    
    
}
