package br.com.maxjdev.dao;

import java.util.List;

import br.com.maxjdev.dao.generic.IGenericDAO;
import br.com.maxjdev.domain.Cliente;

/**
 * @author maxjdev
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
