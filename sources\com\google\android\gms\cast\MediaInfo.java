package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
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
import com.google.android.gms.internal.cast.X;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "MediaInfoCreator")
@Reserved({1})
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MediaInfo> CREATOR = new C0688v();
    @Field(getter = "getContentId", id = 2)
    private final String a;
    @Field(getter = "getStreamType", id = 3)
    private int b;
    @Field(getter = "getContentType", id = 4)
    private String c;
    @Field(getter = "getMetadata", id = 5)
    private MediaMetadata d;
    @Field(getter = "getStreamDuration", id = 6)
    private long e;
    @Field(getter = "getMediaTracks", id = 7)
    private List<MediaTrack> f;
    @Field(getter = "getTextTrackStyle", id = 8)
    private TextTrackStyle g;
    @Field(id = 9)
    private String h;
    @Field(getter = "getAdBreaks", id = 10)
    private List<AdBreakInfo> i;
    @Field(getter = "getAdBreakClips", id = 11)
    private List<AdBreakClipInfo> j;
    @Field(getter = "getEntity", id = 12)
    private String k;
    @Field(getter = "getVmapAdsRequest", id = 13)
    private VastAdsRequest l;
    @Field(getter = "getStartAbsoluteTime", id = 14)
    private long m;
    private JSONObject n;

    @VisibleForTesting
    public static class a {
        private final MediaInfo a;

        public a(String str) throws IllegalArgumentException {
            this.a = new MediaInfo(str);
        }

        public a a(int i) throws IllegalArgumentException {
            this.a.m(i);
            return this;
        }

        public a a(String str) {
            this.a.a(str);
            return this;
        }

        public MediaInfo a() {
            return this.a;
        }
    }

    @Constructor
    MediaInfo(@Param(id = 2) String str, @Param(id = 3) int i2, @Param(id = 4) String str2, @Param(id = 5) MediaMetadata mediaMetadata, @Param(id = 6) long j2, @Param(id = 7) List<MediaTrack> list, @Param(id = 8) TextTrackStyle textTrackStyle, @Param(id = 9) String str3, @Param(id = 10) List<AdBreakInfo> list2, @Param(id = 11) List<AdBreakClipInfo> list3, @Param(id = 12) String str4, @Param(id = 13) VastAdsRequest vastAdsRequest, @Param(id = 14) long j3) {
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = mediaMetadata;
        this.e = j2;
        this.f = list;
        this.g = textTrackStyle;
        this.h = str3;
        String str5 = this.h;
        if (str5 != null) {
            try {
                this.n = new JSONObject(str5);
            } catch (JSONException unused) {
                this.n = null;
                this.h = null;
            }
        } else {
            this.n = null;
        }
        this.i = list2;
        this.j = list3;
        this.k = str4;
        this.l = vastAdsRequest;
        this.m = j3;
    }

    public List<AdBreakInfo> F() {
        List<AdBreakInfo> list = this.i;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String G() {
        return this.a;
    }

    public String H() {
        return this.c;
    }

    public JSONObject I() {
        return this.n;
    }

    public String X() {
        return this.k;
    }

    public List<MediaTrack> Y() {
        return this.f;
    }

    public long Z() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.c = str;
    }

    public long aa() {
        return this.e;
    }

    public int ba() {
        return this.b;
    }

    public TextTrackStyle ca() {
        return this.g;
    }

    public VastAdsRequest da() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.n == null) != (mediaInfo.n == null)) {
            return false;
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            JSONObject jSONObject2 = mediaInfo.n;
            if (jSONObject2 != null && !JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return X.a(this.a, mediaInfo.a) && this.b == mediaInfo.b && X.a(this.c, mediaInfo.c) && X.a(this.d, mediaInfo.d) && this.e == mediaInfo.e && X.a(this.f, mediaInfo.f) && X.a(this.g, mediaInfo.g) && X.a(this.i, mediaInfo.i) && X.a(this.j, mediaInfo.j) && X.a(this.k, mediaInfo.k) && X.a(this.l, mediaInfo.l) && this.m == mediaInfo.m;
    }

    public MediaMetadata getMetadata() {
        return this.d;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.n), this.f, this.g, this.i, this.j, this.k, this.l, Long.valueOf(this.m));
    }

    public List<AdBreakClipInfo> i() {
        List<AdBreakClipInfo> list = this.j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* access modifiers changed from: 0000 */
    public final void m(int i2) throws IllegalArgumentException {
        if (i2 < -1 || i2 > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        this.b = i2;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.a);
            int i2 = this.b;
            String str = i2 != 1 ? i2 != 2 ? "NONE" : "LIVE" : "BUFFERED";
            jSONObject.put("streamType", str);
            if (this.c != null) {
                jSONObject.put("contentType", this.c);
            }
            if (this.d != null) {
                jSONObject.put("metadata", this.d.toJson());
            }
            String str2 = "duration";
            if (this.e <= -1) {
                jSONObject.put(str2, JSONObject.NULL);
            } else {
                jSONObject.put(str2, ((double) this.e) / 1000.0d);
            }
            if (this.f != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack json : this.f) {
                    jSONArray.put(json.toJson());
                }
                jSONObject.put("tracks", jSONArray);
            }
            if (this.g != null) {
                jSONObject.put("textTrackStyle", this.g.toJson());
            }
            if (this.n != null) {
                jSONObject.put("customData", this.n);
            }
            if (this.k != null) {
                jSONObject.put("entity", this.k);
            }
            if (this.i != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (AdBreakInfo json2 : this.i) {
                    jSONArray2.put(json2.toJson());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.j != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (AdBreakClipInfo json3 : this.j) {
                    jSONArray3.put(json3.toJson());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            if (this.l != null) {
                jSONObject.put("vmapAdsRequest", this.l.toJson());
            }
            if (this.m != -1) {
                jSONObject.put("startAbsoluteTime", ((double) this.m) / 1000.0d);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, G(), false);
        SafeParcelWriter.writeInt(parcel, 3, ba());
        SafeParcelWriter.writeString(parcel, 4, H(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getMetadata(), i2, false);
        SafeParcelWriter.writeLong(parcel, 6, aa());
        SafeParcelWriter.writeTypedList(parcel, 7, Y(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, ca(), i2, false);
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.writeTypedList(parcel, 10, F(), false);
        SafeParcelWriter.writeTypedList(parcel, 11, i(), false);
        SafeParcelWriter.writeString(parcel, 12, X(), false);
        SafeParcelWriter.writeParcelable(parcel, 13, da(), i2, false);
        SafeParcelWriter.writeLong(parcel, 14, Z());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @VisibleForTesting
    public final void a(List<AdBreakInfo> list) {
        this.i = list;
    }

    /* access modifiers changed from: 0000 */
    public final void a(JSONObject jSONObject) throws JSONException {
        String str = "breaks";
        int i2 = 0;
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            this.i = new ArrayList(jSONArray.length());
            int i3 = 0;
            while (true) {
                if (i3 >= jSONArray.length()) {
                    break;
                }
                AdBreakInfo a2 = AdBreakInfo.a(jSONArray.getJSONObject(i3));
                if (a2 == null) {
                    this.i.clear();
                    break;
                } else {
                    this.i.add(a2);
                    i3++;
                }
            }
        }
        String str2 = "breakClips";
        if (jSONObject.has(str2)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
            this.j = new ArrayList(jSONArray2.length());
            while (i2 < jSONArray2.length()) {
                AdBreakClipInfo a3 = AdBreakClipInfo.a(jSONArray2.getJSONObject(i2));
                if (a3 != null) {
                    this.j.add(a3);
                    i2++;
                } else {
                    this.j.clear();
                    return;
                }
            }
        }
    }

    MediaInfo(String str) throws IllegalArgumentException {
        this(str, -1, null, null, -1, null, null, null, null, null, null, null, -1);
        if (str == null) {
            throw new IllegalArgumentException("contentID cannot be null");
        }
    }

    MediaInfo(JSONObject jSONObject) throws JSONException {
        MediaInfo mediaInfo;
        this(jSONObject.getString("contentId"), -1, null, null, -1, null, null, null, null, null, null, null, -1);
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString("streamType");
        if ("NONE".equals(string)) {
            mediaInfo = this;
            mediaInfo.b = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(string)) {
                mediaInfo.b = 1;
            } else if ("LIVE".equals(string)) {
                mediaInfo.b = 2;
            } else {
                mediaInfo.b = -1;
            }
        }
        mediaInfo.c = jSONObject2.optString("contentType", null);
        String str = "metadata";
        if (jSONObject2.has(str)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
            mediaInfo.d = new MediaMetadata(jSONObject3.getInt("metadataType"));
            mediaInfo.d.a(jSONObject3);
        }
        mediaInfo.e = -1;
        String str2 = "duration";
        if (jSONObject2.has(str2) && !jSONObject2.isNull(str2)) {
            double optDouble = jSONObject2.optDouble(str2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.e = (long) (optDouble * 1000.0d);
            }
        }
        String str3 = "tracks";
        if (jSONObject2.has(str3)) {
            mediaInfo.f = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray(str3);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                mediaInfo.f.add(new MediaTrack(jSONArray.getJSONObject(i2)));
            }
        } else {
            mediaInfo.f = null;
        }
        String str4 = "textTrackStyle";
        if (jSONObject2.has(str4)) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject(str4);
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.a(jSONObject4);
            mediaInfo.g = textTrackStyle;
        } else {
            mediaInfo.g = null;
        }
        a(jSONObject);
        mediaInfo.n = jSONObject2.optJSONObject("customData");
        String str5 = "entity";
        if (jSONObject2.has(str5)) {
            mediaInfo.k = jSONObject2.getString(str5);
        }
        mediaInfo.l = VastAdsRequest.a(jSONObject2.optJSONObject("vmapAdsRequest"));
        if (C0704fa.h) {
            String str6 = "startAbsoluteTime";
            if (jSONObject2.has(str6) && !jSONObject2.isNull(str6)) {
                double optDouble2 = jSONObject2.optDouble(str6);
                if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    mediaInfo.m = (long) (optDouble2 * 1000.0d);
                }
            }
        }
    }
}
