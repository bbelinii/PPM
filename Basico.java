public class Basico extends Aluguel {

    private int limiteKm;
    private boolean seguro;

    public Basico() {
        limiteKm = 100;
        seguro = false;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluguel Basico");
        System.out.println("Limite KM: " + limiteKm);
        System.out.println("Seguro: " + seguro);

        for (Veiculo v : veiculos) {
            System.out.println(v.getModelo());
        }

        System.out.println();
    }
}