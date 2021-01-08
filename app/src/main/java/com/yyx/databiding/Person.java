package com.yyx.databiding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.yyx.BR;

/**
 * Author: AaronYang  \  aymiracle37@gmail.com
 * Date: 2021/1/8
 * Function:
 */

public class Person extends BaseObservable {

    String name;
    int age; // TODO: 2021/1/8 int  类型的如何界面变化引起数据变化

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //@Bindable观察数据变化
    @Bindable
    public String getName() {
        return name;
    }


    //数据变化界面要变化要加notifyPropertyChanged 和对应字段
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    //@Bindable观察数据变化
    @Bindable
    public int getAge() {
        return age;
    }

    //数据变化界面要变化要加notifyPropertyChanged 和对应字段
    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }


    public void growAge() {
        setAge(++age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}