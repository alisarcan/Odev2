import java.util.Scanner;

public class Kdv {
    public static void main(String[] args){
        double ucret, kdv1 = 0.18, kdv2 = 0.08, kdvOrani;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz : " );
        ucret = input.nextDouble();

        kdvOrani = (ucret > 0 && ucret < 1000) ? kdv1 : kdv2;
         ucret = ucret + (ucret * kdvOrani);

        System.out.print("Kdv'li tutar :" + ucret);









    }
}
