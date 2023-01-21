/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
public final class Specialproduct extends Products {
    private  Specialproduct [] specialproducts;
    private  int NoProduct;
    private String relationship;
    
    public Specialproduct(String relationship,Specialproduct [] specialproducts,int size) {
        this.relationship=relationship;
        this.specialproducts=new Specialproduct[size];
        for(int i=0;i<this.specialproducts.length;i++){
            this.specialproducts[i]=specialproducts[i];
        } }

    public Specialproduct(String Pname, double Price) {
        super(Pname, Price);
    }
    @Override
     public String toString(){
        return getPname()+"("+getId()+")"+" costs $"+getPrice();
    }

      public String Print() {
          String Print="";
          for (int i=0;i<specialproducts.length;i++) 
                Print+= "- " + specialproducts[i]+"\n";
          return "Products in the offer " + relationship + ":\n" +Print;
     }
       public void Printlist() {
           for(int j=0;j<this.specialproducts.length;j++){
              System.out.print("( in "+this.specialproducts[j].getPname()+" ) the relation ");
               System.out.println(Print());}    
     }
    }
    