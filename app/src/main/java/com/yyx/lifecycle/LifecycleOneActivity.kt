package com.yyx.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yyx.R
import com.yyx.databinding.ActivityLifecycleOneBinding

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/7
 * Function:
 */
class LifecycleOneActivity(): AppCompatActivity() {

    var name = "OneActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyLifecycleOne("OneActivity"))
        val binding = DataBindingUtil.setContentView<ActivityLifecycleOneBinding>(this,R.layout.activity_lifecycle_one)
        binding.oneActivity = this
//        binding.lifecycleOwner = this
    }


    fun click(v: View){
        var intent = Intent(this, LifecycleTwoActivity::class.java)
        startActivity(intent)
    }

}