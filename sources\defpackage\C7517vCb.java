package defpackage;

/* renamed from: vCb reason: default package and case insensitive filesystem */
/* compiled from: MinguoChronology */
/* synthetic */ class C7517vCb {
    static final /* synthetic */ int[] a = new int[C6423fDb.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    static {
        a[C6423fDb.PROLEPTIC_MONTH.ordinal()] = 1;
        a[C6423fDb.YEAR_OF_ERA.ordinal()] = 2;
        try {
            a[C6423fDb.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}
