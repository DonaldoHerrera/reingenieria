package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: Nt reason: default package */
final class Nt extends AbstractMap<String, Object> {
    final Object a;
    final Mt b;

    Nt(Object obj, boolean z) {
        this.a = obj;
        this.b = Mt.a(obj.getClass(), z);
        if (!(!this.b.a())) {
            throw new IllegalArgumentException();
        }
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final /* synthetic */ Set entrySet() {
        return new St(this);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Ut a2 = this.b.a((String) obj);
        if (a2 == null) {
            return null;
        }
        return a2.a(this.a);
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        Ut a2 = this.b.a(str);
        String valueOf = String.valueOf(str);
        String str2 = "no field of key ";
        String concat = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        if (a2 != null) {
            Object a3 = a2.a(this.a);
            Object obj3 = this.a;
            Pu.a(obj2);
            a2.a(obj3, obj2);
            return a3;
        }
        throw new NullPointerException(String.valueOf(concat));
    }
}
