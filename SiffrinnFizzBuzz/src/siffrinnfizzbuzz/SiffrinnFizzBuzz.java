package siffrinnfizzbuzz;

public class SiffrinnFizzBuzz {

       public static void main(String[] args) {
                   
       //If divisible by 3 print Fizz
       //if divisible by 5 print Buzz
        
        int one = 10;
        int two = 20;
        int three = 30;
      
        if (one%5==0)
             System.out.println("Buzz");
            if (two%5==0)
                 System.out.println("Buzz");
                if (three%5==0)
                    System.out.println("Buzz");
            if(one%3==0)
                    System.out.println("Fizz");
                if(two%3==0)
                    System.out.println("Fizz");
                    if(three%3==0)
                        System.out.println("Fizz");
        
      }
    
}
