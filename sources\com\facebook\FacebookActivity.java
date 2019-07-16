package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.d;
import com.facebook.common.e;
import com.facebook.internal.C0556q;
import com.facebook.internal.Z;
import com.facebook.internal.ia;
import com.facebook.login.y;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

public class FacebookActivity extends FragmentActivity {
    private static final String TAG = "com.facebook.FacebookActivity";
    public static String a = "PassThrough";
    private static String b = "SingleFragment";
    private Fragment c;

    private void y() {
        setResult(0, Z.a(getIntent(), (Bundle) null, Z.a(Z.c(getIntent()))));
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.c;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!B.t()) {
            ia.b(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            B.c(getApplicationContext());
        }
        setContentView(e.com_facebook_activity_layout);
        if (a.equals(intent.getAction())) {
            y();
        } else {
            this.c = x();
        }
    }

    public Fragment w() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public Fragment x() {
        Intent intent = getIntent();
        C0370l supportFragmentManager = getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.a(b);
        if (a2 != null) {
            return a2;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C0556q qVar = new C0556q();
            qVar.setRetainInstance(true);
            qVar.show(supportFragmentManager, b);
            return qVar;
        }
        if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.setRetainInstance(true);
            deviceShareDialogFragment.a((ShareContent) intent.getParcelableExtra("content"));
            deviceShareDialogFragment.show(supportFragmentManager, b);
            return deviceShareDialogFragment;
        }
        y yVar = new y();
        yVar.setRetainInstance(true);
        A a3 = supportFragmentManager.a();
        a3.a(d.com_facebook_fragment_container, yVar, b);
        a3.a();
        return yVar;
    }
}
