package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: Gvb reason: default package */
/* compiled from: SmartSet.kt */
public final class Gvb<T> extends AbstractSet<T> {
    private static final int a = 5;
    public static final b b = new b(null);
    private Object c;
    private int d;

    /* renamed from: Gvb$a */
    /* compiled from: SmartSet.kt */
    private static final class a<T> implements Iterator<T>, PYa {
        private final Iterator<T> a;

        public a(T[] tArr) {
            C7471uYa.b(tArr, "array");
            this.a = C6920mYa.a(tArr);
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public T next() {
            return this.a.next();
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: Gvb$b */
    /* compiled from: SmartSet.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public final <T> Gvb<T> a() {
            return new Gvb<>(null);
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }

        @NXa
        public final <T> Gvb<T> a(Collection<? extends T> collection) {
            C7471uYa.b(collection, "set");
            Gvb<T> gvb = new Gvb<>(null);
            gvb.addAll(collection);
            return gvb;
        }
    }

    /* renamed from: Gvb$c */
    /* compiled from: SmartSet.kt */
    private static final class c<T> implements Iterator<T>, PYa {
        private boolean a = true;
        private final T b;

        public c(T t) {
            this.b = t;
        }

        public boolean hasNext() {
            return this.a;
        }

        public T next() {
            if (this.a) {
                this.a = false;
                return this.b;
            }
            throw new NoSuchElementException();
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private Gvb() {
    }

    @NXa
    public static final <T> Gvb<T> c() {
        return b.a();
    }

    public boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.c = t;
        } else if (size() == 1) {
            if (C7471uYa.a(this.c, (Object) t)) {
                return false;
            }
            this.c = new Object[]{this.c, t};
        } else if (size() < a) {
            Object obj2 = this.c;
            if (obj2 != null) {
                Object[] objArr = (Object[]) obj2;
                if (C6578hWa.a(objArr, (Object) t)) {
                    return false;
                }
                if (size() == a - 1) {
                    LinkedHashSet b2 = SWa.b(Arrays.copyOf(objArr, objArr.length));
                    b2.add(t);
                    obj = b2;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
                    copyOf[copyOf.length - 1] = t;
                    obj = copyOf;
                }
                this.c = obj;
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            Object obj3 = this.c;
            if (obj3 == null) {
                throw new OVa("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            } else if (!LYa.b(obj3).add(t)) {
                return false;
            }
        }
        c(size() + 1);
        return true;
    }

    public void c(int i) {
        this.d = i;
    }

    public void clear() {
        this.c = null;
        c(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C7471uYa.a(this.c, obj);
        }
        if (size() < a) {
            Object obj2 = this.c;
            if (obj2 != null) {
                return C6578hWa.a((Object[]) obj2, obj);
            }
            throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj3 = this.c;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new OVa("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }

    public int d() {
        return this.d;
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.c);
        }
        if (size() < a) {
            Object obj = this.c;
            if (obj != null) {
                return new a((Object[]) obj);
            }
            throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            return LYa.b(obj2).iterator();
        }
        throw new OVa("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    public final /* bridge */ int size() {
        return d();
    }

    public /* synthetic */ Gvb(C7264rYa rya) {
        this();
    }
}
