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

        Basico aluguelBasico = new Basico();
        Premium aluguelPremium = new Premium();
        Executivo aluguelExecutivo = new Executivo();

        aluguelBasico.adicionarVeiculo(carro);

        aluguelPremium.adicionarVeiculo(van);

        aluguelExecutivo.adicionarVeiculo(carro);
        aluguelExecutivo.adicionarVeiculo(van);

        alugueis.add(aluguelBasico);
        alugueis.add(aluguelPremium);
        alugueis.add(aluguelExecutivo);

        System.out.println("TODOS OS VEICULOS");

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }

        System.out.println("TODOS OS ALUGUEIS");

        for (Aluguel aluguel : alugueis) {
            aluguel.exibirDados();
        }

        System.out.println("VEICULOS DISPONIVEIS");

        for (Veiculo veiculo : veiculos) {

            if (veiculo.getStatusVeiculo() == StatusVeiculo.DISPONIVEL) {
                veiculo.exibirDados();
            }
        }

        System.out.println("AVALIACOES");

        carro.avaliar(9);
        van.avaliar(10);
        aluguelExecutivo.avaliar(8);

        carro.exibirDados();
        van.exibirDados();
        aluguelExecutivo.exibirDados();

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