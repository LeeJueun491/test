package com.example.leap;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private WebView webview;
    private String url = "http://www.ewha.ac.kr/mbs/ewhamk/subview.jsp?id=ewhamk_020301000000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();


        webview = (WebView)findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);

        webview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //연결 안되는거 막기

        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webview.setScrollbarFadingEnabled(true);
        //사이즈 화면에 맞게 조절

        webview.loadUrl(url);
        webview.setWebChromeClient(new WebChromeClient());
        webview.setWebViewClient(new WebViewClientClass());

        //webview settings

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()){
            //뒤로가기 누름
            webview.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }//webview를 종료할 때


    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(url);
            return true;
        }
    }
}
