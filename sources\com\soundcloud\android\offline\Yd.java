package com.soundcloud.android.offline;

import android.content.Context;

/* compiled from: OfflineServiceInitiator.kt */
public class Yd {
    /* access modifiers changed from: private */
    public final Context a;

    public Yd(Context context) {
        C7471uYa.b(context, "context");
        this.a = context;
    }

    public C5037Jua<Object> b() {
        return new Xd(this);
    }

    public void c() {
        OfflineContentService.c(this.a);
    }

    public void d() {
        OfflineContentService.d(this.a);
    }

    public void a() {
        OfflineContentService.b(this.a);
    }
}
