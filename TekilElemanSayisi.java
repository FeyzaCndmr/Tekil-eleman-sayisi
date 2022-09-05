import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Soru3 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<String>();
        liste.add("elma");
        liste.add("armut");
        liste.add("ananas");
        liste.add("elma");
        liste.add("kiraz");
        liste.add("elma");
        Iterator<String> it = liste.iterator();
        Set<String> kume = new HashSet<>();
        while (it.hasNext()) {
            String i = it.next();
            kume.add(i);
        }
        System.out.println("Tekil olarak " + kume.size() + " adet eleman bulunuyor.");

    }
}
