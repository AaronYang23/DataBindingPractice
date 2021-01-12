package com.yyx.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/12
 * Function: 多个lifecyc监听生命周期
 */

class MyLifecycleOther(var name: String) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onActivityStart() {
        Log.i("==============", "$name==========MyLifecycleOtherL:onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i("==============", "$name=====MyLifecycleOtherL:onCreate")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.i("==============", "$name=====MyLifecycleOtherL:onResume")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.i("==============", "$name===========MyLifecycleOtherL:onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.i("==============", "$name=========MyLifecycleOtherL:onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.i("==============", "$name=========MyLifecycleOtherL:onDestroy")
    }

}