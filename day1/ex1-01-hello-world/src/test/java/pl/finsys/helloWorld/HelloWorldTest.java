package pl.finsys.helloWorld;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.finsys.testHello.TestHelloNumberGiver;
import static org.junit.Assert.assertEquals;

/**
 *
 *
 * @author jarek@finsys.pl
 */
public class HelloWorldTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testHelloWorld() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        TestHelloNumberGiver bean = (TestHelloNumberGiver) context.getBean("numberGiver");

        // when
        int a = bean.gimmeNumber();

        //then
        assertEquals(2014, a);

    }
}
