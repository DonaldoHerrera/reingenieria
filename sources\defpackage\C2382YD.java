package defpackage;

/* renamed from: YD reason: default package and case insensitive filesystem */
/* compiled from: RegularImmutableSet */
final class C2382YD<E> extends C3366yD<E> {
    static final C2382YD<Object> c;
    final transient Object[] d;
    final transient Object[] e;
    private final transient int f;
    private final transient int g;
    private final transient int h;

    static {
        C2382YD yd = new C2382YD(new Object[0], 0, null, 0, 0);
        c = yd;
    }

    C2382YD(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d = objArr;
        this.e = objArr2;
        this.f = i2;
        this.g = i;
        this.h = i3;
    }

    /* access modifiers changed from: 0000 */
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.h);
        return i + this.h;
    }

    /* access modifiers changed from: 0000 */
    public Object[] c() {
        return this.d;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.e;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C3266tD.a(obj);
        while (true) {
            int i = a & this.f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public C3326wD<E> h() {
        return C3326wD.b(this.d, this.h);
    }

    public int hashCode() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return true;
    }

    public int size() {
        return this.h;
    }

    public C2988fE<E> iterator() {
        return g().iterator();
    }
}
