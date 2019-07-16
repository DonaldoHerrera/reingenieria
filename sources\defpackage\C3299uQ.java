package defpackage;

import androidx.work.r;

/* renamed from: uQ reason: default package and case insensitive filesystem */
/* compiled from: WorkModule_WorkManagerFactory */
public final class C3299uQ implements C4961HMa<r> {
    private static final C3299uQ a = new C3299uQ();

    public static C3299uQ a() {
        return a;
    }

    public static r b() {
        r a2 = C3279tQ.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public r get() {
        return b();
    }
}
