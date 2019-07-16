package defpackage;

/* renamed from: IUa reason: default package */
/* compiled from: Pow2 */
public final class IUa {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
