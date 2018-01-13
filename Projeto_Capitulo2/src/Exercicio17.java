/**
 * Created by suemareverton on 13/06/17.
 */
public class Exercicio17 {

    /*
        Sem as instruções break, toda vez que ocorre uma correspondência
        nas instruções switch, as instruções para esse caso e casos
        subsequentes são executadas até que uma instrução break
        ou o fim do switch seja encontrado.

        Isso costuma ser referido como “falling through”, que é o processo
        em que a instrução percorre sucessivamente os cases subsequentes.
     */

    public static void main(String[] args) {

        String mes = "maio";

        switch (mes) {
            case "Janeiro":
                System.out.println("Janeiro");
            case "Fevereiro":
                System.out.println("Fevereiro");
            case "Março":
                System.out.println("Março");
            case "Abril":
                System.out.println("Abril");
            case "Maio":
                System.out.println("Maio");
            case "Junho":
                System.out.println("Junho");
            case "Julho":
                System.out.println("Julho");
            case "Agosto":
                System.out.println("Agosto");
            case "Setembro":
                System.out.println("Setembro");
            case "Outubro":
                System.out.println("Outubro");
            case "Novembro":
                System.out.println("Novembro");
            case "Dezembro":
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
        }
    }
}
