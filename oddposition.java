package array2;

import org.w3c.dom.ls.LSOutput;

public class oddposition {
    public static void main(String[] args) {


    int[] arr={1,2,3,4,5,6,7,8,9,10};
    System.out.println("elements in odd position");
    for(int i=0;i< arr.length;i=i+2)
        System.out.print(arr[i]+" ");
}
}
