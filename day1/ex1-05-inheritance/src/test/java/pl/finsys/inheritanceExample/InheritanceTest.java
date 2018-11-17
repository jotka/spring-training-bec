package pl.finsys.inheritanceExample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

/**
 *
 *
 * @author jarek@finsys.pl
 */
public class InheritanceTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testInheritance() throws Exception {

        // given

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-inheritance-ex.xml");

        // when
        MadagascarFootballTeam madagascarFootballTeam = (MadagascarFootballTeam) context.getBean("madagascarFootballTeam");

        //then
        assertNotNull(madagascarFootballTeam);

        assertThat(madagascarFootballTeam.getCountry()).isEqualTo("Madagascar");

        assertThat(madagascarFootballTeam.getAction()).isEqualTo("play");

        assertThat(madagascarFootballTeam.getType()).isEqualTo(1);

    }
}
