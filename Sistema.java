import java.util.List;
import java.util.ArrayList;

public class Sistema {
    private static Sistema instancia;
    private List<Cliente> clientes = new ArrayList<>();

    private Sistema() {
        // Inicializar a lista de clientes (exemplo)
        clientes.add(new Cliente("1", "João"));
        clientes.add(new Cliente("2", "Maria"));
    }

    public static Sistema getInst() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }

    public Cliente localizarCliente(String idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                return cliente;
            }
        }
        return null; // Retorna null se o cliente não for encontrado
    }
}
