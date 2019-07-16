package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Eyb reason: default package */
/* compiled from: TlsVersion */
public enum Eyb {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String g;

    private Eyb(String str) {
        this.g = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    public static Eyb a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            c = 2;
                            break;
                        }
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            c = 1;
                            break;
                        }
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            c = 0;
                            break;
                        }
                }
            } else if (str.equals("TLSv1")) {
                c = 3;
                if (c == 0) {
                    return TLS_1_3;
                }
                if (c == 1) {
                    return TLS_1_2;
                }
                if (c == 2) {
                    return TLS_1_1;
                }
                if (c == 3) {
                    return TLS_1_0;
                }
                if (c == 4) {
                    return SSL_3_0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected TLS version: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (str.equals("SSLv3")) {
            c = 4;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    static List<Eyb> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String a() {
        return this.g;
    }
}
