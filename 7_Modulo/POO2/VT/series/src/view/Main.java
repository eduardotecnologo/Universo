package view;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;

/**
 *
 * @author edudeveloper
 */
public class Main {

    public static void main(String[] args) {

        String nome = "edudeveloper";
        System.out.println(nome);

        Servico servico = new Servico(0, "barba", 30);

        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());

        Cliente cliente = new Cliente(1, "luedudeveloperan", "rua teste", "12345");
        System.out.println(cliente.getNome());

        Usuario usuario = new Usuario(1, "barbeiro", "4002");
        System.out.println(usuario.getNome());

        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "26/05/2020 09:30");

        System.out.println(agendamento.getCliente().getNome());
    }
}
