package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Inb reason: default package */
/* compiled from: ExtensionRegistryLite */
public class Inb {
    private static final Inb a = new Inb(true);
    private final Map<a, f<?, ?>> b;

    /* renamed from: Inb$a */
    /* compiled from: ExtensionRegistryLite */
    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    Inb() {
        this.b = new HashMap();
    }

    public static Inb a() {
        return a;
    }

    public static Inb b() {
        return new Inb();
    }

    public <ContainingType extends Wnb> f<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (f) this.b.get(new a(containingtype, i));
    }

    private Inb(boolean z) {
        this.b = Collections.emptyMap();
    }

    public final void a(f<?, ?> fVar) {
        this.b.put(new a(fVar.a(), fVar.c()), fVar);
    }
}
