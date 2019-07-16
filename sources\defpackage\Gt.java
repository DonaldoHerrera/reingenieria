package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: Gt reason: default package */
public class Gt<K, V> extends AbstractMap<K, V> implements Cloneable {
    int a;
    private Object[] b;

    /* renamed from: Gt$a */
    final class a implements Entry<K, V> {
        private int a;

        a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = getKey();
            Object key2 = entry.getKey();
            if (key == key2 || (key != null && key.equals(key2))) {
                Object value = getValue();
                Object value2 = entry.getValue();
                if (value == value2 || (value != null && value.equals(value2))) {
                    return true;
                }
            }
            return false;
        }

        public final K getKey() {
            return Gt.this.b(this.a);
        }

        public final V getValue() {
            return Gt.this.c(this.a);
        }

        public final int hashCode() {
            Object key = getKey();
            Object value = getValue();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            return Gt.this.a(this.a, v);
        }
    }

    /* renamed from: Gt$b */
    final class b extends AbstractSet<Entry<K, V>> {
        b() {
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new c();
        }

        public final int size() {
            return Gt.this.a;
        }
    }

    /* renamed from: Gt$c */
    final class c implements Iterator<Entry<K, V>> {
        private boolean a;
        private int b;

        c() {
        }

        public final boolean hasNext() {
            return this.b < Gt.this.a;
        }

        public final /* synthetic */ Object next() {
            int i = this.b;
            Gt gt = Gt.this;
            if (i != gt.a) {
                this.b = i + 1;
                this.a = false;
                return new a(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            int i = this.b - 1;
            if (this.a || i < 0) {
                throw new IllegalArgumentException();
            }
            Gt.this.a(i);
            this.b--;
            this.a = true;
        }
    }

    private final V d(int i) {
        if (i < 0) {
            return null;
        }
        return this.b[i];
    }

    private final V e(int i) {
        int i2 = this.a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V d = d(i + 1);
        Object[] objArr = this.b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.a--;
        a(i2 - 2, null, null);
        return d;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Gt<K, V> clone() {
        try {
            Gt<K, V> gt = (Gt) super.clone();
            Object[] objArr = this.b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                gt.b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return gt;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final V a(int i, V v) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V d = d(i3);
        this.b[i3] = v;
        return d;
    }

    public final K b(int i) {
        if (i < 0 || i >= this.a) {
            return null;
        }
        return this.b[i << 1];
    }

    public final V c(int i) {
        if (i < 0 || i >= this.a) {
            return null;
        }
        return d((i << 1) + 1);
    }

    public void clear() {
        this.a = 0;
        this.b = null;
    }

    public final boolean containsKey(Object obj) {
        return -2 != b(obj);
    }

    public final boolean containsValue(Object obj) {
        int i = this.a << 1;
        Object[] objArr = this.b;
        int i2 = 1;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    public final Set<Entry<K, V>> entrySet() {
        return new b();
    }

    public final V get(Object obj) {
        return d(b(obj) + 1);
    }

    public final V put(K k, V v) {
        int i;
        int b2 = b((Object) k) >> 1;
        if (b2 == -1) {
            b2 = this.a;
        }
        if (b2 >= 0) {
            int i2 = b2 + 1;
            if (i2 >= 0) {
                Object[] objArr = this.b;
                int i3 = i2 << 1;
                if (objArr == null) {
                    i = 0;
                } else {
                    i = objArr.length;
                }
                if (i3 > i) {
                    int i4 = ((i / 2) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 < i3) {
                        i4 = i3;
                    }
                    if (i4 == 0) {
                        this.b = null;
                    } else {
                        int i5 = this.a;
                        Object[] objArr2 = this.b;
                        if (i5 == 0 || i4 != objArr2.length) {
                            Object[] objArr3 = new Object[i4];
                            this.b = objArr3;
                            if (i5 != 0) {
                                System.arraycopy(objArr2, 0, objArr3, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = b2 << 1;
                V d = d(i6 + 1);
                a(i6, k, v);
                if (i2 > this.a) {
                    this.a = i2;
                }
                return d;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V remove(Object obj) {
        return e(b(obj));
    }

    public final int size() {
        return this.a;
    }

    private final int b(Object obj) {
        int i = this.a << 1;
        Object[] objArr = this.b;
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    public final V a(int i) {
        return e(i << 1);
    }

    private final void a(int i, K k, V v) {
        Object[] objArr = this.b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }
}
