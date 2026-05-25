public class Premium extends Aluguel {

    private boolean kmIlimitado;
    private boolean seguro;

    public Premium() {
        kmIlimitado = true;
        seguro = true;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluguel Premium");
        System.out.println("KM ilimitado: " + kmIlimitado);
        System.out.println("Seguro: " + seguro);

        for (Veiculo v : veiculos) {
            System.out.println(v.getModelo());
        }

        System.out.println();
    }
}