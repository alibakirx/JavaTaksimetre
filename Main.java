import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenlerimizi tanımlıyoruz.
        int acilisUcreti = 10,gidilenKm;
        double kmUcreti = 2.20,odencekTutar;

        // Kullanıcıdan kaç km yol gidildiğine dair sayısal bir değer alıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km mesafe gidildi ? ");
        gidilenKm = input.nextInt();

        //Açılış ücretiyle beraber toplam ücreti hesaplıyoruz.
        odencekTutar = acilisUcreti + (gidilenKm * kmUcreti);

        // Minimum ödenecek değer 20 TL olduğu için koşul ifadeleriyle ne kadar ödeyeceğini belirliyoruz.
        if (odencekTutar <= 20){
            System.out.print("Toplam Borcunuz 20 TL'dir  ");
        }
        else{
            System.out.printf("Toplam borcunuz: %,.3f ", odencekTutar);

        }





    }
}