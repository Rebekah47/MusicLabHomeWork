package Instruments.Wind;

import Instruments.HowToPlay;
import Instruments.Instrument;
import Instruments.Strings.Strings;

public abstract class Wind extends Instrument {

    private int numOfKeys;
    private Boolean reed;

    public Wind(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, int numOfKeys, Boolean reed) {
        super(name, colour, howToPlay, costPrice, retailPrice);
        this.numOfKeys = numOfKeys;
        this.reed = reed;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public Boolean getReed() {
        return reed;
    }

    public void setReed(Boolean reed) {
        this.reed = reed;
    }
}
