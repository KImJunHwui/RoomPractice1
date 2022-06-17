package com.kim.roompractice1.datas

import android.icu.text.NumberFormat
import android.os.Build
import androidx.annotation.RequiresApi
import java.io.Serializable
import java.util.*

// 룸클래스 생성 -> 가격, 주소, 계단, 세부사항 변수 지정
class Room(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) : Serializable{

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

    fun getFormmatedFloor() : String{

        if(this.floor >= 1){

            return "${this.floor}층"
        }

        else if(this.floor == 0){

            return "반지하"
        }

        else{

            return "지하 ${-this.floor}층"

        }


    }



}