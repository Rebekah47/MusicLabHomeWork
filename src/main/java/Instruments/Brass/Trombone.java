package Instruments.Brass;

import Instruments.HowToPlay;
import Instruments.Strings.Strings;

public class Trombone extends Brass {

    private TromboneType tromboneType;

    public Trombone(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, BrassFamily brassFamily, TromboneType tromboneType) {
        super(name, colour, howToPlay, costPrice, retailPrice, brassFamily);
        this.tromboneType = tromboneType;
    }

    public TromboneType getTromboneType() {
        return tromboneType;
    }

    public void setTromboneType(TromboneType tromboneType) {
        this.tromboneType = tromboneType;
    }

    public String play(){
        return "PPPPPuuuuurrrrrrrrrp";
    }
}
