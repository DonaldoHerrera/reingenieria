package defpackage;

import com.google.android.exoplayer2.H;

/* renamed from: qn reason: default package and case insensitive filesystem */
/* compiled from: TagPayloadReader */
abstract class C1640qn {
    protected final C1424jn a;

    /* renamed from: qn$a */
    /* compiled from: TagPayloadReader */
    public static final class a extends H {
        public a(String str) {
            super(str);
        }
    }

    protected C1640qn(C1424jn jnVar) {
        this.a = jnVar;
    }

    public final void a(Pq pq, long j) throws H {
        if (a(pq)) {
            b(pq, j);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(Pq pq) throws H;

    /* access modifiers changed from: protected */
    public abstract void b(Pq pq, long j) throws H;
}
