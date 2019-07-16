package defpackage;

/* renamed from: vx reason: default package and case insensitive filesystem */
final class C1799vx implements C1342gx {
    private final C1403ix a;
    private final String b;
    private final Object[] c;
    private final int d;

    C1799vx(C1403ix ixVar, String str, Object[] objArr) {
        this.a = ixVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final int a() {
        return (this.d & 1) == 1 ? e.i : e.j;
    }

    public final boolean b() {
        return (this.d & 2) == 2;
    }

    public final C1403ix c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final String d() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final Object[] e() {
        return this.c;
    }
}
