package com.yyx.databiding

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yyx.R
import com.yyx.databinding.AcDatabindingPractice2Binding

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/8
 * Function:
 */

class DataBindingActivity : AppCompatActivity() {

    var person = Person("Aaron Yang", 18)
    var binding2: AcDatabindingPractice2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //泛型填写根据布局名自动生成的Binding

        //1.设置基本类型 当成findViewById使用
//        val binding =  DataBindingUtil.setContentView<AcDatabindingPractice1Binding>(this, R.layout.ac_databinding_practice_1)
//        binding.setName("Aaron  Yang")
//        binding.setAge("26")


        //2.设置对象，对象改变数据改变，并且数据改变界面也改变;设置点击事件
        binding2 = DataBindingUtil.setContentView<AcDatabindingPractice2Binding>(
            this,
            R.layout.ac_databinding_practice_2
        )
        //如果view层的数据没有设置进去，那么数据不会填充，点击事件都会无效
        binding2!!.person = person
        binding2!!.dataBindingActivity = this
    }


    fun onClick(v: View) {
        Log.i("=========", "=====click:" + v.id)
        when (v.id) {
            //数据改变
            binding2!!.button1.id -> {
//                person.name = "AaronYang by Data"  //没有调用带有notify操作的数据设置不会改变界面
                person.setName("AaronYang by Data")
                person.growAge()
            }

            //界面改变 年龄归0
            binding2!!.button2.id -> {
                binding2!!.name.text = "AaronYang by View"
                binding2!!.age.text = "0"
            }
        }
        binding2!!.personToString.text = person.toString()
        Log.i("=========", "after click=====person$person")
    }


}