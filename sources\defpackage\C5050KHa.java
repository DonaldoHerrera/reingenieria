package defpackage;

import android.content.res.Resources;
import java.util.Locale;

/* renamed from: KHa reason: default package and case insensitive filesystem */
/* compiled from: LocaleFormatter_Factory */
public final class C5050KHa implements C4961HMa<C5018JHa> {
    private final C7054oVa<Locale> a;
    private final C7054oVa<Resources> b;

    public C5050KHa(C7054oVa<Locale> ova, C7054oVa<Resources> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5050KHa a(C7054oVa<Locale> ova, C7054oVa<Resources> ova2) {
        return new C5050KHa(ova, ova2);
    }

    public C5018JHa get() {
        return new C5018JHa((Locale) this.a.get(), (Resources) this.b.get());
    }
}
