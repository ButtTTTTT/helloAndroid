package top.lhit.myapplication3.ui.home
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.collection.arrayMapOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import top.lhit.myapplication3.R
import top.lhit.myapplication3.R.id.item_image
import top.lhit.myapplication3.R.id.item_message
import top.lhit.myapplication3.R.id.item_title
import top.lhit.myapplication3.databinding.FragmentHomeBinding
class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var fhb: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fhb = FragmentHomeBinding.bind(view)
        fhb.recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val myAdapter = MyAdapter()
        fhb.recyclerView.adapter = myAdapter
    }
    inner class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView = LayoutInflater.from(context)
                .inflate(R.layout.item_view_grid, parent, false)
            return MyViewHolder(itemView)
        }
        override fun getItemCount(): Int {
            return 20
        }
        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            /**
             * 设置imageView中的图片
             */
            val arr = arrayListOf(0, 3, 4, 7, 9)
            if (arr.contains(position)){
                holder.itemView.findViewById<TextView>(item_message).setSingleLine(false)
            }else{
                holder.itemView.findViewById<TextView>(item_message).setSingleLine(true)
            }
                holder.itemView.findViewById<ImageView>(item_image)
                    .setImageResource(R.drawable.test)
            holder.itemView.findViewById<TextView>(item_title).text =
                "【${position}】 移动端架构师体系课"
            holder.itemView.findViewById<TextView>(item_message).text = """
                移动开发“两级分化”，没有差不多的“中间层”
                唯有尽早成长为架构师，你的职业道路才能走的更远更稳
            """.trimIndent()
        }
    }
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}