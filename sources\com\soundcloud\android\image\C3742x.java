package com.soundcloud.android.image;

import android.app.Application;
import com.squareup.picasso.C6246k;
import com.squareup.picasso.E;

/* renamed from: com.soundcloud.android.image.x reason: case insensitive filesystem */
/* compiled from: ImageModule_ProvidePicassoFactory */
public final class C3742x implements C4961HMa<E> {
    private final C7054oVa<Application> a;
    private final C7054oVa<C7440tyb> b;
    private final C7054oVa<C6246k> c;

    public C3742x(C7054oVa<Application> ova, C7054oVa<C7440tyb> ova2, C7054oVa<C6246k> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C3742x a(C7054oVa<Application> ova, C7054oVa<C7440tyb> ova2, C7054oVa<C6246k> ova3) {
        return new C3742x(ova, ova2, ova3);
    }

    public static E a(Application application, C4806CMa<C7440tyb> cMa, C6246k kVar) {
        E a2 = C3738t.a(application, cMa, kVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public E get() {
        return a((Application) this.a.get(), C4930GMa.a(this.b), (C6246k) this.c.get());
    }
}
