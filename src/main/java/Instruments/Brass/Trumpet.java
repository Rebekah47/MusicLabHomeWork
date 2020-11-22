package Instruments.Brass;

import Instruments.HowToPlay;
import Instruments.Strings.Strings;

public class Trumpet extends Brass{

    private Boolean comesWithMute;

    public Trumpet(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, BrassFamily brassFamily, Boolean comesWithMute) {
        super(name, colour, howToPlay, costPrice, retailPrice, brassFamily);
        this.comesWithMute = comesWithMute;
    }

    public Boolean getComesWithMute() {
        return comesWithMute;
    }

    public void setComesWithMute(Boolean comesWithMute) {
        this.comesWithMute = comesWithMute;
    }

    public String play(){
        return "Bum ba da bum!!! ";
    }
}
