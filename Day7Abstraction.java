

abstract class Animal{
   abstract  public void walk();

    }

class horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");

    }

}
class Chicken  extends Animal{
    public void walk(){

        System.out.println("walks on 2 legs ");
    }
}


public class Day7Abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
       
        
    }
    
}
