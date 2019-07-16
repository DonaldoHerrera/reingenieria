package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tw reason: default package and case insensitive filesystem */
public class C1738tw {
    private static final Class<?> a = b();
    private static volatile C1738tw b;
    static final C1738tw c = new C1738tw(true);
    private final Map<a, c<?, ?>> d;

    /* renamed from: tw$a */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    C1738tw() {
        this.d = new HashMap();
    }

    public static C1738tw a() {
        C1738tw twVar = b;
        if (twVar == null) {
            synchronized (C1738tw.class) {
                twVar = b;
                if (twVar == null) {
                    twVar = C1678rw.a();
                    b = twVar;
                }
            }
        }
        return twVar;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private C1738tw(boolean z) {
        this.d = Collections.emptyMap();
    }

    public final <ContainingType extends C1403ix> c<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (c) this.d.get(new a(containingtype, i));
    }
}
