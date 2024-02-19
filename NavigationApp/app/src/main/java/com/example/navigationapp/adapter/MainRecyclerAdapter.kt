package com.example.navigationapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationapp.databinding.ItemRecycleLayoutBinding
import com.example.navigationapp.model.AllCategory
import com.example.navigationapp.model.CategoryItem

class MainRecyclerAdapter (var context: Context, var CategoryList : MutableList<AllCategory>):
    RecyclerView.Adapter<MainRecyclerAdapter.MyViewHolder>(){
    class MyViewHolder(var binding:ItemRecycleLayoutBinding) : RecyclerView.ViewHolder(binding.root){
//        private var CategoryTitle:TextView
        var itemRecycler:RecyclerView
        init {
//            CategoryTitle=binding.catTitle
            itemRecycler=binding.catItemRecycle
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding=ItemRecycleLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return CategoryList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var catergory = CategoryList[position]
        holder.binding.catTitle.text=catergory.CategoryTitle
        setCatItemRecycle(holder.itemRecycler,CategoryList[position].CategoryItem as MutableList<CategoryItem>)
    }
    private fun setCatItemRecycle(recyclerView: RecyclerView, categoryItem: MutableList<CategoryItem>){
        var itemRecyclerAdapter = CategoryItemAdapter(context,categoryItem)
        recyclerView.layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView.adapter=itemRecyclerAdapter
    }

}