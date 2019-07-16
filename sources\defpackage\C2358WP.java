package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/* renamed from: WP reason: default package and case insensitive filesystem */
/* compiled from: Token */
public class C2358WP implements Serializable {
    public static final C2358WP a = new C2358WP(null, null);
    private final Map<String, String> b;
    private String c;
    private String d;
    private long e;
    private String f;

    public C2358WP(String str, String str2) {
        this(str, str2, null);
    }

    public String a() {
        return this.c;
    }

    public long b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.f;
    }

    public boolean e() {
        return (this.c == null && this.d == null) ? false : true;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof C2358WP)) {
            return super.equals(obj);
        }
        C2358WP wp = (C2358WP) obj;
        String str = this.c;
        if (str == null ? wp.c != null : !str.equals(wp.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null ? wp.d != null : !str2.equals(wp.d)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null ? wp.f != null : !str3.equals(wp.f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Token{access='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", refresh='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", scope='");
        sb.append(this.f);
        sb.append('\'');
        sb.append(", expires=");
        long j = this.e;
        sb.append(j == 0 ? "never" : new Date(j));
        sb.append('}');
        return sb.toString();
    }

    public C2358WP(String str, String str2, String str3) {
        this.b = new T();
        this.c = str;
        this.d = str2;
        this.f = str3;
    }

    @JsonCreator
    public C2358WP(@JsonProperty("access_token") String str, @JsonProperty("refresh_token") String str2, @JsonProperty("scope") String str3, @JsonProperty("expires_in") long j) {
        this(str, str2, str3);
        this.e = j;
    }
}
