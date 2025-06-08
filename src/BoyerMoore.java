import java.util.*;

public class BoyerMoore {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,1,1,2,2};
        int candidate=0,count=0;
        for(int i:arr){
            if(count==0){
                candidate =i;
            }
//            count+=(i==candidate)?1:-1;
            if(i==candidate) {
                count++;
            }
            else count--;
        }
        System.out.print(candidate);
    }
}
