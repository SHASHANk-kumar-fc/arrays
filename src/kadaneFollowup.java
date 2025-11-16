import java.util.Scanner;

public class kadaneFollowup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int [7];
        for(int i=0;i<7;i++){
         arr[i]=sc.nextInt();
        }
       int[]index=new int[2];
        kadane(arr,7,index);
        for(int i=index[0];i<=index[1];i++){
            System.out.println(arr[i]);
        }
    }

    private static void kadane(int[] arr, int n,int[]result) {
        int sum=0;int start=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum==0)start=i;
            sum+=arr[i];
            if(sum>max){
                max=sum;
                result[0]=start;
                result[1]=i;
            }

            if(sum<0){
                sum=0;

            }
        }
    }
}
