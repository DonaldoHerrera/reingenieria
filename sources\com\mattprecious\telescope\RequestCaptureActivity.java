package com.mattprecious.telescope;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;

public final class RequestCaptureActivity extends Activity {
    private long a;

    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".telescope.CAPTURE");
        return sb.toString();
    }

    @TargetApi(21)
    private void b() {
        Intent createScreenCaptureIntent = ((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent();
        this.a = System.currentTimeMillis();
        startActivityForResult(createScreenCaptureIntent, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            Intent intent2 = new Intent(a(this));
            intent2.putExtra("code", i2);
            intent2.putExtra("data", intent);
            intent2.putExtra("prompt-shown", a());
            sendBroadcast(intent2);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT < 21) {
            Log.e("TelescopeCapture", "System capture activity started pre-lollipop.");
            finish();
            return;
        }
        b();
    }

    private boolean a() {
        return System.currentTimeMillis() - this.a > 200;
    }
}
