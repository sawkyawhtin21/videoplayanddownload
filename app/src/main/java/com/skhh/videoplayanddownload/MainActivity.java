package com.skhh.videoplayanddownload;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;



public class MainActivity extends AppCompatActivity {
    WebView webView;

  //  VideoView video;
 //   String video_url = "http://file2.video9.in/english/movie/2014/x-men-_days_of_future_past/X-Men-%20Days%20of%20Future%20Past%20Trailer%20-%20[Webmusic.IN].3gp";
//    String video_url = "<<iframe src=\"https://drive.google.com/file/d/1sYUEUc1BJUGkWb7m5hNLfdDc2Dje_I4v/preview\" width=\"640\" height=\"480\"></iframe>";
//    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //       video = (VideoView)findViewById(R.id.video);
        webView = (WebView) findViewById(R.id.webview);
   //     webView.loadUrl("https://drive.google.com/file/d/1m7TLDeAQhKwsDTz-tTGacUpOn6PDUc3K/view?usp=sharing");
        webView.loadUrl("https://drive.google.com/file/d/1m7TLDeAQhKwsDTz-tTGacUpOn6PDUc3K/preview");

        //    enable javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //   force links and redirects to open in the webview  instead of in a browser
        webView.setWebViewClient(new WebViewClient());

        return;


//        pd = new ProgressDialog(MainActivity.this);
//        pd.setMessage("Buffering video please wait...");
//        pd.show();
//
//        Uri uri = Uri.parse(video_url);
//        video.setVideoURI(uri);
//        video.start();
//
//        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                //close the progress dialog when buffering is done
//                pd.dismiss();
//            }
//        });
//    }


    }
}