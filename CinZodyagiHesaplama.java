package CaglaSonmez;

import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = input.nextInt();

        String cinZodyagiBurcu = "";

        switch (dogumYili % 12) {
            case 0:
                cinZodyagiBurcu = "Maymun";
                break;
            case 1:
                cinZodyagiBurcu = "Horoz";
                break;
            case 2:
                cinZodyagiBurcu = "Köpek";
                break;
            case 3:
                cinZodyagiBurcu = "Domuz";
                break;
            case 4:
                cinZodyagiBurcu = "Fare";
                break;
            case 5:
                cinZodyagiBurcu = "Öküz";
                break;
            case 6:
                cinZodyagiBurcu = "Kaplan";
                break;
            case 7:
                cinZodyagiBurcu = "Tavşan";
                break;
            case 8:
                cinZodyagiBurcu = "Ejderha";
                break;
            case 9:
                cinZodyagiBurcu = "Yılan";
                break;
            case 10:
                cinZodyagiBurcu = "At";
                break;
            case 11:
                cinZodyagiBurcu = "Koyun";
                break;
            default:
                System.out.print("Hatalı Giriş Yaptınız! ");
        }

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagiBurcu);
    }
}
