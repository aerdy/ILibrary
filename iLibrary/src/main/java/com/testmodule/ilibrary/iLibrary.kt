package com.testmodule.ilibrary

import com.testmodule.ilibrary.core.OnResulListener

class ILibrary {
    lateinit var onResulListener: OnResulListener
     fun init(onResulListener: OnResulListener) {
        this.onResulListener = onResulListener
    }
}