/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public class Products {
    private String Pname;
    private double Price;
    private int Id;
    private static int CounterId=1;
    public Products(String Pname, double Price) {
        this.Pname = Pname;
        this.Price = Price;
        this.Id=CounterId++;
    }

    public Products() {
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getId() {
        return Id;
    }
    public String toString(){
        return getPname()+"("+getId()+")"+" costs $"+getPrice();
    }
    
    
}
