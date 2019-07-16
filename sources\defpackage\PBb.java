package defpackage;

import com.soundcloud.flippernative.BuildConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: PBb reason: default package */
/* compiled from: ZoneOffset */
public final class PBb extends NBb implements C7036oDb, C7105pDb, Comparable<PBb>, Serializable {
    public static final CDb<PBb> c = new OBb();
    private static final ConcurrentMap<Integer, PBb> d = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap<String, PBb> e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final PBb f = a(0);
    public static final PBb g = a(-64800);
    public static final PBb h = a(64800);
    private final int i;
    private final transient String j;

    private PBb(int i2) {
        this.i = i2;
        this.j = b(i2);
    }

    private static int a(CharSequence charSequence, int i2, boolean z) {
        if (!z || charSequence.charAt(i2 - 1) == ':') {
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence.charAt(i2 + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - '0') * 10) + (charAt2 - '0');
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ID for ZoneOffset, non numeric characters found: ");
            sb.append(charSequence);
            throw new C5687cBb(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid ID for ZoneOffset, colon not found when expected: ");
        sb2.append(charSequence);
        throw new C5687cBb(sb2.toString());
    }

    private static int b(int i2, int i3, int i4) {
        return (i2 * 3600) + (i3 * 60) + i4;
    }

    private static String b(int i2) {
        if (i2 == 0) {
            return "Z";
        }
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder();
        int i3 = abs / 3600;
        int i4 = (abs / 60) % 60;
        sb.append(i2 < 0 ? "-" : "+");
        sb.append(i3 < 10 ? BuildConfig.VERSION_NAME : "");
        sb.append(i3);
        String str = ":0";
        String str2 = ":";
        sb.append(i4 < 10 ? str : str2);
        sb.append(i4);
        int i5 = abs % 60;
        if (i5 != 0) {
            if (i5 >= 10) {
                str = str2;
            }
            sb.append(str);
            sb.append(i5);
        }
        return sb.toString();
    }

    private static void c(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            StringBuilder sb = new StringBuilder();
            sb.append("Zone offset hours not in valid range: value ");
            sb.append(i2);
            sb.append(" is not in the range -18 to 18");
            throw new C5687cBb(sb.toString());
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                throw new C5687cBb("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                throw new C5687cBb("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            throw new C5687cBb("Zone offset minutes and seconds must have the same sign");
        }
        String str = " is not in the range 0 to 59";
        if (Math.abs(i3) > 59) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Zone offset minutes not in valid range: abs(value) ");
            sb2.append(Math.abs(i3));
            sb2.append(str);
            throw new C5687cBb(sb2.toString());
        } else if (Math.abs(i4) > 59) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Zone offset seconds not in valid range: abs(value) ");
            sb3.append(Math.abs(i4));
            sb3.append(str);
            throw new C5687cBb(sb3.toString());
        } else if (Math.abs(i2) != 18) {
        } else {
            if (Math.abs(i3) > 0 || Math.abs(i4) > 0) {
                throw new C5687cBb("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    public static PBb of(String str) {
        int i2;
        int i3;
        int i4;
        char charAt;
        C6355eDb.a(str, "offsetId");
        PBb pBb = (PBb) e.get(str);
        if (pBb != null) {
            return pBb;
        }
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            sb.append(BuildConfig.VERSION_NAME);
            sb.append(str.charAt(1));
            str = sb.toString();
        } else if (length != 3) {
            if (length == 5) {
                i4 = a((CharSequence) str, 1, false);
                i3 = a((CharSequence) str, 3, false);
            } else if (length != 6) {
                if (length == 7) {
                    i4 = a((CharSequence) str, 1, false);
                    i3 = a((CharSequence) str, 3, false);
                    i2 = a((CharSequence) str, 5, false);
                } else if (length == 9) {
                    i4 = a((CharSequence) str, 1, false);
                    i3 = a((CharSequence) str, 4, true);
                    i2 = a((CharSequence) str, 7, true);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid ID for ZoneOffset, invalid format: ");
                    sb2.append(str);
                    throw new C5687cBb(sb2.toString());
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid ID for ZoneOffset, plus/minus not found when expected: ");
                    sb3.append(str);
                    throw new C5687cBb(sb3.toString());
                } else if (charAt == '-') {
                    return a(-i4, -i3, -i2);
                } else {
                    return a(i4, i3, i2);
                }
            } else {
                i4 = a((CharSequence) str, 1, false);
                i3 = a((CharSequence) str, 4, true);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        i4 = a((CharSequence) str, 1, false);
        i3 = 0;
        i2 = 0;
        charAt = str.charAt(0);
        if (charAt == '+') {
        }
        if (charAt == '-') {
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new FBb(8, this);
    }

    public int d() {
        return this.i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBb)) {
            return false;
        }
        if (this.i != ((PBb) obj).i) {
            z = false;
        }
        return z;
    }

    public String getId() {
        return this.j;
    }

    public int hashCode() {
        return this.i;
    }

    public String toString() {
        return this.j;
    }

    public long d(C7381tDb tdb) {
        if (tdb == C6423fDb.OFFSET_SECONDS) {
            return (long) this.i;
        }
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new C5687cBb(sb.toString());
    }

    public static PBb a(int i2, int i3, int i4) {
        c(i2, i3, i4);
        return a(b(i2, i3, i4));
    }

    public static PBb a(C7036oDb odb) {
        PBb pBb = (PBb) odb.a(BDb.d());
        if (pBb != null) {
            return pBb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain ZoneOffset from TemporalAccessor: ");
        sb.append(odb);
        sb.append(", type ");
        sb.append(odb.getClass().getName());
        throw new C5687cBb(sb.toString());
    }

    public NDb b() {
        return NDb.a(this);
    }

    public static PBb a(int i2) {
        if (Math.abs(i2) > 64800) {
            throw new C5687cBb("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i2 % 900 != 0) {
            return new PBb(i2);
        } else {
            Integer valueOf = Integer.valueOf(i2);
            PBb pBb = (PBb) d.get(valueOf);
            if (pBb == null) {
                d.putIfAbsent(valueOf, new PBb(i2));
                pBb = (PBb) d.get(valueOf);
                e.putIfAbsent(pBb.getId(), pBb);
            }
            return pBb;
        }
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (tdb != C6423fDb.OFFSET_SECONDS) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public int c(C7381tDb tdb) {
        if (tdb == C6423fDb.OFFSET_SECONDS) {
            return this.i;
        }
        if (!(tdb instanceof C6423fDb)) {
            return a(tdb).a(d(tdb), tdb);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void b(DataOutput dataOutput) throws IOException {
        int i2 = this.i;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    public FDb a(C7381tDb tdb) {
        if (tdb == C6423fDb.OFFSET_SECONDS) {
            return tdb.range();
        }
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.d() || cDb == BDb.f()) {
            return this;
        }
        if (cDb == BDb.b() || cDb == BDb.c() || cDb == BDb.e() || cDb == BDb.a() || cDb == BDb.g()) {
            return null;
        }
        return cDb.a(this);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.OFFSET_SECONDS, (long) this.i);
    }

    /* renamed from: a */
    public int compareTo(PBb pBb) {
        return pBb.i - this.i;
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        b(dataOutput);
    }

    static PBb a(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? a(dataInput.readInt()) : a(readByte * 900);
    }
}
