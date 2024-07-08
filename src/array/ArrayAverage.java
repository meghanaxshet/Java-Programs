package array;

public class ArrayAverage {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        int[] arr = {6, 9, 4, 3, 1};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Average of an array is : " + avg);
    }
}
