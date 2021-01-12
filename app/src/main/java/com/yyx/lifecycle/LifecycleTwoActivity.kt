package com.yyx.lifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yyx.R
import com.yyx.databinding.ActivityLifecycleTwoBinding

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/7
 * Function:
 */

class LifecycleTwoActivity() : AppCompatActivity() {

    var name = "TwoActivity"

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyLifecycleOne("TwoActivity")) //一个lifecycle类可以观察多个activity（都是新对象）
        lifecycle.addObserver(MyLifecycleOther("TwoActivity")) //一个页面可以被多个lifecycle观察
        val binding = DataBindingUtil.setContentView<ActivityLifecycleTwoBinding>(
            this,
            R.layout.activity_lifecycle_two
        )
        binding.twoActiviy = this
    }

    fun click(v: View) {
        finish()
    }
}