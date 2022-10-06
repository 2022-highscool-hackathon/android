package com.example.hackathon_2022.ui.add

import android.app.Dialog
import android.net.http.SslError
import android.os.Message
import android.view.ViewGroup
import android.webkit.*
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivityAddSupportBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddSupportActivity: BaseActivity<ActivityAddSupportBinding>(R.layout.activity_add_support){
    override fun initView() {
        clickBack()
        clickFindAddress()
    }

    override fun observeEvent() {
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