package com.sharath.category.model;

public class Sales {
    private Long productId;
    private Long leafCategoryId;
    private Long primaryCategoryId;
    private Long amount;
    private Long quantity;

    public Long getProductId() {
        return productId;
    }

    public Long getLeafCategoryId() {
        return leafCategoryId;
    }

    public Long getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public Long getAmount() {
        return amount;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setLeafCategoryId(Long leafCategoryId) {
        this.leafCategoryId = leafCategoryId;
    }

    public void setPrimaryCategoryId(Long primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Sales(Long productId, Long leafCategoryId, Long primaryCategoryId, Long amount, Long quantity) {
        this.productId = productId;
        this.leafCategoryId = leafCategoryId;
        this.primaryCategoryId = primaryCategoryId;
        this.amount = amount;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "productId=" + productId +
                ", leafCategoryId=" + leafCategoryId +
                ", primaryCategoryId=" + primaryCategoryId +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}
