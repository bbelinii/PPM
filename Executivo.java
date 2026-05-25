public class Executivo extends Aluguel implements Avaliavel {

    private boolean kmIlimitado;
    private boolean motoristaParticular;
    private int nota;

    public Executivo() {
        kmIlimitado = true;
        motoristaParticular = true;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluguel Executivo");
        System.out.println("KM ilimitado: " + kmIlimitado);
        System.out.println("Motorista: " + motoristaParticular);
        System.out.println("Nota: " + nota);

        for (Veiculo v : veiculos) {
            System.out.println(v.getModelo());
        }

        System.out.println();
    }
}