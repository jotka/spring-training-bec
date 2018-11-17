package pl.finsys.beanscopes;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.finsys.beanscopes.services.ServiceOne;
import pl.finsys.beanscopes.services.ServiceOneImpl;
import pl.finsys.beanscopes.services.ServiceTwo;
import pl.finsys.beanscopes.services.ServiceTwoImpl;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 *
 * @author jarek@finsys.pl
 */
public class BeanScopesTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testBeanScope() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        // when
        ServiceTwo service1 = (ServiceTwoImpl)context.getBean("serviceOne");
        ServiceTwo service2 = (ServiceTwoImpl)context.getBean("serviceOne");

        ServiceOne serviceOne1 = (ServiceOneImpl)context.getBean("serviceTwo");
        ServiceOne serviceOne2 = (ServiceOneImpl)context.getBean("serviceTwo");

        //then
        assertNotNull(service1);

        assertNotNull(service2);
        assertNotEquals(service1, service2);

        assertNotNull(serviceOne1);
        assertNotNull(serviceOne2);

        assertEquals(serviceOne1, serviceOne2);
    }
}
