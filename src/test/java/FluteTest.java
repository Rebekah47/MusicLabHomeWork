import Instruments.HowToPlay;
import Instruments.Wind.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){

        flute = new Flute("Flute", "Silver", HowToPlay.BLOW,200, 500,20,true, "full");
    }

    @Test
    public void canPlay(){
        assertEquals("Trilllllllllllllll", flute.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300, flute.calculateMarkup());
    }

}
