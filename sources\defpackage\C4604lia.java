package defpackage;

import android.content.SharedPreferences;

/* renamed from: lia reason: default package and case insensitive filesystem */
/* compiled from: DevSettingsStore_Factory */
public final class C4604lia implements C4961HMa<C4596kia> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C7648wza<Boolean>> b;
    private final C7054oVa<C7648wza<Boolean>> c;
    private final C7054oVa<C7648wza<Boolean>> d;
    private final C7054oVa<C7648wza<String>> e;
    private final C7054oVa<C7648wza<Boolean>> f;

    public C4604lia(C7054oVa<SharedPreferences> ova, C7054oVa<C7648wza<Boolean>> ova2, C7054oVa<C7648wza<Boolean>> ova3, C7054oVa<C7648wza<Boolean>> ova4, C7054oVa<C7648wza<String>> ova5, C7054oVa<C7648wza<Boolean>> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C4604lia a(C7054oVa<SharedPreferences> ova, C7054oVa<C7648wza<Boolean>> ova2, C7054oVa<C7648wza<Boolean>> ova3, C7054oVa<C7648wza<Boolean>> ova4, C7054oVa<C7648wza<String>> ova5, C7054oVa<C7648wza<Boolean>> ova6) {
        C4604lia lia = new C4604lia(ova, ova2, ova3, ova4, ova5, ova6);
        return lia;
    }

    public C4596kia get() {
        C4596kia kia = new C4596kia((SharedPreferences) this.a.get(), (C7648wza) this.b.get(), (C7648wza) this.c.get(), (C7648wza) this.d.get(), (C7648wza) this.e.get(), (C7648wza) this.f.get());
        return kia;
    }
}
