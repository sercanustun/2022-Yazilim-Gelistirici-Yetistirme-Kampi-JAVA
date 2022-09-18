package src.odevler.o1;

public class V23MiniProje5SayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 10};
        int aranacak = 8;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi)
            System.out.println("Sayı mevcuttur");
        else
            System.out.println("Sayı mevcut değildir.");

    }
}
