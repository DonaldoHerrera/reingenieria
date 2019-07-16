package defpackage;

/* renamed from: mEa reason: default package and case insensitive filesystem */
/* compiled from: AsyncLoadingState.kt */
public final class C6900mEa<ErrorType> {
    private final boolean a;
    private final boolean b;
    private final ErrorType c;
    private final ErrorType d;
    private final boolean e;

    public C6900mEa() {
        this(false, false, null, null, false, 31, null);
    }

    public C6900mEa(boolean z, boolean z2, ErrorType errortype, ErrorType errortype2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = errortype;
        this.d = errortype2;
        this.e = z3;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=ErrorType, for r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=ErrorType, for r7v0, types: [java.lang.Object] */
    public static /* synthetic */ C6900mEa a(C6900mEa mea, boolean z, boolean z2, ErrorType errortype, ErrorType errortype2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mea.a;
        }
        if ((i & 2) != 0) {
            z2 = mea.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            errortype = mea.c;
        }
        Object obj2 = errortype;
        if ((i & 8) != 0) {
            errortype2 = mea.d;
        }
        Object obj3 = errortype2;
        if ((i & 16) != 0) {
            z3 = mea.e;
        }
        return mea.a(z, z4, obj2, obj3, z3);
    }

    public final ErrorType a() {
        return this.c;
    }

    public final C6900mEa<ErrorType> a(boolean z, boolean z2, ErrorType errortype, ErrorType errortype2, boolean z3) {
        C6900mEa mea = new C6900mEa(z, z2, errortype, errortype2, z3);
        return mea;
    }

    public final ErrorType b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6900mEa) {
                C6900mEa mea = (C6900mEa) obj;
                if (this.a == mea.a) {
                    if ((this.b == mea.b) && C7471uYa.a((Object) this.c, (Object) mea.c) && C7471uYa.a((Object) this.d, (Object) mea.d)) {
                        if (this.e == mea.e) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C6900mEa<ErrorType> f() {
        return a(this, false, true, null, null, false, 29, null);
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        ErrorType errortype = this.c;
        int i4 = 0;
        int hashCode = (i3 + (errortype != null ? errortype.hashCode() : 0)) * 31;
        ErrorType errortype2 = this.d;
        if (errortype2 != null) {
            i4 = errortype2.hashCode();
        }
        int i5 = (hashCode + i4) * 31;
        boolean z3 = this.e;
        if (!z3) {
            i = z3;
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncLoadingState(isLoadingNextPage=");
        sb.append(this.a);
        sb.append(", isRefreshing=");
        sb.append(this.b);
        sb.append(", nextPageError=");
        sb.append(this.c);
        sb.append(", refreshError=");
        sb.append(this.d);
        sb.append(", requestMoreOnScroll=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6900mEa(boolean z, boolean z2, Object obj, Object obj2, boolean z3, int i, C7264rYa rya) {
        boolean z4 = (i & 1) != 0 ? false : z;
        this(z4, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? false : z3);
    }

    public final C6900mEa<ErrorType> a(ErrorType errortype) {
        return a(this, false, false, null, errortype, false, 21, null);
    }
}
