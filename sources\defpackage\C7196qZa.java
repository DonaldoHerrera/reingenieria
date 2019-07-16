package defpackage;

/* renamed from: qZa reason: default package and case insensitive filesystem */
/* compiled from: Ranges.kt */
class C7196qZa extends C7127pZa {
    public static final void a(boolean z, Number number) {
        C7471uYa.b(number, "step");
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Step must be positive, was: ");
            sb.append(number);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
