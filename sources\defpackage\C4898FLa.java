package defpackage;

import android.content.ContentValues;
import java.util.concurrent.Callable;

/* renamed from: FLa reason: default package and case insensitive filesystem */
/* compiled from: PropellerRx */
public class C4898FLa {
    /* access modifiers changed from: private */
    public final C5500ZKa a;

    public C4898FLa(C5500ZKa zKa) {
        this.a = zKa;
    }

    public APa<C5631bLa> a(C6975nLa nla) {
        return APa.a((Callable<? extends EPa<? extends T>>) new C7596wLa<Object>(this, nla));
    }

    public APa<C5413WKa> a(C5116MLa mLa, ContentValues contentValues) {
        return a(mLa.name(), contentValues);
    }

    public APa<C5413WKa> a(String str, ContentValues contentValues) {
        return APa.a((Callable<? extends EPa<? extends T>>) new C7734yLa<Object>(this, str, contentValues));
    }

    public APa<C5266RKa> a(C5116MLa mLa, ContentValues contentValues, C7113pLa pla) {
        return a(mLa.name(), contentValues, pla);
    }

    public APa<C5266RKa> a(String str, ContentValues contentValues, C7113pLa pla) {
        return APa.a((Callable<? extends EPa<? extends T>>) new C7389tLa<Object>(this, str, contentValues, pla));
    }

    public APa<C6431fLa> a(a aVar) {
        return APa.a((Callable<? extends EPa<? extends T>>) new C7527vLa<Object>(this, aVar));
    }

    static <T extends C6499gLa> APa<T> a(T t) {
        return t.b() ? APa.c(t) : APa.b((Throwable) t.a());
    }
}
