package collection;


import java.util.*;

public class FrequentElement {
    public static Map<Integer, Integer> frequent(List<Integer> arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size();i++){
            if (map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
            else {
                map.put(arr.get(i),1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(frequent(list));
    }
}
