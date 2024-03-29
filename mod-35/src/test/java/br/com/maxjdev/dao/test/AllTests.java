package java.br.com.maxjdev.dao.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author maxjdev
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}
