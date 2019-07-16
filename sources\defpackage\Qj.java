package defpackage;

import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.internal.ia;
import java.io.Serializable;

/* renamed from: Qj reason: default package */
/* compiled from: AccessTokenAppIdPair */
class Qj implements Serializable {
    private final String a;
    private final String b;

    /* renamed from: Qj$a */
    /* compiled from: AccessTokenAppIdPair */
    static class a implements Serializable {
        private final String a;
        private final String b;

        private Object readResolve() {
            return new Qj(this.a, this.b);
        }

        private a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public Qj(AccessToken accessToken) {
        this(accessToken.k(), B.f());
    }

    private Object writeReplace() {
        return new a(this.a, this.b);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Qj)) {
            return false;
        }
        Qj qj = (Qj) obj;
        if (ia.a(qj.a, this.a) && ia.a(qj.b, this.b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public Qj(String str, String str2) {
        if (ia.b(str)) {
            str = null;
        }
        this.a = str;
        this.b = str2;
    }
}
