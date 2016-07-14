package cz.mira.flakeman;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Mira on 13.7.2016.
 */
public class WebAppInterface {

    Context ctx;

    public WebAppInterface(Context ctx) {
        this.ctx = ctx;
    }

    @JavascriptInterface
    public void showToast() {
        Toast.makeText(ctx, "Test JS", Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void showBetterToast(String message) {
        Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
    }
}
