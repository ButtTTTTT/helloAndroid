package top.lhit.myapplication3.ui.study
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import top.lhit.myapplication3.R
import top.lhit.myapplication3.databinding.FragmentStudyBinding
class StudyFragment : Fragment(R.layout.fragment_study) {
    private lateinit var fsb: FragmentStudyBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //绑定视图
        fsb = FragmentStudyBinding.bind(view)
        //设置视图管理器
        fsb.recyclerView.layoutManager = LinearLayoutManager(context)

        fsb.recyclerView.adapter = StudyAdapter()
    }

    inner class StudyAdapter : RecyclerView.Adapter<StudyAdapter.StudyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudyViewHolder {
            val view =
                LayoutInflater.from(context).inflate(R.layout.item_fragment_study, parent, false)
            return StudyViewHolder(view)
        }

        override fun getItemCount(): Int {
            return 20
        }

        override fun onBindViewHolder(holder: StudyViewHolder, position: Int) {
            holder
                .itemView
                .findViewById<ImageView>(R.id.item_course_poster)
                .setImageResource(R.drawable.test)
            holder
                .itemView
                .findViewById<TextView>(R.id.item_course_title)
                .text = "[${position}]架构师体系课"
            holder
                .itemView
                .findViewById<TextView>(R.id.item_course_label)
                .text = "架构师"
            holder
                .itemView
                .findViewById<TextView>(R.id.item_course_progrss)
                .text = "已学.100%"
        }

        inner class StudyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        }
    }

}


