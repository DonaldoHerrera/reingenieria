package defpackage;

/* renamed from: Kvb reason: default package */
/* compiled from: HashPMap */
public final class Kvb<K, V> {
    private static final Kvb<Object, Object> a = new Kvb<>(Mvb.a(), 0);
    private final Mvb<Jvb<Nvb<K, V>>> b;
    private final int c;

    private Kvb(Mvb<Jvb<Nvb<K, V>>> mvb, int i) {
        this.b = mvb;
        this.c = i;
    }

    public static <K, V> Kvb<K, V> a() {
        Kvb<Object, Object> kvb = a;
        if (kvb != null) {
            return kvb;
        }
        a(0);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i == 1) {
            objArr[1] = "plus";
        } else if (i == 2 || i == 3 || i == 4) {
            objArr[1] = "minus";
        } else {
            objArr[1] = "empty";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    private Jvb<Nvb<K, V>> b(int i) {
        Jvb<Nvb<K, V>> jvb = (Jvb) this.b.a(i);
        return jvb == null ? Jvb.f() : jvb;
    }

    public V a(Object obj) {
        Jvb<E> b2 = b(obj.hashCode());
        while (b2 != null && b2.size() > 0) {
            Nvb nvb = (Nvb) b2.b;
            if (nvb.a.equals(obj)) {
                return nvb.b;
            }
            b2 = b2.c;
        }
        return null;
    }

    public Kvb<K, V> a(K k, V v) {
        Jvb b2 = b(k.hashCode());
        int size = b2.size();
        int a2 = a(b2, (Object) k);
        if (a2 != -1) {
            b2 = b2.c(a2);
        }
        Jvb a3 = b2.a(new Nvb(k, v));
        return new Kvb<>(this.b.a(k.hashCode(), a3), (this.c - size) + a3.size());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=Jvb<Nvb<K, V>>, code=Jvb, for r2v0, types: [Jvb<Nvb<K, V>>, Jvb] */
    private static <K, V> int a(Jvb jvb, Object obj) {
        int i = 0;
        while (jvb != null && jvb.size() > 0) {
            if (((Nvb) jvb.b).a.equals(obj)) {
                return i;
            }
            jvb = jvb.c;
            i++;
        }
        return -1;
    }
}
