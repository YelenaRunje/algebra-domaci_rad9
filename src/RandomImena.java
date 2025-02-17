import java.util.Random;
import java.util.List;

public class RandomImena {
    public static void main(String[] args) {
        List<String> imena = List.of("Iva", "Anita", "Marija", "Pera", "Šima", "Luca");
        List<String> prezimena = List.of("Jurić", "Antić", "Vuković", "Ratković", "Vuletić", "Anić");

        Random rand = new Random();

        System.out.println("Random kombinacije imena i prezimena:");
        for (int i = 1; i <= 5; i++) {
            String ime = imena.get(rand.nextInt(imena.size()));
            String prezime = prezimena.get(rand.nextInt(prezimena.size()));
            System.out.println(ime+" "+prezime);
        }
    }
}
