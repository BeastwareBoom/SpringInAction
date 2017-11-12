package chapter03;

import com.ascland.chapter03.ambiguity.AmbiguityConfig;
import com.ascland.chapter03.ambiguity.Dinner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AmbiguityConfig.class)
public class AmbiguityTest {

    @Autowired
    private Dinner dinner;

    @Test
    public void ambiguityTest() {
        assertNotNull(dinner);
    }
}
