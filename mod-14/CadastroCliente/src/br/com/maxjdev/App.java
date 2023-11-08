package br.com.maxjdev;
import br.com.maxjdev.dao.ClienteMapDAO;
import br.com.maxjdev.dao.IClienteDAO;
import br.com.maxjdev.domain.Cliente;
import javax.swing.*;
public class App {
    private static IClienteDAO iClienteDAO;
    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção invalida, digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }
        
        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por virgula, conforme exemplos: Nome, CPF, Telefone, Endereço, Numero, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente que deseja consultar",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente que deseja excluir",
                        "Excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if (isOpcaoAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados a serem alterados separados por virgula, conforme exemplos: Nome, CPF, Telefone, Endereço, Numero, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
        JOptionPane.showMessageDialog(null, "Dados do cliente alterados com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        if (dadosSeparados.length == 7) {
            Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
            Boolean isCadastrado = iClienteDAO.cadastrar(cliente);

            if (isCadastrado) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltam campos a serem preenchidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void excluir(String dados) {
        Long cpf = Long.parseLong(dados);
        Cliente cliente = iClienteDAO.consultar(cpf);
        if (cliente != null) {
            iClienteDAO.excluir(cpf);
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado. Nenhuma exclusão foi realizada.", "Excluir", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente, "Consultar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado !", "Consultar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Encerrando sistema...", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
//    ------*> IsBooleans
    private static boolean isExclusao(String opcao) {
        return "3".equals(opcao);
    }

    private static boolean isConsultar(String opcao) {
        return "2".equals(opcao);
    }

    private static boolean isCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private  static boolean isOpcaoAlterar(String opcao) {
        return "4".equals(opcao);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }
}
