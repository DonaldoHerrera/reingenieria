package com.soundcloud.android.stream;

/* compiled from: StreamDataSource.kt */
final class H<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ I a;
    final /* synthetic */ sb b;

    H(I i, sb sbVar) {
        this.a = i;
        this.b = sbVar;
    }

    /* renamed from: a */
    public final sb apply(Boolean bool) {
        C7471uYa.b(bool, "it");
        return bool.booleanValue() ? this.a.a.b(this.b) : this.b;
    }
}
