/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public class Employee extends User{
    private double salary;
    private final String Manger="(Manger)";

    public Employee( String name,double salary) {
        super(name);
        this.salary = salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
     //if
        return name;
    }
    
    public double getSalary() {
        
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double UpdateBonus(){
        return salary*1.15;
    }
   
    public String toString(String salary,Employee employee ){
        String emp="";
        if(employee instanceof Manger)
            emp+=Manger;
        if(salary.equals("salary"))
            emp+="Employee : "+getName()+"("+getID()+") has $"+getSalary();
        else
             emp+="Employee : "+getName()+"("+getID()+") has $"+ UpdateBonus();  
        
        return emp;
    }
    
    
}
