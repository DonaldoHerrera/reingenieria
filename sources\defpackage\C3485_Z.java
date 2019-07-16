package defpackage;

/* renamed from: _Z reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PaymentFailureEvent */
final class C3485_Z extends C3803kZ {
    C3485_Z(String str, long j, String str2) {
        super(str, j, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Caa)) {
            return false;
        }
        return h().equals(((Caa) obj).h());
    }

    public final int hashCode() {
        return h().hashCode() ^ 1000003;
    }
}
