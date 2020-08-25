package Entity;

/**
 *
 * @author Bernardo
 */
public class Report {
    private String productName;
    private int stock;
    private int sold;
    private int total;
    private int warehouse;
    private int min;
    private int max;

    public Report() {
    }
    
    public Report(String productName, int stock, int sold, int total, int warehouse, int min, int max) {
        this.productName = productName;
        this.stock = stock;
        this.sold = sold;
        this.total = total;
        this.warehouse = warehouse;
        this.min = min;
        this.max = max;
    }

    public Report(String productName, int stock, int sold, int total, int warehouse) {
        this.productName = productName;
        this.stock = stock;
        this.sold = sold;
        this.total = total;
        this.warehouse = warehouse;
    }
    
    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(int warehouse) {
        this.warehouse = warehouse;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    

    @Override
    public String toString() {
        return "Report{" + "productName=" + productName + ", stock=" + stock + ", sold=" + sold + ", total=" + total + ", warehouse=" + warehouse + ", min=" + min + ", max=" + max + '}';
    }
    
    
    
}
