package defpackage;

/* renamed from: et reason: default package and case insensitive filesystem */
enum C1276et {
    PLUS(Character.valueOf('+'), "", ",", false, true),
    HASH(Character.valueOf('#'), "#", ",", false, true),
    DOT(Character.valueOf('.'), ".", ".", false, false),
    FORWARD_SLASH(Character.valueOf('/'), "/", "/", false, false),
    SEMI_COLON(Character.valueOf(';'), ";", ";", true, false),
    QUERY(Character.valueOf('?'), "?", "&", true, false),
    AMP(Character.valueOf('&'), "&", "&", true, false),
    SIMPLE(null, "", ",", false, false);
    
    private final Character j;
    private final String k;
    private final String l;
    private final boolean m;
    private final boolean n;

    private C1276et(Character ch, String str, String str2, boolean z, boolean z2) {
        this.j = ch;
        Pu.a(str);
        this.k = str;
        Pu.a(str2);
        this.l = str2;
        this.m = z;
        this.n = z2;
        if (ch != null) {
            C1307ft.a.put(ch, this);
        }
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public final int d() {
        return this.j == null ? 0 : 1;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public final String a(String str) {
        if (this.n) {
            return C1555nu.c(str);
        }
        return C1555nu.a(str);
    }
}
