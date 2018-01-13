/**
 * Created by suemareverton on 15/06/17.
 * Conversões entre tipos
 * Referência: https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html
 */

public class Exercicio0 {

    public static void main(String[] args) {

        // Boolean para String


        String flag = String.valueOf(true);

        // int para String
        String idadeEmString = String.valueOf(10);

        // float para String
        String salarioEmString = String.valueOf(1234.56);

        // array de caracteres para String
        char[] arrayChar = { 'D','S','A' };
        String nome = String.valueOf(arrayChar);

        // String para int
        int idade = Integer.parseInt("10");

        // String para float
        float salario = Float.parseFloat("123.45");

        // String para double
        double salarioMuitoGrande = Double.parseDouble("123456.78");

        int salarioTruncado = (int) 12345.67F;

        // Um int pode receber um short? Sim!
        short meuShort = 10;
        int meuInteiro = meuShort;

        // E um short, pode receber um inteiro? Não!
        // meuInteiro = 2000000000;
        // meuShort = meuInteiro;

        // E se quisermos fazer uma conversão explícita?
        meuInteiro = 2000000000;
        meuShort = (short) meuInteiro;
        System.out.println(meuShort);
    }

}
