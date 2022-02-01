package vending.machine;

public class SnackInventory {

    private Integer quantity = 100;


    public Integer getQuantityOfChips() {
        quantity--;
        return quantity;
    }

    public Integer getPriceOfChips() {
        return 2;
    }

    public Integer getQuantityOfCookies() {
        quantity--;
        return quantity;
    }

    public Integer getPriceOfCookies() {
        return 2;
    }

    public Integer getQuantityOfJuice() {
        quantity--;
        return quantity;
    }

    public Integer getPriceOfJuice() {
        return 4;
    }

    public Integer getQuantityOfWater() {
        quantity--;
        return quantity;
    }

    public Integer getPriceOfWater() {
        return 4;
    }
    }
