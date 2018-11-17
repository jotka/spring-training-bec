package pl.finsys.autowired.byType;

import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author jarek@finsys.pl
 */
public class TypeTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @org.junit.Test
    public void testName() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        //when
        Ping ping = (Ping) context.getBean("panda");

        //then
        assertNotNull(ping);

        assertNotNull(ping.getPong());

    }
}
