package chapter04;

import com.ascland.chapter04.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用完全xml配置SpringAOP
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter04/aop-xml-config.xml")
public class XMLConfigTest {

    @Autowired
    private Performance performance;

    @Test
    public void play() {
        performance.perform();
    }
}
