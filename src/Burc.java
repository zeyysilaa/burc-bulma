import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int ay, gün;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Dogdugunuz ay :");
        ay = girdi.nextInt();
        System.out.println("Dogdugunuz gün");
        gün = girdi.nextInt();

        if (ay == 1 && (gün >= 1 && gün <= 21)){
            System.out.println("Oğlak burcusunuz.");
        }else if (ay == 1 && (gün >= 22 && gün <= 31)){
            System.out.println("Kova burcusunuz.");
        }if (ay == 2 && (gün >= 1 && gün <= 21)){
            System.out.println("Kova burcusunuz.");
        } else if (ay == 2 && (gün >= 22 && gün <= 28)) {
            System.out.println("Balık burcusunuz.");
        }if (ay == 3 && (gün >= 1 && gün <= 22)){
            System.out.println("Balık burcusunuz.");
        }else if (ay == 3 && (gün >= 22 && gün <= 31)){
            System.out.println("Koç burcusunuz.");
        }if (ay == 4 && (gün >= 1 && gün <= 21)){
            System.out.println("Koç burcusunuz.");
        } else if (ay == 4 && (gün >= 22 && gün <= 30)) {
            System.out.println("Boğa burcusunuz.");
        }if (ay == 5 && (gün >= 1 && gün <= 21)){
            System.out.println("Boğa burcusunuz.");
        }else if (ay == 5 && (gün >= 22 && gün <= 31 )){
            System.out.println("İkizler burcusunuz.");
        }if (ay == 6 && (gün >= 1 && gün <= 21)){
            System.out.println("İkizler burcusunuz.");
        } else if (ay == 6 && (gün <= 22 && gün <= 30) ) {
            System.out.println("Yengeç burcusunuz.");
        }if (ay == 7 && (gün >= 1 && gün <= 21)){
            System.out.println("Yengeç burcusunuz.");
        } else if (ay == 7 && (gün >= 22 && gün <=31)) {
            System.out.println("Aslan burcusunuz.");
        }if (ay == 8 && (gün >= 1 && gün <= 21)){
            System.out.println("Aslan burcusunuz.");
        } else if (ay == 8 && (gün >= 22 && gün <= 31)) {
            System.out.println("Başak burcusunuz.");
        }if (ay == 9 && (gün >= 1 && gün <= 21)){
            System.out.println("Başak burcusunuz.");
        }else if (ay == 9 && (gün >= 22 && gün <= 30)){
            System.out.println("Terazi burcusunuz.");
        }if (ay == 10 && (gün >= 1 && gün <= 21)){
            System.out.println("Terazi burcusunuz.");
        } else if (ay == 10 && (gün >= 22 && gün <= 31)) {
            System.out.println("Akrep burcusunuz.");
        }if (ay == 11 && (gün >= 1 && gün <= 21)){
            System.out.println("Akrep burcusunuz");
        }else if (ay == 11 && (gün >= 22 && gün <= 30)){
            System.out.println("Yay burcusunuz.");
        }if (ay == 12 && (gün >= 1 && gün <= 21)){
            System.out.println("Yay burcusunuz.");
        }else if (ay == 12 && (gün >= 22 && gün <= 31)){
            System.out.println("Oğlak burcusunuz.");
        }


    }
}
