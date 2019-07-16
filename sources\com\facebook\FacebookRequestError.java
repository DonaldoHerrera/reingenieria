package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.A;
import com.facebook.internal.C0559u;
import com.facebook.internal.E;
import com.facebook.internal.ia;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR = new C0597w();
    static final b a = new b(200, 299, null);
    private final a b;
    private final int c;
    private final int d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final JSONObject k;
    private final JSONObject l;
    private final Object m;
    private final HttpURLConnection n;
    private final C0594t o;

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    private static class b {
        private final int a;
        private final int b;

        /* synthetic */ b(int i, int i2, C0597w wVar) {
            this(i, i2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i) {
            return this.a <= i && i <= this.b;
        }

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, C0597w wVar) {
        this(parcel);
    }

    static FacebookRequestError a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        int i3;
        JSONObject jSONObject2 = jSONObject;
        String str5 = "error_code";
        String str6 = "error";
        String str7 = "FACEBOOK_NON_JSON_RESULT";
        String str8 = "body";
        String str9 = "code";
        try {
            if (jSONObject2.has(str9)) {
                int i4 = jSONObject2.getInt(str9);
                Object a2 = ia.a(jSONObject2, str8, str7);
                if (a2 != null && (a2 instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a2;
                    boolean z2 = true;
                    String str10 = "error_subcode";
                    if (jSONObject3.has(str6)) {
                        JSONObject jSONObject4 = (JSONObject) ia.a(jSONObject3, str6, (String) null);
                        String optString = jSONObject4.optString(C1325gg.TYPE, null);
                        String optString2 = jSONObject4.optString("message", null);
                        i3 = jSONObject4.optInt(str9, -1);
                        int optInt = jSONObject4.optInt(str10, -1);
                        str2 = jSONObject4.optString("error_user_msg", null);
                        str = jSONObject4.optString("error_user_title", null);
                        z = jSONObject4.optBoolean("is_transient", false);
                        str3 = optString2;
                        i2 = optInt;
                        str4 = optString;
                    } else {
                        String str11 = "error_msg";
                        String str12 = "error_reason";
                        if (!jSONObject3.has(str5)) {
                            if (!jSONObject3.has(str11)) {
                                if (!jSONObject3.has(str12)) {
                                    str4 = null;
                                    str3 = null;
                                    str2 = null;
                                    str = null;
                                    i3 = -1;
                                    i2 = -1;
                                    z2 = false;
                                    z = false;
                                }
                            }
                        }
                        String optString3 = jSONObject3.optString(str12, null);
                        String optString4 = jSONObject3.optString(str11, null);
                        int optInt2 = jSONObject3.optInt(str5, -1);
                        i2 = jSONObject3.optInt(str10, -1);
                        str4 = optString3;
                        str3 = optString4;
                        str2 = null;
                        str = null;
                        z = false;
                        i3 = optInt2;
                    }
                    if (z2) {
                        FacebookRequestError facebookRequestError = new FacebookRequestError(i4, i3, i2, str4, str3, str, str2, z, jSONObject3, jSONObject, obj, httpURLConnection, null);
                        return facebookRequestError;
                    }
                }
                if (!a.a(i4)) {
                    FacebookRequestError facebookRequestError2 = new FacebookRequestError(i4, -1, -1, null, null, null, null, false, jSONObject2.has(str8) ? (JSONObject) ia.a(jSONObject2, str8, str7) : null, jSONObject, obj, httpURLConnection, null);
                    return facebookRequestError2;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public int b() {
        return this.d;
    }

    public String c() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        return this.o.getLocalizedMessage();
    }

    public String d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public C0594t e() {
        return this.o;
    }

    public JSONObject f() {
        return this.k;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.c);
        sb.append(", errorCode: ");
        sb.append(this.d);
        sb.append(", subErrorCode: ");
        sb.append(this.e);
        sb.append(", errorType: ");
        sb.append(this.f);
        sb.append(", errorMessage: ");
        sb.append(c());
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    private FacebookRequestError(int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C0594t tVar) {
        boolean z2;
        a aVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = str2;
        this.l = jSONObject;
        this.k = jSONObject2;
        this.m = obj;
        this.n = httpURLConnection;
        this.h = str3;
        this.i = str4;
        if (tVar != null) {
            this.o = tVar;
            z2 = true;
        } else {
            this.o = new D(this, str2);
            z2 = false;
        }
        C0559u a2 = a();
        if (z2) {
            aVar = a.OTHER;
        } else {
            aVar = a2.a(i3, i4, z);
        }
        this.b = aVar;
        this.j = a2.a(this.b);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        Exception exc2 = exc;
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc2 instanceof C0594t ? (C0594t) exc2 : new C0594t((Throwable) exc2));
    }

    public FacebookRequestError(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    static synchronized C0559u a() {
        synchronized (FacebookRequestError.class) {
            A b2 = E.b(B.f());
            if (b2 == null) {
                C0559u a2 = C0559u.a();
                return a2;
            }
            C0559u d2 = b2.d();
            return d2;
        }
    }
}
