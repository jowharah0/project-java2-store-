
package project;
import java.util.Scanner; 
public class Project {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
    
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
        System.out.println("Test1");  
    Store store = new Store("SAS Store");
     System.out.println("Welcome to "+store.getSname());
     
     
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
    //store.addProduct(p16);
     
     Customer C1=new Customer("Sara");
     Customer C2=new Customer("Sadeem");
     Employee E1 = new Manger("Aljohra",15000);
     Employee E2 = new Employee("Noura",10000);
//    
     
     System.out.println("The users are :");
     System.out.println(C1);
     System.out.println(C2);
     System.out.println(E1.toString("salary",E1));
     System.out.println(E2.toString("salary",E2));
     
     System.out.println();
        System.out.println("Test2");
     System.out.println("Increase all salaries with 15%");
     System.out.println(E1.toString("Bonus",E1));
     System.out.println(E2.toString("Bonus",E2));
        System.out.println("Test3");
     System.out.println();
     System.out.println("Store before 3 correct buy opeartion :"+store.getSname());
     System.out.println(store);
     Products[] Buy1={p1,p5,p3};
     System.out.println();
     
     System.out.println(store.Buy(Buy1,C1));
     System.out.println(C1);
     System.out.println("------------------------------------------------");
     System.out.println();
     System.out.println("Store after the first correct buy opeartion :"+store.getSname());
     System.out.println();
     System.out.println(store);
     System.out.println();
     Products[] Buy2={p4,p11,p6};
     System.out.println(store.Buy(Buy2,C1));
     System.out.println(C1);
     System.out.println("------------------------------------------------");
     System.out.println();
     System.out.println("Store after the second correct buy opeartion :"+store.getSname());
     System.out.println();
     System.out.println(store);
     Products[] Buy3={p2};
     System.out.println(store.Buy(Buy3,C1));
     System.out.println(C1);
     System.out.println("------------------------------------------------");
     System.out.println();
     System.out.println("Store after the third correct buy opeartion :"+store.getSname());
     System.out.println();
     System.out.println(store);
     
     System.out.println("The customers are :");
     System.out.println(C1);
     System.out.println(C2);
        System.out.println("Test4");
     System.out.println("------------------------------------------------");
     System.out.println();
     System.out.println("Store before a wrong buy opeartion :"+store.getSname());
     System.out.println();
     System.out.println(store);
     System.out.println("The customer needs :");
     System.out.println(p4);
     System.out.println(p10);
     if(!store.isExist(p4.getId()))
       System.out.println("Sorry the product "+p4.getPname()+" doesn't exist in the store");
     if(!store.isExist(p10.getId())) 
         System.out.println("Sorry the product "+p10.getPname()+" doesn't exist in the store");
     System.out.println("---");
     System.out.println("Store after a wrong buy opeartion :"+store.getSname());
     System.out.println();
     System.out.println(store);
     System.out.println("The users are :");
     System.out.println(C1);
     System.out.println(C2);
     System.out.println(E1.toString("Bonus",E1));
     System.out.println(E2.toString("Bonus",E2));
     //5
        System.out.println("Test5");
     System.out.println("------------------");
     System.out.println("store before add product:"+store.getSname());
     System.out.println(store);
     store.addProduct(p16);
     //6
     System.out.println("Test6");
     System.out.println("The list of the first special products :");
   
    
     Specialproduct[] school={P7,P8,P9,P12};
     Specialproduct School=new Specialproduct("Back to School",school,4);
     System.out.println(School.Print());
     System.out.println();
     
     School.Printlist();
     

     System.out.println("The list of the second special products :");
     System.out.println();
     Specialproduct[] technology={P13,P14,P15};
     Specialproduct tech=new Specialproduct("Technology SALE",technology,3);
     System.out.println(tech.Print());
     tech.Printlist();
     System.out.println("Test7");
     System.out.println("---------------------------");
     System.out.println(C1);
     System.out.println(C2);
     System.out.println(E1.toString("Bonus",E1));
     System.out.println(E2.toString("Bonus",E2));
     
     //feature 2
     System.out.println("Enter user Id :");
     int ID=input.nextInt();
     if(Manger.Check(ID))
      new Gui(store);
     else 
        System.out.println("Can't remove a product. Only Mangers can remove the product"); 
    

     
    
    
}
}
