package defpackage;

import android.content.Context;
import com.soundcloud.android.properties.j;

/* renamed from: Lya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideDatabaseManagerFactory */
public final class C5103Lya implements C4961HMa<Tea> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3469VY> b;
    private final C7054oVa<j> c;

    public C5103Lya(C7054oVa<Context> ova, C7054oVa<C3469VY> ova2, C7054oVa<j> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5103Lya a(C7054oVa<Context> ova, C7054oVa<C3469VY> ova2, C7054oVa<j> ova3) {
        return new C5103Lya(ova, ova2, ova3);
    }

    public static Tea a(Context context, C3469VY vy, j jVar) {
        Tea b2 = C7853zya.b(context, vy, jVar);
        C5023JMa.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public Tea get() {
        return a((Context) this.a.get(), (C3469VY) this.b.get(), (j) this.c.get());
    }
}
