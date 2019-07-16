package defpackage;

import android.content.Context;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.properties.j;

/* renamed from: RM reason: default package and case insensitive filesystem */
/* compiled from: AdjustWrapper_Factory */
public final class C2262RM implements C4961HMa<C2243QM> {
    private final C7054oVa<C3700b> a;
    private final C7054oVa<j> b;
    private final C7054oVa<Context> c;

    public C2262RM(C7054oVa<C3700b> ova, C7054oVa<j> ova2, C7054oVa<Context> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2262RM a(C7054oVa<C3700b> ova, C7054oVa<j> ova2, C7054oVa<Context> ova3) {
        return new C2262RM(ova, ova2, ova3);
    }

    public C2243QM get() {
        return new C2243QM((C3700b) this.a.get(), (j) this.b.get(), (Context) this.c.get());
    }
}
