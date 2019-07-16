package defpackage;

/* renamed from: nda reason: default package and case insensitive filesystem */
/* compiled from: OfflineState.kt */
public final class C3831nda {
    public static final C3823mda a(boolean z, boolean z2, boolean z3) {
        if (z) {
            return C3823mda.REQUESTED;
        }
        if (z2) {
            return C3823mda.DOWNLOADED;
        }
        if (z3) {
            return C3823mda.UNAVAILABLE;
        }
        return C3823mda.REQUESTED;
    }
}
