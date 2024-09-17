public class Day23OOP8 {
    public static void main(String[] args) {
        
    }
    //this is not  dependent on object
    static void fun(){
        main obj=new main();

    

        obj.greeting();//you can use this becouse it require an instance
        //but the funtion you are using it in does not depent on instance
        //you can not access non static stuff without referencing thier instance in
        //a static contex
        //hence,here i am referencing it
    }
    ///we know that something whitch is not static ,belong to an object
    void greeting(){
        System.out.println("Hello World");
    }
}
