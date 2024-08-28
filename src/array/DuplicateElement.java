package array;

public class DuplicateElement {
    public static void duplicate(int[] arr){
        for(int i=0; i< arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
        //return 0;

    }

    public static void main(String[] args) {
        int[] arr = {2,2,5,7,9,1,1};
       duplicate(arr);
    }
}
