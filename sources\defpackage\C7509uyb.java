package defpackage;

import java.io.IOException;

/* renamed from: uyb reason: default package and case insensitive filesystem */
/* compiled from: Protocol */
public enum C7509uyb {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    private final String h;

    private C7509uyb(String str) {
        this.h = str;
    }

    public static C7509uyb a(String str) throws IOException {
        if (str.equals(HTTP_1_0.h)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.h)) {
            return HTTP_1_1;
        }
        if (str.equals(H2_PRIOR_KNOWLEDGE.h)) {
            return H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals(HTTP_2.h)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.h)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.h)) {
            return QUIC;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected protocol: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    public String toString() {
        return this.h;
    }
}
