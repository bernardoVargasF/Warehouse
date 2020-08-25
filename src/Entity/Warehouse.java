package Entity;

public class Warehouse {
    private int warehouseId;
    private String warehouseName;
    private int minProduct;
    private int maxProduct;
    
    public Warehouse() {}

    public Warehouse(int warehouseId, String warehouseName, int minProduct, int maxProduct) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.minProduct = minProduct;
        this.maxProduct = maxProduct;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getMinProduct() {
        return minProduct;
    }

    public void setMinProduct(int minProduct) {
        this.minProduct = minProduct;
    }

    public int getMaxProduct() {
        return maxProduct;
    }

    public void setMaxProduct(int maxProduct) {
        this.maxProduct = maxProduct;
    }

    @Override
    public String toString() {
        return "Warehouse{" + "warehouseId=" + warehouseId + ", warehouseName=" + warehouseName + ", minProduct=" + minProduct + ", maxProduct=" + maxProduct + '}';
    }
    
}
