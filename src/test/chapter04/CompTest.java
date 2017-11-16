package chapter04;

import com.ascland.chapter04.comparison.Sleepable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <aop:aspect>实现</aop:aspect>
 */
public class CompTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:chapter04/comparison-aspect-config.xml")
    public static class AspectTest {

        @Autowired
        private Sleepable sleepable;

        @Test
        public void testSleep() {
            sleepable.sleep();
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:chapter04/comparison-advisor-config.xml")
    public static class AdvisorTest {

        @Autowired
        private Sleepable sleepable;

        @Test
        public void testSleep() {
            sleepable.sleep();
        }
    }

}
