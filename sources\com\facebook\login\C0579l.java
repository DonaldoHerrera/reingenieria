package com.facebook.login;

import android.net.Uri;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

/* renamed from: com.facebook.login.l reason: case insensitive filesystem */
/* compiled from: DeviceLoginManager */
public class C0579l extends D {
    private static volatile C0579l g;
    private Uri h;
    private String i;

    public static C0579l a() {
        if (g == null) {
            synchronized (C0579l.class) {
                if (g == null) {
                    g = new C0579l();
                }
            }
        }
        return g;
    }

    public String c() {
        return this.i;
    }

    public Uri d() {
        return this.h;
    }

    public void a(Uri uri) {
        this.h = uri;
    }

    /* access modifiers changed from: protected */
    public Request a(Collection<String> collection) {
        Request a = super.a(collection);
        Uri d = d();
        if (d != null) {
            a.b(d.toString());
        }
        String c = c();
        if (c != null) {
            a.a(c);
        }
        return a;
    }
}
