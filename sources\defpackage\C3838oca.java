package defpackage;

import android.content.Context;
import com.soundcloud.android.foundation.playqueue.j;

/* renamed from: oca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueOperations_Factory */
public final class C3838oca implements C4961HMa<C3830nca> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3846pca> b;
    private final C7054oVa<j> c;
    private final C7054oVa<HPa> d;

    public C3838oca(C7054oVa<Context> ova, C7054oVa<C3846pca> ova2, C7054oVa<j> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3838oca a(C7054oVa<Context> ova, C7054oVa<C3846pca> ova2, C7054oVa<j> ova3, C7054oVa<HPa> ova4) {
        return new C3838oca(ova, ova2, ova3, ova4);
    }

    public C3830nca get() {
        return new C3830nca((Context) this.a.get(), (C3846pca) this.b.get(), (j) this.c.get(), (HPa) this.d.get());
    }
}
