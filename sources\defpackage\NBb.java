package defpackage;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: NBb reason: default package */
/* compiled from: ZoneId */
public abstract class NBb implements Serializable {
    public static final CDb<NBb> a = new MBb();
    public static final Map<String, String> b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        b = Collections.unmodifiableMap(hashMap);
    }

    NBb() {
        if (getClass() != PBb.class && getClass() != QBb.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static Set<String> a() {
        return new HashSet(QDb.a());
    }

    public static NBb of(String str) {
        C6355eDb.a(str, "zoneId");
        if (str.equals("Z")) {
            return PBb.f;
        }
        if (str.length() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid zone: ");
            sb.append(str);
            throw new C5687cBb(sb.toString());
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return PBb.of(str);
        } else {
            if (!str.equals("UTC") && !str.equals("GMT")) {
                String str2 = "UT";
                if (!str.equals(str2)) {
                    if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                        PBb of = PBb.of(str.substring(3));
                        if (of.d() == 0) {
                            return new QBb(str.substring(0, 3), of.b());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str.substring(0, 3));
                        sb2.append(of.getId());
                        return new QBb(sb2.toString(), of.b());
                    } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                        return QBb.a(str, true);
                    } else {
                        PBb of2 = PBb.of(str.substring(2));
                        if (of2.d() == 0) {
                            return new QBb(str2, of2.b());
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(of2.getId());
                        return new QBb(sb3.toString(), of2.b());
                    }
                }
            }
            return new QBb(str, PBb.f.b());
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(DataOutput dataOutput) throws IOException;

    public abstract NDb b();

    public NBb c() {
        try {
            NDb b2 = b();
            if (b2.a()) {
                return b2.a(C6623iBb.a);
            }
        } catch (ODb unused) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NBb)) {
            return false;
        }
        return getId().equals(((NBb) obj).getId());
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }

    public static NBb a(String str, PBb pBb) {
        C6355eDb.a(str, "prefix");
        C6355eDb.a(pBb, "offset");
        if (str.length() == 0) {
            return pBb;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid prefix, must be GMT, UTC or UT: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (pBb.d() == 0) {
            return new QBb(str, pBb.b());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(pBb.getId());
            return new QBb(sb2.toString(), pBb.b());
        }
    }

    public static NBb a(C7036oDb odb) {
        NBb nBb = (NBb) odb.a(BDb.f());
        if (nBb != null) {
            return nBb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain ZoneId from TemporalAccessor: ");
        sb.append(odb);
        sb.append(", type ");
        sb.append(odb.getClass().getName());
        throw new C5687cBb(sb.toString());
    }
}
