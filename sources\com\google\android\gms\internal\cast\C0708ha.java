package com.google.android.gms.internal.cast;

import android.os.SystemClock;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.C0674g;
import com.google.android.gms.cast.C0676i;
import com.google.android.gms.cast.C0679l;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaQueueItem.a;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.cast.ha reason: case insensitive filesystem */
public final class C0708ha extends K {
    public static final String e = X.b("com.google.cast.media");
    @VisibleForTesting
    private final C0720na A = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na B = new C0720na(86400000);
    private long f;
    private MediaStatus g;
    /* access modifiers changed from: private */
    public Long h;
    private C0712ja i;
    @VisibleForTesting
    private final C0720na j = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na k = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na l = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na m = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na n = new C0720na(10000);
    @VisibleForTesting
    private final C0720na o = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na p = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na q = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na r = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na s = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na t = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na u = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na v = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na w = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na x = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na y = new C0720na(86400000);
    @VisibleForTesting
    private final C0720na z = new C0720na(86400000);

    public C0708ha(String str) {
        super(e, "MediaControlChannel", null);
        a(this.j);
        a(this.k);
        a(this.l);
        a(this.m);
        a(this.n);
        a(this.o);
        a(this.p);
        a(this.q);
        a(this.r);
        a(this.s);
        a(this.t);
        a(this.u);
        a(this.v);
        a(this.w);
        a(this.x);
        a(this.z);
        a(this.z);
        a(this.A);
        a(this.B);
        p();
    }

    private final void l() {
        C0712ja jaVar = this.i;
        if (jaVar != null) {
            jaVar.b();
        }
    }

    private final void m() {
        C0712ja jaVar = this.i;
        if (jaVar != null) {
            jaVar.d();
        }
    }

    private final void n() {
        C0712ja jaVar = this.i;
        if (jaVar != null) {
            jaVar.c();
        }
    }

    private final void o() {
        C0712ja jaVar = this.i;
        if (jaVar != null) {
            jaVar.e();
        }
    }

    private final void p() {
        this.f = 0;
        this.g = null;
        for (C0720na a : d()) {
            a.a(2002);
        }
    }

    private final long q() throws C0718ma {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus != null) {
            return mediaStatus.ka();
        }
        throw new C0718ma();
    }

    public final void a(C0712ja jaVar) {
        this.i = jaVar;
    }

    public final long b(C0722oa oaVar, JSONObject jSONObject) throws IllegalStateException, C0718ma {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put(C1325gg.TYPE, "PLAY");
            jSONObject2.put("mediaSessionId", q());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject2.toString(), c, null);
        this.l.a(c, oaVar);
        return c;
    }

    public final long c(C0722oa oaVar) throws C0718ma, IllegalStateException {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put(C1325gg.TYPE, "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", q());
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), c, null);
        this.x.a(c, oaVar);
        return c;
    }

    public final long e() {
        if (this.f != 0) {
            MediaStatus mediaStatus = this.g;
            if (mediaStatus != null) {
                AdBreakStatus F = mediaStatus.F();
                if (F == null) {
                    return 0;
                }
                AdBreakClipInfo G = this.g.G();
                if (G == null) {
                    return 0;
                }
                double aa = this.g.aa();
                double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                if (aa == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && this.g.ba() == 2) {
                    d = 1.0d;
                }
                return a(d, F.G(), G.H());
            }
        }
        return 0;
    }

    public final long f() {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus == null) {
            return 0;
        }
        C0674g X = mediaStatus.X();
        if (X == null) {
            return 0;
        }
        long a = X.a();
        if (!X.c()) {
            a = a(1.0d, a, -1);
        }
        return a;
    }

    public final long g() {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus == null) {
            return 0;
        }
        C0674g X = mediaStatus.X();
        if (X == null) {
            return 0;
        }
        long b = X.b();
        if (X.d()) {
            b = a(1.0d, b, -1);
        }
        if (X.c()) {
            b = Math.min(b, X.a());
        }
        return b;
    }

    public final long h() {
        MediaInfo i2 = i();
        if (i2 == null) {
            return 0;
        }
        Long l2 = this.h;
        if (l2 != null) {
            if (l2.equals(Long.valueOf(4294967296000L))) {
                if (this.g.X() != null) {
                    return Math.min(this.h.longValue(), f());
                }
                if (k() >= 0) {
                    return Math.min(this.h.longValue(), k());
                }
            }
            return this.h.longValue();
        } else if (this.f == 0) {
            return 0;
        } else {
            double aa = this.g.aa();
            long fa = this.g.fa();
            int ba = this.g.ba();
            if (aa == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || ba != 2) {
                return fa;
            }
            return a(aa, fa, i2.aa());
        }
    }

    public final MediaInfo i() {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.Z();
    }

    public final MediaStatus j() {
        return this.g;
    }

    public final long k() {
        MediaInfo i2 = i();
        if (i2 != null) {
            return i2.aa();
        }
        return 0;
    }

    public final long a(C0722oa oaVar, C0676i iVar) throws IllegalStateException, IllegalArgumentException {
        if (iVar.g() == null && iVar.i() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject jSONObject = new JSONObject();
        long c = c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put(C1325gg.TYPE, "LOAD");
            if (iVar.g() != null) {
                jSONObject.put("media", iVar.g().toJson());
            }
            if (iVar.i() != null) {
                jSONObject.put("queueData", iVar.i().a());
            }
            if (iVar.b() != null) {
                jSONObject.put("autoplay", iVar.b());
            }
            if (iVar.e() != -1) {
                jSONObject.put("currentTime", ((double) iVar.e()) / 1000.0d);
            }
            jSONObject.put("playbackRate", iVar.h());
            if (iVar.c() != null) {
                jSONObject.put("credentials", iVar.c());
            }
            if (iVar.d() != null) {
                jSONObject.put("credentialsType", iVar.d());
            }
            long[] a = iVar.a();
            if (a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < a.length; i2++) {
                    jSONArray.put(i2, a[i2]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject f2 = iVar.f();
            if (f2 != null) {
                jSONObject.put("customData", f2);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), c, null);
        this.j.a(c, oaVar);
        return c;
    }

    public final long b(C0722oa oaVar) throws IllegalStateException {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put(C1325gg.TYPE, "GET_STATUS");
            if (this.g != null) {
                jSONObject.put("mediaSessionId", this.g.ka());
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), c, null);
        this.q.a(c, oaVar);
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0211 A[Catch:{ JSONException -> 0x028e }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x021e A[Catch:{ JSONException -> 0x028e }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022b A[Catch:{ JSONException -> 0x028e }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0235 A[Catch:{ JSONException -> 0x028e }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x023c A[Catch:{ JSONException -> 0x028e }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0243 A[Catch:{ JSONException -> 0x028e }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x024a A[Catch:{ JSONException -> 0x028e }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x025d A[Catch:{ JSONException -> 0x028e }] */
    public final void b(String str) {
        char c;
        int i2;
        this.a.a("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(C1325gg.TYPE);
            long optLong = jSONObject.optLong("requestId", -1);
            char c2 = 65535;
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        c = 3;
                        break;
                    }
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        c = 7;
                        break;
                    }
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        c = 4;
                        break;
                    }
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        c = 2;
                        break;
                    }
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        c = 6;
                        break;
                    }
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        c = 1;
                        break;
                    }
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        c = 0;
                        break;
                    }
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        c = 5;
                        break;
                    }
            }
            c = 65535;
            String str2 = "itemIds";
            String str3 = "customData";
            switch (c) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean a = this.j.a(optLong);
                        int i3 = (this.o.a() && !this.o.a(optLong)) || (this.p.a() && !this.p.a(optLong)) ? 1 : 0;
                        if (!a) {
                            if (this.g != null) {
                                i2 = this.g.a(jSONObject2, i3);
                                if ((i2 & 1) != 0) {
                                    this.f = SystemClock.elapsedRealtime();
                                    o();
                                }
                                if ((i2 & 2) != 0) {
                                    this.f = SystemClock.elapsedRealtime();
                                    o();
                                }
                                if ((i2 & 128) != 0) {
                                    this.f = SystemClock.elapsedRealtime();
                                }
                                if ((i2 & 4) != 0) {
                                    l();
                                }
                                if ((i2 & 8) != 0) {
                                    n();
                                }
                                if ((i2 & 16) != 0) {
                                    m();
                                }
                                if ((i2 & 32) != 0) {
                                    this.f = SystemClock.elapsedRealtime();
                                    if (this.i != null) {
                                        this.i.a();
                                    }
                                }
                                if ((i2 & 64) != 0) {
                                    this.f = SystemClock.elapsedRealtime();
                                    o();
                                }
                            }
                        }
                        this.g = new MediaStatus(jSONObject2);
                        this.f = SystemClock.elapsedRealtime();
                        i2 = 127;
                        if ((i2 & 1) != 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if ((i2 & 128) != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if ((i2 & 32) != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                    } else {
                        this.g = null;
                        o();
                        l();
                        n();
                        m();
                    }
                    for (C0720na a2 : d()) {
                        a2.a(optLong, 0, (Object) null);
                    }
                    break;
                case 1:
                    this.a.d("received unexpected error: Invalid Player State.", new Object[0]);
                    JSONObject optJSONObject = jSONObject.optJSONObject(str3);
                    for (C0720na a3 : d()) {
                        a3.a(optLong, 2100, (Object) optJSONObject);
                    }
                    return;
                case 2:
                    this.j.a(optLong, 2100, (Object) jSONObject.optJSONObject(str3));
                    return;
                case 3:
                    this.j.a(optLong, 2101, (Object) jSONObject.optJSONObject(str3));
                    return;
                case 4:
                    this.a.d("received unexpected error: Invalid Request.", new Object[0]);
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(str3);
                    for (C0720na a4 : d()) {
                        a4.a(optLong, 2100, (Object) optJSONObject2);
                    }
                    return;
                case 5:
                    this.x.a(optLong, 0, (Object) null);
                    if (this.i != null) {
                        int[] a5 = a(jSONObject.getJSONArray(str2));
                        if (a5 != null) {
                            this.i.b(a5);
                        }
                    }
                    return;
                case 6:
                    this.z.a(optLong, 0, (Object) null);
                    if (this.i != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] a6 = a(jSONObject.getJSONArray(str2));
                        int optInt = jSONObject.optInt("insertBefore", 0);
                        if (a6 != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case -1881281404:
                                    if (string2.equals("REMOVE")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case -1785516855:
                                    if (string2.equals("UPDATE")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 1395699694:
                                    if (string2.equals("NO_CHANGE")) {
                                        c2 = 4;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 == 0) {
                                this.i.a(a6, optInt);
                            } else if (c2 == 1) {
                                this.i.c(a6);
                                return;
                            } else if (c2 == 2) {
                                this.i.a(a6);
                                return;
                            } else if (c2 == 3) {
                                this.i.b(a6);
                                return;
                            }
                        }
                    }
                    return;
                case 7:
                    this.y.a(optLong, 0, (Object) null);
                    if (this.i != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray2.length()];
                        for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                            mediaQueueItemArr[i4] = new a(jSONArray2.getJSONObject(i4)).a();
                        }
                        this.i.a(mediaQueueItemArr);
                        break;
                    }
                    break;
            }
        } catch (JSONException e2) {
            this.a.d("Message is malformed (%s); ignoring: %s", e2.getMessage(), str);
        }
    }

    public final long a(C0722oa oaVar, JSONObject jSONObject) throws IllegalStateException, C0718ma {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put(C1325gg.TYPE, "PAUSE");
            jSONObject2.put("mediaSessionId", q());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject2.toString(), c, null);
        this.k.a(c, oaVar);
        return c;
    }

    public final long a(C0722oa oaVar, C0679l lVar) throws IllegalStateException, C0718ma {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        long b = lVar.d() ? 4294967296000L : lVar.b();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put(C1325gg.TYPE, "SEEK");
            jSONObject.put("mediaSessionId", q());
            jSONObject.put("currentTime", ((double) b) / 1000.0d);
            String str = "resumeState";
            if (lVar.c() == 1) {
                jSONObject.put(str, "PLAYBACK_START");
            } else if (lVar.c() == 2) {
                jSONObject.put(str, "PLAYBACK_PAUSE");
            }
            if (lVar.a() != null) {
                jSONObject.put("customData", lVar.a());
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), c, null);
        this.h = Long.valueOf(b);
        this.n.a(c, (C0722oa) new C0714ka(this, oaVar));
        return c;
    }

    public final long a(C0722oa oaVar) throws IllegalStateException, C0718ma {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put(C1325gg.TYPE, "SKIP_AD");
            jSONObject.put("mediaSessionId", q());
        } catch (JSONException e2) {
            this.a.d(String.format(Locale.ROOT, "Error creating SkipAd message: %s", new Object[]{e2.getMessage()}), new Object[0]);
        }
        a(jSONObject.toString(), c, null);
        this.B.a(c, oaVar);
        return c;
    }

    public final long a(C0722oa oaVar, long[] jArr) throws IllegalStateException, C0718ma {
        if (jArr != null) {
            JSONObject jSONObject = new JSONObject();
            long c = c();
            try {
                jSONObject.put("requestId", c);
                jSONObject.put(C1325gg.TYPE, "EDIT_TRACKS_INFO");
                jSONObject.put("mediaSessionId", q());
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jSONArray.put(i2, jArr[i2]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            } catch (JSONException unused) {
            }
            a(jSONObject.toString(), c, null);
            this.r.a(c, oaVar);
            return c;
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    private final long a(double d, long j2, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j2;
        }
        long j4 = ((long) (((double) elapsedRealtime) * d)) + j2;
        if (j3 > 0 && j4 > j3) {
            j4 = j3;
        } else if (j4 < 0) {
            j4 = 0;
        }
        return j4;
    }

    public final long a(C0722oa oaVar, int i2, long j2, MediaQueueItem[] mediaQueueItemArr, int i3, Integer num, JSONObject jSONObject) throws IllegalArgumentException, IllegalStateException, C0718ma {
        int i4 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i4 == 0 || j2 >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long c = c();
            try {
                jSONObject2.put("requestId", c);
                jSONObject2.put(C1325gg.TYPE, "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", q());
                if (i2 != 0) {
                    jSONObject2.put("currentItemId", i2);
                }
                if (i3 != 0) {
                    jSONObject2.put("jump", i3);
                }
                if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i5 = 0; i5 < mediaQueueItemArr.length; i5++) {
                        jSONArray.put(i5, mediaQueueItemArr[i5].toJson());
                    }
                    jSONObject2.put("items", jSONArray);
                }
                String a = C0724pa.a(num);
                if (a != null) {
                    jSONObject2.put("repeatMode", a);
                }
                if (i4 != 0) {
                    jSONObject2.put("currentTime", ((double) j2) / 1000.0d);
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException unused) {
            }
            a(jSONObject2.toString(), c, null);
            this.u.a(c, oaVar);
            return c;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("playPosition cannot be negative: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void b() {
        super.b();
        p();
    }

    public final long a(C0722oa oaVar, int[] iArr) throws C0718ma, IllegalArgumentException {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put(C1325gg.TYPE, "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", q());
            JSONArray jSONArray = new JSONArray();
            for (int put : iArr) {
                jSONArray.put(put);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), c, null);
        this.y.a(c, oaVar);
        return c;
    }

    private static int[] a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            iArr[i2] = jSONArray.getInt(i2);
        }
        return iArr;
    }

    public final void a(long j2, int i2) {
        for (C0720na a : d()) {
            a.a(j2, i2, (Object) null);
        }
    }
}
