package br.com.maxjdev.dao.factory;

import br.com.maxjdev.Domain.Produto;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author maxjdev
 */
public class ProdutoFactory {


    public static Produto convert(ResultSet rs) throws SQLException {
        Produto prod = new Produto();
        prod.setId(rs.getLong("ID_PRODUTO"));
        prod.setCodigo(rs.getString("CODIGO"));
        prod.setNome(rs.getString("NOME"));
        prod.setDescricao(rs.getString("DESCRICAO"));
        prod.setFornecedores(rs.getString("FORNECEDOR"));
        prod.setValor(rs.getBigDecimal("VALOR"));
        return prod;
    }
}
