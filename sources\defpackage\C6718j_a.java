package defpackage;

import java.lang.reflect.Type;

/* renamed from: j_a reason: default package and case insensitive filesystem */
/* compiled from: KCallableImpl.kt */
final class C6718j_a extends C7540vYa implements PXa<Type> {
    final /* synthetic */ C6786k_a a;

    C6718j_a(C6786k_a k_a) {
        this.a = k_a;
        super(0);
    }

    public final Type d() {
        Type a2 = this.a.a.l();
        return a2 != null ? a2 : this.a.a.f().a();
    }
}
