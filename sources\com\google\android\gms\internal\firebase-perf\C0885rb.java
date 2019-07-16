package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.rb reason: case insensitive filesystem */
final /* synthetic */ class C0885rb {
    static final /* synthetic */ int[] a = new int[C0882qb.values().length];
    static final /* synthetic */ int[] b = new int[Gb.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    static {
        try {
            b[Gb.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Gb.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[Gb.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a[C0882qb.MAP.ordinal()] = 1;
        a[C0882qb.VECTOR.ordinal()] = 2;
        a[C0882qb.SCALAR.ordinal()] = 3;
    }
}
