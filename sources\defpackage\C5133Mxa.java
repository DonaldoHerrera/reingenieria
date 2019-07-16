package defpackage;

import android.content.SharedPreferences;
import com.soundcloud.android.offline.Cc;

/* renamed from: Mxa reason: default package and case insensitive filesystem */
/* compiled from: MigrationModule_MigrationEngineFactory */
public final class C5133Mxa implements C4961HMa<C5071Kxa> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C3314vL> b;
    private final C7054oVa<Cc> c;
    private final C7054oVa<C4791Bxa> d;
    private final C7054oVa<C4946Gxa> e;

    public static C5071Kxa a(SharedPreferences sharedPreferences, C3314vL vLVar, Cc cc, C4791Bxa bxa, C4946Gxa gxa) {
        C5071Kxa a2 = C5102Lxa.a(sharedPreferences, vLVar, cc, bxa, gxa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5071Kxa get() {
        return a((SharedPreferences) this.a.get(), (C3314vL) this.b.get(), (Cc) this.c.get(), (C4791Bxa) this.d.get(), (C4946Gxa) this.e.get());
    }
}
