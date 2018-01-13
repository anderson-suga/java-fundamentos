/**
 * Created by suemareverton on 17/06/17.
 * Criando suas exceptions
 */
public class Exercicio12 {

    private static int anosParaCompletar100Anos(int idade)  {

        if (idade < 0)
            throw new IdadeMenorQue0Exception("Idade não pode ser menor que 0");
        if (idade > 100)
            throw new IdadeMaiorQue100Exception("Idade não pode ser maior que 100");

        return 100 - idade;
    }

    public static void main(String[] args) {
        try {
            int anosRestantes = anosParaCompletar100Anos(200);
            System.out.println("Faltam " + anosRestantes + " para você completar 100 anos");
        } catch (IdadeMenorQue0Exception im0e) {
            System.out.println("Idade não pode ser menor que 0");
        } catch (IdadeMaiorQue100Exception im100e) {
            System.out.println("Idade não pode ser maior que 100");
        }
    }
}

class IdadeMaiorQue100Exception extends IllegalArgumentException {
    IdadeMaiorQue100Exception(String message) {
        super(message);
    }
}

class IdadeMenorQue0Exception extends IllegalArgumentException {
    IdadeMenorQue0Exception(String message) {
        super(message);
    }
}
