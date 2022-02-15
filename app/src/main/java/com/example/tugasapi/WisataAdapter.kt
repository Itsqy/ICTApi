package com.example.tugasapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugasapi.model.DataItem

class WisataAdapter(val dataWisata: List<DataItem?>?) :
    RecyclerView.Adapter<WisataAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgWIsata = view.findViewById<ImageView>(R.id.item_image_recipe)
        val tvTitle = view.findViewById<TextView>(R.id.item_tv_title)

        //        val tvPorsi = view.findViewById<TextView>(R.id.item_tv_portion)
//        val tvDurasi = view.findViewById<TextView>(R.id.item_tv_times)
        val tvDificulty = view.findViewById<TextView>(R.id.item_tv_dificulty)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_recipe, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.tvDurasi.text = dataRecipe?.get(position)?.times
        holder.tvTitle.text = dataWisata?.get(position)?.namaWisata
//        holder.tvPorsi.text = dataWisata?.get(position)?.portion
        holder.tvDificulty.text = dataWisata?.get(position)?.provinsi

        Glide.with(holder.itemView)
            .load(dataWisata?.get(position)?.image)
            .error(R.drawable.ic_launcher_background)
            .into(holder.imgWIsata)
    }

    override fun getItemCount(): Int {
        if (dataWisata != null) {
            return dataWisata.size

        }

        return 0
    }
}