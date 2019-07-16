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
import com.google.android.gms.internal.cast.X;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "VastAdsRequestCreator")
@Reserved({1})
public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Creator<VastAdsRequest> CREATOR = new I();
    @Field(getter = "getAdTagUrl", id = 2)
    private final String a;
    @Field(getter = "getAdsResponse", id = 3)
    private final String b;

    @Constructor
    VastAdsRequest(@Param(id = 2) String str, @Param(id = 3) String str2) {
        this.a = str;
        this.b = str2;
    }

    public static VastAdsRequest a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new VastAdsRequest(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
    }

    public String F() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        return X.a(this.a, vastAdsRequest.a) && X.a(this.b, vastAdsRequest.b);
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public String i() {
        return this.a;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.a != null) {
                jSONObject.put("adTagUrl", this.a);
            }
            if (this.b != null) {
                jSONObject.put("adsResponse", this.b);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, i(), false);
        SafeParcelWriter.writeString(parcel, 3, F(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
