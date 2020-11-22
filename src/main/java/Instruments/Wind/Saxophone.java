package Instruments.Wind;

import Instruments.HowToPlay;
public class Saxophone extends Wind {

    private String type;

    public Saxophone(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, int numOfKeys, Boolean reed, String type) {
        super(name, colour, howToPlay, costPrice, retailPrice, numOfKeys, reed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String play(){
        return "Jazzy type thing.";
    }
}
