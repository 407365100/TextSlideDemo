# TextSlideDemo
文字轮播类似图片轮播
##工程目录
![这里写图片描述](http://img.blog.csdn.net/20160219143755584)
##概述
实现textview的轮播，效果与图片轮播类似
##主要文件
|文件|作用|
|:---|:---|
|LazyViewPager.java|v4包中，ViewPager的一个改造类。<br/>默认ViewPager第1次加载就开始同时存在2个条目，第2次就同时存在3个条目<br/>而LazyViewPager做了改变，同时最多只能有一个条目实例|
|SlideShowView.java|详情查看源码|
<br/>
SlideShowView.java
`对外暴露了一个设置要显示字符串的方法，setData()。使用如下`

MainActivity.java
```java
public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SlideShowView slideShowView= (SlideShowView) findViewById(R.id.slideshowView);
        //设置字符串
        String[] texts = new String[]{
                "中共第八大会议",
                "正月庆元宵",
                "大冬天的能不这样吗！大家都觉得你们如何呢大家都觉得你们如何呢大家都觉得你们如何呢",
                "大家都觉得你们如何呢大家都觉得你们如何呢大家都觉得你们如何呢大家都觉得你们如何呢"
        };
        slideShowView.setData(texts);
    }
}
```

##运行效果
![这里写图片描述](http://img.blog.csdn.net/20160219143907045)
