package pl.finsys.propertyPlaceholder;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author jarek@finsys.pl
 */
public class RobotTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testValueInjection() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-propertyPlaceholder.xml");

        // when
        Robot robot = (Robot) context.getBean("robot");

        //then
        robot.sayGoodbye();

        assertEquals("Greetings, Human!", robot.sayHello());
        assertEquals("Bye, Human!", robot.sayGoodbye());

    }
}
