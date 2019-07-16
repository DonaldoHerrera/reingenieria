package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: QBb reason: default package */
/* compiled from: ZoneRegion */
final class QBb extends NBb implements Serializable {
    private static final Pattern c = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private final String d;
    private final transient NDb e;

    QBb(String str, NDb nDb) {
        this.d = str;
        this.e = nDb;
    }

    private static QBb a(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ID for region-based ZoneId, invalid format: ");
            sb.append(str);
            throw new C5687cBb(sb.toString());
        }
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
                    return a(str, false);
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

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(7, this);
    }

    public NDb b() {
        NDb nDb = this.e;
        return nDb != null ? nDb : QDb.a(this.d, false);
    }

    public String getId() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public void b(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.d);
    }

    static QBb a(String str, boolean z) {
        C6355eDb.a(str, "zoneId");
        if (str.length() < 2 || !c.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ID for region-based ZoneId, invalid format: ");
            sb.append(str);
            throw new C5687cBb(sb.toString());
        }
        NDb nDb = null;
        try {
            nDb = QDb.a(str, true);
        } catch (ODb e2) {
            if (str.equals("GMT0")) {
                nDb = PBb.f.b();
            } else if (z) {
                throw e2;
            }
        }
        return new QBb(str, nDb);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        b(dataOutput);
    }

    static NBb a(DataInput dataInput) throws IOException {
        return a(dataInput.readUTF());
    }
}
