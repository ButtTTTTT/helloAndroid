package top.lhit.myapplication3.model.http
import android.util.Log
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.util.concurrent.TimeUnit

/**
 * object 类 可以在整个声明周期中都有使用的话建议用object类
 */
/**
 *  Get 请求
 *  同步GET请求
 *  同步Get的意思是一直等待http请求，直到返回了响应。在这之间会阻塞线程，所以同步请求
 *  不能在Android的主线程中执行，否则会报错NetworkMainThreadException
 */
object HiOkHttp {

    private val BASE_URL = "http://10.0.2.2:3000"

    private val user_query_list = "/user/query"

    //构建客户端请求配置
    val client = OkHttpClient
        .Builder() //builder  构造者设计模式
        .connectTimeout(10, TimeUnit.SECONDS)//连接超时时间
        .readTimeout(10, TimeUnit.SECONDS)//读取超时时间
        .writeTimeout(10, TimeUnit.SECONDS)//请求超时时间
        .build()

    //android 分为主线程和子线程
    //主线程就是APP启动后，咱们android framework层会启动一个线程，主线程(UI线程)
    //子线程 ---new Thread().start()
    fun get() { //网络同步请求接口

        //同步子线程
        Thread {
            val request = Request.Builder()
                .url(BASE_URL + "/user/query?userId=147c4593-101b-4259-acf5-29f975d481b8")
                .build()
            //构造请求对象
            val call = client.newCall(request)
            //发起同步请求 execute --同步执行，100ms,1000ms
            val response = call.execute()
            //body 是请求的返回对象 可以为null
            val body = response.body?.string();

            println("get response:${body}")
            Log.e("OKHTTP", "get resoponse: ${body}")

        }.start()
    }
    fun getAsync() { //网络异步请求接口 get Async

        //同步子线程
        Thread {
            val request = Request.Builder()
                .url(BASE_URL + "/user/query?userId=147c4593-101b-4259-acf5-29f975d481b8")
                .build()
            //构造请求对象
            val call = client.newCall(request)
            //发起异步请求 execute --同步执行，100ms,1000ms
            val response = call.enqueue(object :Callback{
                override fun onFailure(call: Call, e: IOException) {
                    Log.e("OKHTTP","get response Exception:${e.message}")
                }

                override fun onResponse(call: Call, response: Response) {
                    val body = response.body?.string()
                    Log.e("OKHTTP","get response: ${body}")

                }
            })
            //body 是请求的返回对象 可以为null  异步并没有放回对象
//            val body = response.body?.string();
//
//            println("get response:${body}")
//            Log.e("OKHTTP", "get resoponse: ${body}")

        }.start()
    }
}