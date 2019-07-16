package defpackage;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Map.Entry;

/* renamed from: XD reason: default package and case insensitive filesystem */
/* compiled from: RegularImmutableMap */
final class C2364XD<K, V> extends C3346xD<K, V> {
    static final C3346xD<Object, Object> e = new C2364XD(null, new Object[0], 0);
    private final transient int[] f;
    final transient Object[] g;
    private final transient int h;

    /* renamed from: XD$a */
    /* compiled from: RegularImmutableMap */
    static class a<K, V> extends C3366yD<Entry<K, V>> {
        private final transient C3346xD<K, V> c;
        /* access modifiers changed from: private */
        public final transient Object[] d;
        /* access modifiers changed from: private */
        public final transient int e;
        /* access modifiers changed from: private */
        public final transient int f;

        a(C3346xD<K, V> xDVar, Object[] objArr, int i, int i2) {
            this.c = xDVar;
            this.d = objArr;
            this.e = i;
            this.f = i2;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.c.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public C3326wD<Entry<K, V>> h() {
            return new C2346WD(this);
        }

        public int size() {
            return this.f;
        }

        /* access modifiers changed from: 0000 */
        public int a(Object[] objArr, int i) {
            return g().a(objArr, i);
        }

        public C2988fE<Entry<K, V>> iterator() {
            return g().iterator();
        }
    }

    /* renamed from: XD$b */
    /* compiled from: RegularImmutableMap */
    static final class b<K> extends C3366yD<K> {
        private final transient C3346xD<K, ?> c;
        private final transient C3326wD<K> d;

        b(C3346xD<K, ?> xDVar, C3326wD<K> wDVar) {
            this.c = xDVar;
            this.d = wDVar;
        }

        /* access modifiers changed from: 0000 */
        public int a(Object[] objArr, int i) {
            return g().a(objArr, i);
        }

        public boolean contains(Object obj) {
            return this.c.get(obj) != null;
        }

        public C3326wD<K> g() {
            return this.d;
        }

        public int size() {
            return this.c.size();
        }

        public C2988fE<K> iterator() {
            return g().iterator();
        }
    }

    /* renamed from: XD$c */
    /* compiled from: RegularImmutableMap */
    static final class c extends C3326wD<Object> {
        private final transient Object[] c;
        private final transient int d;
        private final transient int e;

        c(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.e = i2;
        }

        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.e);
            return this.c[(i * 2) + this.d];
        }

        public int size() {
            return this.e;
        }
    }

    private C2364XD(int[] iArr, Object[] objArr, int i) {
        this.f = iArr;
        this.g = objArr;
        this.h = i;
    }

    static <K, V> C2364XD<K, V> a(int i, Object[] objArr) {
        if (i == 0) {
            return (C2364XD) e;
        }
        if (i == 1) {
            C3044iD.a(objArr[0], objArr[1]);
            return new C2364XD<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        return new C2364XD<>(a(objArr, i, C3366yD.c(i), 0), objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public C3366yD<K> b() {
        return new b(this, new c(this.g, 0, this.h));
    }

    /* access modifiers changed from: 0000 */
    public C3286uD<V> c() {
        return new c(this.g, 1, this.h);
    }

    public V get(Object obj) {
        return a(this.f, this.g, this.h, 0, obj);
    }

    public int size() {
        return this.h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    static int[] a(Object[] objArr, int i, int i2, int i3) {
        if (i == 1) {
            C3044iD.a(objArr[i3], objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i5 = 0;
        while (i5 < i) {
            int i6 = i5 * 2;
            int i7 = i6 + i3;
            Object obj = objArr[i7];
            Object obj2 = objArr[i6 + (i3 ^ 1)];
            C3044iD.a(obj, obj2);
            int a2 = C3266tD.a(obj.hashCode());
            while (true) {
                int i8 = a2 & i4;
                int i9 = iArr[i8];
                if (i9 == -1) {
                    break;
                } else if (!objArr[i9].equals(obj)) {
                    a2 = i8 + 1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple entries with same key: ");
                    sb.append(obj);
                    String str = "=";
                    sb.append(str);
                    sb.append(obj2);
                    sb.append(" and ");
                    sb.append(objArr[i9]);
                    sb.append(str);
                    sb.append(objArr[i9 ^ 1]);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return iArr;
    }

    static Object a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                obj2 = objArr[i2 ^ 1];
            }
            return obj2;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = C3266tD.a(obj.hashCode());
            while (true) {
                int i3 = a2 & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a2 = i3 + 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public C3366yD<Entry<K, V>> a() {
        return new a(this, this.g, 0, this.h);
    }
}
