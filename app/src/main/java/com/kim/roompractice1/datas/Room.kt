package com.kim.roompractice1.datas

import android.icu.text.NumberFormat
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

class Room(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) {

    @RequiresApi(Build.VERSION_CODES.N)
    fun getFormmatedPrice() : String {

        if(this.price >= 10000){

            val uk = this.price / 10000
            val rest = this.price % 10000

            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }

        else{

            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}"


        }
    }



}