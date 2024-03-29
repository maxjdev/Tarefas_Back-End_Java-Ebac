package br.com.maxjdev.dao.factory;

import br.com.maxjdev.Domain.Produto;
import br.com.maxjdev.Domain.ProdutoQuantidade;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author maxjdev
 */
public class ProdutoQuantidadeFactory {

    public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
        Produto prod = ProdutoFactory.convert(rs);
        ProdutoQuantidade prodQ = new ProdutoQuantidade();
        prodQ.setProduto(prod);
        prodQ.setId(rs.getLong("ID"));
        prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
        prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        return prodQ;
    }
}
