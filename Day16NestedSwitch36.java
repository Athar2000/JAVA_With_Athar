import java.util.Scanner;
public class Day16NestedSwitch36 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();
        switch(empID){
            case 1:
            System.out.println("AThar");
               break;
               case 2:
               System.out.println("Nimrah Shakeel");
               break;
               case  3:
               switch(department){
                case  "IT":
                System.out.println("IT department");
                break;
                case "Managment":
                System.out.println("Management Deparmnet");
                break:
                default:
                System.out.println("No depart,ent");


               }
               break;
               System.out.println("enter  correct EmpId");
        }

        

    }
    
}
