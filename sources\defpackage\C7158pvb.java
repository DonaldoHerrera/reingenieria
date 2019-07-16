package defpackage;

/* renamed from: pvb reason: default package and case insensitive filesystem */
/* compiled from: DFS */
class C7158pvb extends a<N, Boolean> {
    final /* synthetic */ _Xa a;
    final /* synthetic */ boolean[] b;

    C7158pvb(_Xa _xa, boolean[] zArr) {
        this.a = _xa;
        this.b = zArr;
    }

    public boolean b(N n) {
        if (((Boolean) this.a.invoke(n)).booleanValue()) {
            this.b[0] = true;
        }
        return !this.b[0];
    }

    public Boolean a() {
        return Boolean.valueOf(this.b[0]);
    }
}
