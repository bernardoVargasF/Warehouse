package Entity;

public class Product {
    private int productId;
    private String productName;
    private int total;
    private int remaining;
    private int warehouse_id;

    public Product() {
    }

    public Product(int productId, String productName, int total, int remaining, int warehouse_id) {
        this.productId = productId;
        this.productName = productName;
        this.total = total;
        this.remaining = remaining;
        this.warehouse_id = warehouse_id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", total=" + total + ", remaining=" + remaining + ", warehouse_id=" + warehouse_id + '}';
    }
    
      
}
