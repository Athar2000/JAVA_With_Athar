class Student{

String name;
int age ;
public void printInfo(){
    System.out.println("Name : "+name);
    System.out.println("Age  : "+age);
    
}
Student (String name,int age){
    this.name=name;
    this.age=age;
}
}

public class Day7Oops4 {
    public static void main(String[] args){
        Student s1=new Student("aman",24);
        s1.printInfo();

    }
   
    
}
