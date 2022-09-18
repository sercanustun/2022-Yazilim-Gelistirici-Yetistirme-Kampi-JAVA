package src.odevler.o1;

public class V19MiniProje1SayiAsalMi {
    public static void main(String[] args) {
        int number = 2;
        boolean isPrime = true;


        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayi asaldir.");
        } else
            System.out.println("Sayi asal değildir.");

    }


}

