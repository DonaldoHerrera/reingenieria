package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.b.a;
import com.facebook.B;

/* renamed from: com.facebook.internal.m reason: case insensitive filesystem */
/* compiled from: CustomTab */
public class C0552m {
    private Uri a;

    public C0552m(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String b = da.b();
        StringBuilder sb = new StringBuilder();
        sb.append(B.o());
        sb.append("/");
        sb.append("dialog/");
        sb.append(str);
        this.a = ia.a(b, sb.toString(), bundle);
    }

    public void a(Activity activity, String str) {
        b a2 = new a().a();
        a2.a.setPackage(str);
        a2.a.addFlags(1073741824);
        a2.a(activity, this.a);
    }
}
