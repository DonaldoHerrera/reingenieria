package defpackage;

/* renamed from: vma reason: default package and case insensitive filesystem */
public final /* synthetic */ class C4694vma {
    public static final /* synthetic */ int[] a = new int[C4730zma.values().length];
    public static final /* synthetic */ int[] b = new int[C4730zma.values().length];

    static {
        a[C4730zma.PREPARING.ordinal()] = 1;
        a[C4730zma.PAUSED_FOR_BUFFERING.ordinal()] = 2;
        a[C4730zma.PLAYING.ordinal()] = 3;
        a[C4730zma.ERROR.ordinal()] = 4;
        a[C4730zma.COMPLETED.ordinal()] = 5;
        a[C4730zma.PAUSED.ordinal()] = 6;
        a[C4730zma.STOPPED.ordinal()] = 7;
        a[C4730zma.ERROR_RETRYING.ordinal()] = 8;
        b[C4730zma.ERROR.ordinal()] = 1;
        b[C4730zma.PAUSED.ordinal()] = 2;
        b[C4730zma.COMPLETED.ordinal()] = 3;
    }
}
