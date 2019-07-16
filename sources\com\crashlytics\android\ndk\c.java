package com.crashlytics.android.ndk;

import java.io.IOException;

/* compiled from: CrashlyticsNdk */
public class c extends C5531_Ma<Void> implements Ji {
    private h g;
    private Ii h;

    /* access modifiers changed from: protected */
    public boolean K() {
        Ei ei = (Ei) C5328TMa.a(Ei.class);
        if (ei != null) {
            return a(new a(e(), new JniNativeApi(), new g(new C5025JOa(this))), ei, new Gi());
        }
        throw new C6502gOa("CrashlyticsNdk requires Crashlytics");
    }

    /* access modifiers changed from: 0000 */
    public boolean a(h hVar, Ei ei, Gi gi) {
        this.g = hVar;
        boolean b = hVar.b();
        if (b) {
            gi.a(ei, this);
            C5328TMa.e().d("CrashlyticsNdk", "Crashlytics NDK initialization successful");
        }
        return b;
    }

    public Ii b() {
        return this.h;
    }

    public String v() {
        return "com.crashlytics.sdk.android.crashlytics-ndk";
    }

    public String x() {
        return "2.1.0.33";
    }

    /* access modifiers changed from: protected */
    public Void d() {
        try {
            this.h = this.g.a();
        } catch (IOException e) {
            C5328TMa.e().e("CrashlyticsNdk", "Could not process ndk data; ", e);
        }
        return null;
    }
}
