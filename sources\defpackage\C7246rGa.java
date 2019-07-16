package defpackage;

/* renamed from: rGa reason: default package and case insensitive filesystem */
/* compiled from: TestConnectionHelper.kt */
public final class C7246rGa implements C6834lGa {
    private boolean a;
    private boolean b;

    public boolean a() {
        return d() && this.a;
    }

    public C6902mGa b() {
        if (this.b) {
            return this.a ? C6902mGa.WIFI : C6902mGa.FOUR_G;
        }
        return C6902mGa.OFFLINE;
    }

    public boolean c() {
        return this.b && this.a;
    }

    public boolean d() {
        return this.b;
    }
}
