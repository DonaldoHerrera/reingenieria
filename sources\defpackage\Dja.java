package defpackage;

import android.net.Uri;

/* renamed from: Dja reason: default package */
/* compiled from: ResolveResult */
public abstract class Dja {
    public static Dja a(C3508cda cda) {
        return new C3956bja(true, C4928GKa.c(cda), C4928GKa.a(), C4928GKa.a());
    }

    public abstract C4928GKa<Exception> a();

    public abstract boolean b();

    public abstract C4928GKa<Uri> c();

    public abstract C4928GKa<C3508cda> d();

    public static Dja a(Uri uri, Exception exc) {
        return new C3956bja(false, C4928GKa.a(), C4928GKa.c(uri), C4928GKa.b(exc));
    }
}
