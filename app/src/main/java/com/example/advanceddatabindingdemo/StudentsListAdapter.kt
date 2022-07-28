package com.example.advanceddatabindingdemo

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.advanceddatabindingdemo.databinding.LayoutStudentListItemBinding

class StudentsListAdapter(
    private var mActivity: Activity,
    private var students: List<Student>): RecyclerView.Adapter<StudentsListAdapter.ViewHolder>() {


    class ViewHolder(var studentListItemBinding: LayoutStudentListItemBinding): RecyclerView.ViewHolder(studentListItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val studentListItemBinding: LayoutStudentListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.layout_student_list_item, parent, false)
        return ViewHolder(studentListItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.studentListItemBinding.student = students[position]
        holder.studentListItemBinding.root.setOnClickListener {
            Toast.makeText(
                mActivity,
                "Clicked on ${students[position].name}..!!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return students.size
    }

}