package com.partnerai.mobileserver.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class DashboardViewModel : ViewModel() {
    val serverState = MutableStateFlow<List<String>>(emptyList())
}