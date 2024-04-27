package problems.Order_Inventory_Management_Sysyem_Zepto;

import java.util.List;

public abstract class WarehouseSelectionStrategy {
    public abstract Warehouse selectWarehouse(List<Warehouse> warehouseList);
}
