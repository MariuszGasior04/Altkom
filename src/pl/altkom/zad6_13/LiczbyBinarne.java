package pl.altkom.zad6_13;

public class LiczbyBinarne {
    public static void main(String[] args) {
        byte a = 1;
        byte b = (byte) (a<<4);
        System.out.println(b);
        byte c = 27;
        if ((c & a)==1){
            System.out.println("Stoi jedynka");
        } else {
            System.out.println("Stoi zero");
        }
    }
}
