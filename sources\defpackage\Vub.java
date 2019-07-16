package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: Vub reason: default package */
/* compiled from: modifierChecks.kt */
public final class Vub {
    private final C7694xnb a;
    private final C7162pxb b;
    private final Collection<C7694xnb> c;
    private final _Xa<C5582adb, String> d;
    private final Qub[] e;

    private Vub(C7694xnb xnb, C7162pxb pxb, Collection<C7694xnb> collection, _Xa<? super C5582adb, String> _xa, Qub... qubArr) {
        this.a = xnb;
        this.b = pxb;
        this.c = collection;
        this.d = _xa;
        this.e = qubArr;
    }

    public final Rub a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        for (Qub a2 : this.e) {
            String a3 = a2.a(adb);
            if (a3 != null) {
                return new b(a3);
            }
        }
        String str = (String) this.d.invoke(adb);
        if (str != null) {
            return new b(str);
        }
        return c.b;
    }

    public final boolean b(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        if (this.a != null && (!C7471uYa.a((Object) adb.getName(), (Object) this.a))) {
            return false;
        }
        if (this.b != null) {
            String a2 = adb.getName().a();
            C7471uYa.a((Object) a2, "functionDescriptor.name.asString()");
            if (!this.b.b(a2)) {
                return false;
            }
        }
        Collection<C7694xnb> collection = this.c;
        return collection == null || collection.contains(adb.getName());
    }

    public /* synthetic */ Vub(C7694xnb xnb, Qub[] qubArr, _Xa _xa, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            _xa = Sub.a;
        }
        this(xnb, qubArr, _xa);
    }

    public Vub(C7694xnb xnb, Qub[] qubArr, _Xa<? super C5582adb, String> _xa) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(qubArr, "checks");
        C7471uYa.b(_xa, "additionalChecks");
        this(xnb, (C7162pxb) null, null, _xa, (Qub[]) Arrays.copyOf(qubArr, qubArr.length));
    }

    public /* synthetic */ Vub(C7162pxb pxb, Qub[] qubArr, _Xa _xa, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            _xa = Tub.a;
        }
        this(pxb, qubArr, _xa);
    }

    public Vub(C7162pxb pxb, Qub[] qubArr, _Xa<? super C5582adb, String> _xa) {
        C7471uYa.b(pxb, "regex");
        C7471uYa.b(qubArr, "checks");
        C7471uYa.b(_xa, "additionalChecks");
        this((C7694xnb) null, pxb, null, _xa, (Qub[]) Arrays.copyOf(qubArr, qubArr.length));
    }

    public /* synthetic */ Vub(Collection collection, Qub[] qubArr, _Xa _xa, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            _xa = Uub.a;
        }
        this(collection, qubArr, _xa);
    }

    public Vub(Collection<C7694xnb> collection, Qub[] qubArr, _Xa<? super C5582adb, String> _xa) {
        C7471uYa.b(collection, "nameList");
        C7471uYa.b(qubArr, "checks");
        C7471uYa.b(_xa, "additionalChecks");
        this((C7694xnb) null, (C7162pxb) null, collection, _xa, (Qub[]) Arrays.copyOf(qubArr, qubArr.length));
    }
}
