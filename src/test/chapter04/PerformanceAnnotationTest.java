package chapter04;

import com.ascland.chapter04.Performance;
import com.ascland.chapter04.PerformanceConfig;
import com.ascland.chapter04.function.Encoreable;
import com.ascland.chapter04.function.EncoreableIntroducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*注解配置测试时，PerformanceConfig类需要开启@Bean注解*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformanceConfig.class)
public class PerformanceAnnotationTest {

    @Autowired
    private Performance performance;

    @Test
    public void play() {
        performance.perform();
    }

    @Autowired
    private Encoreable encoreable;

    @Test
    public void testEncoreable(){
        //com.ascland.chapter04.Piano@7494f96a
        System.out.println(encoreable);
        encoreable.performEncore();//输出DefaultEncoreable.performEncore()
    }

    @Test
    public void testProxy(){
        Encoreable proxy = (Encoreable) performance;
        //com.ascland.chapter04.Piano@7494f96a
        System.out.println(proxy);
        proxy.performEncore();
    }
}
