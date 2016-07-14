package cz.mira.flakeman;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

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

    @JavascriptInterface
    public String getJsonData() {
        String jsonText = "[{\"State\":\"AL\",\"freq\":{\"low\":4786, \"mid\":1319, \"high\":249}} ,{\"State\":\"AZ\",\"freq\":{\"low\":1101, \"mid\":412, \"high\":674}} ,{\"State\":\"CT\",\"freq\":{\"low\":801, \"mid\":112, \"high\":374}}]";

        return jsonText;
    }

    @JavascriptInterface
    public int getInteger() {
        return 5;
    }
}
