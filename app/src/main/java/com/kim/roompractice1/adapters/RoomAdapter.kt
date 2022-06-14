package com.kim.roompractice1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.kim.roompractice1.R
import com.kim.roompractice1.datas.Room

class RoomAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resID, mList) {

    val inflate = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {

            tempRow = inflate.inflate(R.layout.room_item_list, null)

        }

        val row = tempRow!!

        return row
    }
}