package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaQueueItem.a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.C0704fa;
import com.google.android.gms.internal.cast.C0724pa;
import com.google.android.gms.internal.cast.X;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "MediaStatusCreator")
@Reserved({1})
@VisibleForTesting
public class MediaStatus extends AbstractSafeParcelable {
    public static final Creator<MediaStatus> CREATOR = new E();
    @Field(getter = "getMediaInfo", id = 2)
    @VisibleForTesting
    private MediaInfo a;
    @Field(getter = "getMediaSessionId", id = 3)
    @VisibleForTesting
    private long b;
    @Field(getter = "getCurrentItemId", id = 4)
    @VisibleForTesting
    private int c;
    @Field(getter = "getPlaybackRate", id = 5)
    @VisibleForTesting
    private double d;
    @Field(getter = "getPlayerState", id = 6)
    @VisibleForTesting
    private int e;
    @Field(getter = "getIdleReason", id = 7)
    @VisibleForTesting
    private int f;
    @Field(getter = "getStreamPosition", id = 8)
    @VisibleForTesting
    private long g;
    @Field(id = 9)
    private long h;
    @Field(getter = "getStreamVolume", id = 10)
    @VisibleForTesting
    private double i;
    @Field(getter = "isMute", id = 11)
    @VisibleForTesting
    private boolean j;
    @Field(getter = "getActiveTrackIds", id = 12)
    @VisibleForTesting
    private long[] k;
    @Field(getter = "getLoadingItemId", id = 13)
    @VisibleForTesting
    private int l;
    @Field(getter = "getPreloadedItemId", id = 14)
    @VisibleForTesting
    private int m;
    @Field(id = 15)
    private String n;
    @VisibleForTesting
    private JSONObject o;
    @Field(id = 16)
    private int p;
    @Field(id = 17)
    private final ArrayList<MediaQueueItem> q;
    @Field(getter = "isPlayingAd", id = 18)
    @VisibleForTesting
    private boolean r;
    @Field(getter = "getAdBreakStatus", id = 19)
    @VisibleForTesting
    private AdBreakStatus s;
    @Field(getter = "getVideoInfo", id = 20)
    @VisibleForTesting
    private VideoInfo t;
    @VisibleForTesting
    private C0674g u;
    @VisibleForTesting
    private C0678k v;
    private final SparseArray<Integer> w;

    @Constructor
    MediaStatus(@Param(id = 2) MediaInfo mediaInfo, @Param(id = 3) long j2, @Param(id = 4) int i2, @Param(id = 5) double d2, @Param(id = 6) int i3, @Param(id = 7) int i4, @Param(id = 8) long j3, @Param(id = 9) long j4, @Param(id = 10) double d3, @Param(id = 11) boolean z, @Param(id = 12) long[] jArr, @Param(id = 13) int i5, @Param(id = 14) int i6, @Param(id = 15) String str, @Param(id = 16) int i7, @Param(id = 17) List<MediaQueueItem> list, @Param(id = 18) boolean z2, @Param(id = 19) AdBreakStatus adBreakStatus, @Param(id = 20) VideoInfo videoInfo) {
        List<MediaQueueItem> list2 = list;
        this.q = new ArrayList<>();
        this.w = new SparseArray<>();
        this.a = mediaInfo;
        this.b = j2;
        this.c = i2;
        this.d = d2;
        this.e = i3;
        this.f = i4;
        this.g = j3;
        this.h = j4;
        this.i = d3;
        this.j = z;
        this.k = jArr;
        this.l = i5;
        this.m = i6;
        this.n = str;
        String str2 = this.n;
        if (str2 != null) {
            try {
                this.o = new JSONObject(str2);
            } catch (JSONException unused) {
                this.o = null;
                this.n = null;
            }
        } else {
            this.o = null;
        }
        this.p = i7;
        if (list2 != null && !list.isEmpty()) {
            a((MediaQueueItem[]) list2.toArray(new MediaQueueItem[list.size()]));
        }
        this.r = z2;
        this.s = adBreakStatus;
        this.t = videoInfo;
    }

    private static boolean a(int i2, int i3, int i4, int i5) {
        if (i2 != 1) {
            return false;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return i5 != 2;
            }
            if (i3 != 3) {
                return true;
            }
        }
        return i4 == 0;
    }

    public AdBreakStatus F() {
        return this.s;
    }

    public AdBreakClipInfo G() {
        AdBreakStatus adBreakStatus = this.s;
        if (!(adBreakStatus == null || this.a == null)) {
            String i2 = adBreakStatus.i();
            if (TextUtils.isEmpty(i2)) {
                return null;
            }
            List<AdBreakClipInfo> i3 = this.a.i();
            if (i3 != null && !i3.isEmpty()) {
                for (AdBreakClipInfo adBreakClipInfo : i3) {
                    if (i2.equals(adBreakClipInfo.X())) {
                        return adBreakClipInfo;
                    }
                }
            }
        }
        return null;
    }

    public int H() {
        return this.c;
    }

    public int I() {
        return this.f;
    }

    public C0674g X() {
        return this.u;
    }

    public int Y() {
        return this.l;
    }

    public MediaInfo Z() {
        return this.a;
    }

    public final void a(boolean z) {
        this.r = z;
    }

    public double aa() {
        return this.d;
    }

    public int ba() {
        return this.e;
    }

    public int ca() {
        return this.m;
    }

    public int da() {
        return this.q.size();
    }

    public int ea() {
        return this.p;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        if ((this.o == null) == (mediaStatus.o == null) && this.b == mediaStatus.b && this.c == mediaStatus.c && this.d == mediaStatus.d && this.e == mediaStatus.e && this.f == mediaStatus.f && this.g == mediaStatus.g && this.i == mediaStatus.i && this.j == mediaStatus.j && this.l == mediaStatus.l && this.m == mediaStatus.m && this.p == mediaStatus.p && Arrays.equals(this.k, mediaStatus.k) && X.a(Long.valueOf(this.h), Long.valueOf(mediaStatus.h)) && X.a(this.q, mediaStatus.q) && X.a(this.a, mediaStatus.a)) {
            JSONObject jSONObject = this.o;
            if (jSONObject != null) {
                JSONObject jSONObject2 = mediaStatus.o;
                if (jSONObject2 != null && !JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) {
                    z = false;
                    return !z && this.r == mediaStatus.ja() && X.a(this.s, mediaStatus.s) && X.a(this.t, mediaStatus.t) && X.a(this.u, mediaStatus.u) && Objects.equal(this.v, mediaStatus.v);
                }
            }
            z = true;
            if (!z) {
            }
        }
    }

    public long fa() {
        return this.g;
    }

    public double ga() {
        return this.i;
    }

    public VideoInfo ha() {
        return this.t;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(this.l), Integer.valueOf(this.m), String.valueOf(this.o), Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), this.s, this.t, this.u, this.v);
    }

    public boolean i(long j2) {
        return (j2 & this.h) != 0;
    }

    public boolean ia() {
        return this.j;
    }

    public boolean ja() {
        return this.r;
    }

    public final long ka() {
        return this.b;
    }

    public final boolean la() {
        MediaInfo mediaInfo = this.a;
        return a(this.e, this.f, this.l, mediaInfo == null ? -1 : mediaInfo.ba());
    }

    public Integer m(int i2) {
        return (Integer) this.w.get(i2);
    }

    public MediaQueueItem n(int i2) {
        Integer num = (Integer) this.w.get(i2);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.q.get(num.intValue());
    }

    public MediaQueueItem o(int i2) {
        return n(i2);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, Z(), i2, false);
        SafeParcelWriter.writeLong(parcel, 3, this.b);
        SafeParcelWriter.writeInt(parcel, 4, H());
        SafeParcelWriter.writeDouble(parcel, 5, aa());
        SafeParcelWriter.writeInt(parcel, 6, ba());
        SafeParcelWriter.writeInt(parcel, 7, I());
        SafeParcelWriter.writeLong(parcel, 8, fa());
        SafeParcelWriter.writeLong(parcel, 9, this.h);
        SafeParcelWriter.writeDouble(parcel, 10, ga());
        SafeParcelWriter.writeBoolean(parcel, 11, ia());
        SafeParcelWriter.writeLongArray(parcel, 12, i(), false);
        SafeParcelWriter.writeInt(parcel, 13, Y());
        SafeParcelWriter.writeInt(parcel, 14, ca());
        SafeParcelWriter.writeString(parcel, 15, this.n, false);
        SafeParcelWriter.writeInt(parcel, 16, this.p);
        SafeParcelWriter.writeTypedList(parcel, 17, this.q, false);
        SafeParcelWriter.writeBoolean(parcel, 18, ja());
        SafeParcelWriter.writeParcelable(parcel, 19, F(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 20, ha(), i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02b0, code lost:
        if (r14 == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02e7, code lost:
        if (r1.equals(r14) == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x030a, code lost:
        if (r1.equals(r14) == false) goto L_0x030c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    public final int a(JSONObject jSONObject, int i2) throws JSONException {
        int i3;
        boolean z;
        long[] jArr;
        VideoInfo videoInfo;
        AdBreakStatus adBreakStatus;
        boolean z2;
        JSONObject a2 = a(jSONObject);
        long j2 = a2.getLong("mediaSessionId");
        boolean z3 = false;
        if (j2 != this.b) {
            this.b = j2;
            i3 = 1;
        } else {
            i3 = 0;
        }
        String str = "playerState";
        if (a2.has(str)) {
            String string = a2.getString(str);
            int i4 = 3;
            int i5 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
            if (i5 != this.e) {
                this.e = i5;
                i3 |= 2;
            }
            if (i5 == 1) {
                String str2 = "idleReason";
                if (a2.has(str2)) {
                    String string2 = a2.getString(str2);
                    if (string2.equals("CANCELLED")) {
                        i4 = 2;
                    } else if (!string2.equals("INTERRUPTED")) {
                        i4 = string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    }
                    if (i4 != this.f) {
                        this.f = i4;
                        i3 |= 2;
                    }
                }
            }
        }
        String str3 = "playbackRate";
        if (a2.has(str3)) {
            double d2 = a2.getDouble(str3);
            if (this.d != d2) {
                this.d = d2;
                i3 |= 2;
            }
        }
        String str4 = "currentTime";
        if (a2.has(str4)) {
            long j3 = (long) (a2.getDouble(str4) * 1000.0d);
            if (j3 != this.g) {
                this.g = j3;
                i3 |= 2;
            }
            i3 |= 128;
        }
        String str5 = "supportedMediaCommands";
        if (a2.has(str5)) {
            long j4 = a2.getLong(str5);
            if (j4 != this.h) {
                this.h = j4;
                i3 |= 2;
            }
        }
        String str6 = "volume";
        if (a2.has(str6) && (i2 & 1) == 0) {
            JSONObject jSONObject2 = a2.getJSONObject(str6);
            double d3 = jSONObject2.getDouble("level");
            if (d3 != this.i) {
                this.i = d3;
                i3 |= 2;
            }
            boolean z4 = jSONObject2.getBoolean("muted");
            if (z4 != this.j) {
                this.j = z4;
                i3 |= 2;
            }
        }
        String str7 = "activeTrackIds";
        if (a2.has(str7)) {
            JSONArray jSONArray = a2.getJSONArray(str7);
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i6 = 0; i6 < length; i6++) {
                jArr[i6] = jSONArray.getLong(i6);
            }
            long[] jArr2 = this.k;
            if (jArr2 != null && jArr2.length == length) {
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        z = false;
                        break;
                    } else if (this.k[i7] != jArr[i7]) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            z = true;
            if (z) {
                this.k = jArr;
            }
        } else if (this.k != null) {
            jArr = null;
            z = true;
        } else {
            jArr = null;
            z = false;
        }
        if (z) {
            this.k = jArr;
            i3 |= 2;
        }
        String str8 = "customData";
        if (a2.has(str8)) {
            this.o = a2.getJSONObject(str8);
            this.n = null;
            i3 |= 2;
        }
        String str9 = "media";
        if (a2.has(str9)) {
            JSONObject jSONObject3 = a2.getJSONObject(str9);
            MediaInfo mediaInfo = new MediaInfo(jSONObject3);
            MediaInfo mediaInfo2 = this.a;
            if (mediaInfo2 == null || (mediaInfo2 != null && !mediaInfo2.equals(mediaInfo))) {
                this.a = mediaInfo;
                i3 |= 2;
            }
            if (jSONObject3.has("metadata")) {
                i3 |= 4;
            }
        }
        if (a2.has("currentItemId")) {
            int i8 = a2.getInt("currentItemId");
            if (this.c != i8) {
                this.c = i8;
                i3 |= 2;
            }
        }
        int optInt = a2.optInt("preloadedItemId", 0);
        if (this.m != optInt) {
            this.m = optInt;
            i3 |= 16;
        }
        int optInt2 = a2.optInt("loadingItemId", 0);
        if (this.l != optInt2) {
            this.l = optInt2;
            i3 |= 2;
        }
        MediaInfo mediaInfo3 = this.a;
        if (!a(this.e, this.f, this.l, mediaInfo3 == null ? -1 : mediaInfo3.ba())) {
            if (a2.has("repeatMode")) {
                Integer a3 = C0724pa.a(a2.getString("repeatMode"));
                Integer valueOf = Integer.valueOf(a3 == null ? this.p : a3.intValue());
                if (this.p != valueOf.intValue()) {
                    this.p = valueOf.intValue();
                    z2 = true;
                    if (a2.has("items")) {
                        JSONArray jSONArray2 = a2.getJSONArray("items");
                        int length2 = jSONArray2.length();
                        SparseArray sparseArray = new SparseArray();
                        for (int i9 = 0; i9 < length2; i9++) {
                            sparseArray.put(i9, Integer.valueOf(jSONArray2.getJSONObject(i9).getInt("itemId")));
                        }
                        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[length2];
                        boolean z5 = z2;
                        for (int i10 = 0; i10 < length2; i10++) {
                            Integer num = (Integer) sparseArray.get(i10);
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                            MediaQueueItem n2 = n(num.intValue());
                            if (n2 != null) {
                                z5 |= n2.a(jSONObject4);
                                mediaQueueItemArr[i10] = n2;
                                if (i10 == m(num.intValue()).intValue()) {
                                }
                            } else {
                                if (num.intValue() == this.c) {
                                    MediaInfo mediaInfo4 = this.a;
                                    if (mediaInfo4 != null) {
                                        mediaQueueItemArr[i10] = new a(mediaInfo4).a();
                                        mediaQueueItemArr[i10].a(jSONObject4);
                                    }
                                }
                                mediaQueueItemArr[i10] = new MediaQueueItem(jSONObject4);
                            }
                            z5 = true;
                        }
                        z2 = this.q.size() != length2 ? true : z5;
                        a(mediaQueueItemArr);
                    }
                }
            }
            z2 = false;
            if (a2.has("items")) {
            }
        } else {
            this.c = 0;
            this.l = 0;
            this.m = 0;
            if (!this.q.isEmpty()) {
                this.p = 0;
                this.q.clear();
                this.w.clear();
            }
            AdBreakStatus a4 = AdBreakStatus.a(a2.optJSONObject("breakStatus"));
            if (this.s != null || a4 == null) {
                adBreakStatus = this.s;
                if (adBreakStatus != null) {
                }
                VideoInfo a5 = VideoInfo.a(a2.optJSONObject("videoInfo"));
                if (this.t != null || a5 == null) {
                    videoInfo = this.t;
                    if (videoInfo != null) {
                    }
                    if (a2.has("breakInfo")) {
                        MediaInfo mediaInfo5 = this.a;
                        if (mediaInfo5 != null) {
                            mediaInfo5.a(a2.getJSONObject("breakInfo"));
                            i3 |= 2;
                        }
                    }
                    if (C0704fa.h && a2.has("queueData")) {
                        C0678k.a aVar = new C0678k.a();
                        aVar.a(a2.getJSONObject("queueData"));
                        this.v = aVar.a();
                    }
                    if (C0704fa.h) {
                        return i3;
                    }
                    if (a2.has("liveSeekableRange")) {
                        this.u = C0674g.a(a2.optJSONObject("liveSeekableRange"));
                        return i3 | 2;
                    }
                    if (this.u != null) {
                        i3 |= 2;
                    }
                    this.u = null;
                    return i3;
                }
                this.t = a5;
                i3 |= 64;
                if (a2.has("breakInfo")) {
                }
                C0678k.a aVar2 = new C0678k.a();
                aVar2.a(a2.getJSONObject("queueData"));
                this.v = aVar2.a();
                if (C0704fa.h) {
                }
            }
            if (a4 != null) {
                z3 = true;
            }
            this.r = z3;
            this.s = a4;
            i3 |= 32;
            VideoInfo a52 = VideoInfo.a(a2.optJSONObject("videoInfo"));
            videoInfo = this.t;
            if (videoInfo != null) {
            }
            if (a2.has("breakInfo")) {
            }
            C0678k.a aVar22 = new C0678k.a();
            aVar22.a(a2.getJSONObject("queueData"));
            this.v = aVar22.a();
            if (C0704fa.h) {
            }
        }
        i3 |= 8;
        AdBreakStatus a42 = AdBreakStatus.a(a2.optJSONObject("breakStatus"));
        adBreakStatus = this.s;
        if (adBreakStatus != null) {
        }
        VideoInfo a522 = VideoInfo.a(a2.optJSONObject("videoInfo"));
        videoInfo = this.t;
        if (videoInfo != null) {
        }
        if (a2.has("breakInfo")) {
        }
        C0678k.a aVar222 = new C0678k.a();
        aVar222.a(a2.getJSONObject("queueData"));
        this.v = aVar222.a();
        if (C0704fa.h) {
        }
    }

    public long[] i() {
        return this.k;
    }

    public MediaStatus(JSONObject jSONObject) throws JSONException {
        this(null, 0, 0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0, 0, 0, 0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false, null, 0, 0, null, 0, null, false, null, null);
        a(jSONObject, 0);
    }

    private static JSONObject a(JSONObject jSONObject) {
        String str = "extendedStatus";
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return jSONObject;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                arrayList.add((String) keys.next());
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
            Iterator keys2 = optJSONObject.keys();
            while (keys2.hasNext()) {
                String str2 = (String) keys2.next();
                jSONObject2.put(str2, optJSONObject.get(str2));
            }
            jSONObject2.remove(str);
            return jSONObject2;
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    private final void a(MediaQueueItem[] mediaQueueItemArr) {
        this.q.clear();
        this.w.clear();
        for (int i2 = 0; i2 < mediaQueueItemArr.length; i2++) {
            MediaQueueItem mediaQueueItem = mediaQueueItemArr[i2];
            this.q.add(mediaQueueItem);
            this.w.put(mediaQueueItem.G(), Integer.valueOf(i2));
        }
    }
}
