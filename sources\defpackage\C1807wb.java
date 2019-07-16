package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: wb reason: default package and case insensitive filesystem */
/* compiled from: FontRequest */
public final class C1807wb {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e = 0;
    private final String f;

    public C1807wb(String str, String str2, String str3, List<List<byte[]>> list) {
        C0263Ub.a(str);
        this.a = str;
        C0263Ub.a(str2);
        this.b = str2;
        C0263Ub.a(str3);
        this.c = str3;
        C0263Ub.a(list);
        this.d = list;
        StringBuilder sb = new StringBuilder(this.a);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.b);
        sb.append(str4);
        sb.append(this.c);
        this.f = sb.toString();
    }

    public List<List<byte[]>> a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.b);
        sb2.append(", mQuery: ");
        sb2.append(this.c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
