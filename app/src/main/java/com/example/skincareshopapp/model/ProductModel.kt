package com.example.skincareshopapp.model

data class ProductModel (
    val id_product:Int? = null,
    val name_product:String? = null,
    val number:Int? = null,
    val show_product:Boolean? = null,
    val price:Double? = null,
    val describe_product:String? = null,
    val id_category_product:CategoryProductModel

        )