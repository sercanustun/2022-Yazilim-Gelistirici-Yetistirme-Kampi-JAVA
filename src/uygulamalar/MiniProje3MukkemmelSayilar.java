package src.uygulamalar;

public class MiniProje3MukkemmelSayilar {
    public static void main(String[] args) {
        int number = 6;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println("Mükkemmel sayıdır.");
        } else {
            System.out.println("Mükkemmel sayi değildir.");
        }
    }
}
