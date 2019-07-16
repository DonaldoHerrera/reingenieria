package com.google.android.gms.cast;

import android.graphics.Color;
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
import com.google.android.gms.internal.cast.X;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "TextTrackStyleCreator")
@Reserved({1})
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Creator<TextTrackStyle> CREATOR = new H();
    @Field(getter = "getFontScale", id = 2)
    private float a;
    @Field(getter = "getForegroundColor", id = 3)
    private int b;
    @Field(getter = "getBackgroundColor", id = 4)
    private int c;
    @Field(getter = "getEdgeType", id = 5)
    private int d;
    @Field(getter = "getEdgeColor", id = 6)
    private int e;
    @Field(getter = "getWindowType", id = 7)
    private int f;
    @Field(getter = "getWindowColor", id = 8)
    private int g;
    @Field(getter = "getWindowCornerRadius", id = 9)
    private int h;
    @Field(getter = "getFontFamily", id = 10)
    private String i;
    @Field(getter = "getFontGenericFamily", id = 11)
    private int j;
    @Field(getter = "getFontStyle", id = 12)
    private int k;
    @Field(id = 13)
    private String l;
    private JSONObject m;

    @Constructor
    TextTrackStyle(@Param(id = 2) float f2, @Param(id = 3) int i2, @Param(id = 4) int i3, @Param(id = 5) int i4, @Param(id = 6) int i5, @Param(id = 7) int i6, @Param(id = 8) int i7, @Param(id = 9) int i8, @Param(id = 10) String str, @Param(id = 11) int i9, @Param(id = 12) int i10, @Param(id = 13) String str2) {
        this.a = f2;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = str;
        this.j = i9;
        this.k = i10;
        this.l = str2;
        String str3 = this.l;
        if (str3 != null) {
            try {
                this.m = new JSONObject(str3);
            } catch (JSONException unused) {
                this.m = null;
                this.l = null;
            }
        } else {
            this.m = null;
        }
    }

    private static String m(int i2) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Integer.valueOf(Color.alpha(i2))});
    }

    public final int F() {
        return this.e;
    }

    public final int G() {
        return this.d;
    }

    public final String H() {
        return this.i;
    }

    public final int I() {
        return this.j;
    }

    public final float X() {
        return this.a;
    }

    public final int Y() {
        return this.k;
    }

    public final int Z() {
        return this.b;
    }

    public final void a(JSONObject jSONObject) throws JSONException {
        this.a = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.b = a(jSONObject.optString("foregroundColor"));
        this.c = a(jSONObject.optString("backgroundColor"));
        String str = "edgeType";
        String str2 = "NONE";
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (str2.equals(string)) {
                this.d = 0;
            } else if ("OUTLINE".equals(string)) {
                this.d = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.d = 2;
            } else if ("RAISED".equals(string)) {
                this.d = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.d = 4;
            }
        }
        this.e = a(jSONObject.optString("edgeColor"));
        String str3 = "windowType";
        String str4 = "NORMAL";
        if (jSONObject.has(str3)) {
            String string2 = jSONObject.getString(str3);
            if (str2.equals(string2)) {
                this.f = 0;
            } else if (str4.equals(string2)) {
                this.f = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f = 2;
            }
        }
        this.g = a(jSONObject.optString("windowColor"));
        if (this.f == 2) {
            this.h = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.i = jSONObject.optString("fontFamily", null);
        String str5 = "fontGenericFamily";
        if (jSONObject.has(str5)) {
            String string3 = jSONObject.getString(str5);
            if ("SANS_SERIF".equals(string3)) {
                this.j = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.j = 1;
            } else if ("SERIF".equals(string3)) {
                this.j = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.j = 3;
            } else if ("CASUAL".equals(string3)) {
                this.j = 4;
            } else if ("CURSIVE".equals(string3)) {
                this.j = 5;
            } else if ("SMALL_CAPITALS".equals(string3)) {
                this.j = 6;
            }
        }
        String str6 = "fontStyle";
        if (jSONObject.has(str6)) {
            String string4 = jSONObject.getString(str6);
            if (str4.equals(string4)) {
                this.k = 0;
            } else if ("BOLD".equals(string4)) {
                this.k = 1;
            } else if ("ITALIC".equals(string4)) {
                this.k = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.k = 3;
            }
        }
        this.m = jSONObject.optJSONObject("customData");
    }

    public final int aa() {
        return this.g;
    }

    public final int ba() {
        return this.h;
    }

    public final int ca() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        if ((this.m == null) != (textTrackStyle.m == null)) {
            return false;
        }
        JSONObject jSONObject = this.m;
        if (jSONObject != null) {
            JSONObject jSONObject2 = textTrackStyle.m;
            if (jSONObject2 != null && !JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return this.a == textTrackStyle.a && this.b == textTrackStyle.b && this.c == textTrackStyle.c && this.d == textTrackStyle.d && this.e == textTrackStyle.e && this.f == textTrackStyle.f && this.h == textTrackStyle.h && X.a(this.i, textTrackStyle.i) && this.j == textTrackStyle.j && this.k == textTrackStyle.k;
    }

    public final int hashCode() {
        return Objects.hashCode(Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.m));
    }

    public final int i() {
        return this.c;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", (double) this.a);
            if (this.b != 0) {
                jSONObject.put("foregroundColor", m(this.b));
            }
            if (this.c != 0) {
                jSONObject.put("backgroundColor", m(this.c));
            }
            int i2 = this.d;
            String str = "NONE";
            String str2 = "edgeType";
            if (i2 == 0) {
                jSONObject.put(str2, str);
            } else if (i2 == 1) {
                jSONObject.put(str2, "OUTLINE");
            } else if (i2 == 2) {
                jSONObject.put(str2, "DROP_SHADOW");
            } else if (i2 == 3) {
                jSONObject.put(str2, "RAISED");
            } else if (i2 == 4) {
                jSONObject.put(str2, "DEPRESSED");
            }
            if (this.e != 0) {
                jSONObject.put("edgeColor", m(this.e));
            }
            int i3 = this.f;
            String str3 = "NORMAL";
            String str4 = "windowType";
            if (i3 == 0) {
                jSONObject.put(str4, str);
            } else if (i3 == 1) {
                jSONObject.put(str4, str3);
            } else if (i3 == 2) {
                jSONObject.put(str4, "ROUNDED_CORNERS");
            }
            if (this.g != 0) {
                jSONObject.put("windowColor", m(this.g));
            }
            if (this.f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.h);
            }
            if (this.i != null) {
                jSONObject.put("fontFamily", this.i);
            }
            String str5 = "fontGenericFamily";
            switch (this.j) {
                case 0:
                    jSONObject.put(str5, "SANS_SERIF");
                case 1:
                    jSONObject.put(str5, "MONOSPACED_SANS_SERIF");
                case 2:
                    jSONObject.put(str5, "SERIF");
                case 3:
                    jSONObject.put(str5, "MONOSPACED_SERIF");
                case 4:
                    jSONObject.put(str5, "CASUAL");
                case 5:
                    jSONObject.put(str5, "CURSIVE");
                case 6:
                    jSONObject.put(str5, "SMALL_CAPITALS");
            }
            int i4 = this.k;
            String str6 = "fontStyle";
            if (i4 == 0) {
                jSONObject.put(str6, str3);
            } else if (i4 == 1) {
                jSONObject.put(str6, "BOLD");
            } else if (i4 == 2) {
                jSONObject.put(str6, "ITALIC");
            } else if (i4 == 3) {
                jSONObject.put(str6, "BOLD_ITALIC");
            }
            if (this.m != null) {
                jSONObject.put("customData", this.m);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.m;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, X());
        SafeParcelWriter.writeInt(parcel, 3, Z());
        SafeParcelWriter.writeInt(parcel, 4, i());
        SafeParcelWriter.writeInt(parcel, 5, G());
        SafeParcelWriter.writeInt(parcel, 6, F());
        SafeParcelWriter.writeInt(parcel, 7, ca());
        SafeParcelWriter.writeInt(parcel, 8, aa());
        SafeParcelWriter.writeInt(parcel, 9, ba());
        SafeParcelWriter.writeString(parcel, 10, H(), false);
        SafeParcelWriter.writeInt(parcel, 11, I());
        SafeParcelWriter.writeInt(parcel, 12, Y());
        SafeParcelWriter.writeString(parcel, 13, this.l, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    private static int a(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
