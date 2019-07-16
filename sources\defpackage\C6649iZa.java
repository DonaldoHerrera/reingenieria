package defpackage;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: iZa reason: default package and case insensitive filesystem */
/* compiled from: Progressions.kt */
public class C6649iZa implements Iterable<Integer>, MYa {
    public static final a a = new a(null);
    private final int b;
    private final int c;
    private final int d;

    /* renamed from: iZa$a */
    /* compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public final C6649iZa a(int i, int i2, int i3) {
            return new C6649iZa(i, i2, i3);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6649iZa(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.b = i;
            this.c = C7677xXa.a(i, i2, i3);
            this.d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.d == r3.d) goto L_0x0027;
     */
    public boolean equals(Object obj) {
        if (obj instanceof C6649iZa) {
            if (!isEmpty() || !((C6649iZa) obj).isEmpty()) {
                C6649iZa iza = (C6649iZa) obj;
                if (this.b == iza.b) {
                    if (this.c == iza.c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.b;
    }

    public final int getLast() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public boolean isEmpty() {
        if (this.d > 0) {
            if (this.b > this.c) {
                return true;
            }
        } else if (this.b < this.c) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        String str = " step ";
        if (this.d > 0) {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append("..");
            sb.append(this.c);
            sb.append(str);
            i = this.d;
        } else {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append(" downTo ");
            sb.append(this.c);
            sb.append(str);
            i = -this.d;
        }
        sb.append(i);
        return sb.toString();
    }

    public FWa iterator() {
        return new C6717jZa(this.b, this.c, this.d);
    }
}
