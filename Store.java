/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Sara
 */
public class Store {
    private String Sname;
    private Products[] product= new Products[15];//assume 100
    private int NoProduct;
    private static int receiptNumber;
    
    
    public Store(String name) {
         Sname=name;
    }
    public String getSname() {
        return Sname;
    }

    public int getNoProduct() {
        return NoProduct;
    }
    
    public void addProduct (Products product){ //check
         if (this.NoProduct < this.product.length)
            this.product[this.NoProduct++] = product;
        else
            System.out.println("Full!");
     }
     public boolean isExist(int ID)  {//check
      for (int i=0;i<NoProduct;i++)
             if(product[i].getId()==ID){
                 return true;}
        return false;
    }
       public void RemoveProduct (int ID){
        if(isExist(ID)){
            Products temp= product[product.length-1];
            for(int i=0;i<product.length;i++)
                if(product[i].getId()==ID){
                    for(int j=i;j<product.length-1;j++){
                        product[j]=product[j+1];
                        if(j==product.length-2)
                         product[product.length-2]=temp;
                    }
                        product[product.length-1]=new Products(null,0.0); 
                        NoProduct--;}
                }   
           }
    public String Totalprice(Products[] products, Customer customer){
        double total=0;
        for (Products product1 : products) {
            total += product1.getPrice();}
        if(customer.getStatus().equals("Special"))
            return String.format("(after discount)$%.2f ", total*0.75);
        else
            return String.format("$%.2f", total);
        
    }
    public String Buy(Products[] product1, Customer customer){
        
        String CheckOut="";
      for(int i =0;i<product1.length;i++){
          
          if(isExist(product1[i].getId())){
              RemoveProduct(product1[i].getId());
                   CheckOut+=product1[i]+"\n";}
          
          else 
              System.err.println("Product is not available");}
        ++receiptNumber;
        customer.Status();
      return String.format("WELCOME TO * %s *%nReceipt Number is : %d %nProducts Purchased :%n%sTotal Price : %s"
              ,Sname,receiptNumber , CheckOut , Totalprice(product1,customer) );
    }
    @Override
    public String toString(){
        String Print="";
        for (int i=0;i<NoProduct;i++){ 
            if(this.product[i].getPname()!=null)
            
           
             Print+= "Product"+": "+this.product[i]+"\n";}
        return  "It contains "+( getNoProduct()  )+" product(s)\n"+Print;   
    } 
     public boolean MangerRemove (int ID){
        if(isExist(ID) ){
          RemoveProduct(ID);
          return true;}
         else
           return false;
     }
public boolean test (int a){
    if(a==1)
        return true;
    else 
        return false;
}
    
 
    
}
