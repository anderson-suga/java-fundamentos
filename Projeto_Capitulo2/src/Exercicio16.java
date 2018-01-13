/**
 * Created by suemareverton on 13/06/17.
 */
public class Exercicio16 {

    public static void main(String[] args) {

        int mes = 6;
        int ano = 2000;
        int numeroDias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0))
                    numeroDias = 29;
                else
                    numeroDias = 28;
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }

        System.out.println("Número de dias = " + numeroDias);
    }
}
