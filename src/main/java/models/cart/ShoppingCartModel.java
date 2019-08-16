package models.cart;
import models.menu.ItemModel;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {
    private int id;
    private List<ItemModel> items;

    private double totalAmount = 0.0;

    public double getTotalAmount() {
        totalAmount = items.stream().map(e->e.getPrice()).reduce((a,b)-> a+b).orElse(0.0);
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ShoppingCartModel(){
        items = new ArrayList<ItemModel>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemModel> getItems() {
        return items;
    }

    public void setItems(List<ItemModel> items) {
        this.items = items;
    }


}
