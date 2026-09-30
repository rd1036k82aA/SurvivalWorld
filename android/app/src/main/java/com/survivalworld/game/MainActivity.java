package com.survivalworld.game;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView.setWebContentsDebuggingEnabled(true);

        WebView webView = findViewById(com.getcapacitor.R.id.webview);

        if (webView == null) {
            Toast.makeText(
                this,
                "ERRO: WebView não encontrado",
                Toast.LENGTH_LONG
            ).show();
            return;
        }

        webView.postDelayed(() -> {
            webView.evaluateJavascript(
                "document.body ? document.body.innerText : 'BODY NÃO EXISTE'",
                resultado -> Toast.makeText(
                    this,
                    "WEBVIEW: " + resultado,
                    Toast.LENGTH_LONG
                ).show()
            );
        }, 3000);
    }
}
