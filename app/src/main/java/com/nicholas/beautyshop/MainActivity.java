package com.nicholas.beautyshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nicholas.beautyshop.adapters.ProductCategoryAdapter;
import com.nicholas.beautyshop.appmodel.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add some data to our model
        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"Skin Care"));
        productCategoryList.add(new ProductCategory(3,"Hair"));
        productCategoryList.add(new ProductCategory(4,"Nail"));

        setProductRecyclerView(productCategoryList);

    }
    //setting up a recyclerView in an horizontal format
    private void setProductRecyclerView(List<ProductCategory> productCategoryList){
        productRecyclerView=findViewById(R.id.productRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        productRecyclerView.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this,productCategoryList);
        productRecyclerView.setAdapter(productCategoryAdapter);
    }
}