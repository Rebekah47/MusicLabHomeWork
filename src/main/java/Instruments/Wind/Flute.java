package Instruments.Wind;

import Instruments.HowToPlay;
import Instruments.Strings.Strings;

public class Flute extends Wind{

    private String size;

    public Flute(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, int numOfKeys, Boolean reed, String size) {
        super(name, colour, howToPlay, costPrice, retailPrice, numOfKeys, reed);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String play(){
        return "Trilllllllllllllll";
    }

}
