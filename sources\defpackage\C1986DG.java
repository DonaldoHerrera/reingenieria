package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

/* renamed from: DG reason: default package and case insensitive filesystem */
public final class C1986DG extends ContentObserver {
    private final Context a;
    private final AudioManager b;
    private final C1926AG c;
    private final C1966CG d;
    private float e;

    public C1986DG(Handler handler, Context context, C1926AG ag, C1966CG cg) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = ag;
        this.d = cg;
    }

    private boolean a(float f) {
        return f != this.e;
    }

    private float c() {
        return this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    private void d() {
        this.d.a(this.e);
    }

    public void a() {
        this.e = c();
        d();
        this.a.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this);
    }

    public void b() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c2 = c();
        if (a(c2)) {
            this.e = c2;
            d();
        }
    }
}
