package com.kim.roompractice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.roompractice1.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as Room

        priceTxt.text = roomData.getFormmatedPrice()
        descriptionTxt.text = roomData.description
        floorTxt.text = roomData.getFormmatedFloor()
        addressTxt.text = roomData.address

    }
}