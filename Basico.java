public class Basico extends Aluguel {

    private int limiteKm;
    private boolean seguroIncluso;

    public Basico() {
        limiteKm = 100;
        seguroIncluso = false;
    }

    @Override
    public void exibirDados() {

        System.out.println("ALUGUEL BASICO");
        System.out.println("Limite de KM: " + limiteKm);
        System.out.println("Seguro incluso: " + seguroIncluso);

        System.out.println("Veiculos associados:");

        for (Veiculo veiculo : veiculos) {
            System.out.println("- " + veiculo.getModelo());
        }

        System.out.println();
    }
}