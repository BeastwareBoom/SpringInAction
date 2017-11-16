package chapter04;

import com.ascland.chapter04.args.CompactDisc;
import com.ascland.chapter04.args.TrackConfig;
import com.ascland.chapter04.args.TrackCounter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Asus on 2017/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter04/aop-xml-args-config.xml")
public class TrackerXMLTest {

    @Autowired
    public CompactDisc compactDisc;

    @Autowired
    public TrackCounter trackCounter;

    @Test
    public void testTrack() {
        compactDisc.playTrack(0);
        compactDisc.playTrack(0);
        compactDisc.playTrack(0);
        compactDisc.playTrack(1);
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);

        assertEquals(3,trackCounter.getPlayoutCount(0));
        assertEquals(2,trackCounter.getPlayoutCount(1));
        assertEquals(1,trackCounter.getPlayoutCount(2));
    }
}
