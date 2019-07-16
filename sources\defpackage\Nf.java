package defpackage;

/* renamed from: Nf reason: default package */
/* synthetic */ class Nf {
    static final /* synthetic */ int[] a = new int[Of.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    static {
        a[Of.UNITY.ordinal()] = 1;
        a[Of.REACT.ordinal()] = 2;
        a[Of.CORDOVA.ordinal()] = 3;
        a[Of.XAMARIN.ordinal()] = 4;
        a[Of.SEGMENT.ordinal()] = 5;
        try {
            a[Of.MPARTICLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
    }
}
