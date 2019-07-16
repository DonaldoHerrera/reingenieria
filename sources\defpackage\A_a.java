package defpackage;

import java.lang.reflect.Field;

/* renamed from: A_a reason: default package */
/* compiled from: KClassImpl.kt */
final class A_a extends C7540vYa implements PXa<T> {
    final /* synthetic */ a a;

    A_a(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final T d() {
        Field field;
        C5029Jcb h = this.a.h();
        if (h.g() != C5060Kcb.OBJECT) {
            return null;
        }
        if (!h.K() || C5090Lbb.b.a(h)) {
            field = I_a.this.a().getDeclaredField("INSTANCE");
        } else {
            field = I_a.this.a().getEnclosingClass().getDeclaredField(h.getName().a());
        }
        T t = field.get(null);
        if (t != null) {
            return t;
        }
        throw new OVa("null cannot be cast to non-null type T");
    }
}
