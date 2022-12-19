import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    double yariCap, pi, aci, alan, dilimAlani,cevre;

        System.out.print("Yarı Çapı Giriniz: ");
        yariCap = inp.nextDouble();

        System.out.print("Açı Değerini Giriniz: ");
        aci = inp.nextDouble();

        pi = 3.14;
        alan = pi * yariCap * yariCap;
        dilimAlani = (alan * aci) / 360;
        cevre = 2 * pi * yariCap;

        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Dilim Alanı: " + dilimAlani);
        System.out.println("Dairenin Toplam Alanı: " + alan);


    }
}