package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: qeb reason: default package and case insensitive filesystem */
/* compiled from: Annotations.kt */
public final class C7202qeb implements C6723jeb {
    private final List<C6723jeb> a;

    public C7202qeb(List<? extends C6723jeb> list) {
        C7471uYa.b(list, "delegates");
        this.a = list;
    }

    public C6315deb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return (C6315deb) Ywb.f(Ywb.e(C7676xWa.d(this.a), new C7064oeb(snb)));
    }

    public boolean b(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        for (C6723jeb b : C7676xWa.d(this.a)) {
            if (b.b(snb)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        List<C6723jeb> list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C6723jeb isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C6315deb> iterator() {
        return Ywb.c(C7676xWa.d(this.a), (_Xa<? super T, ? extends Iwb<? extends R>>) C7133peb.a).iterator();
    }

    public C7202qeb(C6723jeb... jebArr) {
        C7471uYa.b(jebArr, "delegates");
        this(C6578hWa.j(jebArr));
    }
}
