package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
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

@Class(creator = "AdBreakStatusCreator")
@Reserved({1})
public class AdBreakStatus extends AbstractSafeParcelable {
    public static final Creator<AdBreakStatus> CREATOR = new K();
    @Field(getter = "getCurrentBreakTimeInMs", id = 2)
    private final long a;
    @Field(getter = "getCurrentBreakClipTimeInMs", id = 3)
    private final long b;
    @Field(getter = "getBreakId", id = 4)
    private final String c;
    @Field(getter = "getBreakClipId", id = 5)
    private final String d;
    @Field(getter = "getWhenSkippableInMs", id = 6)
    private final long e;

    @Constructor
    AdBreakStatus(@Param(id = 2) long j, @Param(id = 3) long j2, @Param(id = 4) String str, @Param(id = 5) String str2, @Param(id = 6) long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    static AdBreakStatus a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        AdBreakStatus adBreakStatus = null;
        if (jSONObject2 == null) {
            return null;
        }
        String str = "currentBreakTime";
        if (jSONObject2.has(str)) {
            String str2 = "currentBreakClipTime";
            if (jSONObject2.has(str2)) {
                try {
                    long j = (long) (((double) jSONObject2.getLong(str)) * 1000.0d);
                    long j2 = (long) (((double) jSONObject2.getLong(str2)) * 1000.0d);
                    String optString = jSONObject2.optString("breakId", null);
                    String optString2 = jSONObject2.optString("breakClipId", null);
                    long optLong = jSONObject2.optLong("whenSkippable", -1);
                    AdBreakStatus adBreakStatus2 = new AdBreakStatus(j, j2, optString, optString2, optLong != -1 ? (long) (((double) optLong) * 1000.0d) : optLong);
                    return adBreakStatus2;
                } catch (JSONException e2) {
                    Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[]{e2.getMessage()}));
                    adBreakStatus = null;
                }
            }
        }
        return adBreakStatus;
    }

    public String F() {
        return this.c;
    }

    public long G() {
        return this.b;
    }

    public long H() {
        return this.a;
    }

    public long I() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.a == adBreakStatus.a && this.b == adBreakStatus.b && X.a(this.c, adBreakStatus.c) && X.a(this.d, adBreakStatus.d) && this.e == adBreakStatus.e;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e));
    }

    public String i() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, H());
        SafeParcelWriter.writeLong(parcel, 3, G());
        SafeParcelWriter.writeString(parcel, 4, F(), false);
        SafeParcelWriter.writeString(parcel, 5, i(), false);
        SafeParcelWriter.writeLong(parcel, 6, I());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
