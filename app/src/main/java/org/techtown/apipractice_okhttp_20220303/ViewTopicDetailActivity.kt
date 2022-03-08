package org.techtown.apipractice_okhttp_20220303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import org.techtown.apipractice_okhttp_20220303.databinding.ActivityViewTopicDetailBinding
import org.techtown.apipractice_okhttp_20220303.datas.TopicData

class ViewTopicDetailActivity : BaseActivity() {
    lateinit var binding : ActivityViewTopicDetailBinding

//    보여주게 될 토론 주제 데이터 > 이벤트처리, 데이터 표현 등 여러 함수에서 사용
//    화면에 들어와서 > Intent 통해 대입 (멤버변수에 대입을 늦게하고 싶다> 일반 멤버변수는 초기값 세팅을 꼭 해야하기때문에)
    lateinit var mTopicData : TopicData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_topic_detail)

        mTopicData = intent.getSerializableExtra("topic") as TopicData
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

        binding.txtTitle.text = mTopicData.title
        Glide.with(mContext).load(mTopicData.imageUrl).into(binding.imgTopicBackground)
    }


}