package chapter04;

import com.ascland.chapter04.Performance;
import com.ascland.chapter04.PerformanceConfig;
import com.ascland.chapter04.WatcherConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*注解配置测试时，PerformanceConfig类需要开启@Bean注解*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WatcherConfig.class)
public class WatcherTest {

    @Autowired
    private Performance performance;

    @Test
    public void play() {
        performance.perform();
    }
}
