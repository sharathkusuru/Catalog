package com.sharath.category.model;
public class CatalogTest {

    private Sales sales;
    private Category category;

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CatalogTest(Sales sales, Category category) {
        this.sales = sales;
        this.category = category;
    }

    @Override
    public String
    toString() {
        return "CatalogTest{" +
                "sales=" + sales +
                ", category=" + category +
                '}';
    }
}
