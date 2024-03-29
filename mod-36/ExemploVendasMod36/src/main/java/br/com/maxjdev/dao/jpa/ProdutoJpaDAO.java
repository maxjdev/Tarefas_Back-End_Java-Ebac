package br.com.maxjdev.dao.jpa;

import br.com.maxjdev.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.maxjdev.domain.jpa.ProdutoJpa;

/**
 * @author maxjdev
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
