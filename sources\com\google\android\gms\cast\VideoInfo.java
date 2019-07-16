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
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "VideoInfoCreator")
@Reserved({1})
public final class VideoInfo extends AbstractSafeParcelable {
    public static final Creator<VideoInfo> CREATOR = new J();
    @Field(getter = "getWidth", id = 2)
    private int a;
    @Field(getter = "getHeight", id = 3)
    private int b;
    @Field(getter = "getHdrType", id = 4)
    private int c;

    @Constructor
    VideoInfo(@Param(id = 2) int i, @Param(id = 3) int i2, @Param(id = 4) int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    static VideoInfo a(JSONObject jSONObject) {
        int i;
        String str = "VideoInfo";
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            char c2 = 65535;
            int hashCode = string.hashCode();
            if (hashCode != 3218) {
                if (hashCode != 103158) {
                    if (hashCode != 113729) {
                        if (hashCode == 99136405) {
                            if (string.equals("hdr10")) {
                                c2 = 1;
                            }
                        }
                    } else if (string.equals("sdr")) {
                        c2 = 3;
                    }
                } else if (string.equals("hdr")) {
                    c2 = 2;
                }
            } else if (string.equals("dv")) {
                c2 = 0;
            }
            if (c2 == 0) {
                i = 3;
            } else if (c2 == 1) {
                i = 2;
            } else if (c2 == 2) {
                i = 4;
            } else if (c2 != 3) {
                Log.d(str, String.format(Locale.ROOT, "Unknown HDR type: %s", new Object[]{string}));
                i = 0;
            } else {
                i = 1;
            }
            return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
        } catch (JSONException e) {
            Log.d(str, String.format(Locale.ROOT, "Error while creating a VideoInfo instance from JSON: %s", new Object[]{e.getMessage()}));
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.b == videoInfo.getHeight() && this.a == videoInfo.getWidth() && this.c == videoInfo.i();
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.a;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c));
    }

    public final int i() {
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.writeInt(parcel, 4, i());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
