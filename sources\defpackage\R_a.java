package defpackage;

import java.util.Comparator;

/* renamed from: R_a reason: default package */
/* compiled from: KDeclarationContainerImpl.kt */
final class R_a<T> implements Comparator<C5583aeb> {
    public static final R_a a = new R_a();

    R_a() {
    }

    /* renamed from: a */
    public final int compare(C5583aeb aeb, C5583aeb aeb2) {
        Integer a2 = _db.a(aeb, aeb2);
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }
}
