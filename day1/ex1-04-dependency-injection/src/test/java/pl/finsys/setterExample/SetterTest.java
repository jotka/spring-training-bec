package pl.finsys.setterExample;

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
public class SetterTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testSetter() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        // when
        FaxRoom faxRoom = (FaxRoom)context.getBean("ourFaxRoom");

        //then
        assertNotNull(faxRoom);

        assertThat(faxRoom.sendFax()).isEqualTo(1999);

    }
}
