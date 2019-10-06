package pl.altkom.kolekcje.mapy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class UnikalneSlowa {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> slowa = new HashSet<>();
        Scanner sc = new Scanner(new FileInputStream("/home/student/Pobrane/lalka-tom-pierwszy.txt"));
        String maxSlowo = "";
        int max = 0;

        while (sc.hasNext()) {
            String slowo = sc.next().toLowerCase();
            for (String part: slowo.split("[,./:!?;()\\-_'`0123456789+*–]")){
                if(part.length()>max){
                    max = part.length();
                    maxSlowo = part;
                }
                slowa.add(part);
            }
        }

        System.out.println(slowa.size());
        System.out.println(maxSlowo);
        System.out.println(max);

    }
    }


