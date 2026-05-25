import java.util.ArrayList;

public abstract class Aluguel {

    protected ArrayList<Veiculo> veiculos;

    public Aluguel() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public abstract void exibirDados();
}