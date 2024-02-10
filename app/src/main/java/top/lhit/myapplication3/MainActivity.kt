package top.lhit.myapplication3

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import top.lhit.myapplication3.model.http.HiOkHttp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setupWithNavController(findNavController(R.id.nav_host_fragment_activity_main))

//        HiOkHttp.get()
        HiOkHttp.getAsync()
    }

}