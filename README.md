# DataBindingPractice
DataBinding学习使用

## DataBinding
  ### 启用
  ap下的build.gradle
  android {
  ...
    databinding{
      enable ture
    }
  ...
  }
  
  ### 使用
  
 #### 1、无需findviewById
  选中根布局 Alt+回车 ->  `convert to data binding layout`
  对应Activity下,使用
      var binding =  DataBindlingDataBindingUtil.setContent(Activiry.this,R.layout.ac_databinding_practice_1)
      通过binding对象可以直接获取到对应layout视图下的控件
  
  
 #### 2、设置控件的onclick方法
 1、 variable data中声明一个对象一般是activity 并且里面声明onclick方法
 2、 控件设置点击：  android:onclick=@{activity::onclick}
 3、一定要给databinding中的activity赋值，即binding.activity = this,否则点击无效

 #### 3、data 为对象，数据、界面变化的联动
  1、前面的步骤和之前一眼
  2、对象继承BaseObeservable
  3、get方法注解@bindale
  4、set方法设置值之后调用notifyPropertyChanged（BR.age）刷新绑定此数据的界面，（BR.age 类似于R文件下的id，自动生成）
  5、记得给layout下的variable对象赋值
