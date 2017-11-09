package chapter01;

import com.ascland.chapter01.BraveKnight;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * com.ascland.chapter01.config.KnightConfig配置
 * chapter01/knight.xml作用完全一致
 */

public class BraveKnightTest {

    /********************测试依赖注入**********************/

    @Test
    public void testXMLConfig() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter01/knight.xml");
        BraveKnight knight = (BraveKnight) context.getBean("knight");
        knight.embarkOnQuest();
        context.close();
    }

    @Test
    public void testAnnotationConfig() {
        System.out.println("testAnnotationConfig");
        //或传入basePackage
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ascland.chapter01.config");
        //或传入@Configuration配置类的类名
        //        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        BraveKnight knight = (BraveKnight) context.getBean("knight");
        knight.embarkOnQuest();
        context.close();
    }

    /*****************测试AOP*******************/
    @Test
    public void knightShouldEmbarkOnQuest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "chapter01/minstrel.xml");
        BraveKnight knight = (BraveKnight) context.getBean("knight");
        knight.embarkOnQuest();
        context.close();
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "chapter01/minstrel.xml");
        BraveKnight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
