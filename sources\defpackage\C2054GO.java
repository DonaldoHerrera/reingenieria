package defpackage;

/* renamed from: GO reason: default package and case insensitive filesystem */
/* compiled from: PerformanceReporter.kt */
public final class C2054GO {
    public static final void a(C2074HO ho, String str, int i, int i2) {
        C7471uYa.b(ho, "$this$reportLoadingStats");
        C7471uYa.b(str, "labelPrefix");
        int i3 = i2 - i;
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_hit");
            ho.a(sb.toString(), (long) i);
        }
        if (i3 != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_miss");
            ho.a(sb2.toString(), (long) i3);
        }
    }
}
