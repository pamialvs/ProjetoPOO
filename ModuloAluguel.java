import java.util.ArrayList;
import java.util.List;

public class ModuloAluguel {

    private List<Aluguel> alugueis = new ArrayList<>();

    private static ModuloAluguel instancia;

    private ModuloAluguel() {
    }

    public static ModuloAluguel getInstancia() {
        if (instancia == null) {
            instancia = new ModuloAluguel();
        }
        return instancia;
    }

    public String cadastrarAluguel(String idCliente) {
        Cliente cliente = Sistema.getInst().localizarCliente(idCliente);

        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }

        Aluguel aluguel = new Aluguel();
        aluguel.data = ""; // Definir lógica para a data
        aluguel.devolvido = false;
        aluguel.id = String.valueOf(this.alugueis.size());

        this.alugueis.add(aluguel);

        return aluguel.id;
    }

    public Aluguel localizarAluguel(String idAluguel) {
        for (Aluguel aluguel : this.alugueis) {
            if (aluguel.id.equals(idAluguel)) {
                return aluguel;
            }
        }
        return null;
    }

    public void adicionarItemAluguel(String idAluguel, int codProduto, int quantidade) {
        Aluguel aluguel = this.localizarAluguel(idAluguel);

        if (aluguel == null) {
            throw new IllegalArgumentException("Aluguel não encontrado.");
        }

        ItemAluguel itemAluguel = new ItemAluguel();
        itemAluguel.dataDevolucao = ""; // Definir lógica para a data de devolução
        itemAluguel.codProduto = codProduto;
        itemAluguel.quantidade = quantidade;

        aluguel.adicionarItemAluguel(itemAluguel);
    }

    public static void main(String[] args) {
        ModuloAluguel modulo = ModuloAluguel.getInstancia();
        // Testar o sistema aqui
    }
}
