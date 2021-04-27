import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class HazMatInventory {

    //Item of Haz Mat to be inventoried
    public static class HazMatItem {
        String name;
        String stockNumber;
        int hazMatClass;
        String storageArea;
        int quantityInStock;

        public HazMatItem(String name, String stockNumber, int hazMatClass, String storageArea, int stock) {
            this.name = name;
            this.stockNumber = stockNumber;
            this.hazMatClass = hazMatClass;
            this.storageArea = storageArea;
            this.quantityInStock = stock;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStockNumber() {
            return stockNumber;
        }

        public void setStockNumber(String stockNumber) {
            this.stockNumber = stockNumber;
        }

        public int getHazMatClass() {
            return hazMatClass;
        }

        public void setHazMatClass(int hazMatClass) {
            this.hazMatClass = hazMatClass;
        }

        public String getStorageArea() {
            return storageArea;
        }

        public void setStorageArea(String storageArea) {
            this.storageArea = storageArea;
        }

        public int getQuantityInStock() {
            return quantityInStock;
        }

        public void setQuantityInStock(int quantityInStock) {
            this.quantityInStock = quantityInStock;
        }

    }

    //another possible interface opportunity?
    //public interface HazMatInventoryAccess {}

    //NOT THREAD SAFE / SELF-SYNCHRONIZING!!!
    private ArrayList<HazMatItem> HazMatStock = new ArrayList<>();
    private ArrayList<HazMatItem> WasteInventory = new ArrayList<>();

    //refactor to implement exception handling for bad entry / boolean return
    //for entry confirmation?
    public void addItemToInventory(HazMatItem gain) {
        HazMatStock.add(gain);
    }

    public void issueInventory(HazMatItem issue) {
    }

}
