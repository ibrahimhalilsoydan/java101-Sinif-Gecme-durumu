import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik,fizik, kimya, turkce,muzik;
        double avarage;

        System.out.print("Matematik notunu giriniz:");
        matematik =input.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik =input.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya =input.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        turkce =input.nextInt();

        System.out.print("Müzik notunu giriniz:");
        muzik =input.nextInt();

       if ((matematik <= 100 && matematik > 0 )
               && (fizik <= 100 && fizik > 0 )
               && (kimya <= 100 && kimya > 0 )
               &&  (turkce <= 100 && turkce > 0 )
               &&  (muzik <= 100 && muzik > 0 ) ) {

           avarage =(matematik + fizik + kimya + turkce + muzik)/5;

           if (avarage >= 55){
               System.out.print("Ortalamanız : "+avarage+ "   Tebrikler sınıfı geçtiniz..");
           }else {
               System.out.print("Ortalamanız : "+avarage+ "   Malesef..Sınıfta kaldınız..");
           }
       }else {
           System.out.print("Hatalı not girişi!!! Ders notları 0 - 100 arasında değer almak zorundadır lütfen geçerli not degerleri girizin. ");
       }


    }
}