public class Executivo extends Aluguel implements Avaliavel {

    private boolean quilometragemIlimitada;
    private boolean motoristaParticular;
    private int nota;

    public Executivo() {
        quilometragemIlimitada = true;
        motoristaParticular = true;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
    }

    @Override
    public void exibirDados() {

        System.out.println("ALUGUEL EXECUTIVO");
        System.out.println("Quilometragem ilimitada: " + quilometragemIlimitada);
        System.out.println("Motorista particular: " + motoristaParticular);
        System.out.println("Nota: " + nota);

        System.out.println("Veiculos associados:");

        for (Veiculo veiculo : veiculos) {
            System.out.println("- " + veiculo.getModelo());
        }

        System.out.println();
    }
}