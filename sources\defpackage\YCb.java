package defpackage;

/* renamed from: YCb reason: default package */
/* compiled from: SignStyle */
public enum YCb {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    /* access modifiers changed from: 0000 */
    public boolean a(boolean z, boolean z2, boolean z3) {
        int ordinal = ordinal();
        boolean z4 = false;
        if (ordinal == 0) {
            if (!z || !z2) {
                z4 = true;
            }
            return z4;
        } else if (ordinal == 1 || ordinal == 4) {
            return true;
        } else {
            if (!z2 && !z3) {
                z4 = true;
            }
            return z4;
        }
    }
}
