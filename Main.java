package pm_prova2_m;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        alugueis.add(basico);
        alugueis.add(premium);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("1 - Associar veiculo ao aluguel");
            System.out.println("2 - Exibir todos os veiculos");
            System.out.println("3 - Exibir todos os alugueis");
            System.out.println("4 - Exibir veiculos disponiveis");
            System.out.println("5 - Avaliar");
            System.out.println("6 - Realizar inspecao");
            System.out.println("7 - Remover veiculos em manutencao");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Escolha o aluguel");
                    System.out.println("1 - Basico");
                    System.out.println("2 - Premium");

                    int aluguelEscolhido = sc.nextInt();

                    Aluguel aluguel = null;

                    if (aluguelEscolhido == 1) {
                        aluguel = basico;
                    }

                    if (aluguelEscolhido == 2) {
                        aluguel = premium;
                    }

                    int adicionar = 1;

                    while (adicionar != 0) {

                        System.out.println("Escolha o veiculo");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        System.out.println("3 - Van");
                        System.out.println("0 - Finalizar");

                        int veiculoEscolhido = sc.nextInt();

                        if (veiculoEscolhido == 1) {
                            aluguel.adicionarVeiculo(carro);
                            System.out.println("Carro adicionado");
                        }

                        if (veiculoEscolhido == 2) {
                            aluguel.adicionarVeiculo(moto);
                            System.out.println("Moto adicionada");
                        }

                        if (veiculoEscolhido == 3) {
                            aluguel.adicionarVeiculo(van);
                            System.out.println("Van adicionada");
                        }

                        if (veiculoEscolhido == 0) {
                            adicionar = 0;
                        }
                    }

                    break;

                case 2:

                    for (Veiculo v : veiculos) {
                        v.exibirDados();
                    }

                    break;

                case 3:

                    for (Aluguel a : alugueis) {
                        a.exibirDetalhes();
                    }

                    break;

                case 4:

                    for (Veiculo v : veiculos) {

                        if (v.getStatusVeiculo() == StatusVeiculo.DISPONIVEL) {
                            v.exibirDados();
                        }
                    }

                    break;

                case 5:

                    System.out.println("1 - Carro");
                    System.out.println("2 - Van");

                    int avaliacao = sc.nextInt();

                    System.out.println("Digite a nota");

                    int nota = sc.nextInt();

                    if (avaliacao == 1) {
                        carro.avaliar(nota);
                    }

                    if (avaliacao == 2) {
                        van.avaliar(nota);
                    }

                    System.out.println("Avaliacao realizada");

                    break;

                case 6:

                    System.out.println("1 - Moto");
                    System.out.println("2 - Van");

                    int inspecao = sc.nextInt();

                    if (inspecao == 1) {
                        moto.realizarInspecao();
                    }

                    if (inspecao == 2) {
                        van.realizarInspecao();
                    }

                    break;

                case 7:

                    veiculos.removeIf(v ->
                            v.getStatusVeiculo() == StatusVeiculo.MANUTENCAO
                    );

                    System.out.println("Veiculos removidos");

                    break;

                case 0:

                    System.out.println("Programa encerrado");

                    break;

                default:

                    System.out.println("Opcao invalida");
            }
        }
    }
}