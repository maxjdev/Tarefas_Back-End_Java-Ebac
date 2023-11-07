package br.com.maxjdev.dao;
import br.com.maxjdev.domain.Cliente;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/** @author maxdev
 *
 * Implementação de IClienteDAO que armazena os clientes em um HashSet.*/
public class ClienteSetDAO implements IClienteDAO{
    private final Set<Cliente> set;
    /** Cria uma instância de ClienteMapDAO e inicializa o mapa interno.*/
    public ClienteSetDAO () {
        this.set = new HashSet<>();
    }
    /** Cadastra um cliente.
     *
     * @param cliente O cliente a ser cadastrado.
     * @return true se o cadastro for bem-sucedido, false se um cliente com o mesmo CPF já existe.*/
    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }
    /** Exclui um cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser excluído.*/
    @Override
    public void excluir(Long cpf) {
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                this.set.remove(cliente);
                break;
            }
        }
    }
    /** Altera os dados de um cliente.
     *
     * @param cliente O cliente com os novos dados a serem salvos.*/
    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteCadastrado : this.set) {
                if (clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setEndereco(cliente.getEndereco());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
                }
            }
        }
    }
    /** Consulta um cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser consultado.
     * @return O objeto Cliente correspondente ao CPF, ou null se não for encontrado.*/
    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente cliente : set) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null ;
    }
    /** Retorna uma coleção contendo todos os clientes armazenados.
     *
     * @return Uma coleção de objetos Cliente.*/
    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
