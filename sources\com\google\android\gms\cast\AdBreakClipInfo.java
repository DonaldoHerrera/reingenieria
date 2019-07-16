package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.cast.X;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "AdBreakClipInfoCreator")
@Reserved({1})
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Creator<AdBreakClipInfo> CREATOR = new C0682o();
    @Field(getter = "getId", id = 2)
    private final String a;
    @Field(getter = "getTitle", id = 3)
    private final String b;
    @Field(getter = "getDurationInMs", id = 4)
    private final long c;
    @Field(getter = "getContentUrl", id = 5)
    private final String d;
    @Field(getter = "getMimeType", id = 6)
    private final String e;
    @Field(getter = "getClickThroughUrl", id = 7)
    private final String f;
    @Field(getter = "getCustomDataAsString", id = 8)
    private String g;
    @Field(getter = "getContentId", id = 9)
    private String h;
    @Field(getter = "getImageUrl", id = 10)
    private String i;
    @Field(getter = "getWhenSkippableInMs", id = 11)
    private final long j;
    @Field(getter = "getHlsSegmentFormat", id = 12)
    private final String k;
    @Field(getter = "getVastAdsRequest", id = 13)
    private final VastAdsRequest l;
    private JSONObject m;

    @Constructor
    AdBreakClipInfo(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) long j2, @Param(id = 5) String str3, @Param(id = 6) String str4, @Param(id = 7) String str5, @Param(id = 8) String str6, @Param(id = 9) String str7, @Param(id = 10) String str8, @Param(id = 11) long j3, @Param(id = 12) String str9, @Param(id = 13) VastAdsRequest vastAdsRequest) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j3;
        this.k = str9;
        this.l = vastAdsRequest;
        if (!TextUtils.isEmpty(this.g)) {
            try {
                this.m = new JSONObject(str6);
            } catch (JSONException e2) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[]{e2.getMessage()}));
                this.g = null;
                this.m = new JSONObject();
            }
        } else {
            this.m = new JSONObject();
        }
    }

    static AdBreakClipInfo a(JSONObject jSONObject) {
        long j2;
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "whenSkippable";
        if (jSONObject2 == null) {
            return null;
        }
        String str3 = "id";
        if (!jSONObject2.has(str3)) {
            return null;
        }
        try {
            String string = jSONObject2.getString(str3);
            long optLong = (long) (((double) jSONObject2.optLong("duration")) * 1000.0d);
            String optString = jSONObject2.optString("clickThroughUrl", null);
            String optString2 = jSONObject2.optString("contentUrl", null);
            String optString3 = jSONObject2.optString("mimeType", null);
            if (optString3 == null) {
                optString3 = jSONObject2.optString("contentType", null);
            }
            String str4 = optString3;
            String optString4 = jSONObject2.optString("title", null);
            JSONObject optJSONObject = jSONObject2.optJSONObject("customData");
            String optString5 = jSONObject2.optString("contentId", null);
            String optString6 = jSONObject2.optString("posterUrl", null);
            long j3 = -1;
            if (jSONObject2.has(str2)) {
                j2 = optLong;
                j3 = (long) (((double) ((Integer) jSONObject2.get(str2)).intValue()) * 1000.0d);
            } else {
                j2 = optLong;
            }
            String optString7 = jSONObject2.optString("hlsSegmentFormat", null);
            VastAdsRequest a2 = VastAdsRequest.a(jSONObject2.optJSONObject("vastAdsRequest"));
            if (optJSONObject != null) {
                if (optJSONObject.length() != 0) {
                    str = optJSONObject.toString();
                    AdBreakClipInfo adBreakClipInfo = new AdBreakClipInfo(string, optString4, j2, optString2, str4, optString, str, optString5, optString6, j3, optString7, a2);
                    return adBreakClipInfo;
                }
            }
            str = null;
            AdBreakClipInfo adBreakClipInfo2 = new AdBreakClipInfo(string, optString4, j2, optString2, str4, optString, str, optString5, optString6, j3, optString7, a2);
            return adBreakClipInfo2;
        } catch (JSONException e2) {
            Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[]{e2.getMessage()}));
            return null;
        }
    }

    public String F() {
        return this.h;
    }

    public String G() {
        return this.d;
    }

    public long H() {
        return this.c;
    }

    public String I() {
        return this.k;
    }

    public String X() {
        return this.a;
    }

    public String Y() {
        return this.i;
    }

    public String Z() {
        return this.e;
    }

    public String aa() {
        return this.b;
    }

    public VastAdsRequest ba() {
        return this.l;
    }

    public long ca() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return X.a(this.a, adBreakClipInfo.a) && X.a(this.b, adBreakClipInfo.b) && this.c == adBreakClipInfo.c && X.a(this.d, adBreakClipInfo.d) && X.a(this.e, adBreakClipInfo.e) && X.a(this.f, adBreakClipInfo.f) && X.a(this.g, adBreakClipInfo.g) && X.a(this.h, adBreakClipInfo.h) && X.a(this.i, adBreakClipInfo.i) && this.j == adBreakClipInfo.j && X.a(this.k, adBreakClipInfo.k) && X.a(this.l, adBreakClipInfo.l);
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l);
    }

    public String i() {
        return this.f;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            jSONObject.put("duration", ((double) this.c) / 1000.0d);
            if (this.j != -1) {
                jSONObject.put("whenSkippable", ((double) this.j) / 1000.0d);
            }
            if (this.h != null) {
                jSONObject.put("contentId", this.h);
            }
            if (this.e != null) {
                jSONObject.put("contentType", this.e);
            }
            if (this.b != null) {
                jSONObject.put("title", this.b);
            }
            if (this.d != null) {
                jSONObject.put("contentUrl", this.d);
            }
            if (this.f != null) {
                jSONObject.put("clickThroughUrl", this.f);
            }
            if (this.m != null) {
                jSONObject.put("customData", this.m);
            }
            if (this.i != null) {
                jSONObject.put("posterUrl", this.i);
            }
            if (this.k != null) {
                jSONObject.put("hlsSegmentFormat", this.k);
            }
            if (this.l != null) {
                jSONObject.put("vastAdsRequest", this.l.toJson());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, X(), false);
        SafeParcelWriter.writeString(parcel, 3, aa(), false);
        SafeParcelWriter.writeLong(parcel, 4, H());
        SafeParcelWriter.writeString(parcel, 5, G(), false);
        SafeParcelWriter.writeString(parcel, 6, Z(), false);
        SafeParcelWriter.writeString(parcel, 7, i(), false);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.writeString(parcel, 9, F(), false);
        SafeParcelWriter.writeString(parcel, 10, Y(), false);
        SafeParcelWriter.writeLong(parcel, 11, ca());
        SafeParcelWriter.writeString(parcel, 12, I(), false);
        SafeParcelWriter.writeParcelable(parcel, 13, ba(), i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
