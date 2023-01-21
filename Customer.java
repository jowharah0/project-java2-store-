/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public final class Customer extends User {
    private int VisitTime;
    private String status;
   
    public Customer(String name) {
        super(name);
        status="New";
    }
    public String getStatus() {
     
        return status;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public int getVisitTime() {
        return VisitTime;
    }
    public String Status(){
       VisitTime++;
        if(VisitTime>2)
          status="Special";
        return status;
    }
    
    public String toString(){
        return  getStatus()+" Customer : "+getName()+"("+getID()+") visits "+getVisitTime()+" time(s).";
    }
    
}
