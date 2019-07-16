package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: Fvb reason: default package */
/* compiled from: SmartList */
public class Fvb<E> extends AbstractList<E> implements RandomAccess {
    private int a;
    /* access modifiers changed from: private */
    public Object b;

    /* renamed from: Fvb$a */
    /* compiled from: SmartList */
    private static class a<T> implements Iterator<T> {
        private static final a a = new a();

        private a() {
        }

        public static <T> a<T> a() {
            return a;
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: Fvb$b */
    /* compiled from: SmartList */
    private class b extends c<E> {
        private final int b;

        public b() {
            super();
            this.b = Fvb.this.modCount;
        }

        /* access modifiers changed from: protected */
        public void a() {
            if (Fvb.this.modCount != this.b) {
                StringBuilder sb = new StringBuilder();
                sb.append("ModCount: ");
                sb.append(Fvb.this.modCount);
                sb.append("; expected: ");
                sb.append(this.b);
                throw new ConcurrentModificationException(sb.toString());
            }
        }

        /* access modifiers changed from: protected */
        public E b() {
            return Fvb.this.b;
        }

        public void remove() {
            a();
            Fvb.this.clear();
        }
    }

    /* renamed from: Fvb$c */
    /* compiled from: SmartList */
    private static abstract class c<T> implements Iterator<T> {
        private boolean a;

        private c() {
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract T b();

        public final boolean hasNext() {
            return !this.a;
        }

        public final T next() {
            if (!this.a) {
                this.a = true;
                a();
                return b();
            }
            throw new NoSuchElementException();
        }
    }

    private static /* synthetic */ void c(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            case 5:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        String str3 = "toArray";
        if (i == 2 || i == 3 || i == 4) {
            objArr[1] = "iterator";
        } else if (i == 6 || i == 7 || i == 8) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean add(E e) {
        Object[] objArr;
        int i = this.a;
        if (i == 0) {
            this.b = e;
        } else if (i == 1) {
            this.b = new Object[]{this.b, e};
        } else {
            Object[] objArr2 = (Object[]) this.b;
            int length = objArr2.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 >= i3) {
                    i3 = i2;
                }
                objArr = new Object[i3];
                this.b = objArr;
                System.arraycopy(objArr2, 0, objArr, 0, length);
            } else {
                objArr = objArr2;
            }
            objArr[this.a] = e;
        }
        this.a++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.b = null;
        this.a = 0;
        this.modCount++;
    }

    public E get(int i) {
        if (i >= 0) {
            int i2 = this.a;
            if (i < i2) {
                if (i2 == 1) {
                    return this.b;
                }
                return ((Object[]) this.b)[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public Iterator<E> iterator() {
        int i = this.a;
        if (i == 0) {
            a a2 = a.a();
            if (a2 != null) {
                return a2;
            }
            c(2);
            throw null;
        } else if (i == 1) {
            return new b();
        } else {
            Iterator<E> it = super.iterator();
            if (it != null) {
                return it;
            }
            c(4);
            throw null;
        }
    }

    public E remove(int i) {
        E e;
        if (i >= 0) {
            int i2 = this.a;
            if (i < i2) {
                if (i2 == 1) {
                    e = this.b;
                    this.b = null;
                } else {
                    E[] eArr = (Object[]) this.b;
                    E e2 = eArr[i];
                    if (i2 == 2) {
                        this.b = eArr[1 - i];
                    } else {
                        int i3 = (i2 - i) - 1;
                        if (i3 > 0) {
                            System.arraycopy(eArr, i + 1, eArr, i, i3);
                        }
                        eArr[this.a - 1] = null;
                    }
                    e = e2;
                }
                this.a--;
                this.modCount++;
                return e;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public E set(int i, E e) {
        if (i >= 0) {
            int i2 = this.a;
            if (i < i2) {
                if (i2 == 1) {
                    E e2 = this.b;
                    this.b = e;
                    return e2;
                }
                Object[] objArr = (Object[]) this.b;
                Object obj = objArr[i];
                objArr[i] = e;
                return obj;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int size() {
        return this.a;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            int i = this.a;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.b;
                } else {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                    tArr2[0] = this.b;
                    if (tArr2 != null) {
                        return tArr2;
                    }
                    c(6);
                    throw null;
                }
            } else if (length < i) {
                T[] copyOf = Arrays.copyOf((Object[]) this.b, i, tArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                c(7);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.b, 0, tArr, 0, i);
            }
            int i2 = this.a;
            if (length > i2) {
                tArr[i2] = null;
            }
            if (tArr != null) {
                return tArr;
            }
            c(8);
            throw null;
        }
        c(5);
        throw null;
    }

    public void add(int i, E e) {
        if (i >= 0) {
            int i2 = this.a;
            if (i <= i2) {
                if (i2 == 0) {
                    this.b = e;
                } else if (i2 == 1 && i == 0) {
                    this.b = new Object[]{e, this.b};
                } else {
                    int i3 = this.a;
                    Object[] objArr = new Object[(i3 + 1)];
                    if (i3 == 1) {
                        objArr[0] = this.b;
                    } else {
                        Object[] objArr2 = (Object[]) this.b;
                        System.arraycopy(objArr2, 0, objArr, 0, i);
                        System.arraycopy(objArr2, i, objArr, i + 1, this.a - i);
                    }
                    objArr[i] = e;
                    this.b = objArr;
                }
                this.a++;
                this.modCount++;
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.a);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
