import models.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by suemareverton on 24/07/17.
 */
public class Exercicio14 {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("José",1000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Roberto",2000d, "Marketing"));
        funcionarios.add(new Funcionario("Márcia",3000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Vera",4000d, "Marketing"));
        funcionarios.add(new Funcionario("João",5000d,"Recursos Humanos"));

        // Obtendo o total de salários por setor
        Map<String, Long> mapFuncionariosPorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                                Collectors.counting()));

        for(String departamento : mapFuncionariosPorDepartamento.keySet()) {
            System.out.println(
                    String.format("Total de funcionários em %s: %d",
                            departamento,
                            mapFuncionariosPorDepartamento.get(departamento)
                    ));
        }

        System.out.println("---");

        // Obtendo a média de salários por setor
        Map<String, Double> mapMediaSalarialPorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                                Collectors.averagingDouble(f -> f.getSalario())));

        for(String departamento : mapMediaSalarialPorDepartamento.keySet()) {
            System.out.println(
                    String.format("Média salarial de %s: %.2f",
                            departamento,
                            mapMediaSalarialPorDepartamento.get(departamento)
                    ));
        }

    }


}
