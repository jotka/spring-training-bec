package pl.finsys.autowired.constructor;

import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author jarek@finsys.pl
 */
public class ConstructorTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @org.junit.Test
    public void testConstructor() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        //when
        Analyst analyst = (Analyst) context.getBean("analyst");

        //then
        assertNotNull(analyst);

        assertEquals("C++", analyst.getLanguage().getName());

    }
}
