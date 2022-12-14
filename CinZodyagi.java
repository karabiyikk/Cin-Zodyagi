package KosulluIfadeler;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogum, zodyak;
        String burc;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogum = input.nextInt();
        zodyak = dogum % 12;

        if (zodyak == 0) {
            burc = "Maymun";
        } else if (zodyak == 1) {
            burc = "Horoz";
        } else if (zodyak == 2) {
            burc = "Köpek";
        } else if (zodyak == 3) {
            burc = "Domuz";
        } else if (zodyak == 4) {
            burc = "Fare";
        } else if (zodyak == 5) {
            burc = "Öküz";
        } else if (zodyak == 6) {
            burc = "Kaplan";
        } else if (zodyak == 7) {
            burc = "Tavşan";
        } else if (zodyak == 8) {
            burc = "Ejderha";
        } else if (zodyak == 9) {
            burc = "Yılan";
        } else if (zodyak == 10) {
            burc = "At";
        } else {
            burc = "Koyun";
        }
        System.out.print("Çin Zodyağı Burcunuz : " + burc);
    }
}