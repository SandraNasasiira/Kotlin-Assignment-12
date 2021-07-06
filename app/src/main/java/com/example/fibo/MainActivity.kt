package com.example.fibo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler=findViewById(R.id.rvumbers)
        recycler.layoutManager=LinearLayoutManager(baseContext)
        var adapter=recyclerviewadapter(fibonacci(100))
      recycler.adapter=adapter
    }

    fun fibonacci(num:Int):MutableList<BigInteger>{
        var newList= MutableList<BigInteger>(num,{BigInteger.ZERO})
        var num1=BigInteger.ZERO
        var num2=BigInteger.ONE
        newList[0]=num1
        newList[1]=num2
        for (i in 1..num){
            var sum=num1+num2
            num1=num2
            num2=sum
            newList[i-1]=num1

        }
        return newList
    }
}