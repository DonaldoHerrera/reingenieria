package defpackage;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

/* renamed from: ZC reason: default package and case insensitive filesystem */
/* compiled from: AbstractIterator */
public abstract class C2400ZC<T> extends C2988fE<T> {
    private a a = a.NOT_READY;
    private T b;

    /* renamed from: ZC$a */
    /* compiled from: AbstractIterator */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C2400ZC() {
    }

    private boolean c() {
        this.a = a.FAILED;
        this.b = a();
        if (this.a == a.DONE) {
            return false;
        }
        this.a = a.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    public final T b() {
        this.a = a.DONE;
        return null;
    }

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        Preconditions.checkState(this.a != a.FAILED);
        int i = C2381YC.a[this.a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return c();
        }
        return true;
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.a = a.NOT_READY;
            T t = this.b;
            this.b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
