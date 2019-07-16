package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
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
import com.google.android.gms.internal.cast.X;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "MediaTrackCreator")
@Reserved({1})
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MediaTrack> CREATOR = new F();
    @Field(getter = "getId", id = 2)
    private long a;
    @Field(getter = "getType", id = 3)
    private int b;
    @Field(getter = "getContentId", id = 4)
    private String c;
    @Field(getter = "getContentType", id = 5)
    private String d;
    @Field(getter = "getName", id = 6)
    private String e;
    @Field(getter = "getLanguage", id = 7)
    private String f;
    @Field(getter = "getSubtype", id = 8)
    private int g;
    @Field(id = 9)
    private String h;
    private JSONObject i;

    @VisibleForTesting
    public static class a {
        private final MediaTrack a;

        public a(long j, int i) throws IllegalArgumentException {
            this.a = new MediaTrack(j, i);
        }

        public a a(String str) {
            this.a.a(str);
            return this;
        }

        public a b(String str) {
            this.a.b(str);
            return this;
        }

        public a a(int i) throws IllegalArgumentException {
            this.a.m(i);
            return this;
        }

        public MediaTrack a() {
            return this.a;
        }
    }

    @Constructor
    MediaTrack(@Param(id = 2) long j, @Param(id = 3) int i2, @Param(id = 4) String str, @Param(id = 5) String str2, @Param(id = 6) String str3, @Param(id = 7) String str4, @Param(id = 8) int i3, @Param(id = 9) String str5) {
        this.a = j;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i3;
        this.h = str5;
        String str6 = this.h;
        if (str6 != null) {
            try {
                this.i = new JSONObject(str6);
            } catch (JSONException unused) {
                this.i = null;
                this.h = null;
            }
        } else {
            this.i = null;
        }
    }

    public final String F() {
        return this.d;
    }

    public final long G() {
        return this.a;
    }

    public final String H() {
        return this.f;
    }

    public final int I() {
        return this.g;
    }

    public final int X() {
        return this.b;
    }

    public final void a(String str) {
        this.c = str;
    }

    /* access modifiers changed from: 0000 */
    public final void b(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.i == null) != (mediaTrack.i == null)) {
            return false;
        }
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            JSONObject jSONObject2 = mediaTrack.i;
            if (jSONObject2 != null && !JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return this.a == mediaTrack.a && this.b == mediaTrack.b && X.a(this.c, mediaTrack.c) && X.a(this.d, mediaTrack.d) && X.a(this.e, mediaTrack.e) && X.a(this.f, mediaTrack.f) && this.g == mediaTrack.g;
    }

    public final String getName() {
        return this.e;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), String.valueOf(this.i));
    }

    public final String i() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final void m(int i2) throws IllegalArgumentException {
        if (i2 < 0 || i2 > 5) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("invalid subtype ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 == 0 || this.b == 1) {
            this.g = i2;
        } else {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.a);
            int i2 = this.b;
            String str = C1325gg.TYPE;
            if (i2 == 1) {
                jSONObject.put(str, "TEXT");
            } else if (i2 == 2) {
                jSONObject.put(str, "AUDIO");
            } else if (i2 == 3) {
                jSONObject.put(str, "VIDEO");
            }
            if (this.c != null) {
                jSONObject.put("trackContentId", this.c);
            }
            if (this.d != null) {
                jSONObject.put("trackContentType", this.d);
            }
            if (this.e != null) {
                jSONObject.put("name", this.e);
            }
            if (!TextUtils.isEmpty(this.f)) {
                jSONObject.put("language", this.f);
            }
            int i3 = this.g;
            String str2 = "subtype";
            if (i3 == 1) {
                jSONObject.put(str2, "SUBTITLES");
            } else if (i3 == 2) {
                jSONObject.put(str2, "CAPTIONS");
            } else if (i3 == 3) {
                jSONObject.put(str2, "DESCRIPTIONS");
            } else if (i3 == 4) {
                jSONObject.put(str2, "CHAPTERS");
            } else if (i3 == 5) {
                jSONObject.put(str2, "METADATA");
            }
            if (this.i != null) {
                jSONObject.put("customData", this.i);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, G());
        SafeParcelWriter.writeInt(parcel, 3, X());
        SafeParcelWriter.writeString(parcel, 4, i(), false);
        SafeParcelWriter.writeString(parcel, 5, F(), false);
        SafeParcelWriter.writeString(parcel, 6, getName(), false);
        SafeParcelWriter.writeString(parcel, 7, H(), false);
        SafeParcelWriter.writeInt(parcel, 8, I());
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    MediaTrack(JSONObject jSONObject) throws JSONException {
        this(0, 0, null, null, null, null, -1, null);
        this.a = jSONObject.getLong("trackId");
        String string = jSONObject.getString(C1325gg.TYPE);
        if ("TEXT".equals(string)) {
            this.b = 1;
        } else if ("AUDIO".equals(string)) {
            this.b = 2;
        } else if ("VIDEO".equals(string)) {
            this.b = 3;
        } else {
            String str = "invalid type: ";
            String valueOf = String.valueOf(string);
            throw new JSONException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        this.c = jSONObject.optString("trackContentId", null);
        this.d = jSONObject.optString("trackContentType", null);
        this.e = jSONObject.optString("name", null);
        this.f = jSONObject.optString("language", null);
        String str2 = "subtype";
        if (jSONObject.has(str2)) {
            String string2 = jSONObject.getString(str2);
            if ("SUBTITLES".equals(string2)) {
                this.g = 1;
            } else if ("CAPTIONS".equals(string2)) {
                this.g = 2;
            } else if ("DESCRIPTIONS".equals(string2)) {
                this.g = 3;
            } else if ("CHAPTERS".equals(string2)) {
                this.g = 4;
            } else if ("METADATA".equals(string2)) {
                this.g = 5;
            } else {
                this.g = -1;
            }
        } else {
            this.g = 0;
        }
        this.i = jSONObject.optJSONObject("customData");
    }

    MediaTrack(long j, int i2) throws IllegalArgumentException {
        this(0, 0, null, null, null, null, -1, null);
        this.a = j;
        if (i2 <= 0 || i2 > 3) {
            StringBuilder sb = new StringBuilder(24);
            sb.append("invalid type ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.b = i2;
    }
}
