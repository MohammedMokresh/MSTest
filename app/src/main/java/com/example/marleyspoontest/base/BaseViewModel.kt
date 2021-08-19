package com.example.marleyspoontest.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import com.dansdev.libeventpipe.EventPipe
import com.example.marleyspoontest.utils.SingleLiveEvent
import com.example.marleyspoontest.utils.UIEvent

abstract class BaseViewModel : ViewModel(), LifecycleObserver {
    var errorMessage = SingleLiveEvent<String>()


    fun <T : UIEvent> publishUIEvent(event: T) {
        EventPipe.send(event)
    }

}
