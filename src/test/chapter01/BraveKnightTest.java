package chapter01;

import com.ascland.chapter01.BraveKnight;
import com.ascland.chapter01.Knight;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BraveKnightTest {


    @Test
    public void knightShouldEmbarkOnQuest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "minstrel.xml");
        BraveKnight knight = (BraveKnight) applicationContext.getBean("knight");
        knight.embarkOnQuest();
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "minstrel.xml");
        BraveKnight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
