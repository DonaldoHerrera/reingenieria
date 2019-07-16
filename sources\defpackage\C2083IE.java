package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: IE reason: default package and case insensitive filesystem */
public final class C2083IE {
    private static final String[] a = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private final String c;
    private final String d;
    private final String e;
    private final Date f;
    private final long g;
    private final long h;

    private C2083IE(String str, String str2, String str3, Date date, long j, long j2) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = date;
        this.g = j;
        this.h = j2;
    }

    static C2083IE a(Map<String, String> map) throws C2044GE {
        String[] strArr;
        String str = "triggerEvent";
        ArrayList arrayList = new ArrayList();
        for (String str2 : a) {
            if (!map.containsKey(str2)) {
                arrayList.add(str2);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                C2083IE ie = new C2083IE((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey(str) ? (String) map.get(str) : "", b.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
                return ie;
            } catch (ParseException e2) {
                throw new C2044GE("Could not process experiment: parsing experiment start time failed.", e2);
            } catch (NumberFormatException e3) {
                throw new C2044GE("Could not process experiment: one of the durations could not be converted into a long.", e3);
            }
        } else {
            throw new C2044GE(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final String c() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final long d() {
        return this.f.getTime();
    }

    /* access modifiers changed from: 0000 */
    public final long e() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public final long f() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.c;
    }
}
