package com.crashlytics.android.ndk;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

/* compiled from: BreakpadController */
class a implements h {
    private final Context a;
    private final d b;
    private final b c;

    a(Context context, d dVar, b bVar) {
        this.a = context;
        this.b = dVar;
        this.c = bVar;
    }

    public Ii a() throws IOException {
        TreeSet b2 = this.c.b();
        if (!b2.isEmpty()) {
            b2.pollFirst();
        }
        return new Ii(b2);
    }

    public boolean b() {
        File a2 = this.c.a();
        if (a2 == null) {
            return false;
        }
        try {
            return this.b.a(a2.getCanonicalPath(), this.a.getAssets());
        } catch (IOException e) {
            C5328TMa.e().e("CrashlyticsNdk", "Error initializing CrashlyticsNdk", e);
            return false;
        }
    }
}
