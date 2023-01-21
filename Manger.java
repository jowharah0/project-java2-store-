/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
public final class Manger extends Employee {

    private static int [] MangerID=new int[6];
    private int Count;

    public Manger(String name, double salary) {
        super(name, salary);
        MangerID[Count++]=ID;     
    }
    
    public static boolean Check(int Id){
       for(int i=0;i<MangerID.length;i++){
           if(Id==MangerID[i]) 
               return true;
           else 
               return false;}
       { return false;}} ////checkkkkkkkkkkkkkkkkkkkkkkkkkkk
   
}
     

    

