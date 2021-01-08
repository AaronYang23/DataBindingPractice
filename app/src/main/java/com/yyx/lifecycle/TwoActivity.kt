package com.yyx.lifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yyx.R

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/7
 * Function:
 */

class TwoActivity(): AppCompatActivity() {

    var name = "TwoActivity"

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_lifecycle_two)
        lifecycle.addObserver(MyLifecycle("OneActivity"))
    }

    fun click(v: View){
        finish()
    }
}