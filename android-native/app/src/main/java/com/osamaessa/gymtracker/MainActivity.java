package com.osamaessa.gymtracker;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceRequest;
import android.net.Uri;

public class MainActivity extends Activity {
    private WebView web;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        web = new WebView(this);
        web.setWebViewClient(new WebViewClient(){
            @Override public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest r){
                Uri u=r.getUrl(); String s=u.toString();
                return !(s.startsWith("file://") || s.startsWith("https://") || s.startsWith("http://"));
            }
        });
        WebSettings st=web.getSettings(); st.setJavaScriptEnabled(true); st.setDomStorageEnabled(true); st.setDatabaseEnabled(true); st.setAllowFileAccess(true); st.setAllowContentAccess(true); st.setBuiltInZoomControls(false); st.setDisplayZoomControls(false); st.setMediaPlaybackRequiresUserGesture(false);
        web.loadUrl("file:///android_asset/index.html"); setContentView(web);
    }
    @Override public void onBackPressed(){ if(web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
