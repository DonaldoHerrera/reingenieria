package defpackage;

/* renamed from: WKa reason: default package and case insensitive filesystem */
/* compiled from: InsertResult */
public class C5413WKa extends C6499gLa {
    private final long b;

    public C5413WKa(long j) {
        this.b = j;
    }

    static C5413WKa a(String str, int i, Throwable th, String str2) {
        C5413WKa wKa = new C5413WKa(-1);
        if (i == 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT on ");
            sb.append(str);
            sb.append(" failed (row existed, ignoring)");
            return (C5413WKa) wKa.a(new C5529_Ka(sb.toString(), th, str2));
        } else if (i != 5) {
            return (C5413WKa) wKa.a(new C5529_Ka(th, str2));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("REPLACE on ");
            sb2.append(str);
            sb2.append(" failed");
            return (C5413WKa) wKa.a(new C5529_Ka(sb2.toString(), th, str2));
        }
    }

    public long c() {
        return this.b;
    }
}
