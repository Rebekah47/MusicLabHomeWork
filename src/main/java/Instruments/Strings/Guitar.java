package Instruments.Strings;

import Instruments.HowToPlay;

public class Guitar extends Strings {

    private Boolean electric;

    public Guitar(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice, int numOfStrings, Boolean electric) {
        super(name, colour, howToPlay, costPrice, retailPrice, numOfStrings);
        this.electric = electric;
    }

    public Boolean getElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }

    public String play(){
        return "Strum, Strum, Strum";
    }

}
