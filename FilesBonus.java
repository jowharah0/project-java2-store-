/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;
import java.util.Scanner;
import java.nio.file.Paths;
public class FilesBonus {
     private static Scanner input;
    public static void main(String[] args) throws Exception
    {
  
    
    
       Scanner input = new Scanner(System.in);
         input = new Scanner(Paths.get("Products.txt"));
         while (input.hasNext()) 
        {  Store store = new Store(input.nextLine());
           Products p1=new Products (input.next(),input.nextDouble());
           Products p2=new Products (input.next(),input.nextDouble());
           Products p3=new Products (input.next(),input.nextDouble());
           Products p4=new Products (input.next(),input.nextDouble());
           Products p5=new Specialproduct (input.next(),input.nextDouble());
           Products p6=new Products (input.next(),input.nextDouble());
           Products p7=new Products (input.next(),input.nextDouble());
           Products p8=new Products (input.next(),input.nextDouble());
           Products p9=new Products (input.next(),input.nextDouble());
           Products p10=new Products (input.next(),input.nextDouble());
           Products p11=new Products (input.next(),input.nextDouble());
           Products p12=new Products (input.next(),input.nextDouble());
           Products p13=new Products (input.next(),input.nextDouble());
           Products p14=new Products (input.next(),input.nextDouble());
           Products p15=new Products (input.next(),input.nextDouble());
           Customer C1=new Customer(input.next());
           Customer C2=new Customer(input.next());
           Employee E1 = new Manger(input.next(),input.nextDouble());
           Employee E2 = new Employee(input.next(),input.nextDouble());
            closeFile1(); 
      
            
     store.addProduct(p1);
     store.addProduct(p2);
     store.addProduct(p3);
     store.addProduct(p4);
     store.addProduct(p5);
     store.addProduct(p6);
     store.addProduct(p7);
     store.addProduct(p8);
     store.addProduct(p9);
     store.addProduct(p10);
     store.addProduct(p11);
     store.addProduct(p12);
     store.addProduct(p13);
     store.addProduct(p14);
     store.addProduct(p15);
     System.out.println();
     System.out.println(store);
            
            
   }}
    
    
    public static void closeFile1() {
        if (input != null) {
            input.close();
}}

    
 
    
    
  
    
}
