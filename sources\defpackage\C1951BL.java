package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@EVa(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0016\u0018\u0000 '2\u00020\u0001:\u0001'BK\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u0016\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0012J\b\u0010\u001b\u001a\u00020\u0011H\u0012J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\bH\u0012J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\bH\u0012J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J$\u0010#\u001a\u00020$2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020!0&H\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/soundcloud/android/analytics/BatchTrackingApi;", "Lcom/soundcloud/android/analytics/TrackingApi;", "httpClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "batchUrl", "", "batchSize", "", "devicePropertiesProvider", "Lcom/soundcloud/android/analytics/TrackingApi$DevicePropertiesProvider;", "authenticationProvider", "Lcom/soundcloud/android/analytics/TrackingApi$AuthenticationProvider;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "flushEventLoggerInstantlyPref", "Lcom/soundcloud/android/storage/prefs/Preference;", "", "(Ldagger/Lazy;Ljava/lang/String;ILcom/soundcloud/android/analytics/TrackingApi$DevicePropertiesProvider;Lcom/soundcloud/android/analytics/TrackingApi$AuthenticationProvider;Lcom/soundcloud/android/error/reporting/ErrorReporter;Lcom/soundcloud/android/storage/prefs/Preference;)V", "createRequest", "Lokhttp3/Request;", "body", "Lokhttp3/RequestBody;", "createRequestBody", "eventJsonObjects", "Ljava/util/ArrayList;", "Lorg/json/JSONObject;", "isDebugTrackingEnabled", "isIgnoredEvent", "status", "isSuccessCodeOrIgnored", "pushToRemote", "", "Lcom/soundcloud/android/analytics/TrackingRecord;", "events", "sendBatch", "", "successes", "", "Companion", "analytics-base_release"}, mv = {1, 1, 15})
/* renamed from: BL reason: default package and case insensitive filesystem */
/* compiled from: BatchTrackingApi.kt */
public class C1951BL implements C1932AM {
    public static final a a = new a(null);
    private final C4806CMa<C7440tyb> b;
    private final String c;
    private final int d;
    private final b e;
    private final defpackage.C1932AM.a f;
    private final C3469VY g;
    private final C7648wza<Boolean> h;

    /* renamed from: BL$a */
    /* compiled from: BatchTrackingApi.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C1951BL(C4806CMa<C7440tyb> cMa, String str, int i, b bVar, defpackage.C1932AM.a aVar, C3469VY vy, C7648wza<Boolean> wza) {
        C7471uYa.b(cMa, "httpClient");
        C7471uYa.b(str, "batchUrl");
        C7471uYa.b(bVar, "devicePropertiesProvider");
        C7471uYa.b(aVar, "authenticationProvider");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(wza, "flushEventLoggerInstantlyPref");
        this.b = cMa;
        this.c = str;
        this.d = i;
        this.e = bVar;
        this.f = aVar;
        this.g = vy;
        this.h = wza;
    }

    private boolean a(int i) {
        return i == 400;
    }

    private boolean b(int i) {
        return i >= 200 && i < 500;
    }

    public List<C2110JM> a(List<C2110JM> list) {
        C7471uYa.b(list, "events");
        ArrayList arrayList = new ArrayList(list.size());
        int i = a() ? 1 : this.d;
        int i2 = 0;
        do {
            int i3 = i2 * i;
            try {
                a(list.subList(i3, Math.min(list.size(), i3 + i)), arrayList);
                i2++;
            } catch (IOException e2) {
                b a2 = SDb.a(C2428_L.a);
                StringBuilder sb = new StringBuilder();
                sb.append("Failed with IOException pushing event count: ");
                sb.append(list.size());
                a2.b(e2, sb.toString(), new Object[0]);
            } catch (JSONException e3) {
                defpackage.C3469VY.a.a(this.g, e3, null, 2, null);
                b a3 = SDb.a(C2428_L.a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed with JSONException, pushing event count: ");
                sb2.append(list.size());
                a3.a((Throwable) e3, sb2.toString(), new Object[0]);
            }
        } while (i2 * i < list.size());
        return arrayList;
    }

    private void a(List<C2110JM> list, List<C2110JM> list2) throws IOException, JSONException {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (C2110JM jm : list) {
            try {
                arrayList.add(new JSONObject(jm.b()));
                arrayList2.add(jm);
            } catch (JSONException e2) {
                SDb.a(C2428_L.a).a((Throwable) e2);
            }
        }
        if (!C7471uYa.a((Object) arrayList2, (Object) list)) {
            defpackage.C3469VY.a.a(this.g, new C2091IM(), null, 2, null);
        }
        Ayb execute = ((C7440tyb) this.b.get()).a(a(a(arrayList))).execute();
        try {
            int d2 = execute.d();
            b a2 = SDb.a(C2428_L.a);
            StringBuilder sb = new StringBuilder();
            sb.append("Tracking event response: ");
            sb.append(execute);
            sb.append(";body=");
            Cyb a3 = execute.a();
            sb.append(a3 != null ? a3.string() : null);
            a2.a(sb.toString(), new Object[0]);
            if (a()) {
                if (a(d2)) {
                    throw new C2011EL(list);
                }
            }
            if (b(d2)) {
                list2.addAll(arrayList2);
            } else {
                C3469VY vy = this.g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tracking request failed with unexpected status code: ");
                sb2.append(execute);
                sb2.append("; recordCount = ");
                sb2.append(list.size());
                defpackage.C3469VY.a.a(vy, new Exception(sb2.toString()), null, 2, null);
            }
        } finally {
            Cyb a4 = execute.a();
            if (a4 != null) {
                a4.close();
            }
        }
    }

    private C7647wyb a(C7854zyb zyb) {
        defpackage.C7647wyb.a aVar = new defpackage.C7647wyb.a();
        aVar.b(this.c);
        aVar.a("User-Agent", this.e.a());
        String a2 = this.f.a();
        if (a2 != null) {
            aVar.a("Authorization", a2);
        }
        aVar.b(zyb);
        C7647wyb a3 = aVar.a();
        C7471uYa.a((Object) a3, "Request.Builder().apply …t(body)\n        }.build()");
        return a3;
    }

    private C7854zyb a(ArrayList<JSONObject> arrayList) {
        b a2 = SDb.a(C2428_L.a);
        StringBuilder sb = new StringBuilder();
        sb.append("event payload: ");
        sb.append(new JSONArray(arrayList));
        a2.a(sb.toString(), new Object[0]);
        C7233qyb b2 = C7233qyb.b("application/json");
        String jSONArray = new JSONArray(arrayList).toString();
        C7471uYa.a((Object) jSONArray, "JSONArray(eventJsonObjects).toString()");
        String name = C6411exb.a.name();
        C7471uYa.a((Object) name, "Charsets.UTF_8.name()");
        Charset forName = Charset.forName(name);
        C7471uYa.a((Object) forName, "Charset.forName(charsetName)");
        if (jSONArray != null) {
            byte[] bytes = jSONArray.getBytes(forName);
            C7471uYa.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            C7854zyb a3 = C7854zyb.a(b2, bytes);
            C7471uYa.a((Object) a3, "RequestBody.create(Media…(Charsets.UTF_8.name())))");
            return a3;
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    private boolean a() {
        return this.e.b() && ((Boolean) this.h.getValue()).booleanValue();
    }
}
