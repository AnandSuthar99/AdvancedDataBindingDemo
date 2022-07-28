package com.example.advanceddatabindingdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.advanceddatabindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val clickHandler = ClickHandler(this)
    private val student = Student("Stephen", 21)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.clickHandler = clickHandler
        binding.student = student

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, RecyclerViewBindingDemoActivity::class.java))
        }
    }

    class ClickHandler (private val mContext: Context) {
        fun onEnrolClicked(v: View) {
            Toast.makeText(mContext, "Enrol Button Clicked", Toast.LENGTH_LONG).show()
        }

        fun onCancelClicked(v: View) {
            Toast.makeText(mContext, "Cancel Button Clicked", Toast.LENGTH_LONG).show()
        }
    }
}