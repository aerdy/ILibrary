package com.example.a9_2_publish_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.testmodule.ilibrary.ILibrary
import com.testmodule.ilibrary.core.Data
import com.testmodule.ilibrary.core.OnResulListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ILibrary().init(object :OnResulListener{
            override fun resultData(data: Data) {
                TODO("Not yet implemented")
            }

        })

    }
}