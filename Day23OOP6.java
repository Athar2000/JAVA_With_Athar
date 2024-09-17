import java.util.*;
public class Day23OOP6 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    public humain(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        humain.population+=1;
    }
    
}
