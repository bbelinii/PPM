package pm_prova2_m;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Aluguel> alugueis = new ArrayList<>();

        Carro carro = new Carro(
                "AAA1111",
                "Civic",
                2020,
                250,
                50000,
                StatusVeiculo.DISPONIVEL,
                4
        );

        Moto moto = new Moto(
                "BBB2222",
                "XRE 300",
                2021,
                120,
                20000,
                StatusVeiculo.MANUTENCAO,
                300
        );

        Van van = new Van(
                "CCC3333",
                "Sprinter",
                2022,
                450,
                10000,
                StatusVeiculo.DISPONIVEL,
                15
        );

        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(van);

        Basico basico = new Basico(
                "Lucas",
                3,
                750,
                StatusAluguel.ATIVO
        );

        Premium premium = new Premium(
                "Mariana",
                5,
                2250,
                StatusAluguel.ATIVO
        );

        Executivo executivo = new Executivo(
                "Fernando",
                7,
                5000,
                StatusAluguel.FINALIZADO
        );

        alugueis.add(basico);
        alugueis.add(premium);
        alugueis.add(executivo);

        System.out.println("TODOS OS VEICULOS");

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }

        System.out.println("TODOS OS ALUGUEIS");

        for (Aluguel aluguel : alugueis) {
            aluguel.exibirDetalhes();
        }

        System.out.println("VEICULOS DISPONIVEIS");

        for (Veiculo veiculo : veiculos) {

            if (veiculo.getStatusVeiculo() == StatusVeiculo.DISPONIVEL) {
                veiculo.exibirDados();
            }
        }

        carro.avaliar(9);
        van.avaliar(10);
        executivo.avaliar(8);

        System.out.println("AVALIACOES REALIZADAS");

        carro.exibirDados();
        van.exibirDados();
        executivo.exibirDetalhes();

        System.out.println("INSPECOES");

        moto.realizarInspecao();
        van.realizarInspecao();

        veiculos.removeIf(veiculo ->
                veiculo.getStatusVeiculo() == StatusVeiculo.MANUTENCAO
        );

        System.out.println("VEICULOS APOS REMOCAO");

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }
    }
}