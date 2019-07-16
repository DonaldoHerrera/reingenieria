package defpackage;

import java.util.List;

/* renamed from: np reason: default package and case insensitive filesystem */
/* compiled from: DvbDecoder */
public final class C1550np extends Vo {
    private final C1581op o;

    public C1550np(List<byte[]> list) {
        super("DvbDecoder");
        Pq pq = new Pq((byte[]) list.get(0));
        this.o = new C1581op(pq.z(), pq.z());
    }

    /* access modifiers changed from: protected */
    public C1612pp a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.a();
        }
        return new C1612pp(this.o.a(bArr, i));
    }
}
