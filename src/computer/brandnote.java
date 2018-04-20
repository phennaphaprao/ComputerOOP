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
public class brandnote extends generation implements ADDRESS,PHONE,EMAIL{
    String name ;
    public brandnote(String name){
        this.name=name;
    }
    
    public void address(){
        System.out.println("Address : "+super.address);
        
    }
    public void phone(){
        System.out.println("Address : "+super.phone);
    }
    public void email(){
        System.out.println("Email : "+super.email);
    }
    
    public void salary(){
    }
    void time(){
        System.out.println("Open is "+super.time);
    }
    void name(){
        System.out.println("Facebook : STORE COMPUTER");
    }
    void print(){
       System.out.println("==================="+name+"===================");
       address();
       phone();
       email();
       this.time();
       this.name();
    }
}
