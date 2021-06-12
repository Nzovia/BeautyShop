package com.nicholas.beautyshop.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nicholas.beautyshop.appmodel.ProductsModel;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context context;
    List<ProductsModel> beautyProducts;

    //generate a constructor for the products
    public ProductAdapter(List<ProductsModel> beautyProducts) {
        this.beautyProducts = beautyProducts;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return beautyProducts.size();
    }

    //create a viewholder class that extends to recyclerview.viewholder
    public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
