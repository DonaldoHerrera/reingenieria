package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

/* renamed from: xb reason: default package and case insensitive filesystem */
/* compiled from: FontsContractCompat */
class C1837xb implements Callable<c> {
    final /* synthetic */ Context a;
    final /* synthetic */ C1807wb b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;

    C1837xb(Context context, C1807wb wbVar, int i, String str) {
        this.a = context;
        this.b = wbVar;
        this.c = i;
        this.d = str;
    }

    public c call() throws Exception {
        c a2 = C0193Bb.a(this.a, this.b, this.c);
        Typeface typeface = a2.a;
        if (typeface != null) {
            C0193Bb.a.put(this.d, typeface);
        }
        return a2;
    }
}
