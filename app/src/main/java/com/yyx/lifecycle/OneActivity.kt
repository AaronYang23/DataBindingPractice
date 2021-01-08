package com.yyx.lifecycle

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.yyx.R

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/7
 * Function:
 */
class OneActivity(): AppCompatActivity() {

    var name = "OneActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyLifecycle("TwoActivity"))
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this,R.layout.activity_lifecycle_one)
        binding.lifecycleOwner = this
//        binding.setVariable(BR.oneActivity,this)

//        binding.setVariable(BR.oneActivity,this)
    }


    fun click(v: View){
        var intent = Intent(this, TwoActivity::class.java)
        startActivity(intent)
    }

}