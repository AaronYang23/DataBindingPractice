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
      var binding = DataBindingUtil.setContent(Activiry.this,R.layout.ac_databinding_practice_1)
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


总结：主要东西：DataBindingUtil、@{activity::onClick}、extends BaseObeserver、@bindale、notifyPropertyChanged()

备注：避免阅读混乱，控件命名需要规范，控件要有控件缩写标识


# Lifecycle
1、需要能获取到avtivity或者fragment的类实现LifecycleObserver接口,对应的方法下能获取到所需页面的生命周期（比如Presenter、ViewModel）

    注意点：
    java8一下：实现LifecycleObeserver，要观察的周期带上注解
    java8：实现DefaultObservable，不需要注解

2、需要观察的activity/fragment  添加观察lifecycle ：获取lifecycle对象 然后addObserver(实现了1接口的对象)

- 实现lifecycleobserver中可以多个方法注解生命周期 均可执行
- 一个lifecycle类可以观察多个activity（都是新对象）
- 一个页面可以被多个lifecycle观察