package Instruments.Strings;

import Instruments.HowToPlay;

public class Cello extends Strings {

    private String size;

    public Cello(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, int numOfStrings, String size) {
        super(name, colour, howToPlay, costPrice, retailPrice, numOfStrings);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String play(){
        return "Pachabel's Canon unfortunately";
    }

}
