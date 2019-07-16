package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C0579l;
import com.facebook.login.D;
import com.facebook.login.s;

public class DeviceLoginButton extends LoginButton {
    private Uri u;

    private class a extends b {
        private a() {
            super();
        }

        /* access modifiers changed from: protected */
        public D a() {
            C0579l a = C0579l.a();
            a.a(DeviceLoginButton.this.getDefaultAudience());
            a.a(s.DEVICE_AUTH);
            a.a(DeviceLoginButton.this.getDeviceRedirectUri());
            return a;
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Uri getDeviceRedirectUri() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public b getNewLoginClickListener() {
        return new a();
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.u = uri;
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
