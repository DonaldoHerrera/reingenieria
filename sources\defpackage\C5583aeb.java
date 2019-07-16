package defpackage;

/* renamed from: aeb reason: default package and case insensitive filesystem */
/* compiled from: Visibility.kt */
public abstract class C5583aeb {
    private final String a;
    private final boolean b;

    protected C5583aeb(String str, boolean z) {
        C7471uYa.b(str, "name");
        this.a = str;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    public Integer a(C5583aeb aeb) {
        C7471uYa.b(aeb, "visibility");
        return _db.b(this, aeb);
    }

    public abstract boolean a(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb);

    public final boolean b() {
        return this.b;
    }

    public C5583aeb c() {
        return this;
    }

    public final String toString() {
        return a();
    }

    public String a() {
        return this.a;
    }
}
