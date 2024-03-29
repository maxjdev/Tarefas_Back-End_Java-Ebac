package br.com.maxjdev.dao;

/**
 * @author maxjdev
 *
 * Classe que representa todas as entidades ou objetos da aplicação que seram salvas no banco de dados
 */
public interface IPersistente {

    //public Long getCodigo();

    public Long getId();

    public void setId(Long id);
}
