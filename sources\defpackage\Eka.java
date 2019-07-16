package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.d;

/* renamed from: Eka reason: default package */
/* compiled from: AuthTaskResult */
public class Eka {
    private final Kka a;
    private final C4719yka b;
    private final Exception c;
    private final Bundle d;
    private final String e;

    private Eka(C4719yka yka) {
        this(Kka.SUCCESS, yka, null, null, null);
    }

    public static Eka a(C4719yka yka) {
        return new Eka(yka);
    }

    public static Eka b(ifa ifa) {
        return new Eka(Kka.EMAIL_INVALID, ifa);
    }

    public static Eka c(ifa ifa) {
        return new Eka(Kka.EMAIL_TAKEN, ifa);
    }

    public static Eka d(ifa ifa) {
        return new Eka(Kka.UNAUTHORIZED, ifa);
    }

    public static Eka e(ifa ifa) {
        return new Eka(Kka.SERVER_ERROR, ifa);
    }

    public static Eka f(ifa ifa) {
        return new Eka(Kka.SPAM, ifa);
    }

    public static Eka g(ifa ifa) {
        return new Eka(Kka.UNAUTHORIZED, ifa);
    }

    public boolean f() {
        return false;
    }

    public boolean h() {
        return this.a == Kka.DEVICE_BLOCK;
    }

    public boolean i() {
        return this.a == Kka.DEVICE_CONFLICT;
    }

    public boolean j() {
        return this.a == Kka.EMAIL_INVALID;
    }

    public boolean k() {
        return this.a == Kka.EMAIL_TAKEN;
    }

    public boolean l() {
        return this.a == Kka.GOOGLE_NEEDS_PERMISSIONS;
    }

    public boolean m() {
        return this.a == Kka.NETWORK_ERROR;
    }

    public boolean n() {
        return this.a == Kka.SERVER_ERROR;
    }

    public boolean o() {
        return this.a == Kka.FLAKY_SIGNUP_ERROR;
    }

    public boolean p() {
        return this.a == Kka.SPAM;
    }

    public boolean q() {
        return this.a == Kka.SUCCESS;
    }

    public boolean r() {
        return this.a == Kka.UNAUTHORIZED;
    }

    public boolean s() {
        return this.a.a();
    }

    public boolean t() {
        return this.a == Kka.VALIDATION_ERROR;
    }

    public String toString() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = this.a;
        objArr[1] = Boolean.valueOf(this.b != null);
        objArr[2] = this.c;
        if (this.d != null) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = this.e;
        return String.format("Auth task result with\n\tkind: %s\n\tuser present: %b\n\texception: %s\n\tbundle present: %b\n\tserver error: %s", objArr);
    }

    private Eka(Exception exc) {
        this(Kka.FAILURE, null, exc, null, null);
    }

    public static Eka a(Exception exc) {
        return new Eka(exc);
    }

    public static Eka b(Exception exc) {
        return new Eka(Kka.NETWORK_ERROR, exc);
    }

    public String c() {
        return this.e;
    }

    public Exception d() {
        return this.c;
    }

    public Bundle e() {
        return this.d;
    }

    public boolean g() {
        return this.a == Kka.DENIED;
    }

    private Eka(Kka kka, String str, ifa ifa) {
        this(kka, null, ifa, null, str);
    }

    public static Eka a(String str) {
        return a((Exception) new Dka(str));
    }

    public C4719yka b() {
        return this.b;
    }

    private Eka(Kka kka, Exception exc) {
        this(kka, null, exc, null, null);
    }

    public static Eka a(ifa ifa) {
        return new Eka(Kka.DENIED, ifa);
    }

    private Eka(Kka kka) {
        this(kka, null, null, null, null);
    }

    public static Eka a(String str, ifa ifa) {
        return new Eka(Kka.VALIDATION_ERROR, str, ifa);
    }

    Eka(Kka kka, C4719yka yka, Exception exc, Bundle bundle, String str) {
        this.a = kka;
        this.b = yka;
        this.c = exc;
        this.d = bundle;
        this.e = str;
    }

    public static Eka a(Bundle bundle) {
        Eka eka = new Eka(Kka.DEVICE_CONFLICT, null, null, bundle, null);
        return eka;
    }

    public static Eka a() {
        return new Eka(Kka.DEVICE_BLOCK);
    }

    public static Eka a(d dVar) {
        return new Eka(Kka.GOOGLE_NEEDS_PERMISSIONS, dVar);
    }
}
