package com.example.bebo2.studio_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Admin_activity extends AppCompatActivity {
ProgressBar loadProgress;
private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_activity);
        mToolbar = (Toolbar)findViewById(R.id.tool_admin);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle(R.string.admin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadProgress = (ProgressBar)findViewById(R.id.loadprograss);
        WebView wv = (WebView) findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setScrollBarStyle(View.VISIBLE);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.getSettings().setSupportZoom(true);
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setUseWideViewPort(true);
        wv.getSettings().setAllowContentAccess(true);
        wv.loadUrl("https://console.firebase.google.com/u/2/project/studioapp-33160/overview");
        wv.setVisibility(View.INVISIBLE);
        wv.setWebViewClient(new WebViewClass(wv, loadProgress));
    }
}
