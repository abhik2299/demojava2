package array2;

public class frequency {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,1,4,5,4,4,2,6};
        int n=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    n=n+1;
            }
            System.out.println("the frequency of"+arr[i]+" "+n);
            n=0;
        }
    }
}
