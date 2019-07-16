package defpackage;

import java.nio.ByteBuffer;

/* renamed from: Vo reason: default package */
/* compiled from: SimpleSubtitleDecoder */
public abstract class Vo extends Tm<C0500bp, C1211cp, Zo> implements Yo {
    private final String n;

    protected Vo(String str) {
        super(new C0500bp[2], new C1211cp[2]);
        this.n = str;
        a(1024);
    }

    /* access modifiers changed from: protected */
    public abstract Xo a(byte[] bArr, int i, boolean z) throws Zo;

    public void a(long j) {
    }

    /* access modifiers changed from: protected */
    public final C0500bp c() {
        return new C0500bp();
    }

    /* access modifiers changed from: protected */
    public final C1211cp d() {
        return new Wo(this);
    }

    /* access modifiers changed from: protected */
    public final Zo a(Throwable th) {
        return new Zo("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    public final void a(C1211cp cpVar) {
        super.a(cpVar);
    }

    /* access modifiers changed from: protected */
    public final Zo a(C0500bp bpVar, C1211cp cpVar, boolean z) {
        try {
            ByteBuffer byteBuffer = bpVar.c;
            C1211cp cpVar2 = cpVar;
            cpVar2.a(bpVar.d, a(byteBuffer.array(), byteBuffer.limit(), z), bpVar.f);
            cpVar.c(Integer.MIN_VALUE);
            return null;
        } catch (Zo e) {
            return e;
        }
    }
}
