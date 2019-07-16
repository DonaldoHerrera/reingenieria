package com.facebook.login;

/* compiled from: LoginBehavior */
public enum s {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    private s(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.k;
    }
}
