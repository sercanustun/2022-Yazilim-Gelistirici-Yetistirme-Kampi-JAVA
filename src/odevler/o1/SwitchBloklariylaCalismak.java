package src.odevler.o1;

public class SwitchBloklariylaCalismak {
    public static void main(String[] args) {

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükkemmel : geçtiniz ");
                break;
            case 'B':
                System.out.println("Çok güzel : geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }


    }
}
