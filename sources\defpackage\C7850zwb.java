package defpackage;

import java.util.Iterator;

/* renamed from: zwb reason: default package and case insensitive filesystem */
/* compiled from: Sequences.kt */
public final class C7850zwb<T> implements Iwb<T>, Awb<T> {
    /* access modifiers changed from: private */
    public final Iwb<T> a;
    /* access modifiers changed from: private */
    public final int b;

    public C7850zwb(Iwb<? extends T> iwb, int i) {
        C7471uYa.b(iwb, "sequence");
        this.a = iwb;
        this.b = i;
        if (!(this.b >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public Iterator<T> iterator() {
        return new C7781ywb(this);
    }

    public Iwb<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new C7850zwb(this, i) : new C7850zwb(this.a, i2);
    }
}
