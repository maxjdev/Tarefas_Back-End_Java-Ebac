package br.com.maxjdev.anotacao;

import java.lang.annotation.*;

/**
 * @author maxjdev
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {

    String value();
}
