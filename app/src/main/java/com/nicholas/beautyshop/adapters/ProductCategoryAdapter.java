package com.nicholas.beautyshop.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nicholas.beautyshop.R;
import com.nicholas.beautyshop.appmodel.ProductCategory;

import java.util.List;

public class ProductCategoryAdapter extends RecyclerView.Adapter<ProductCategoryAdapter.ProductViewHolder> {
    Context context;
    List<ProductCategory> productCategoryList;

    public ProductCategoryAdapter(Context context, List<ProductCategory> productCategoryList) {
        this.context = context;
        this.productCategoryList = productCategoryList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //here we will call the recyclerview item list
        View view=LayoutInflater.from(context).inflate(R.layout.productcategories,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productcategory.setText(productCategoryList.get(position).getProductName());

    }

    @Override
    public int getItemCount() {
        return productCategoryList.size();
    }

    public static final class ProductViewHolder extends  RecyclerView.ViewHolder {
        TextView productcategory;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            productcategory=itemView.findViewById(R.id.most);
        }
    }


}
