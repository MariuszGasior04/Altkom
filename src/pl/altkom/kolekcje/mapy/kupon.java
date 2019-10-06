package pl.altkom.kolekcje.mapy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class kupon {
    public static void main(String[] args) {

        Random r = new Random();

        for(int i= 0; i<8;i++){
            Set<Integer> los = new TreeSet<>();
        while (los.size()<6){
            los.add(r.nextInt(49)+1);
        }
        System.out.println(los);
        }
        /*for(int j=0; j<49;j+=10){
            for(int i =0; i < 10; i++){
                if(i+j == 0){
                    System.out.printf("   ");
                }else if(i+j<50){
                    System.out.printf("%3d",i+j);
                }
            }
            System.out.println();
        }*/

    }


}
