package com.google.android.gms.internal.measurement;

final /* synthetic */ class Ab {
    static final /* synthetic */ int[] a = new int[Db.values().length];
    static final /* synthetic */ int[] b = new int[Tb.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    static {
        try {
            b[Tb.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Tb.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[Tb.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a[Db.MAP.ordinal()] = 1;
        a[Db.VECTOR.ordinal()] = 2;
        a[Db.SCALAR.ordinal()] = 3;
    }
}
