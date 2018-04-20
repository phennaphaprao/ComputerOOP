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
abstract class generation {
    
    static Scanner a = new Scanner(System.in);
    int asus;
    int Asus1 = 12300,Asus2 = 13900,Asus3 = 22300,Asus4 = 23900;
    int Acer1 = 32000,Acer2 = 29600,Acer3 = 20100,Acer4 = 12900;
    int Dell1 = 20130,Dell2 = 32000,Dell3 = 31200,Dell4 = 20900;
    int Msi1 = 30600,Msi2 = 31000,Msi3 = 32100,Msi4 = 52000;
    String address = "Computer Shop M.1 T.SE A.KATOO J.PHUKET",phone = "0981878586";
    String time = "Monday - Friday : from 9:00 - 17:00 hrs. ",email = "praw_praw1998@gmail.com";
    
    public void ASUS(){
        do{
        System.out.println("=========GENERATION ASUS==========");
        System.out.println("1. Asus E402NA-GA239T ");
        System.out.println("2. Asus X555QG-XX157T ");
        System.out.println("3. Asus K550IK-GO017T ");
        System.out.println("4. Asus Zenbook UX370UA-C4178T Touch ");
        System.out.print("Enter generation >> ");
        asus = a.nextInt();
        }while(asus!=1 && asus!=2 && asus!=3 && asus!=4);
        
        System.out.println("-------------------SPECS FANCTION-------------------");
        if(asus==1){
        System.out.println("1. CPU Intel Pentium N4200 Processor 1.1GHz \n" +
                           "2. Memory DDR3 4GB\n" +
                           "3. Hard Disk SATA 1TB 5400RPM 2.5' HDD\n" +
                           "4. 14.0\" Ultra Slim 200nits//HD 1366x768 16:9//Glare\n" +
                           "5. OS Windows 10 Home");
        System.out.println("Salary is "+Asus1+" THB");
        }else if(asus==2){
        System.out.println("1. AMD A10-9620P (2.5GHz up to 3.4GHz)\n"+ 
                           "2. AMD Radeon R5 M330 (2GB GDDR3)\n"+
                           "3. 8 GB DDR4\n"+
                           "4. 1 TB 5400 RPM\n"+
                           "5. 15.6 inch (1366x768) HD");
        System.out.println("Salary is "+Asus2+" THB");
        }else if(asus==3){
        System.out.println("1. AMD FX-9830P (3.00 GHz) \n"+ 
                           "2. AMD Radeon RX560 (4GB GDDR5)\n"+
                           "3. 8 GB DDR4\n"+
                           "4. 1 TB 5400 RPM\n"+
                           "5. 15.6 inch (1366x768) HD");
        System.out.println("Salary is "+Asus3+" THB");
        }else if(asus==4){
        System.out.println("1. Intel Core i7-7500U (2.70 - 3.50 GHz) \n"+ 
                           "2. Intel HD Graphics 620\n"+
                           "3. 8 GB DDR3L On Board\n"+
                           "4. 512GB SSD PCIe M.2\n"+
                           "5. 13.3 inch LED (1920x1080) Full HD IPS");
        System.out.println("Salary is "+Asus4+" THB");
        }
        System.out.println("-----------------------------------------------------");
    }
    
    public void ACER(){
        do{
        System.out.println("=========GENERATION ACER==========");
        System.out.println("1. Acer Aspire E5-474G-56YN ");
        System.out.println("2. Acer Aspire E5-571-372Z ");
        System.out.println("3. Acer Aspire E5-573G-52WX ");
        System.out.println("4. Acer Aspire E5-572G-78HY ");
        System.out.print("Enter generation >> ");
        asus = a.nextInt();
        }while(asus!=1 && asus!=2 && asus!=3 && asus!=4);
        
        System.out.println("-------------------SPECS FANCTION-------------------");
         if(asus==1){
        System.out.println("1. Intel Core i5-6200U (2.3 - 2.80 GHz)\n" +
                           "2. NVIDIA GeForce 920M (2GB GDDR3)\n" +
                           "3. 8 GB DDR3L\n" +
                           "4. 1 TB 5400 RPM\n" +
                           "5. 14 inch (1366x768) HD");
        System.out.println("Salary is "+Acer1+" THB");
        }else if(asus==2){
        System.out.println("1. Intel Core i3-4005U (1.70 GHz)\n"+ 
                           "2. Intel HD Graphics 4400\n"+
                           "3. 4 GB DDR3\n"+
                           "4. 500 GB 5400 RPM\n"+
                           "5. 15.6 inch (1366x768) HD");
        System.out.println("Salary is "+Acer2+" THB");
        }else if(asus==3){
        System.out.println("1. Intel Core i5-5200U (2.20 GHz) \n"+ 
                           "2. NVIDIA GeForce GT 940M (4GB GDDR3)\n"+
                           "3. 8 GB DDR3L\n"+
                           "4. 500 GB 5400 RPM\n"+
                           "5. 15.6 inch (1366x768) HD");
        System.out.println("Salary is "+Acer3+" THB");
        }else if(asus==4){
        System.out.println("1. Intel Core i7-4712MQ (2.30 - 3.30 GHz)  \n"+ 
                           "2. NVIDIA GeForce GT 840M (2GB GDDR3)\n"+
                           "3. 8 GB DDR3L\n"+
                           "4. 1 TB 5400 RPM\n"+
                           "5. 15.6 inch WXGA (1366x768) LED");
        System.out.println("Salary is "+Acer4+" THB");
        }
         System.out.println("-----------------------------------------------------");
    }
    
    public void DELL(){
        do{
        System.out.println("=========GENERATION DELL==========");
        System.out.println("1. Dell Inspiron 11-3147 ");
        System.out.println("2. Dell Inspiron 15-5547 ");
        System.out.println("3. Dell XPS 13-L321X ");
        System.out.println("4. Dell Inspiron 15-7548 ");
        System.out.print("Enter generation >> ");
        asus = a.nextInt();
        }while(asus!=1 && asus!=2 && asus!=3 && asus!=4);
        
        System.out.println("-------------------SPECS FANCTION-------------------");
         if(asus==1){
        System.out.println("1. Celeron Dual Core\n" +
                           "2. 2.16GHz with Burst Technology up to 2.58GHz\n" +
                           "3. 5400 rpm\n" +
                           "4. Intel HD Graphics 4000\n" +
                           "5. 1366x768");
        System.out.println("Salary is "+Dell1+" THB");
        }else if(asus==2){
        System.out.println("1. Intel Core i7 (4th Gen) 4510U / 2 GHz\n"+ 
                           "2. 3.1 GHz\n"+
                           "3. Dual-Core\n"+
                           "4. 4 MB\n"+
                           "5. Intel Turbo Boost Technology 2.0");
        System.out.println("Salary is "+Dell2+" THB");
        }else if(asus==3){
        System.out.println("1. Intel Core i5 2nd Gen 2467M (1.60 GHz)\n"+ 
                           "2. 4 GB Memory 128 GB SSD.\n"+
                           "3. Intel HD Graphics 3000.\n"+
                           "4. Windows 7 Home Premium 64-bit.\n"+
                           "5. 12.4\" x 8.1\" x 0.27\" - 0.71\" 2.99 lbs");
        System.out.println("Salary is "+Dell3+" THB");
        }else if(asus==4){
        System.out.println("1. 16GB (2x 8192MB) – DDR3, 1600Mhz \n"+ 
                           "2. AMD Radeon R7 M265 (4GB, DDR3)\n"+
                           "3. 1TB HDD (5400 rpm) / 256GB SSD\n"+
                           "4. Intel Turbo Boost Technology 2.0\n"+
                           "5. 4 MB");
        System.out.println("Salary is "+Dell4+" THB");
        }
         System.out.println("-----------------------------------------------------");
    }
    
    public void MSI(){
        do{
        System.out.println("=========GENERATION MSI==========");
        System.out.println("1. MSI GL62M 7RDX-1496XTH ");
        System.out.println("2. MSI GE60 2PC APACHE ");
        System.out.println("3. MSI GL62M 7RDX-1248XTH ");
        System.out.println("4. MSI GL62M 7REX ");
        System.out.print("Enter generation >> ");
        asus = a.nextInt();
        }while(asus!=1 && asus!=2 && asus!=3 && asus!=4);
        
        System.out.println("-------------------SPECS FANCTION-------------------");
         if(asus==1){
        System.out.println("1. Intel Core i7-7700HQ (2.80 - 3.80 GHz)\n" +
                           "2. NVIDIA GeForce GTX 1050 (2GB GDDR5)\n" +
                           "3. 4 GB DDR4\n" +
                           "4. 1 TB 5400 RPM\n" +
                           "5. 15.6 inch (1920x1080) Full HD IPS");
        System.out.println("Salary is "+Msi1+" THB");
        }else if(asus==2){
        System.out.println("1. Intel Core i7 (4th Gen) 4700HQ / 2.4 GHz\n"+ 
                           "2. 3.4 GHz\n"+
                           "3. Quad-Core\n"+
                           "4. 6 MB\n"+
                           "5. Mobile Intel HM86 Express");
        System.out.println("Salary is "+Msi2+" THB");
        }else if(asus==3){
        System.out.println("1. Intel Core i7-7700HQ (2.80 - 3.80 GHz) \n"+ 
                           "2. NVIDIA GeForce GTX 1050 (2GB GDDR5)\n"+
                           "3. 8 GB DDR4\n"+
                           "4. 1 TB 5400 RPM\n"+
                           "5. 15.6 inch (1920x1080) Full HD IPS level panal");
        System.out.println("Salary is "+Msi3+" THB");
        }else if(asus==4){
        System.out.println("1. Up to 7th Gen. Intel® Core™ i7 processo\n"+ 
                           "2. 15.6\" FHD (1920x1080), Wide-View\n"+
                           "3. Intel® HM175\n"+
                           "4. DDR4-2400\n"+
                           "5. Max 32GB");
        System.out.println("Salary is "+Msi4+" THB");
        }
         System.out.println("-----------------------------------------------------");
    }
    
    abstract void salary();
}
