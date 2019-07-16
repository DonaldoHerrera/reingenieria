package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yQa reason: default package and case insensitive filesystem */
/* compiled from: SequentialDisposable */
public final class C7739yQa extends AtomicReference<VPa> implements VPa {
    public C7739yQa() {
    }

    public boolean a(VPa vPa) {
        return C7463uQa.a((AtomicReference<VPa>) this, vPa);
    }

    public boolean b(VPa vPa) {
        return C7463uQa.b(this, vPa);
    }

    public void dispose() {
        C7463uQa.a((AtomicReference<VPa>) this);
    }

    public C7739yQa(VPa vPa) {
        lazySet(vPa);
    }

    public boolean a() {
        return C7463uQa.a((VPa) get());
    }
}
