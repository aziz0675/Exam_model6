package com.example.exam2.helper

import android.util.Log
import com.example.exam2.networking.ApiClient

object Logger {
    fun d(tag: String?, msg: String?) {
        if (ApiClient.IS_TESTER) Log.d(tag, msg!!)
    }

    fun i(tag: String?, msg: String?) {
        if (ApiClient.IS_TESTER) Log.i(tag, msg!!)
    }

    fun v(tag: String?, msg: String?) {
        if (ApiClient.IS_TESTER) Log.v(tag, msg!!)
    }

    fun e(tag: String?, msg: String?) {
        if (ApiClient.IS_TESTER) Log.e(tag, msg!!)
    }
}