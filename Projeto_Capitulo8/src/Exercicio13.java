import models.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by suemareverton on 24/07/17.
 * Agrupamentos
 */

public class Exercicio13 {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("José",1000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Roberto",2000d, "Marketing"));
        funcionarios.add(new Funcionario("Márcia",3000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Vera",4000d, "Marketing"));
        funcionarios.add(new Funcionario("João",5000d,"Recursos Humanos"));

        // Obtendo o total de salários por setor
        Map<String, Double> mapSalariosPorDepartamento =
                funcionarios.stream()
                    .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                        Collectors.summingDouble(f -> f.getSalario())));

        for(String departamento : mapSalariosPorDepartamento.keySet()) {
            System.out.println(
                    String.format("Total de salário em %s: %.2f",
                            departamento,
                            mapSalariosPorDepartamento.get(departamento)
                    ));
        }

        // DESAFIO: E para obter o total de funcionários por departamento?
    }

}
