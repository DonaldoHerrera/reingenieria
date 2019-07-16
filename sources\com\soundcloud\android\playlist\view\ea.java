package com.soundcloud.android.playlist.view;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaylistViewModelToRenderer.kt */
public final class ea {
    public static final ea a = new ea();

    private ea() {
    }

    private final List<C6260cqa> b(C7218qra qra, c cVar) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, qra, cVar);
        b((List<C6260cqa>) arrayList, qra);
        return arrayList;
    }

    private final List<C6260cqa> c(List<C6260cqa> list, C7218qra qra) {
        for (e eVar : qra.e()) {
            list.add(eVar);
            f f = qra.f();
            if (f != null && C7471uYa.a((Object) eVar.a(), (Object) f.f().a())) {
                list.add(f);
            }
        }
        return list;
    }

    public final C4736AEa<C6260cqa, C6973nJa> a(boolean z, C6832lEa<C7218qra, C6973nJa> lea) {
        C7471uYa.b(lea, "asyncViewModel");
        return new C4736AEa<>(C6900mEa.a(lea.a(), false, false, null, null, false, 10, null), a(lea, z));
    }

    private final List<C6260cqa> b(List<C6260cqa> list, C7218qra qra) {
        d d = qra.d();
        if (d != null) {
            list.add(d);
        }
        return list;
    }

    private final List<C6260cqa> a(C6832lEa<C7218qra, C6973nJa> lea, boolean z) {
        if (lea.b() != null) {
            Object b = lea.b();
            if (b != null) {
                C7218qra qra = (C7218qra) b;
                c cVar = new c(qra.b(), qra.c().r());
                if (qra.c().q()) {
                    return a(qra);
                }
                if (z) {
                    return a(qra, cVar);
                }
                return b(qra, cVar);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        c cVar2 = new c(C4891FEa.a.a(lea.a().a(), true), false);
        if (!z) {
            return C6850lWa.a(cVar2);
        }
        return C6918mWa.b((Object[]) new C6260cqa[]{new g(null), cVar2});
    }

    private final List<C6260cqa> a(C7218qra qra, c cVar) {
        ArrayList arrayList = new ArrayList();
        a((List<C6260cqa>) arrayList, qra);
        a(arrayList, qra, cVar);
        b((List<C6260cqa>) arrayList, qra);
        return arrayList;
    }

    private final List<C6260cqa> a(C7218qra qra) {
        ArrayList arrayList = new ArrayList();
        c(arrayList, qra);
        return arrayList;
    }

    private final List<C6260cqa> a(List<C6260cqa> list, C7218qra qra, c cVar) {
        if (qra.e().isEmpty()) {
            list.add(cVar);
        } else {
            c(list, qra);
        }
        return list;
    }

    private final List<C6260cqa> a(List<C6260cqa> list, C7218qra qra) {
        list.add(new g(qra.c()));
        return list;
    }
}
