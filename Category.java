package com.sharath.category.model;

import java.util.List;

public class Category {
    private Long id;
    private String name;
    private List<Category> children;
    private Long totalSales;
    private Long totalQuantity;

    public Category(long id, String bharath, List<Category> children) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

    public Long getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Long totalSales) {
        this.totalSales = totalSales;
    }

    public Long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Category(Long id, String name, List<Category> children, Long totalSales, Long totalQuantity) {
        this.id = id;
        this.name = name;
        this.children = children;
        this.totalSales = totalSales;
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                ", totalSales=" + totalSales +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}



