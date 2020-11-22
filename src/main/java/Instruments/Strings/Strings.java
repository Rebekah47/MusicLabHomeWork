package Instruments.Strings;

import Instruments.HowToPlay;
import Instruments.Instrument;

public abstract class Strings extends Instrument {
    private int numOfStrings;

    public Strings(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, int numOfStrings) {
        super(name, colour, howToPlay, costPrice, retailPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfKeys() {
        return numOfStrings;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfStrings = numOfKeys;
    }
}
