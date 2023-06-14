package array2;

public class largearray {
    public static void main(String[] args) {
        int[] arr ={23,45,11,67,81,13,64,54,91,22};
        int greatest=0;
        for(int i=0;i<arr.length-1;i++)
        {
                if (arr[i+1] > arr[i])
                    greatest=arr[i+1];
                else
                    greatest=arr[i];
        }
        System.out.println("The largest element of array  "+greatest);
            }
        }


