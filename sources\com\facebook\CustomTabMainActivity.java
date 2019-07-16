package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.internal.C0552m;

public class CustomTabMainActivity extends Activity {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private boolean e = true;
    private BroadcastReceiver f;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabMainActivity.class.getSimpleName());
        sb.append(".extra_params");
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabMainActivity.class.getSimpleName());
        sb2.append(".extra_chromePackage");
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(CustomTabMainActivity.class.getSimpleName());
        sb3.append(".extra_url");
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(CustomTabMainActivity.class.getSimpleName());
        sb4.append(".action_refresh");
        d = sb4.toString();
    }

    public static final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(B.f());
        sb.append("://authorize");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(a);
            new C0552m("oauth", bundleExtra).a(this, getIntent().getStringExtra(b));
            this.e = false;
            this.f = new C0583m(this);
            C1600pd.a((Context) this).a(this.f, new IntentFilter(CustomTabActivity.a));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (d.equals(intent.getAction())) {
            C1600pd.a((Context) this).a(new Intent(CustomTabActivity.b));
            a(-1, intent);
        } else if (CustomTabActivity.a.equals(intent.getAction())) {
            a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.e) {
            a(0, null);
        }
        this.e = true;
    }

    private void a(int i, Intent intent) {
        C1600pd.a((Context) this).a(this.f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
