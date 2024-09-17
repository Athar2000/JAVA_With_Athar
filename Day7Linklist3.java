import java.util.*;
public class Day7Linklist3 {
    
    public Day7Linklist3 removeNthFormEnd(Day7Linklist3 head,int n,next ){
        if (head.next==null);{
            return null;

        }
        //size
        int size=0;
        Day7Linklist3 curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        //previous node
        int indexToSearch=size-n;
        Day7Linklist3 prev=head;
        int i=1;
        while(i<indexToSearch){
            prev=prev.next;

            i++;



        }
        prev.next=prev.next.next;
        return head;




    }
}
