import java.lang.management.OperatingSystemMXBean;

/**
 * Created by suemareverton on 13/06/17.
 * Enums
 */

public class Exercicio19 {

    public static void main(String[] args) {

        // 1 para soma
        // 2 para subtração
        // 3 para multiplicação
        // 4 para divisão
        calcular(10,TipoOperacao.MULTIPLICACAO,2);
    }

    private static void calcular(int operando1, TipoOperacao tipoOperacao, int operando2) {
        if(tipoOperacao == TipoOperacao.ADICAO)
            System.out.println(operando1 + operando2);
        else if(tipoOperacao == TipoOperacao.SUBTRACAO)
            System.out.println(operando1 - operando2);
        else if(tipoOperacao == TipoOperacao.MULTIPLICACAO)
            System.out.println(operando1 * operando2);
        else if(tipoOperacao == TipoOperacao.DIVISAO)
            System.out.println(operando1 / operando2);
        else System.out.println("tipo de operação inválido");
    }
}

enum TipoOperacao {
    ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO
}


