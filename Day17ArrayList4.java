import java.util.*;
public class Day17ArrayList4 {
    public static void main(String[]argss){
        Scanner in=new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //intitialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());

        }
        //add element
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());

            }
            System.out.println(list);
        }
    }
    
}
