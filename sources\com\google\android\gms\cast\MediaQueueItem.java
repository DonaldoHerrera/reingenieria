package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
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
import com.google.android.gms.internal.cast.X;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "MediaQueueItemCreator")
@Reserved({1})
public class MediaQueueItem extends AbstractSafeParcelable {
    public static final Creator<MediaQueueItem> CREATOR = new C();
    @Field(getter = "getMedia", id = 2)
    private MediaInfo a;
    @Field(getter = "getItemId", id = 3)
    private int b;
    @Field(getter = "getAutoplay", id = 4)
    private boolean c;
    @Field(getter = "getStartTime", id = 5)
    private double d;
    @Field(getter = "getPlaybackDuration", id = 6)
    private double e;
    @Field(getter = "getPreloadTime", id = 7)
    private double f;
    @Field(getter = "getActiveTrackIds", id = 8)
    private long[] g;
    @Field(id = 9)
    private String h;
    private JSONObject i;

    @VisibleForTesting
    public static class a {
        private final MediaQueueItem a;

        public a(MediaInfo mediaInfo) throws IllegalArgumentException {
            this.a = new MediaQueueItem(mediaInfo);
        }

        public MediaQueueItem a() {
            this.a.Z();
            return this.a;
        }

        public a(JSONObject jSONObject) throws JSONException {
            this.a = new MediaQueueItem(jSONObject);
        }
    }

    @Constructor
    MediaQueueItem(@Param(id = 2) MediaInfo mediaInfo, @Param(id = 3) int i2, @Param(id = 4) boolean z, @Param(id = 5) double d2, @Param(id = 6) double d3, @Param(id = 7) double d4, @Param(id = 8) long[] jArr, @Param(id = 9) String str) {
        this.d = Double.NaN;
        this.a = mediaInfo;
        this.b = i2;
        this.c = z;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = jArr;
        this.h = str;
        String str2 = this.h;
        if (str2 != null) {
            try {
                this.i = new JSONObject(str2);
            } catch (JSONException unused) {
                this.i = null;
                this.h = null;
            }
        } else {
            this.i = null;
        }
    }

    public boolean F() {
        return this.c;
    }

    public int G() {
        return this.b;
    }

    public MediaInfo H() {
        return this.a;
    }

    public double I() {
        return this.e;
    }

    public double X() {
        return this.f;
    }

    public double Y() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final void Z() throws IllegalArgumentException {
        if (this.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (!Double.isNaN(this.d) && this.d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(this.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(this.f) || this.f < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public final boolean a(JSONObject jSONObject) throws JSONException {
        boolean z;
        boolean z2;
        long[] jArr;
        String str = "media";
        boolean z3 = false;
        if (jSONObject.has(str)) {
            this.a = new MediaInfo(jSONObject.getJSONObject(str));
            z = true;
        } else {
            z = false;
        }
        String str2 = "itemId";
        if (jSONObject.has(str2)) {
            int i2 = jSONObject.getInt(str2);
            if (this.b != i2) {
                this.b = i2;
                z = true;
            }
        }
        String str3 = "autoplay";
        if (jSONObject.has(str3)) {
            boolean z4 = jSONObject.getBoolean(str3);
            if (this.c != z4) {
                this.c = z4;
                z = true;
            }
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) == Double.isNaN(this.d) && (Double.isNaN(optDouble) || Math.abs(optDouble - this.d) <= 1.0E-7d)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.d = optDouble;
            z = true;
        }
        String str4 = "playbackDuration";
        if (jSONObject.has(str4)) {
            double d2 = jSONObject.getDouble(str4);
            if (Math.abs(d2 - this.e) > 1.0E-7d) {
                this.e = d2;
                z = true;
            }
        }
        String str5 = "preloadTime";
        if (jSONObject.has(str5)) {
            double d3 = jSONObject.getDouble(str5);
            if (Math.abs(d3 - this.f) > 1.0E-7d) {
                this.f = d3;
                z = true;
            }
        }
        String str6 = "activeTrackIds";
        if (jSONObject.has(str6)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str6);
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = jSONArray.getLong(i3);
            }
            long[] jArr2 = this.g;
            if (jArr2 != null && jArr2.length == length) {
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    } else if (this.g[i4] != jArr[i4]) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            z3 = true;
        } else {
            jArr = null;
        }
        if (z3) {
            this.g = jArr;
            z = true;
        }
        String str7 = "customData";
        if (!jSONObject.has(str7)) {
            return z;
        }
        this.i = jSONObject.getJSONObject(str7);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        if ((this.i == null) != (mediaQueueItem.i == null)) {
            return false;
        }
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            JSONObject jSONObject2 = mediaQueueItem.i;
            if (jSONObject2 != null && !JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return X.a(this.a, mediaQueueItem.a) && this.b == mediaQueueItem.b && this.c == mediaQueueItem.c && ((Double.isNaN(this.d) && Double.isNaN(mediaQueueItem.d)) || this.d == mediaQueueItem.d) && this.e == mediaQueueItem.e && this.f == mediaQueueItem.f && Arrays.equals(this.g, mediaQueueItem.g);
    }

    public int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g)), String.valueOf(this.i));
    }

    public long[] i() {
        return this.g;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("media", this.a.toJson());
            if (this.b != 0) {
                jSONObject.put("itemId", this.b);
            }
            jSONObject.put("autoplay", this.c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            if (this.e != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", this.e);
            }
            jSONObject.put("preloadTime", this.f);
            if (this.g != null) {
                JSONArray jSONArray = new JSONArray();
                for (long put : this.g) {
                    jSONArray.put(put);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            if (this.i != null) {
                jSONObject.put("customData", this.i);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, H(), i2, false);
        SafeParcelWriter.writeInt(parcel, 3, G());
        SafeParcelWriter.writeBoolean(parcel, 4, F());
        SafeParcelWriter.writeDouble(parcel, 5, Y());
        SafeParcelWriter.writeDouble(parcel, 6, I());
        SafeParcelWriter.writeDouble(parcel, 7, X());
        SafeParcelWriter.writeLongArray(parcel, 8, i(), false);
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private MediaQueueItem(MediaInfo mediaInfo) throws IllegalArgumentException {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    MediaQueueItem(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, null);
        a(jSONObject);
    }
}
