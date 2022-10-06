package com.example.hackathon_2022.ui.add

import android.app.Dialog
import android.app.TimePickerDialog
import android.net.http.SslError
import android.os.Message
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import android.widget.TextView
import android.widget.TimePicker
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivityAddSupportBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddSupportActivity: BaseActivity<ActivityAddSupportBinding>(R.layout.activity_add_support){

    private val startListener = TimePickerDialog.OnTimeSetListener { p0, p1, p2 -> binding.startTimeTxt.text = "${p1} : ${p2}" }
    private val endListener = TimePickerDialog.OnTimeSetListener { p0, p1, p2 -> binding.endTimeTxt.text = "${p1} : ${p2}" }

    override fun initView() {
        clickBack()
        clickFindAddress()
        clickStartTime()
        clickEntTime()
        binding.supportBtn.setOnClickListener {
            finish()
        }
    }

    override fun observeEvent() {
    }

    fun clickDay(view: View) {
        val txt = view as TextView
        if(!txt.isSelected) {
            txt.setTextColor(resources.getColor(R.color.white))
            txt.setBackgroundResource(R.color.main)
            txt.isSelected = true
        } else {
            txt.setTextColor(resources.getColor(R.color.black))
            txt.setBackgroundResource(R.color.white)
            txt.isSelected = false
        }
    }

    private fun clickStartTime() {
        binding.startTime.setOnClickListener {
            val dialog = TimePickerDialog(this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, startListener, 9, 0, true)
            dialog.apply {
                window?.setBackgroundDrawableResource(R.color.transparent)
                show()
            }
        }
    }

    private fun clickEntTime() {
        binding.endTime.setOnClickListener {
            val dialog = TimePickerDialog(this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, endListener, 18, 0, true)
            dialog.apply {
                window?.setBackgroundDrawableResource(R.color.transparent)
                show()
            }
        }
    }

    private fun clickBack() {
        binding.back.setOnClickListener {
            finish()
        }
    }

    private fun clickFindAddress() {
        binding.findAddress.setOnClickListener {
            showAddress()
        }
    }

    private fun showAddress() {
        binding.webView.settings.apply {
            javaScriptEnabled = true
            javaScriptCanOpenWindowsAutomatically = true
            setSupportMultipleWindows(true)
        }
        binding.webView.apply {
            addJavascriptInterface(MyJavaScriptInterface(), "Leaf")
            webViewClient = client
            webChromeClient = chromeClient
            loadUrl("http://43.201.36.11:3000/api/map/find")
        }
    }

    inner class MyJavaScriptInterface {
        @JavascriptInterface
        fun getAddress(zoneCode: String, roadAddress: String, buildingName: String) {
            CoroutineScope(Dispatchers.Default).launch {
                withContext(CoroutineScope(Dispatchers.Main).coroutineContext) {
                    binding.addressNumber.text = zoneCode
                    binding.address.text = "$roadAddress $buildingName"
                }
            }
        }
    }

    private val client: WebViewClient = object : WebViewClient() {

        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            return false
        }

        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            handler?.proceed()
        }
    }

    private val chromeClient = object : WebChromeClient() {

        override fun onCreateWindow(view: WebView?, isDialog: Boolean, isUserGesture: Boolean, resultMsg: Message?): Boolean {

            val newWebView = WebView(this@AddSupportActivity)

            newWebView.settings.javaScriptEnabled = true

            val dialog = Dialog(this@AddSupportActivity)

            dialog.setContentView(newWebView)

            val params = dialog.window!!.attributes

            params.width = ViewGroup.LayoutParams.MATCH_PARENT
            params.height = ViewGroup.LayoutParams.MATCH_PARENT
            dialog.window!!.attributes = params
            dialog.show()

            newWebView.webChromeClient = object : WebChromeClient() {
                override fun onJsAlert(view: WebView, url: String, message: String, result: JsResult): Boolean {
                    super.onJsAlert(view, url, message, result)
                    return true
                }

                override fun onCloseWindow(window: WebView?) {
                    dialog.dismiss()
                }
            }

            (resultMsg!!.obj as WebView.WebViewTransport).webView = newWebView
            resultMsg.sendToTarget()

            return true
        }
    }
}