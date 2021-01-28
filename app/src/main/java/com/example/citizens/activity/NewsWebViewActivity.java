package com.example.citizens.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.example.citizens.R;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.BaseIndicatorView;

public class NewsWebViewActivity extends AppCompatActivity {

    private WebView newsWebView;
    private AgentWeb newsAgentWeb;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_webview);
        newsAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(mLinearLayout, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator(R.color.light_blue)
                .createAgentWeb()
                .ready()
                .go(getIntent().getStringExtra("URL"));

//        newsWebView = (WebView) findViewById(R.id.webview_news);
//        Intent intent = getIntent();
//        newsWebView.loadUrl(intent.getStringExtra("URL"));
    }
}