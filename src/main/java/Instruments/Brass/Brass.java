package Instruments.Brass;

import Instruments.HowToPlay;
import Instruments.Instrument;
import Instruments.Strings.Strings;

public abstract class Brass extends Instrument {

    private BrassFamily brassFamily;

    public Brass(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, BrassFamily brassFamily) {
        super(name, colour, howToPlay, costPrice, retailPrice);
        this.brassFamily = brassFamily;
    }

    public BrassFamily getBrassFamily() {
        return brassFamily;
    }

    public void setBrassFamily(BrassFamily brassFamily) {
        this.brassFamily = brassFamily;
    }
}
