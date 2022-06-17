package com.kim.roompractice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.roompractice1.adapters.RoomAdapter
import com.kim.roompractice1.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
// mRoomList 어레이리스트 적용
    val mRoomList = ArrayList<Room>()
// 레이트리니바 설정
    lateinit var mAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRoomList[position]
            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("room", clickedRoom)
            startActivity(myIntent)
        }


// mRoomList 내용 추가
        mRoomList.add( Room( 7500, "서울시 동대문구", 8, "서울시 동대문구의 8층 7500만원 방 입니다." ) )
        mRoomList.add( Room( 24500, "서울시 서대문구", 0, "서울시 서대문구의 반지하 2억 4500만원 방 입니다." ) )
        mRoomList.add( Room( 8500, "서울시 동작구", 0, "서울시 동작구의 반지하 8500만원 방 입니다." ) )
        mRoomList.add( Room( 4500, "서울시 은평구", -2, "서울시 은평구의 지하 2층 4500만원 방 입니다." ) )
        mRoomList.add( Room( 182500, "서울시 중랑구", 5, "서울시 중랑구의 5층 1억 18억 2500만원 방 입니다." ) )
        mRoomList.add( Room( 235000, "서울시 도봉구", 7, "서울시 도봉구의 7층 1억 23억 5000만원 방 입니다." ) )
        mRoomList.add( Room( 24000, "서울시 강남구", 19, "서울시 강남구의 19층 2억 4000만원 방 입니다." ) )
        mRoomList.add( Room( 3700, "서울시 서초구", -1, "서울시 서초구의 지하 1층 3700만원 방 입니다." ) )
// 룸어댑터의 내용을 mAdapter에 상속
        mAdapter = RoomAdapter(this, R.layout.room_item_list, mRoomList)
//  roomListView의 어댑터를 mAdapter로 지정
        roomListView.adapter = mAdapter
    }
}