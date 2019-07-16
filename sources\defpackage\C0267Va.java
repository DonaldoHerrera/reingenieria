package defpackage;

import android.graphics.Typeface;

/* renamed from: Va reason: default package and case insensitive filesystem */
/* compiled from: ResourcesCompat */
class C0267Va implements Runnable {
    final /* synthetic */ Typeface a;
    final /* synthetic */ a b;

    C0267Va(a aVar, Typeface typeface) {
        this.b = aVar;
        this.a = typeface;
    }

    public void run() {
        this.b.a(this.a);
    }
}
