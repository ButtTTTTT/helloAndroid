package top.lhit.myapplication3.ui;

/**
 * UI是Android入门学习重中之重的板块，是 直接面向用户的门面。
 * AndroidUI：
 * 1、AndroidUI基础容器
 * 2、AndroidUI基础控件
 * 3、AndroidUI高级控件
 */
public class KTAndroidUI {
    /**
     * 1、Android常用的基础布局容器
     * Android的UI可以分为两类，一类叫做ViewGroup容器，
     * 一类叫做View视图
     * View视图：(TextView,Button,ImageView)都是常用常见的视图。
     * ViewGroup容器：内部可以承载、放置、添加View视图
     */
    /**
     * 基础布局容器：
     * 1、LinearLayout线性布局：横着或竖着按顺序排列
     * 2、RelativeLayout相对布局：起始坐标时屏幕坐上角，以同级或上级为参考系定位位置
     * 3、FrameLayout帧布局：像千层饼一样，一层叠着一层
     * 4、ConstraintLayout约束布局：google于2016年新发布的一种布局方式，它不在android的基础
     * api包里需要额外引入
     */
    /**
     * 线性布局LinearLayout
     * 线性布局就是从左到右或从上到下按顺序排列的一种布局
     *
     *      属性             可选值                                      说明
     *
     *  orientation   vertical 垂直排列     也就是这个线性布局到底是水平方向逐个排列还是垂直方向逐个排列
     *                horizontal 水平排列
     *  layout_width    match_parent: 填充父           layout_width和layout_height是android重控件的必要属性
     *   layout_height   容器的剩余控件                  规定了控件的宽度和高度，这个两个属性的值可以是指定的值
     *                   wrap_content:根据子视图宽高       也可以根据内容自适应，还可以填充整个剩余空间
     *                   自适应自己的宽高
     *                   自定义大小50dp
     *  background       #ff0000 红色                    填充背景色
     *
     *  gravity         center：所有子视图相对              决定子控件相对该父容器的位置
     *                  于父容器居中显示
     *                  horizontal_center:
     *                  所有子容器的横向方向上相对
     *                  父容器居中显示
     *                  vertical_center:所有子视图的纵向
     *                  方向上相对父容器居中显示
     *  layout_gravity   center:该容器相对于它的父容器居中显示            决定该容器相对于它的父容器的位置
     *                   horizontal_cent:该容器横向向上相对
     *                   于父容器居中显示
     *                   vertical_center:该容器纵向方向上相对于它的
     *                   父容器居中显示
    **   weight             按比例分配父容器剩余的宽度或高度
     */
    /**
     * 相对布局 RelativeLayout
     * 相对布局在摆放子视图位置时，按照指定的参考系来摆放子视图的位置，默认以屏幕左上角(0,0)位置作为参考系摆放位置
     * 1、相对父元素的 7 个常用属性：
     *          属性                  可选值(Boolean)                   说明
     *  layout_alignParentTop       true/false              是否让控件相对于父容器顶部对齐
     *  layout_alignParentBottom    true/false              是否让控件相对于父容器底部对齐
     *  layout_alignParentLeft      true/false              是否让控件相对于父容器左边对齐
     *  layout_alignParentRight     true/false              是否让控件相对于父容器右边对齐
     *  layout_centerHorizontal     true/false              是否让控件相对于父容器水平居中显示
     *  layout_centerVertical       true/false              是否让控件相对于父容器垂直居中显示
     *  centerInParent              true/false              是否让控件相对于父容器居中显示
     *
     * 2、相对于兄弟元素的摆放自己的位置   4个常用的属性
     *  layout_above                   @+id/                 指定在哪个控件的上侧
     *  layout_below                  true/false             指定在哪个控件的下侧
     *  android:layout_toLeftOf       true/false             指定在哪个控件的左侧
     *  android:layout_toRightOf      true/false             指定在哪个控件的右侧
     *
     *3、相对于兄弟元素的对齐方式  4个常用的属性
     *  layout_alignLeft                @+id/               该控件的 左边沿 与 指定控件 的左边对齐
     *  layout_alignRight               @+id/               该控件的 右边沿 与 指定控件 的右边对齐
     *  layout_alignTop                 @+id/               该控件的 上边沿 与 指定控件 的上边沿对齐
     *  layout_alignBottom              @+id/               该控件的 下边沿 与 指定控件 的上边沿对齐
     */
    /**
     * 帧布局FrameLayout：
     * 组件的默认位置都是左上方，组件之间可以重叠。像千层饼一样，一层压着一层 可以设置上下左右的对齐、
     * 水平垂直居中、设置方式与线性布局相似
     * 1、常用属性
     *          属性                      可选值                     说明
     *  layout_gravity              center                      组件相对父容器的位置
     *                              center_vertical
     *                              center_horizontal
     *  layout_marginLeft           具体的数值100dp              左侧外间距
     *  layout_marginTop            具体的数值100dp              上侧外间距
     *  layout_marginRight          具体的数值                   右侧外间距
     *  layout_marginBottom         具体的数值                   下侧外间距
     *
     */
    /**
     * 基础控件：
     * 1、Button：
     * MaterialButton：
     * MaterialButton 是Google于SDK28推出的新控件，当遇到按钮需要圆角、或者描边等，就不必使用xml文件
     * 或者在GitHub上找第三方库实现
     * MaterialButton的依赖引入：
     * com.google.android.material:material:1.3.0
     * MaterialButton的Theme主题修改：
     * android:theme="@style/Theme.MaterialComponents.Light.NoActionBar"
     * Material继承关系：
     * java.lang.Object
     *  android.view.View
     *      android.widget.TextView
     *          android.widget.Button
     *              androidx.appcompat.widget.AppCompatButton
     *                  com.google.android.material.button.MaterialButton
     * MaterialButton继承AppCompatButton,所以它拥有AppCompatButton所有的特征，且在其基础上做了一些扩展
     * 如圆角、描边、前置和后置icon(支持Size、Tint、Padding、Gravity等)，还支持按压水波纹并且自定义颜色
     * 关键属性：
     *          属性                  描述                  参数
     *   app:backgraoundTint        背景着色                默认为?attr/colorPrimary
     *   app:backgroundTintMode     着色模式                add,multiply,screen,src_atop,src_in,src_over
     *   app:strokeColor            描边颜色
     *   app:strokeWidth            描边宽度
     *   app:cornerRadius           圆角大小
     *   app:rippleColor            按压水波纹颜色
     *   app:icon                   图标icon
     *   app:iconSize               图标大小
     *   app:iconGravity            图标重心                 start,end,textStart,textEnd
     *   app:iconTint               图标着色
     *   app:iconTintMode           图标着色模式              add,multiply,screen,src_atop,src_in,src_over
     *   app:iconPadding            图标和文本之间的间距
     *   注意事项：
     *    1、不可以使用android:background 设置按钮背景，会破坏MaterialButton本身的绘制，而设置背景则推荐使用 app:backgroundTint
     *    2、MaterialButton创建后，按钮实际长度不是设定值，因为它上下有留空，可以使用
     *    android:insetBottom="0dp" 和android:insetTop="0dp" 去除
     *    3、去除阴影
     *      MD控件默认有阴影效果，但是有时候我们并不想要按钮有阴影，那么这时候可以指定style为
     *      style="@style/Widget.MaterialComponents.Button.UnelevatedButton" 这样就能去掉阴影，让视图看起来扁平化
     *    4、闪退
     *      修改APP主题
     *          android:theme="@style/Theme.MaterialComponents.Light.NoActionBar"
     */
    /**
     * MaterialButtonToggleGroup
     *  1、单选
     *  2、多选
     *  继承关系：
     *      java.lang.Object
     *          android.view.View
     *              android.view.ViewGroup
     *                  android.widget.LinearLayout
     *                      com.google.android.material.button.MaterialButtonToggleGroup
     *
     * 类似一个LinearLayout,但只能添加MaterialButton,只有第一个元素的最左边和最后一个元素的最右边角
     * 才能保留它们的形状外观圆角大小，类似于IOS重的SegmentedControl,用户可以从组中选择一个或多个选项
     *
     * 公开属性：
     *              属性                     秒速                   参数
     *        app:checkedButton         默认选中                    按钮ID
     *        app:singleSelection       是否单项选择                 true/false
     *        app:selectionRequired     设置为true后，强制至少选中一个  true/false
     *
     *  tab切换监听：
     *          MaterialButtonToggleGroup materialButtonToggleGroup= findViewById(xxxx.toggleGroup);
     *          mater.addOnButtonCheckedListener()
     */
    /**
     * TextView控件：
     *  常用属性：
     *          属性                      属性值示例                         属性说明
     *     id                           @+id/value                  设置一个组件的id，通过findViewById()的方法来获取该对象，然后进行相关设置
     *     layout_width                 xxdp                        组件宽度
     *     layout_height                xxdp                        组件高度
     *     text                                                     设置文本内容
     *     background                   #xxxxxx                     设置背景颜色 或背景图片
     *     textColor                    #xxxxxx                     设置字体颜色
     *     textStyle                    bold/italic/normal          设置字体样式
     *     textSize                     xxdp                        设置字体大小
     *     gravity                      center/center_horizontal/   内容的对齐方向
     *                                  center_vertical
     *     drawableTop                  @drawable/icon              TextView上部出现一个图片
     *     drawableTint                 #ffffff                     图片着色
     *     ellipsize                    end,middle,marquee,start     文字超出时的截断方式
     *     singleLine                   true/false                  单行显示
     *     padding                      xxdp                        内间距
     *     paddingLeft
     *     paddingRight
     *     paddingTop
     *     paddingBottom
     *     margin                       xxdp                        外间距
     *     marginLeft
     *     marginRight
     *     marginTop
     *     marginBottom
     */
    /**
     * ImageView 控件：
     * 常见属性：
     *          属性                      属性值示例                       属性说明
     *     android:src              @drawable/icon_home             给ImageView设置要显示的图片
     *     android:alpha            0.5[0.0~1.0]                    设置透明度
     *     android:scaleType                                        用于设置图片如何缩放以适应ImageView的大小
     * ScaleType
     *  1、center：保持原图的大小，显示再ImageView的中心。当原图的长width大于ImageView的height，超过部分裁剪处理。
     *  2、centerCrop：以填满整个ImageView为目的，将原图的的中心对准ImageView的中心，等比例放大原图，知道填满ImageView为止
     *  (指的是ImageView的宽和高都要填满)，原图超过ImageView的部分做裁剪处理。
     *  3、centerInside:以原图完全显示为目的，将图片的内容完整居中显示，通过按比例缩小的原图的width等于或小于ImageView的长宽。
     *  如果原图的长宽width本身就小于ImageView的width，则原图就不作任何处理，居中显示在ImageView
     *  4、fitCenter：把原图按比例扩大或缩小到ImageView的ImageView的height，居中显示
     *  5、fitEnd：把原图按比例扩大或缩小到ImageView的height，显示在ImageView的下部分位置
     *  6、fitStart：把原图按比例扩大或缩小到ImageView的height，显示在ImageView的上部分位置
     *  7、fitXY：把原图按照指定的大小在View中显示，拉伸显示的图片，不保持原比例，填满ImageView
     *  8、matrix:不改变原图的大小，从ImageView的左上角开始绘制原图，原图超过ImageView的部分作裁剪处理
     *
     *  很多人觉得fitCenter和centerInside没有区别，根据示例效果来分析，其实是有区别的。
     *  fitCenter：是将原图等比例放大或缩小，使原图的高度等于ImageView的高度，并居中显示
     *  centerInside： 在原图的原本width大于ImageView的width时候，则缩小原图，效果如同fitCenter
     *  反之，则不进行任何处理，居中显示，效果如同center
     */
    /**
     * RecyclerView 高级控件& 案例实践
     * RecyclerView是android极其重要的一个高级UI控件，使用频率极其之高，APP的90%以上的页面都会使用到。
     * 由于其出色的性能和插拔式的架构设计，被全世界广大开发者一致称赞
     * LinearLayoutManager 列表布局:
     * 1、纵向列表
     * recyclerView.layoutManager = LinearLayoutManager(context,VERTICAL,false)
     * recyclerView.adapter = MyAdapter()
     * 2、横向列表
     * recyclerView.layoutManager = LinearLayoutManager(context,HORIZONTAL,false)
     * recyclerView.adapter = MyAdapter()
     * 3、数据源适配器
     * inner class MyAdapter : RecyclerView.Adapter<ViewHolder>(){
     *     //[必须重写]创建ItemView的ViewHolder，用于后续的数据绑定
     *     override fun onCreateViewHolder(parent: ViewGroup,viewType:Int): ViewHolder{
     *         val view = LayoutInflater.from(context).inflate(R.layout.item_view_staggered,parent)
     *     }
     * }
     */
    /**
     * GridLayoutManager 网格布局
     *
     */


}
