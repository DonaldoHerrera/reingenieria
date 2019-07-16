package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: rCb reason: default package and case insensitive filesystem */
/* compiled from: JapaneseChronology */
public final class C7241rCb extends C6625iCb implements Serializable {
    static final Locale e;
    public static final C7241rCb f = new C7241rCb();
    private static final Map<String, String[]> g = new HashMap();
    private static final Map<String, String[]> h = new HashMap();
    private static final Map<String, String[]> i = new HashMap();

    static {
        String str = "JP";
        String str2 = "ja";
        e = new Locale(str2, str, str);
        String str3 = "en";
        g.put(str3, new String[]{"Unknown", "K", "M", "T", "S", "H"});
        g.put(str2, new String[]{"Unknown", "K", "M", "T", "S", "H"});
        h.put(str3, new String[]{"Unknown", "K", "M", "T", "S", "H"});
        h.put(str2, new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        i.put(str3, new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        i.put(str2, new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private C7241rCb() {
    }

    private Object readResolve() {
        return f;
    }

    public ZBb<C7379tCb> c(C7036oDb odb) {
        return super.c(odb);
    }

    public String getCalendarType() {
        return "japanese";
    }

    public String getId() {
        return "Japanese";
    }

    public C7379tCb a(C7036oDb odb) {
        if (odb instanceof C7379tCb) {
            return (C7379tCb) odb;
        }
        return new C7379tCb(C6827lBb.a(odb));
    }

    public C7379tCb date(int i2, int i3, int i4) {
        return new C7379tCb(C6827lBb.a(i2, i3, i4));
    }

    public C7448uCb eraOf(int i2) {
        return C7448uCb.a(i2);
    }

    public C6353eCb<C7379tCb> a(C6623iBb ibb, NBb nBb) {
        return super.a(ibb, nBb);
    }

    public int a(C6693jCb jcb, int i2) {
        if (jcb instanceof C7448uCb) {
            C7448uCb ucb = (C7448uCb) jcb;
            int O = (ucb.K().O() + i2) - 1;
            FDb.a(1, (long) ((ucb.J().O() - ucb.K().O()) + 1)).b((long) i2, C6423fDb.YEAR_OF_ERA);
            return O;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public FDb a(C6423fDb fdb) {
        switch (C7172qCb.a[fdb.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return fdb.range();
            default:
                Calendar instance = Calendar.getInstance(e);
                int i2 = 0;
                switch (C7172qCb.a[fdb.ordinal()]) {
                    case 19:
                        C7448uCb[] L = C7448uCb.L();
                        return FDb.a((long) L[0].getValue(), (long) L[L.length - 1].getValue());
                    case 20:
                        C7448uCb[] L2 = C7448uCb.L();
                        return FDb.a((long) C7379tCb.b.O(), (long) L2[L2.length - 1].J().O());
                    case 21:
                        C7448uCb[] L3 = C7448uCb.L();
                        int O = (L3[L3.length - 1].J().O() - L3[L3.length - 1].K().O()) + 1;
                        int i3 = BaseClientBuilder.API_PRIORITY_OTHER;
                        while (i2 < L3.length) {
                            i3 = Math.min(i3, (L3[i2].J().O() - L3[i2].K().O()) + 1);
                            i2++;
                        }
                        return FDb.a(1, 6, (long) i3, (long) O);
                    case 22:
                        return FDb.a((long) (instance.getMinimum(2) + 1), (long) (instance.getGreatestMinimum(2) + 1), (long) (instance.getLeastMaximum(2) + 1), (long) (instance.getMaximum(2) + 1));
                    case 23:
                        C7448uCb[] L4 = C7448uCb.L();
                        int i4 = 366;
                        while (i2 < L4.length) {
                            i4 = Math.min(i4, (L4[i2].K().lengthOfYear() - L4[i2].K().L()) + 1);
                            i2++;
                        }
                        return FDb.a(1, (long) i4, 366);
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unimplementable field: ");
                        sb.append(fdb);
                        throw new UnsupportedOperationException(sb.toString());
                }
        }
    }
}
