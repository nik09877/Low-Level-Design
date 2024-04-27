package problems.Order_Inventory_Management_Sysyem_Zepto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
    //category wise products storage
    List<ProductCategory> productCategoryList;

    Inventory(){
        productCategoryList = new ArrayList<>();
    }

    //add new category
    public void addCategory(int categoryId, String name, int price){
        ProductCategory productCategory = new ProductCategory();
        productCategory.price = price;
        productCategory.categoryName = name;
        productCategory.categoryId = categoryId;
        productCategoryList.add(productCategory);
    }


    //add product to the particular category
    public void addProduct(Product product, int productCategoryId){

        //take out the respective productCategory Object
        ProductCategory categoryObject = null;
        for(ProductCategory category : productCategoryList)
        {
            if(category.categoryId == productCategoryId){
                categoryObject = category;
            }
        }

        if(categoryObject !=null) {
            categoryObject.addProduct(product);
        }
    }

    //remove product from the category
    public void removeItems(Map<Integer, Integer> productCategoryAndCountMap){

        for(Map.Entry<Integer, Integer> entry : productCategoryAndCountMap.entrySet())
        {
            ProductCategory category = getProductCategoryFromID(entry.getKey());
            if (category != null) {
                category.removeProduct(entry.getValue());
            }
        }

    }

    private ProductCategory getProductCategoryFromID(int productCategoryId){

        for(ProductCategory productCategory : productCategoryList){

            if(productCategory.categoryId == productCategoryId){
                return productCategory;
            }
        }

        return null;
    }

}
