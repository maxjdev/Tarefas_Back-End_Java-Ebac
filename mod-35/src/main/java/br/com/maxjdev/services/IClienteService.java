package br.com.maxjdev.services;


import br.com.maxjdev.Domain.Cliente;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.services.generic.IGenericService;

/**
 * @author maxjdev
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}