package com.yyx.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/7
 * Function:
 */
class MyLifecycle(name:String) : LifecycleObserver {

    var name:String = name


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onActivityCreate() {
        Log.i("==============", "$name=====onActivityCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onActivityStart() {
        Log.i("==============", "$name==========onActivityStart")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onActivityResume() {
        Log.i("==============", "$name===========onActivityResume")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onActivityPause() {
        Log.i("==============", "$name===========onActivityPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onActivityStop() {
        Log.i("==============", "$name=========onActivityStop")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onActivityDestroy() {
        Log.i("==============", "$name=========onActivityDestroy")
    }


}