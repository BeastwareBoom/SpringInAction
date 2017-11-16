package chapter04;

import com.ascland.chapter04.Performance;
import com.ascland.chapter04.function.Encoreable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*注解配置测试时，PerformanceConfig类需要开启@Bean注解*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter04/aop-xml-function-config.xml")
public class XMLFunctionTest {

    @Autowired
    private Performance performance;

    @Autowired
    private Encoreable encoreable;

    @Test
    public void testEncoreable() {
        //com.ascland.chapter04.Piano@7494f96a
        System.out.println(encoreable);
        encoreable.performEncore();//输出DefaultEncoreable.performEncore()
    }

    @Test
    public void testProxy() {
        Encoreable proxy = (Encoreable) performance;
        //com.ascland.chapter04.Piano@7494f96a
        System.out.println(proxy);
        proxy.performEncore();
    }
}
