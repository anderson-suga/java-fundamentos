/**
 * Created by suemareverton on 17/06/17.
 * Recursão
 */


public class Exercicio14 {

    private static void imprimeDe0AteN(int n) {
        for(int i = 0; i <= n; i++)
            System.out.println(i);
    }

    private static void imprimeDe0AteNComRecursao(int n) {
        if(n == 0)
            return;
        imprimeDe0AteNComRecursao(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
       // imprimeDe0AteN(10);
        imprimeDe0AteNComRecursao(2000000);
    }

}
