package array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {45,98,76,23,20};
        int sum = 0;
        for (int i =0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println("Sum of Array : " +sum);
    }
}
