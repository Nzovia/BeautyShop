package com.nicholas.beautyshop.appmodel;

public class ProductsModel {
    private int productid;
    private String productname;
    private String productquantity;
    private String productprice;
    private int imageUrl;

    public ProductsModel() {
    }

    public ProductsModel(int productid, String productname, String productquantity, String productprice, int imageUrl) {
        this.productid = productid;
        this.productname = productname;
        this.productquantity = productquantity;
        this.productprice = productprice;
        this.imageUrl = imageUrl;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductquantity() {
        return productquantity;
    }

    public void setProductquantity(String productquantity) {
        this.productquantity = productquantity;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
