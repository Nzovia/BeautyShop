package com.nicholas.beautyshop.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nicholas.beautyshop.R;
import com.nicholas.beautyshop.appmodel.ProductsModel;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context context;
    List<ProductsModel> productsModelList;

    //generate a constructor for the products
    public ProductAdapter(Context context, List<ProductsModel> productsModelList) {
        this.context = context;
        this.productsModelList = productsModelList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.productslist,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        //pass the products to the holder
        holder.productImage.setImageResource(productsModelList.get(position).getImageUrl());
        holder.productName.setText(productsModelList.get(position).getProductname());
        holder.productSize.setText(productsModelList.get(position).getProductquantity());
        holder.productPrice.setText(productsModelList.get(position).getProductprice());


    }

    @Override
    public int getItemCount() {
        return productsModelList.size();
    }

    //create a viewholder class that extends to recyclerview.viewholder
    public static final class ProductViewHolder extends RecyclerView.ViewHolder{
        //accessing the products item widgets
        ImageView productImage;
        TextView productName, productSize, productPrice;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage=itemView.findViewById(R.id.productimage);
            productName=itemView.findViewById(R.id.productname);
            productSize=itemView.findViewById(R.id.productsize);
            productPrice=itemView.findViewById(R.id.productprice);

        }
    }
}
