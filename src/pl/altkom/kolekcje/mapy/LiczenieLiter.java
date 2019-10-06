package pl.altkom.kolekcje.mapy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class LiczenieLiter {
    public static void main(String[] args) throws FileNotFoundException {
        Map <Character,Integer> mapa = new HashMap<>();
        Scanner sc = new Scanner(new FileInputStream("/home/student/Pobrane/lalka-tom-pierwszy.txt"));
        while (sc.hasNext()){
            String line = sc.nextLine().toLowerCase();
            //Tworzymy petle sprawdzającą każdą literę w linii. Sprawdzamy czy dana litera jest w Hashmapie.
            // Jezeli nie dodaje ją z wartościa 1. Jeżeli jest to zwieksza jej wartosc o 1
            for (Character ch : line.toCharArray()) {
                if (mapa.containsKey(ch) && Character.isAlphabetic(ch)) {
                    Integer v = mapa.get(ch);
                    mapa.put(ch, v + 1);
                } else {
                    mapa.put(ch, 1);
                }
            }
            //System.out.println(line);
        }
        for(Map.Entry<Character, Integer> e :mapa.entrySet()){
            System.out.printf("%s -> %d",e.getKey(), e.getValue());
            System.out.println();
        }

    }
}
