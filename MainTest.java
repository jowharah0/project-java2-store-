/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author sadeemfaisal
 */
public class MainTest {
    
    
    public static void main(String[] args) {
        
        
        
     Products p1=new Products ("Milk",2.50);
     Products p2=new Products("Egg",10.75);
     Products p3=new Products("Cake",30);
     Products p4=new Products("Apple",4.99);
     Products p5=new Products("Banana",6.65);
     Products p6=new Products("Candy",8.70);
     Products p7=new Specialproduct("Backpack",10.65);
     Specialproduct P7 = (Specialproduct)p7;
     Products p8=new Specialproduct("Pencil",2);
     Specialproduct P8 = (Specialproduct)p8;
     Products p9=new Specialproduct("Pen",1.70);
     Specialproduct P9 = (Specialproduct)p9;
     Products p10=new Products("Orange",5);
     Products p11=new Products("Watermelon",3.99);
     Products p12=new Specialproduct("Eraser",0.50);
     Specialproduct P12 = (Specialproduct)p12;
     Products p13=new Specialproduct("Headphone",15);
     Specialproduct P13 = (Specialproduct)p13;
     Products p14=new Specialproduct("Phone",1300);
     Specialproduct P14 = (Specialproduct)p14;
     Products p15=new Specialproduct("Ipad",1499.99);
     Specialproduct P15 = (Specialproduct)p15;
     Products p16=new Products("Bread",2.7);
     
         Store store = new Store("SAS Store");

         
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
     
     
     
     //store.addProduct(p16);
     
     //System.out.println(store.isExist(2));
    System.out.println(store);
     
     Customer C1=new Customer("Sara");
     Customer C2=new Customer("Sadeem");
     Employee E1 = new Manger("Aljohra",15000);
     Employee E2 = new Employee("Noura",10000);
     
      store.RemoveProduct(3);
                store.RemoveProduct(4);
                store.RemoveProduct(5);
     
        System.out.println(store);
        
          


     
     
    }
     
}
