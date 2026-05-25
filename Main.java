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
                "XRE",
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

        Basico basico = new Basico();
        Premium premium = new Premium();

        basico.adicionarVeiculo(carro);
        premium.adicionarVeiculo(van);

        alugueis.add(basico);
        alugueis.add(premium);

        System.out.println("TODOS OS VEICULOS");

        for (Veiculo v : veiculos) {
            v.exibirDados();
        }

        System.out.println("TODOS OS ALUGUEIS");

        for (Aluguel a : alugueis) {
            a.exibirDados();
        }

        System.out.println("VEICULOS DISPONIVEIS");

        for (Veiculo v : veiculos) {
            if (v.getStatusVeiculo() == StatusVeiculo.DISPONIVEL) {
                v.exibirDados();
            }
        }

        carro.avaliar(9);
        van.avaliar(10);

        moto.realizarInspecao();
        van.realizarInspecao();

        veiculos.removeIf(v -> v.getStatusVeiculo() == StatusVeiculo.MANUTENCAO);

        System.out.println("VEICULOS APOS REMOCAO");

        for (Veiculo v : veiculos) {
            v.exibirDados();
        }
    }
}