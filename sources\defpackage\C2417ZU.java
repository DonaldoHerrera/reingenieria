package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.List;

/* renamed from: ZU reason: default package and case insensitive filesystem */
/* compiled from: Feature.kt */
public final class C2417ZU {
    public List<? extends C2455aV> a;
    private final String b;
    private final boolean c;

    private C2417ZU(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final List<C2455aV> c() {
        List<? extends C2455aV> list = this.a;
        if (list != null) {
            return list;
        }
        C7471uYa.b("plans");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2417ZU) {
                C2417ZU zu = (C2417ZU) obj;
                if (C7471uYa.a((Object) this.b, (Object) zu.b)) {
                    if (this.c == zu.c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Feature(name=");
        sb.append(this.b);
        sb.append(", enabled=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 != null) goto L_0x0017;
     */
    @JsonCreator
    public C2417ZU(@JsonProperty("name") String str, @JsonProperty("enabled") boolean z, @JsonProperty("plans") List<String> list) {
        List<? extends C2455aV> list2;
        C7471uYa.b(str, "name");
        this(str, z);
        if (list != null) {
            list2 = C2455aV.g.a((Collection<String>) list);
        }
        list2 = C6918mWa.a();
        this.a = list2;
    }
}
