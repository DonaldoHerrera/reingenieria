package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Ht reason: default package */
final class Ht {
    final Class<?> a;
    final ArrayList<Object> b = new ArrayList<>();

    Ht(Class<?> cls) {
        this.a = cls;
    }

    /* access modifiers changed from: 0000 */
    public final Object a() {
        return C1431ju.a((Collection<?>) this.b, this.a);
    }
}
