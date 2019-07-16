package defpackage;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: kZa reason: default package and case insensitive filesystem */
/* compiled from: Ranges.kt */
public final class C6785kZa extends C6649iZa implements C6581hZa<Integer> {
    /* access modifiers changed from: private */
    public static final C6785kZa e = new C6785kZa(1, 0);
    public static final a f = new a(null);

    /* renamed from: kZa$a */
    /* compiled from: Ranges.kt */
    public static final class a {
        private a() {
        }

        public final C6785kZa a() {
            return C6785kZa.e;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6785kZa(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean c(int i) {
        return getFirst() <= i && i <= getLast();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (getLast() == r3.getLast()) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (obj instanceof C6785kZa) {
            if (!isEmpty() || !((C6785kZa) obj).isEmpty()) {
                C6785kZa kza = (C6785kZa) obj;
                if (getFirst() == kza.getFirst()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFirst());
        sb.append("..");
        sb.append(getLast());
        return sb.toString();
    }

    public Integer f() {
        return Integer.valueOf(getFirst());
    }

    public Integer g() {
        return Integer.valueOf(getLast());
    }
}
