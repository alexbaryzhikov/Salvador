package com.alexbaryzhikov.salvador.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ProgressBar
import butterknife.BindInt
import butterknife.BindView
import butterknife.ButterKnife
import com.alexbaryzhikov.salvador.R

class MainActivity : AppCompatActivity() {

  @BindView(R.id.discovery_view) lateinit var discoveryView: RecyclerView
  @BindView(R.id.progress_bar) lateinit var progressBar: ProgressBar
  @BindInt(R.integer.discovery_columns) var columns = -1

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    ButterKnife.bind(this)
    setupGrid()
  }

  private fun setupGrid() {
    val gridLayoutManager = GridLayoutManager(this, columns)
  }
}
