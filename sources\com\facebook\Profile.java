package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.ia;
import com.facebook.internal.ia.a;
import com.facebook.internal.ja;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Creator<Profile> CREATOR = new Q();
    /* access modifiers changed from: private */
    public static final String a = "Profile";
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Uri g;

    /* synthetic */ Profile(Parcel parcel, P p) {
        this(parcel);
    }

    public static void b() {
        AccessToken c2 = AccessToken.c();
        if (!AccessToken.m()) {
            a(null);
        } else {
            ia.a(c2.k(), (a) new P());
        }
    }

    public static Profile c() {
        return T.b().a();
    }

    public String d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            jSONObject.put("first_name", this.c);
            jSONObject.put("middle_name", this.d);
            jSONObject.put("last_name", this.e);
            jSONObject.put("name", this.f);
            if (this.g == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.g.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r5.c == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r5.d == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r5.e == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r5.f == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r5.g == null) goto L_0x0075;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (!this.b.equals(profile.b) || this.c != null) {
            if (!this.c.equals(profile.c) || this.d != null) {
                if (!this.d.equals(profile.d) || this.e != null) {
                    if (!this.e.equals(profile.e) || this.f != null) {
                        if (!this.f.equals(profile.f) || this.g != null) {
                            z = this.g.equals(profile.g);
                            return z;
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode = 527 + this.b.hashCode();
        String str = this.c;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.d;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.e;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.g;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        Uri uri = this.g;
        parcel.writeString(uri == null ? null : uri.toString());
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        ja.a(str, "id");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = uri;
    }

    public static void a(Profile profile) {
        T.b().a(profile);
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.b = jSONObject.optString("id", null);
        this.c = jSONObject.optString("first_name", null);
        this.d = jSONObject.optString("middle_name", null);
        this.e = jSONObject.optString("last_name", null);
        this.f = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.g = uri;
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.g = uri;
    }
}
