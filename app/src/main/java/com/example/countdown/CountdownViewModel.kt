package com.example.countdown

import android.os.CountDownTimer
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountdownViewModel : ViewModel() {
    private var countDownTimer: CountDownTimer? = null
    private val _isRunning = MutableLiveData(false)
    val isRunning: LiveData<Boolean>
    get() = _isRunning

    private  val _seconds = MutableLiveData(0)
    val seconds :LiveData<Int>
    get() = _seconds

    private  val _minutes = MutableLiveData(0)
    val minutes :LiveData<Int>
        get() = _minutes

    private val _hours = MutableLiveData(0)
    val hours: LiveData<Int>
        get() = _hours
}


//@ExperimentalAnimationApi
//@Composable
//fun  TimerApp(countdownViewModel: CountdownViewModel,modifier: Modifier = Modifier){
//    val secs = countdownViewModel.seconds.observeAsState()
//    val minutes = countdownViewModel.minutes.observeAsState()
//    val hours = countdownViewModel.hours.observeAsState()
//
//    val resumed = countdownViewModel.isRunning.observeAsState()
//    val progress = countdownViewModel.progress.observeAsState(1f)
//    val timeShow = countdownViewModel.time.observeAsState(initial = "00:00:00")
//}