package pl.finsys.constructorExample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.fest.assertions.Assertions.assertThat;
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

    @Test
    public void testConstructor() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        // when
        PrintRoom printRoom = (PrintRoom)context.getBean("ourPrintRoom");

        //then
        assertNotNull(printRoom);

        assertThat(printRoom.print()).isEqualTo("This is Json Printer");

    }
}
