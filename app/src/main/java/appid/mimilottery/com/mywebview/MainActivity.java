package appid.mimilottery.com.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.web = (WebView) findViewById(R.id.web);

        this.web.getSettings().setJavaScriptEnabled(true);
        this.web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                Toast.makeText(MainActivity.this,"dialog",Toast.LENGTH_SHORT).show();
                return false;
            }
            @Override
            public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
                Toast.makeText(MainActivity.this,"123",Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        this.web.loadUrl("http://htc-test.kxkr.com:8088/options/webbetting?name=%E9%87%8D%E5%BA%86%E6%97%B6%E6%97%B6%E5%BD%A9&zhu=1&bei=1");

    }
}
