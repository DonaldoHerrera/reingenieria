package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.internal.ia;
import com.facebook.internal.ja;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Creator<AccessToken> CREATOR = new C0531a();
    private static final Date a = new Date(Long.MAX_VALUE);
    private static final Date b = a;
    private static final Date c = new Date();
    private static final C0538h d = C0538h.FACEBOOK_APPLICATION_WEB;
    private final Date e;
    private final Set<String> f;
    private final Set<String> g;
    private final Set<String> h;
    private final String i;
    private final C0538h j;
    private final Date k;
    private final String l;
    private final String m;
    private final Date n;

    public interface a {
        void a(AccessToken accessToken);

        void a(C0594t tVar);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C0538h hVar, Date date, Date date2, Date date3) {
        ja.a(str, "accessToken");
        ja.a(str2, "applicationId");
        ja.a(str3, "userId");
        if (date == null) {
            date = b;
        }
        this.e = date;
        this.f = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.g = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.h = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        this.i = str;
        if (hVar == null) {
            hVar = d;
        }
        this.j = hVar;
        if (date2 == null) {
            date2 = c;
        }
        this.k = date2;
        this.l = str2;
        this.m = str3;
        if (date3 == null || date3.getTime() == 0) {
            date3 = b;
        }
        this.n = date3;
    }

    static void a() {
        AccessToken c2 = C0537g.d().c();
        if (c2 != null) {
            b(a(c2));
        }
    }

    public static void b(AccessToken accessToken) {
        C0537g.d().a(accessToken);
    }

    public static AccessToken c() {
        return C0537g.d().c();
    }

    public static boolean m() {
        AccessToken c2 = C0537g.d().c();
        return c2 != null && !c2.n();
    }

    private String p() {
        if (this.i == null) {
            return "null";
        }
        return B.a(O.INCLUDE_ACCESS_TOKENS) ? this.i : "ACCESS_TOKEN_REMOVED";
    }

    public Date d() {
        return this.n;
    }

    public int describeContents() {
        return 0;
    }

    public Set<String> e() {
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4.n.equals(r5.n) != false) goto L_0x0075;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.e.equals(accessToken.e) && this.f.equals(accessToken.f) && this.g.equals(accessToken.g) && this.h.equals(accessToken.h) && this.i.equals(accessToken.i) && this.j == accessToken.j && this.k.equals(accessToken.k)) {
            String str = this.l;
            if (str != null ? str.equals(accessToken.l) : accessToken.l == null) {
                if (this.m.equals(accessToken.m)) {
                }
            }
        }
        z = false;
        return z;
    }

    public Set<String> f() {
        return this.h;
    }

    public Date g() {
        return this.e;
    }

    public Date h() {
        return this.k;
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31;
        String str = this.l;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    public Set<String> i() {
        return this.f;
    }

    public C0538h j() {
        return this.j;
    }

    public String k() {
        return this.i;
    }

    public String l() {
        return this.m;
    }

    public boolean n() {
        return new Date().after(this.e);
    }

    /* access modifiers changed from: 0000 */
    public JSONObject o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.i);
        jSONObject.put("expires_at", this.e.getTime());
        jSONObject.put("permissions", new JSONArray(this.f));
        jSONObject.put("declined_permissions", new JSONArray(this.g));
        jSONObject.put("expired_permissions", new JSONArray(this.h));
        jSONObject.put("last_refresh", this.k.getTime());
        jSONObject.put("source", this.j.name());
        jSONObject.put("application_id", this.l);
        jSONObject.put("user_id", this.m);
        jSONObject.put("data_access_expiration_time", this.n.getTime());
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(p());
        a(sb);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.e.getTime());
        parcel.writeStringList(new ArrayList(this.f));
        parcel.writeStringList(new ArrayList(this.g));
        parcel.writeStringList(new ArrayList(this.h));
        parcel.writeString(this.i);
        parcel.writeString(this.j.name());
        parcel.writeLong(this.k.getTime());
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeLong(this.n.getTime());
    }

    public String b() {
        return this.l;
    }

    static AccessToken a(AccessToken accessToken) {
        AccessToken accessToken2 = new AccessToken(accessToken.i, accessToken.l, accessToken.l(), accessToken.i(), accessToken.e(), accessToken.f(), accessToken.j, new Date(), new Date(), accessToken.n);
        return accessToken2;
    }

    static AccessToken a(Bundle bundle) {
        List a2 = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a3 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List a4 = a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String a5 = N.a(bundle);
        if (ia.b(a5)) {
            a5 = B.f();
        }
        String str = a5;
        String c2 = N.c(bundle);
        try {
            AccessToken accessToken = new AccessToken(c2, str, ia.a(c2).getString("id"), a2, a3, a4, N.b(bundle), N.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), N.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
            return accessToken;
        } catch (JSONException unused) {
            return null;
        }
    }

    AccessToken(Parcel parcel) {
        this.e = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.g = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.h = Collections.unmodifiableSet(new HashSet(arrayList));
        this.i = parcel.readString();
        this.j = C0538h.valueOf(parcel.readString());
        this.k = new Date(parcel.readLong());
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = new Date(parcel.readLong());
    }

    static List<String> a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    static AccessToken a(JSONObject jSONObject) throws JSONException {
        Collection collection;
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            C0538h valueOf = C0538h.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            List a2 = ia.a(jSONArray);
            List a3 = ia.a(jSONArray2);
            if (optJSONArray == null) {
                collection = new ArrayList();
            } else {
                collection = ia.a(optJSONArray);
            }
            AccessToken accessToken = new AccessToken(string, string2, string3, a2, a3, collection, valueOf, date, date2, date3);
            return accessToken;
        }
        throw new C0594t("Unknown AccessToken serialization format.");
    }

    private void a(StringBuilder sb) {
        sb.append(" permissions:");
        if (this.f == null) {
            sb.append("null");
            return;
        }
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f));
        sb.append("]");
    }
}
