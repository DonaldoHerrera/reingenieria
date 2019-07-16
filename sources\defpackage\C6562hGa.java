package defpackage;

import android.content.Context;

/* renamed from: hGa reason: default package and case insensitive filesystem */
/* compiled from: FileHelper_Factory */
public final class C6562hGa implements C4961HMa<C6494gGa> {
    private final C7054oVa<Context> a;

    public C6562hGa(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C6562hGa a(C7054oVa<Context> ova) {
        return new C6562hGa(ova);
    }

    public C6494gGa get() {
        return new C6494gGa((Context) this.a.get());
    }
}
