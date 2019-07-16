package com.soundcloud.android.stream;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.stream.u reason: case insensitive filesystem */
/* compiled from: RemoveStalePromotedItemsCommand */
public class C6106u extends C1595pT<Void, C6499gLa, List<Long>> {
    static final long b = TimeUnit.MINUTES.toMillis(50);
    /* access modifiers changed from: private */
    public final C5694cGa c;
    /* access modifiers changed from: private */
    public List<Long> d = Collections.emptyList();

    protected C6106u(C5500ZKa zKa, C5694cGa cga) {
        super(zKa);
        this.c = cga;
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, Void voidR) {
        return zKa.a((a) new C6104t(this));
    }

    /* access modifiers changed from: protected */
    public List<Long> a(C6499gLa gla) {
        return this.d;
    }
}
