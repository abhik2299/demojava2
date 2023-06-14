package array2;

public class smallarray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 11, 67, 81, 13, 64, 54, 91, 22};
        int small = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i])
                small = arr[i + 1];
            else
                small = arr[i];
        }
        System.out.println("The smallest element of array  " + small);
    }
}
