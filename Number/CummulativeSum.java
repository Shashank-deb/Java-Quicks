import java.util.Arrays;
public class CummulativeSum {
    public static void main(String[] args) {
        int [] arr={9, 8, 7, 0, -2, 5};
        System.out.println(Arrays.toString(f(arr)));
    }
    public static int [] f(int [] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return arr;
    }
}
