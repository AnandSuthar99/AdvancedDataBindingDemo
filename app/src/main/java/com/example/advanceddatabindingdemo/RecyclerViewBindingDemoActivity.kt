package com.example.advanceddatabindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.advanceddatabindingdemo.databinding.ActivityRecyclerViewBindingDemoBinding

class RecyclerViewBindingDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBindingDemoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view_binding_demo)
        binding.rvStudents.layoutManager = LinearLayoutManager(this)
        binding.rvStudents.adapter = StudentsListAdapter(this, listOf(
            Student("Alex", 18),
            Student("Brandon", 20),
            Student("Michael", 24),
            Student("Henry", 16),
            Student("Mark", 21),
            Student("Malinda", 19),
            Student("April", 22),
            Student("Julie", 24),
            Student("James", 25),
            Student("Jason", 17),
            Student("Jennifer", 20)
        ))
    }
}