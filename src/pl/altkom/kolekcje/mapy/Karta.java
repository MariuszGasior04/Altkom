package pl.altkom.kolekcje.mapy;

import java.util.*;
import java.util.concurrent.locks.StampedLock;

enum KolorKarty{
    KIER,KARO,PIK,TREFL;
}
enum FiguraKarty{
    K2, K3, K4, K5, K6, K7, K8, K9, K10, W, D, K, A;
}

public class Karta implements Comparable <Karta>{
    private final KolorKarty kolor;
    private final FiguraKarty figura;

    public Karta(KolorKarty kolor, FiguraKarty figura) {
        this.kolor = kolor;
        this.figura = figura;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Karta)) return false;
        Karta karta = (Karta) o;
        return kolor == karta.kolor &&
                figura == karta.figura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kolor, figura);
    }

    @Override
    public String toString() {
        return "Karta{" +
                "kolor=" + kolor +
                ", figura=" + figura +
                '}';
    }

    public static void main(String[] args) {
        Random r = new Random();
        List<Karta> Talia = new ArrayList<>();
        for(KolorKarty kolor:KolorKarty.values()){
            for(FiguraKarty figura:FiguraKarty.values()){
                Talia.add(new Karta(kolor,figura));
            }
        }
        //for(Karta k:Talia){
          //  System.out.println(k);
        //}
        for(int i = 0; i<1000; i++){
            int i1 = r.nextInt(Talia.size());
            int i2 = r.nextInt(Talia.size());

            Karta temp = Talia.get(i1);
            Talia.set(i1, Talia.get(i2));
            Talia.set(i2,temp);

        }
        List<String> players = Arrays.asList("Janel","Franek","Roman","Lolek");

        Map<String, Set<Karta>> rozdanie = new HashMap<>();

        for(String player: players){
            rozdanie.put(player, new TreeSet<>());
        }

        for(int i = 0; i< Talia.size();i++){
            String p = players.get(i % players.size());
            Karta karta = Talia.get(i);
            Set<Karta> rekaGracza = rozdanie.get(p);
            rekaGracza.add(karta);
        }


        System.out.println(Talia.size());
    }

    @Override
    public int compareTo(Karta karta) {
        return 0;
    }
}

