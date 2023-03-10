package com.example.skincareshopapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.example.skincareshopapp.R
import com.example.skincareshopapp.model.CategoryProductModel
import java.nio.file.Files.size

class CategoryProductAdapter(private val context: Context, private val listCategory: ArrayList<CategoryProductModel>)
    : RecyclerView.Adapter<CategoryProductAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryProductAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_category_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryProductAdapter.ViewHolder, position: Int) {
        val category = listCategory[position]
        holder.nameCategory.text = category.name_category_product
        holder.productByCate.setOnClickListener{
                holder.productByCate.id
        }
    }

    override fun getItemCount(): Int {
        return listCategory.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nameCategory: TextView = itemView.findViewById(R.id.nameCategory)
        val productByCate: ConstraintLayout = itemView.findViewById(R.id.productByCate)
    }

}
