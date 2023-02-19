import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pravougaonik pravougaonik = new Pravougaonik(10, 5);
        pravougaonik.povrsina();
        pravougaonik.povrsina(5, 8);

        Krug krug = new Krug();
        krug.setR(10);
        krug.povrsina();
        krug.povrsina(5);

        Kvadrat kvadrat = new Kvadrat();
        System.out.print("Unesite vrednost stranice kvadrata: ");
        double a = scanner.nextDouble();
        kvadrat.setA(a);
        kvadrat.povrsina();

    }
}