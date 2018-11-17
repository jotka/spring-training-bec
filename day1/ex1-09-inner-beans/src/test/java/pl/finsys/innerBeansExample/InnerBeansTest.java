package pl.finsys.innerBeansExample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author jarek@finsys.pl
 */
public class InnerBeansTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testInnerBeans() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-innerBeans-ex.xml");

        // when
        Order order = (Order)context.getBean("orderBean");

        //then
        assertNotNull(order);

        assertNotNull(order.getClient());

        assertEquals("client1", order.getClient().getName());

    }
}
