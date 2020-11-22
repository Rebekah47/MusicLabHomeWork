import Instruments.Brass.Trumpet;
import Instruments.Strings.Guitar;
import Interfaces.ISell;
import java.util.ArrayList;

public class MusicShop {

    private String name;
    private int till;
    private ArrayList<ISell> stock;

    public MusicShop(String name, int till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        int toRemove = this.stock.indexOf(item);
        this.stock.remove(toRemove);
    }

    public int calculateProfit() {
        int profit = 0;
        for(ISell item : this.stock){
            int itemProfit = item.calculateMarkup();
            profit += itemProfit;
        }
        return profit;
    }

    public void sellItem(ISell item) {
        int toAddToTill = item.calculateMarkup();
        int currentTill = this.getTill();
        int newTotal = currentTill + toAddToTill;
        this.setTill(newTotal);
        this.removeFromStock(item);
    }
}
