import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x, nbr, vMin, vMax;

        System.out.print("Kaç adet sayı girilecek? => ");
        x = scan.nextInt();

        System.out.print("1. sayıyı giriniz => ");
        nbr = scan.nextInt();

        vMin = nbr;
        vMax = nbr;

        for (int i = 2; i <= x; i++){

            System.out.print(i + ". sayıyı giriniz => ");
            nbr = scan.nextInt();

            if (nbr < vMin)
                vMin = nbr;

            if (nbr > vMax)
                vMax = nbr;

        }

        System.out.println("En küçük değer = " + vMin);
        System.out.println("En büyük değer = " + vMax);

    }
}
