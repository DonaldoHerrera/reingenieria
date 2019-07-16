package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: fD reason: default package and case insensitive filesystem */
/* compiled from: ArrayListMultimap */
public final class C2987fD<K, V> extends C3006gD<K, V> {
    transient int e;

    private C2987fD() {
        this(12, 3);
    }

    public static <K, V> C2987fD<K, V> f() {
        return new C2987fD<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.e = 3;
        int a = C2401ZD.a(objectInputStream);
        a((Map<K, Collection<V>>) C3139nD.a());
        C2401ZD.a(this, objectInputStream, a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2401ZD.a(this, objectOutputStream);
    }

    public /* bridge */ /* synthetic */ Map a() {
        return super.a();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private C2987fD(int i, int i2) {
        super(C2310UD.a(i));
        C3044iD.a(i2, "expectedValuesPerKey");
        this.e = i2;
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean a(Object obj, Iterable iterable) {
        return super.a(obj, iterable);
    }

    /* access modifiers changed from: 0000 */
    public List<V> e() {
        return new ArrayList(this.e);
    }
}
