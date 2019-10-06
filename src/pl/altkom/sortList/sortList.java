package pl.altkom.sortList;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sortList {
    public static void main(String[] args) {
        Random r = new Random(0);
        List<Integer> listInt = new ArrayList<>();
        for(int i = 0;i<10;i++){
            int a = r.nextInt(100);
            listInt.add(a);
        }
        System.out.println(listInt);
        for(int i = 0; i < listInt.size()-1; i ++){
            int min = listInt.get(i);
            int index = i;
            for (int j = i+1; j < listInt.size(); j++){
                int element = listInt.get(j);
                if(element <= min){
                    min = element;
                    index = j;
                }
            }
            listInt.set(index, listInt.get(i));
            listInt.set(i, min);
        }
        System.out.println(listInt);
    }

}
