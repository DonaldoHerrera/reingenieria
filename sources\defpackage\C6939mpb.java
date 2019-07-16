package defpackage;

import java.util.Collection;

/* renamed from: mpb reason: default package and case insensitive filesystem */
/* compiled from: OverridingStrategy.kt */
public abstract class C6939mpb {
    public abstract void a(C4935Gcb gcb);

    public abstract void a(C4935Gcb gcb, C4935Gcb gcb2);

    public void a(C4935Gcb gcb, Collection<? extends C4935Gcb> collection) {
        C7471uYa.b(gcb, "member");
        C7471uYa.b(collection, "overridden");
        gcb.a(collection);
    }

    public abstract void b(C4935Gcb gcb, C4935Gcb gcb2);
}
