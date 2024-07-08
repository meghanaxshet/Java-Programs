package array;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {20, 10, 15, 3, 8, 9, 5, 45, 21};
        int lowestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (lowestElement > arr[i]) {
                lowestElement = arr[i];
            }
        }
        System.out.println("Smallest Element is : " + lowestElement);
    }
}
