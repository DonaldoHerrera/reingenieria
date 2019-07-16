package defpackage;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: JCb reason: default package */
/* compiled from: DateTimeFormatter */
public final class JCb {
    public static final JCb a;
    public static final JCb b;
    public static final JCb c;
    public static final JCb d;
    public static final JCb e;
    public static final JCb f;
    public static final JCb g;
    public static final JCb h;
    public static final JCb i;
    public static final JCb j;
    public static final JCb k;
    public static final JCb l;
    public static final JCb m;
    public static final JCb n;
    public static final JCb o;
    private static final CDb<EBb> p = new HCb();
    private static final CDb<Boolean> q = new ICb();
    private final b r;
    private final Locale s;
    private final WCb t;
    private final XCb u;
    private final Set<C7381tDb> v;
    private final C6625iCb w;
    private final NBb x;

    static {
        OCb oCb = new OCb();
        oCb.a((C7381tDb) C6423fDb.YEAR, 4, 10, YCb.EXCEEDS_PAD);
        oCb.a('-');
        oCb.a((C7381tDb) C6423fDb.MONTH_OF_YEAR, 2);
        oCb.a('-');
        oCb.a((C7381tDb) C6423fDb.DAY_OF_MONTH, 2);
        a = oCb.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb2 = new OCb();
        oCb2.g();
        oCb2.a(a);
        oCb2.b();
        b = oCb2.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb3 = new OCb();
        oCb3.g();
        oCb3.a(a);
        oCb3.f();
        oCb3.b();
        c = oCb3.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb4 = new OCb();
        oCb4.a((C7381tDb) C6423fDb.HOUR_OF_DAY, 2);
        oCb4.a(':');
        oCb4.a((C7381tDb) C6423fDb.MINUTE_OF_HOUR, 2);
        oCb4.f();
        oCb4.a(':');
        oCb4.a((C7381tDb) C6423fDb.SECOND_OF_MINUTE, 2);
        oCb4.f();
        oCb4.a((C7381tDb) C6423fDb.NANO_OF_SECOND, 0, 9, true);
        d = oCb4.a(XCb.STRICT);
        OCb oCb5 = new OCb();
        oCb5.g();
        oCb5.a(d);
        oCb5.b();
        e = oCb5.a(XCb.STRICT);
        OCb oCb6 = new OCb();
        oCb6.g();
        oCb6.a(d);
        oCb6.f();
        oCb6.b();
        f = oCb6.a(XCb.STRICT);
        OCb oCb7 = new OCb();
        oCb7.g();
        oCb7.a(a);
        oCb7.a('T');
        oCb7.a(d);
        g = oCb7.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb8 = new OCb();
        oCb8.g();
        oCb8.a(g);
        oCb8.b();
        h = oCb8.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb9 = new OCb();
        oCb9.a(h);
        oCb9.f();
        oCb9.a('[');
        oCb9.h();
        oCb9.d();
        oCb9.a(']');
        i = oCb9.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb10 = new OCb();
        oCb10.a(g);
        oCb10.f();
        oCb10.b();
        oCb10.f();
        oCb10.a('[');
        oCb10.h();
        oCb10.d();
        oCb10.a(']');
        j = oCb10.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb11 = new OCb();
        oCb11.g();
        oCb11.a((C7381tDb) C6423fDb.YEAR, 4, 10, YCb.EXCEEDS_PAD);
        oCb11.a('-');
        oCb11.a((C7381tDb) C6423fDb.DAY_OF_YEAR, 3);
        oCb11.f();
        oCb11.b();
        k = oCb11.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb12 = new OCb();
        oCb12.g();
        oCb12.a(C6899mDb.d, 4, 10, YCb.EXCEEDS_PAD);
        oCb12.a("-W");
        oCb12.a(C6899mDb.c, 2);
        oCb12.a('-');
        oCb12.a((C7381tDb) C6423fDb.DAY_OF_WEEK, 1);
        oCb12.f();
        oCb12.b();
        l = oCb12.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        OCb oCb13 = new OCb();
        oCb13.g();
        oCb13.a();
        m = oCb13.a(XCb.STRICT);
        OCb oCb14 = new OCb();
        oCb14.g();
        oCb14.a((C7381tDb) C6423fDb.YEAR, 4);
        oCb14.a((C7381tDb) C6423fDb.MONTH_OF_YEAR, 2);
        oCb14.a((C7381tDb) C6423fDb.DAY_OF_MONTH, 2);
        oCb14.f();
        oCb14.a("+HHMMss", "Z");
        n = oCb14.a(XCb.STRICT).a((C6625iCb) C7034oCb.e);
        HashMap hashMap = new HashMap();
        Long valueOf = Long.valueOf(1);
        hashMap.put(valueOf, "Mon");
        Long valueOf2 = Long.valueOf(2);
        hashMap.put(valueOf2, "Tue");
        Long valueOf3 = Long.valueOf(3);
        hashMap.put(valueOf3, "Wed");
        Long valueOf4 = Long.valueOf(4);
        hashMap.put(valueOf4, "Thu");
        Long valueOf5 = Long.valueOf(5);
        hashMap.put(valueOf5, "Fri");
        Long valueOf6 = Long.valueOf(6);
        hashMap.put(valueOf6, "Sat");
        hashMap.put(Long.valueOf(7), "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(valueOf, "Jan");
        hashMap2.put(valueOf2, "Feb");
        hashMap2.put(valueOf3, "Mar");
        hashMap2.put(valueOf4, "Apr");
        hashMap2.put(valueOf5, "May");
        hashMap2.put(valueOf6, "Jun");
        hashMap2.put(Long.valueOf(7), "Jul");
        hashMap2.put(Long.valueOf(8), "Aug");
        hashMap2.put(Long.valueOf(9), "Sep");
        hashMap2.put(Long.valueOf(10), "Oct");
        hashMap2.put(Long.valueOf(11), "Nov");
        hashMap2.put(Long.valueOf(12), "Dec");
        OCb oCb15 = new OCb();
        oCb15.g();
        oCb15.i();
        oCb15.f();
        oCb15.a((C7381tDb) C6423fDb.DAY_OF_WEEK, (Map<Long, String>) hashMap);
        oCb15.a(", ");
        oCb15.e();
        oCb15.a((C7381tDb) C6423fDb.DAY_OF_MONTH, 1, 2, YCb.NOT_NEGATIVE);
        oCb15.a(' ');
        oCb15.a((C7381tDb) C6423fDb.MONTH_OF_YEAR, (Map<Long, String>) hashMap2);
        oCb15.a(' ');
        oCb15.a((C7381tDb) C6423fDb.YEAR, 4);
        oCb15.a(' ');
        oCb15.a((C7381tDb) C6423fDb.HOUR_OF_DAY, 2);
        oCb15.a(':');
        oCb15.a((C7381tDb) C6423fDb.MINUTE_OF_HOUR, 2);
        oCb15.f();
        oCb15.a(':');
        oCb15.a((C7381tDb) C6423fDb.SECOND_OF_MINUTE, 2);
        oCb15.e();
        oCb15.a(' ');
        oCb15.a("+HHMM", "GMT");
        o = oCb15.a(XCb.SMART).a((C6625iCb) C7034oCb.e);
    }

    JCb(b bVar, Locale locale, WCb wCb, XCb xCb, Set<C7381tDb> set, C6625iCb icb, NBb nBb) {
        C6355eDb.a(bVar, "printerParser");
        this.r = bVar;
        C6355eDb.a(locale, "locale");
        this.s = locale;
        C6355eDb.a(wCb, "decimalStyle");
        this.t = wCb;
        C6355eDb.a(xCb, "resolverStyle");
        this.u = xCb;
        this.v = set;
        this.w = icb;
        this.x = nBb;
    }

    public static JCb a(String str, Locale locale) {
        OCb oCb = new OCb();
        oCb.b(str);
        return oCb.a(locale);
    }

    public WCb b() {
        return this.t;
    }

    public Locale c() {
        return this.s;
    }

    public NBb d() {
        return this.x;
    }

    public String toString() {
        String bVar = this.r.toString();
        return bVar.startsWith("[") ? bVar : bVar.substring(1, bVar.length() - 1);
    }

    private a b(CharSequence charSequence, ParsePosition parsePosition) {
        C6355eDb.a(charSequence, "text");
        C6355eDb.a(parsePosition, "position");
        RCb rCb = new RCb(this);
        int a2 = this.r.a(rCb, charSequence, parsePosition.getIndex());
        if (a2 < 0) {
            parsePosition.setErrorIndex(~a2);
            return null;
        }
        parsePosition.setIndex(a2);
        return rCb.i();
    }

    public C6625iCb a() {
        return this.w;
    }

    public JCb a(C6625iCb icb) {
        if (C6355eDb.a((Object) this.w, (Object) icb)) {
            return this;
        }
        JCb jCb = new JCb(this.r, this.s, this.t, this.u, this.v, icb, this.x);
        return jCb;
    }

    public JCb a(XCb xCb) {
        C6355eDb.a(xCb, "resolverStyle");
        if (C6355eDb.a((Object) this.u, (Object) xCb)) {
            return this;
        }
        JCb jCb = new JCb(this.r, this.s, this.t, xCb, this.v, this.w, this.x);
        return jCb;
    }

    public String a(C7036oDb odb) {
        StringBuilder sb = new StringBuilder(32);
        a(odb, (Appendable) sb);
        return sb.toString();
    }

    public void a(C7036oDb odb, Appendable appendable) {
        C6355eDb.a(odb, "temporal");
        C6355eDb.a(appendable, "appendable");
        try {
            UCb uCb = new UCb(odb, this);
            if (appendable instanceof StringBuilder) {
                this.r.a(uCb, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.r.a(uCb, sb);
            appendable.append(sb);
        } catch (IOException e2) {
            throw new C5687cBb(e2.getMessage(), e2);
        }
    }

    public <T> T a(CharSequence charSequence, CDb<T> cDb) {
        C6355eDb.a(charSequence, "text");
        C6355eDb.a(cDb, C1325gg.TYPE);
        try {
            GCb a2 = a(charSequence, (ParsePosition) null);
            a2.a(this.u, this.v);
            return a2.b(cDb);
        } catch (SCb e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw a(charSequence, e3);
        }
    }

    private SCb a(CharSequence charSequence, RuntimeException runtimeException) {
        String str;
        if (charSequence.length() > 64) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence.subSequence(0, 64).toString());
            sb.append("...");
            str = sb.toString();
        } else {
            str = charSequence.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Text '");
        sb2.append(str);
        sb2.append("' could not be parsed: ");
        sb2.append(runtimeException.getMessage());
        return new SCb(sb2.toString(), charSequence, 0, runtimeException);
    }

    private GCb a(CharSequence charSequence, ParsePosition parsePosition) {
        String str;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        a b2 = b(charSequence, parsePosition2);
        if (b2 != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return b2.K();
        }
        if (charSequence.length() > 64) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence.subSequence(0, 64).toString());
            sb.append("...");
            str = sb.toString();
        } else {
            str = charSequence.toString();
        }
        String str2 = "Text '";
        if (parsePosition2.getErrorIndex() >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append("' could not be parsed at index ");
            sb2.append(parsePosition2.getErrorIndex());
            throw new SCb(sb2.toString(), charSequence, parsePosition2.getErrorIndex());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(str);
        sb3.append("' could not be parsed, unparsed text found at index ");
        sb3.append(parsePosition2.getIndex());
        throw new SCb(sb3.toString(), charSequence, parsePosition2.getIndex());
    }

    /* access modifiers changed from: 0000 */
    public b a(boolean z) {
        return this.r.a(z);
    }
}
