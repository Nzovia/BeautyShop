package com.nicholas.beautyshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nicholas.beautyshop.adapters.ProductAdapter;
import com.nicholas.beautyshop.adapters.ProductCategoryAdapter;
import com.nicholas.beautyshop.appmodel.ProductCategory;
import com.nicholas.beautyshop.appmodel.ProductsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productRecyclerView, productListRecyclerview;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add some data to our model
        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"Skin Care"));
        productCategoryList.add(new ProductCategory(3,"Hair"));
        productCategoryList.add(new ProductCategory(4,"Nail Care"));

        setProductRecyclerView(productCategoryList);

        //add data from the holder to the model
        List<ProductsModel>  productsModelList = new ArrayList<>();
        productsModelList.add(new ProductsModel());


    }
    //setting up a recyclerView in an horizontal format
    private void setProductRecyclerView(List<ProductCategory> productCategoryList){
        productRecyclerView=findViewById(R.id.productRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        productRecyclerView.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this,productCategoryList);
        productRecyclerView.setAdapter(productCategoryAdapter);
    }
    //setting up a recyclerView in an horizontal format
    private void setProductListRecyclerview(List<ProductsModel> beautyProducts){
        productListRecyclerview=findViewById(R.id.productListRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        productListRecyclerview.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this,beautyProducts);
        productRecyclerView.setAdapter(productCategoryAdapter);
    }
}