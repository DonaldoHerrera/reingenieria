package defpackage;

/* renamed from: jOa reason: default package and case insensitive filesystem */
/* compiled from: ExponentialBackoff */
public class C6706jOa implements C6570hOa {
    private final long a;
    private final int b;

    public C6706jOa(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public long a(int i) {
        return (long) (((double) this.a) * Math.pow((double) this.b, (double) i));
    }
}
