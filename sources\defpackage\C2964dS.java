package defpackage;

/* renamed from: dS reason: default package and case insensitive filesystem */
/* compiled from: Cache */
public abstract class C2964dS<K, V> {

    /* renamed from: dS$a */
    /* compiled from: Cache */
    public interface a<K, V> {
        V get(K k) throws Exception;
    }

    public static <K, V> C2964dS<K, V> a(int i) {
        return new C2983eS(i);
    }

    public abstract C2964dS<K, V> a(K k, V v);

    public abstract V a(K k, a<K, V> aVar);
}
