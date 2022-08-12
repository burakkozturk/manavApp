import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar , elma = 2.5 , limon = 2.5 ,cilek = 2.5 ,armut = 2.5 ,muz = 2.5 , elmaK , limonK ,cilekK ,
                armutK,muzK;


        Scanner input = new Scanner(System.in);
        System.out.print("Alınacak Elma Miktarı : ");
        elmaK = input.nextInt();


        System.out.print("Alınacak Limon Miktarı : ");
        limonK = input.nextInt();


        System.out.print("Alınacak Cilek Miktarı : ");
        cilekK = input.nextInt();

        System.out.print("Alınacak Armut Miktarı : ");
        armutK = input.nextInt();

        System.out.print("Alınacak Muz Miktarı : ");
        muzK = input.nextInt();


        tutar = (elma*elmaK)+(muz*muzK)+(limon*limonK)+(cilek*cilekK)+(armut*armutK);

    }
}