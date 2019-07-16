package defpackage;

/* renamed from: tRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableFlatMapPublisher */
public final class C7395tRa<T, U> extends C7393tPa<U> {
    final _Ab<T> b;
    final C7118pQa<? super T, ? extends _Ab<? extends U>> c;
    final boolean d;
    final int e;
    final int f;

    public C7395tRa(_Ab<T> _ab, C7118pQa<? super T, ? extends _Ab<? extends U>> pqa, boolean z, int i, int i2) {
        this.b = _ab;
        this.c = pqa;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    /* access modifiers changed from: protected */
    public void b(C5551aBb<? super U> abb) {
        if (!ARa.a(this.b, abb, this.c)) {
            this.b.a(C7326sRa.a(abb, this.c, this.d, this.e, this.f));
        }
    }
}
