package defpackage;

import java.util.Arrays;

/* renamed from: gHa reason: default package and case insensitive filesystem */
/* compiled from: DefaultErrorReporter.kt */
public final class C6495gHa implements C3469VY {
    private final C7385tHa a;
    private final C6336dua b;

    public C6495gHa(C7385tHa tha, C6336dua dua) {
        C7471uYa.b(tha, "fabricLogger");
        C7471uYa.b(dua, "appConfigurationReporter");
        this.a = tha;
        this.b = dua;
    }

    public void a(Throwable th, HVa<String, String>... hVaArr) {
        C7471uYa.b(th, "t");
        C7471uYa.b(hVaArr, "contextValuePairs");
        this.b.a();
        if (C7316sHa.e(th)) {
            this.a.a(th, LWa.b((HVa<? extends K, ? extends V>[]) (HVa[]) Arrays.copyOf(hVaArr, hVaArr.length)));
            return;
        }
        SDb.a(th, "Was swallowed", new Object[0]);
    }
}
