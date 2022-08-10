import java.util.Scanner;
//n basamaki fibonacci sayisi bulma

public class Main {
    public static void main(String[] args) {
        int n, i = 1,n1=0,n2=1, total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        n = inp.nextInt();

        do {
            System.out.print(total+" ");
            total=n1+n2;
            n1=n2;
            n2=total;
            i++;
        }while (i<=n);


    }
}






