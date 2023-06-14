package array2;

public class ascend {
    public static void main(String[] args) {
        int[] arr={2,5,1,6,3,8,5,9,4,10,4};
        int t;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if (arr[j] > arr[j+1])
                {
                 t=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=t;
                }

            }
    }
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
}
}