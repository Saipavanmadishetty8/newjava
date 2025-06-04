import java.util.*;

public class MissingNum {
    public static int[] cArray(Scanner s, int x){

        int[] arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i] = s.nextInt();

        }
        return arr;
    }
    public static List<Integer> missingNum(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        for(int i:arr){
            hs.add(i);
        }
        for(int i=1;i<+arr.length;i++){
            if(!hs.contains(i)) ls.add(i);
        }
        return ls;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = cArray(sc,n);
        List<Integer> res = missingNum(a);
        System.out.println(res);

    }
}
