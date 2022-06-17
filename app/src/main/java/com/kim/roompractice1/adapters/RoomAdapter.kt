package com.kim.roompractice1.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kim.roompractice1.R
import com.kim.roompractice1.datas.Room

// 룸 어댑터 생성 -> ArrayAdapter 부모로 지정 -> 3개의 변수를 생성자로 넣어줌
class RoomAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resID, mList) {

    // 어댑터로 리스트뷰와 XML 연결 -> 인플레이트 설정
    val inflate = LayoutInflater.from(mContext)
// 겟뷰 오버라이딩
    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
// 템프로우 컨버터 설정
        var tempRow = convertView
// 템프로우 null일 때 XML에 있는 내용 가지고 옴
        if (tempRow == null) {

            tempRow = inflate.inflate(R.layout.room_item_list, null)

        }
// 로우는 절대 null이 아니라고 지정
        val row = tempRow!!

//    roomData를 mList의 눌리는 순서에 따라 반영 설정
        val roomData = mList[position]
//    가격, 주소, 상세사항을 row에서 찾아 적용함
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

// 각각의 변수에 Text를 roomData에서 받아옴
        priceTxt.text = roomData.getFormmatedPrice()
        addressAndFloorTxt.text = "${roomData.address}, ${roomData.getFormmatedFloor()}"
        descriptionTxt.text = roomData.description

        return row
    }
}