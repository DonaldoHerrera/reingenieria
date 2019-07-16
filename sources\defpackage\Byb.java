package defpackage;

/* renamed from: Byb reason: default package */
/* compiled from: ResponseBody */
class Byb extends Cyb {
    final /* synthetic */ C7233qyb a;
    final /* synthetic */ long b;
    final /* synthetic */ C6961nAb c;

    Byb(C7233qyb qyb, long j, C6961nAb nab) {
        this.a = qyb;
        this.b = j;
        this.c = nab;
    }

    public long contentLength() {
        return this.b;
    }

    public C7233qyb contentType() {
        return this.a;
    }

    public C6961nAb source() {
        return this.c;
    }
}
