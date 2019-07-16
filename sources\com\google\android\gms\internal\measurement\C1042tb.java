package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.tb reason: case insensitive filesystem */
public class C1042tb {
    private static final Class<?> a = d();
    private static volatile C1042tb b;
    private static volatile C1042tb c;
    static final C1042tb d = new C1042tb(true);
    private final Map<a, e<?, ?>> e;

    /* renamed from: com.google.android.gms.internal.measurement.tb$a */
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

    C1042tb() {
        this.e = new HashMap();
    }

    static C1042tb a() {
        return Fb.a(C1042tb.class);
    }

    public static C1042tb b() {
        C1042tb tbVar = b;
        if (tbVar == null) {
            synchronized (C1042tb.class) {
                tbVar = b;
                if (tbVar == null) {
                    tbVar = C1030rb.a();
                    b = tbVar;
                }
            }
        }
        return tbVar;
    }

    public static C1042tb c() {
        C1042tb tbVar = c;
        if (tbVar == null) {
            synchronized (C1042tb.class) {
                tbVar = c;
                if (tbVar == null) {
                    tbVar = C1030rb.b();
                    c = tbVar;
                }
            }
        }
        return tbVar;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <ContainingType extends C1026qc> e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (e) this.e.get(new a(containingtype, i));
    }

    private C1042tb(boolean z) {
        this.e = Collections.emptyMap();
    }
}
