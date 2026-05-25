public class Premium extends Aluguel {

    private boolean quilometragemIlimitada;
    private boolean seguroIncluso;

    public Premium() {
        quilometragemIlimitada = true;
        seguroIncluso = true;
    }

    @Override
    public void exibirDados() {

        System.out.println("ALUGUEL PREMIUM");
        System.out.println("Quilometragem ilimitada: " + quilometragemIlimitada);
        System.out.println("Seguro incluso: " + seguroIncluso);

        System.out.println("Veiculos associados:");

        for (Veiculo veiculo : veiculos) {
            System.out.println("- " + veiculo.getModelo());
        }

        System.out.println();
    }
}