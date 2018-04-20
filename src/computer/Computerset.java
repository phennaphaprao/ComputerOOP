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
public class Computerset {
    
    
    static int set;
    static int sum=0 ;
    static int co ;
    static int e ;
    static Scanner w = new Scanner(System.in);
    static Scanner C = new Scanner(System.in);
    
    public static void aa(){
        do{
    do{    
    System.out.println("************************SET 1************************\n"+
" 		AMD Ryzen 5 1500X                                       5,870\n" +
" 		ASROCK A320M-HDV                                        1,680\n" +
" 		GIGABYTE GTX1050Ti OC 4G 4GB x 1                        5,890\n" +
" 		Apacer PANTHER DDR4 8GB 2133 (8GBx1) Glay x 1           2,090\n" +
" 		Western Digital Blue 1TB WD10EZEX x 1                   1,280\n" +
" 		SAMSUNG 960 EVO M.2 250GB x 1                           4,450\n" +
" 		KINGSTON A400 120GB x 1                                 1,390\n" +
" 		NEOLUTION Gamemaster Pro 700W                             890\n" +
" 		Tsunami Unlimited T7+ Black                             2,390\n" +
" 		ALSEYE Galaxy G120                                      1,590\n" +
" 		ACER Gaming KG241Q x 1                                  4,890\n" +
                "Total	32,410.-");
    System.out.println("************************SET 2************************\n" +
" 		INTEL Core i5-8400                                      6,900\n" +
" 		GIGABYTE Z370 AORUS Ultra Gaming                        5,570\n" +
" 		MSI GTX1050Ti GAMING X 4GB x 1                          6,890\n" +
" 		CORSAIR Vengeance LPX DDR4 8GB 2400 (4GBx2) Red x 1	3,790\n" +
" 		SEAGATE BARRACUDA 1TB x 1                               1,350\n" +
" 		Western Digital WD BLUE M.2 250GB x 1                   2,800\n" +
" 		KINGSTON A400 120GB x 1                                 1,390\n" +
" 		THERMALTAKE Smart RGB 700W 80 Plus                      2,390\n" +
" 		NEOLUTION E-SPORT SAPPHIRE                              1,590\n" +
" 		COOLER MASTER V8 GTS                                    2,890\n" +
" 		SAMSUNG LS22F350FHE x 1                                 3,690\n" +
                "Total	39,250.-");
    System.out.println("************************SET 3************************\n" +
" 		AMD A4-7300                                               990\n" +
" 		GIGABYTE GA-F2A68HM-DS2                                 1,540\n" +
" 		INNO3D GT1030 0dB 2GB x 1                               2,380\n" +
" 		CORSAIR Vengeance C9 DDR3 1600 4GB x 1                  1,290\n" +
" 		Toshiba 500GB x 1                                       1,090\n" +
" 		Apacer PANTHER AS340 120GB x 1                          1,650\n" +
" 		TSUNAMI Extreme 580W                                      400\n" +
" 		NEOLUTION E-SPORT Newtron neo-1007 Black/Red              490\n" +
" 		DEEPCOOL GAMMAXX 200T                                     520\n" +
" 		ACER EB192Qb x 1                                        2,080\n" +
               "Total	12,430.-");
    System.out.println("************************SET 4************************\n" +
" 		INTEL Core i3-8100                                      4,290\n" +
" 		MSI H310M PRO-VH                                        2,290\n" +
" 		GALAX GTX1050 OC 2GB x 1                                3,850\n" +
" 		Apacer PANTHER DDR4 8GB 2133 (8GBx1) Glay x 1           2,090\n" +
" 		Western Digital Blue 1TB WD10EZEX x 1                   1,280\n" +
" 		Western Digital WD GREEN 120GB x 1                      1,990\n" +
" 		NEOLUTION Gamemaster Pro 700W                             890\n" +
" 		Tsunami Super Zero                                      1,190\n" +
" 		COOLER MASTER Hyper 212 LED                             1,350\n" +
" 		AOC E2180SWN x 1                                        2,830\n" +
               "Total	22,050.-");
    System.out.print("Enter computer set :");
    co = C.nextInt();
    }while(co!=1 && co!=2 && co!=3 && co!=4);
    
    System.out.println("Press 1 OK // Press 2 select New");
    System.out.println("Enter number");
    e = w.nextInt();
    }while(e==2);
    //--------------------------------------------------------------------------------
    System.out.println("\n============================Bill===========================\n");
    switch (co){
        case 1 : 
             System.out.println("************************SET 1************************\n"+
" 		AMD Ryzen 5 1500X                               5,870\n" +
" 		ASROCK A320M-HDV                                1,680\n" +
" 		GIGABYTE GTX1050Ti OC 4G 4GB x 1                5,890\n" +
" 		Apacer PANTHER DDR4 8GB 2133 (8GBx1) Glay x 1	2,090\n" +
" 		Western Digital Blue 1TB WD10EZEX x 1           1,280\n" +
" 		SAMSUNG 960 EVO M.2 250GB x 1                   4,450\n" +
" 		KINGSTON A400 120GB x 1                         1,390\n" +
" 		NEOLUTION Gamemaster Pro 700W                     890\n" +
" 		Tsunami Unlimited T7+ Black                     2,390\n" +
" 		ALSEYE Galaxy G120                              1,590\n" +
" 		ACER Gaming KG241Q x 1                          4,890\n"
             + "Total     32,410.-");
             set = 32410;
             break;
        case 2 :
             System.out.println("************************SET 2************************\n" +
" 		INTEL Core i5-8400                                      6,900\n" +
" 		GIGABYTE Z370 AORUS Ultra Gaming                        5,570\n" +
" 		MSI GTX1050Ti GAMING X 4GB x 1                          6,890\n" +
" 		CORSAIR Vengeance LPX DDR4 8GB 2400 (4GBx2) Red x 1	3,790\n" +
" 		SEAGATE BARRACUDA 1TB x 1                               1,350\n" +
" 		Western Digital WD BLUE M.2 250GB x 1                   2,800\n" +
" 		KINGSTON A400 120GB x 1                                 1,390\n" +
" 		THERMALTAKE Smart RGB 700W 80 Plus                      2,390\n" +
" 		NEOLUTION E-SPORT SAPPHIRE                              1,590\n" +
" 		COOLER MASTER V8 GTS                                    2,890\n" +
" 		SAMSUNG LS22F350FHE x 1                                 3,690\n" +
                "Total	39,250.-");
             set = 39250 ; 
             break;
         case 3 :
            System.out.println("************************SET 3************************\n" +
" 		AMD A4-7300                                               990\n" +
" 		GIGABYTE GA-F2A68HM-DS2                                 1,540\n" +
" 		INNO3D GT1030 0dB 2GB x 1                               2,380\n" +
" 		CORSAIR Vengeance C9 DDR3 1600 4GB x 1                  1,290\n" +
" 		Toshiba 500GB x 1                                       1,090\n" +
" 		Apacer PANTHER AS340 120GB x 1                          1,650\n" +
" 		TSUNAMI Extreme 580W                                      400\n" +
" 		NEOLUTION E-SPORT Newtron neo-1007 Black/Red              490\n" +
" 		DEEPCOOL GAMMAXX 200T                                     520\n" +
" 		ACER EB192Qb x 1                                        2,080\n" +
               "Total	12,430.-");
            set = 12430 ; 
            break;
        case 4 :
            System.out.println("************************SET 4************************\n" +
" 		INTEL Core i3-8100                                      4,290\n" +
" 		MSI H310M PRO-VH                                        2,290\n" +
" 		GALAX GTX1050 OC 2GB x 1                                3,850\n" +
" 		Apacer PANTHER DDR4 8GB 2133 (8GBx1) Glay x 1           2,090\n" +
" 		Western Digital Blue 1TB WD10EZEX x 1                   1,280\n" +
" 		Western Digital WD GREEN 120GB x 1                      1,990\n" +
" 		NEOLUTION Gamemaster Pro 700W                             890\n" +
" 		Tsunami Super Zero                                      1,190\n" +
" 		COOLER MASTER Hyper 212 LED                             1,350\n" +
" 		AOC E2180SWN x 1                                        2,830\n" +
                "Total	22,050.-");
            set = 22050 ; 
            break;
       
}
    
    sum = set ;
    System.out.println("total is "+ sum + " THB");
    
   // end a = new end();
   // a.en();
    
    }
     
   
}



