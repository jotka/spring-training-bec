package pl.finsys.autowired.annotation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author jarek@finsys.pl
 */
public class AnnotationTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testAnnotation() throws Exception {

        // uzyj adnotacji @Autowired
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        Reservation reservation = (Reservation) context.getBean("reservation");

        //then
        assertNotNull(reservation.getPerson());
    }
}
