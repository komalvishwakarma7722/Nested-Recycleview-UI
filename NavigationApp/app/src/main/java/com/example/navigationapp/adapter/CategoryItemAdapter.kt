package com.example.navigationapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationapp.databinding.CatRowLayoutBinding
import com.example.navigationapp.model.CategoryItem

class CategoryItemAdapter(var context: Context, var CategoryItemList: MutableList<CategoryItem>):
    RecyclerView.Adapter<CategoryItemAdapter.CtegoryItemViewHolder>(){
    class CtegoryItemViewHolder(var binding: CatRowLayoutBinding) : RecyclerView.ViewHolder(binding.root){
    var itemImage:ImageView
    init {
        itemImage=binding.imageitem
    }

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CtegoryItemViewHolder {
        var binding=CatRowLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return CtegoryItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return CategoryItemList.size
    }

    override fun onBindViewHolder(holder: CtegoryItemViewHolder, position: Int) {
        holder.binding.imageitem.setImageResource(CategoryItemList[position].imageUrl)
    }
}