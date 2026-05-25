public class Carro extends Veiculo implements Avaliavel {

    private int quantidadePortas;
    private int nota;

    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria,
                 double quilometragem, StatusVeiculo statusVeiculo, int quantidadePortas) {

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, statusVeiculo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.println("Carro");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Diaria: " + valorDiaria);
        System.out.println("KM: " + quilometragem);
        System.out.println("Status: " + statusVeiculo);
        System.out.println("Portas: " + quantidadePortas);
        System.out.println("Nota: " + nota);
        System.out.println();
    }
}