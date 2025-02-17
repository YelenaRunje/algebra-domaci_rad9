import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Proizvod> proizvodi = new ArrayList<>();

        System.out.println("Unesite proizvode (za prekid unosa unesite 'x' kao naziv):");

        while (true) {
            System.out.print("Unesi naziv proizvoda: ");
            String naziv = sc.nextLine();
            if (naziv.equalsIgnoreCase("x")) {
                break;
            }

            System.out.print("Unesi cijenu: ");
            double cijena = Double.parseDouble(sc.nextLine());

            System.out.print("Unesi količinu: ");
            int kolicina = Integer.parseInt(sc.nextLine());

            proizvodi.add(new Proizvod(naziv, cijena, kolicina));
        }

        sc.close();

        System.out.println("\nUneseni proizvodi:");
        for (Proizvod p : proizvodi) {
            System.out.println("\t * "+p.getInfo());
        }
    }
}