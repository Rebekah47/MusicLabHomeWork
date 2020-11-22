import Instruments.Brass.BrassFamily;
import Instruments.Brass.Trombone;
import Instruments.Brass.TromboneType;
import Instruments.Brass.Trumpet;
import Instruments.HowToPlay;
import Instruments.Strings.Cello;
import Instruments.Strings.Guitar;
import Instruments.Wind.Flute;
import Instruments.Wind.Saxophone;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Trombone trombone;
    Trumpet trumpet;
    Cello cello;
    Guitar guitar;
    Flute flute;
    Saxophone saxophone;

    @Before
    public void before(){
        musicShop = new MusicShop("Band Wagon", 15000);
        flute = new Flute("Flute", "Silver", HowToPlay.BLOW,200, 500,20,true, "full");
        trombone = new Trombone("Trombone", "yellow", HowToPlay.BLOW, 300,350, BrassFamily.Slide, TromboneType.CIMBASSO);
        trumpet = new Trumpet("Trumpet", "Blue", HowToPlay.BLOW, 120, 400, BrassFamily.Valve, true);
        cello = new Cello("Cello", "Chestnut", HowToPlay.BOW, 600, 1000, 4,"half-size");
        guitar = new Guitar("Acoustic", "red", HowToPlay.PLUCK, 70, 200, 6, false);
        saxophone = new Saxophone("Alto Sax", "Copper", HowToPlay.BLOW, 545, 600, 12, true, "alto" );
    }

    @Test
    public void canAddToStock(){
        musicShop.addToStock(flute);
        musicShop.addToStock(cello);
        assertEquals(2, musicShop.getStock().size());
    }
    @Test
    public void canRemoveFromStock(){
        musicShop.addToStock(guitar);
        musicShop.addToStock(saxophone);
        musicShop.removeFromStock(guitar);
        assertEquals(1, musicShop.getStock().size());
    }

    @Test
    public void canGetProfit(){
        musicShop.addToStock(guitar);
        musicShop.addToStock(saxophone);
        musicShop.addToStock(flute);
        musicShop.addToStock(cello);
        musicShop.addToStock(trombone);
        musicShop.addToStock(trumpet);
        assertEquals(1215, musicShop.calculateProfit());
    }

    @Test
    public void canAddSellItemAndBankMoney(){
        musicShop.addToStock(flute);
        musicShop.sellItem(flute);
        assertEquals(15300, musicShop.getTill());
        assertEquals(0, musicShop.getStock().size());
    }

}
