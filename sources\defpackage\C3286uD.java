package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: uD reason: default package and case insensitive filesystem */
/* compiled from: ImmutableCollection */
public abstract class C3286uD<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] a = new Object[0];

    /* renamed from: uD$a */
    /* compiled from: ImmutableCollection */
    public static abstract class a<E> {
        static int a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                return i3 < 0 ? BaseClientBuilder.API_PRIORITY_OTHER : i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    C3286uD() {
    }

    /* access modifiers changed from: 0000 */
    @CanIgnoreReturnValue
    public int a(Object[] objArr, int i) {
        C2988fE it = iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            objArr[i] = it.next();
            i = i2;
        }
        return i;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object[] c() {
        return null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: 0000 */
    public int d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        throw new UnsupportedOperationException();
    }

    public abstract C2988fE<E> iterator();

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(a);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new b(toArray());
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] c = c();
            if (c != null) {
                return C2310UD.a(c, f(), d(), tArr);
            }
            tArr = C2272SD.b(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
