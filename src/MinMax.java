import java.util.*;
public class MinMax {
    public static void minMax(int[] arr){
        int h = Integer.MIN_VALUE;
        int l = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>h) h=arr[i];
            if(arr[i]<l) l=arr[i];
        }
        System.out.println("["+l+","+h+"]");
    }
    public static void main(String[] args){
        int[] x = {14,55,67,89,99,26,7,180,77,82};
//        minMax(x);
        Arrays.sort(x);
        System.out.println("Lowest value: "+x[0]+"\tHighest value: "+x[x.length-1]);
    }
}
