package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.cast.X;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "AdBreakInfoCreator")
@Reserved({1})
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Creator<AdBreakInfo> CREATOR = new G();
    @Field(getter = "getPlaybackPositionInMs", id = 2)
    private final long a;
    @Field(getter = "getId", id = 3)
    private final String b;
    @Field(getter = "getDurationInMs", id = 4)
    private final long c;
    @Field(getter = "isWatched", id = 5)
    private final boolean d;
    @Field(getter = "getBreakClipIds", id = 6)
    private String[] e;
    @Field(getter = "isEmbedded", id = 7)
    private final boolean f;

    @Constructor
    public AdBreakInfo(@Param(id = 2) long j, @Param(id = 3) String str, @Param(id = 4) long j2, @Param(id = 5) boolean z, @Param(id = 6) String[] strArr, @Param(id = 7) boolean z2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
    }

    static AdBreakInfo a(JSONObject jSONObject) {
        String[] strArr;
        if (jSONObject == null) {
            return null;
        }
        String str = "id";
        if (jSONObject.has(str)) {
            String str2 = "position";
            if (jSONObject.has(str2)) {
                try {
                    String string = jSONObject.getString(str);
                    long j = (long) (((double) jSONObject.getLong(str2)) * 1000.0d);
                    boolean optBoolean = jSONObject.optBoolean("isWatched");
                    long optLong = (long) (((double) jSONObject.optLong("duration")) * 1000.0d);
                    JSONArray optJSONArray = jSONObject.optJSONArray("breakClipIds");
                    if (optJSONArray != null) {
                        String[] strArr2 = new String[optJSONArray.length()];
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            strArr2[i] = optJSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } else {
                        strArr = null;
                    }
                    AdBreakInfo adBreakInfo = new AdBreakInfo(j, string, optLong, optBoolean, strArr, jSONObject.optBoolean("isEmbedded"));
                    return adBreakInfo;
                } catch (JSONException e2) {
                    Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", new Object[]{e2.getMessage()}));
                }
            }
        }
        return null;
    }

    public long F() {
        return this.c;
    }

    public String G() {
        return this.b;
    }

    public long H() {
        return this.a;
    }

    public boolean I() {
        return this.f;
    }

    public boolean X() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return X.a(this.b, adBreakInfo.b) && this.a == adBreakInfo.a && this.c == adBreakInfo.c && this.d == adBreakInfo.d && Arrays.equals(this.e, adBreakInfo.e) && this.f == adBreakInfo.f;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String[] i() {
        return this.e;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            jSONObject.put("position", ((double) this.a) / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f);
            jSONObject.put("duration", ((double) this.c) / 1000.0d);
            if (this.e != null) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.e) {
                    jSONArray.put(put);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, H());
        SafeParcelWriter.writeString(parcel, 3, G(), false);
        SafeParcelWriter.writeLong(parcel, 4, F());
        SafeParcelWriter.writeBoolean(parcel, 5, X());
        SafeParcelWriter.writeStringArray(parcel, 6, i(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, I());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
