package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private String colour;
    private HowToPlay howToPlay;
    private int costPrice;
    private int retailPrice;

    public Instrument(String name, String colour, HowToPlay howToPlay, int costPrice, int retailPrice) {
        this.name = name;
        this.colour = colour;
        this.howToPlay = howToPlay;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public HowToPlay getHowToPlay() {
        return howToPlay;
    }

    public void setHowToPlay(HowToPlay howToPlay) {
        this.howToPlay = howToPlay;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int calculateMarkup(){
        int sellPrice = this.getRetailPrice();
        int boughtPrice = this.getCostPrice();
        int profit =  sellPrice - boughtPrice;
        return profit;
    }

}
