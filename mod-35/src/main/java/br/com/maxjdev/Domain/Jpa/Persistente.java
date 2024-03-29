package br.com.maxjdev.Domain.Jpa;

import javax.persistence.MappedSuperclass;

/**
 * @author maxjdev
 */
@MappedSuperclass
public interface Persistente {
    public Long getId();

    public void setId(Long id);
}