package defpackage;

/* renamed from: pzb reason: default package and case insensitive filesystem */
/* compiled from: RealResponseBody */
public final class C7166pzb extends Cyb {
    private final String a;
    private final long b;
    private final C6961nAb c;

    public C7166pzb(String str, long j, C6961nAb nab) {
        this.a = str;
        this.b = j;
        this.c = nab;
    }

    public long contentLength() {
        return this.b;
    }

    public C7233qyb contentType() {
        String str = this.a;
        if (str != null) {
            return C7233qyb.b(str);
        }
        return null;
    }

    public C6961nAb source() {
        return this.c;
    }
}
