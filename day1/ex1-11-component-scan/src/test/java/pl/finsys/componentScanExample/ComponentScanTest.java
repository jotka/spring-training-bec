package pl.finsys.componentScanExample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.finsys.componentScanExample.services.OrderService;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author jarek@finsys.pl
 */
public class ComponentScanTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testComponentScan() throws Exception {

        // given
        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext-componentScan-ex.xml");

        // when
        OrderService orderService = (OrderService)context.getBean("customerService");


        //then
        assertNotNull(orderService);

        assertNotNull(orderService.getOrderDAO());

        assertEquals("Hello, this is OrderDAO", orderService.getOrderDAO().toString());

    }
}
