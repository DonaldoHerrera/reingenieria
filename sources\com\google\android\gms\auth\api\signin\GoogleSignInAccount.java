package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new c();
    @VisibleForTesting
    private static Clock a = DefaultClock.getInstance();
    @VersionField(id = 1)
    private final int b;
    @Field(getter = "getId", id = 2)
    private String c;
    @Field(getter = "getIdToken", id = 3)
    private String d;
    @Field(getter = "getEmail", id = 4)
    private String e;
    @Field(getter = "getDisplayName", id = 5)
    private String f;
    @Field(getter = "getPhotoUrl", id = 6)
    private Uri g;
    @Field(getter = "getServerAuthCode", id = 7)
    private String h;
    @Field(getter = "getExpirationTimeSecs", id = 8)
    private long i;
    @Field(getter = "getObfuscatedIdentifier", id = 9)
    private String j;
    @Field(id = 10)
    private List<Scope> k;
    @Field(getter = "getGivenName", id = 11)
    private String l;
    @Field(getter = "getFamilyName", id = 12)
    private String m;
    private Set<Scope> n = new HashSet();

    @Constructor
    GoogleSignInAccount(@Param(id = 1) int i2, @Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) String str3, @Param(id = 5) String str4, @Param(id = 6) Uri uri, @Param(id = 7) String str5, @Param(id = 8) long j2, @Param(id = 9) String str6, @Param(id = 10) List<Scope> list, @Param(id = 11) String str7, @Param(id = 12) String str8) {
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = uri;
        this.h = str5;
        this.i = j2;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount a2 = a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString(Scopes.EMAIL, null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a2.h = jSONObject.optString("serverAuthCode", null);
        return a2;
    }

    private final JSONObject da() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (I() != null) {
                jSONObject.put("id", I());
            }
            if (X() != null) {
                jSONObject.put("tokenId", X());
            }
            if (F() != null) {
                jSONObject.put(Scopes.EMAIL, F());
            }
            if (i() != null) {
                jSONObject.put("displayName", i());
            }
            if (H() != null) {
                jSONObject.put("givenName", H());
            }
            if (G() != null) {
                jSONObject.put("familyName", G());
            }
            if (Y() != null) {
                jSONObject.put("photoUrl", Y().toString());
            }
            if (aa() != null) {
                jSONObject.put("serverAuthCode", aa());
            }
            jSONObject.put("expirationTime", this.i);
            jSONObject.put("obfuscatedIdentifier", this.j);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.k.toArray(new Scope[this.k.size()]);
            Arrays.sort(scopeArr, b.a);
            for (Scope scopeUri : scopeArr) {
                jSONArray.put(scopeUri.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String F() {
        return this.e;
    }

    public String G() {
        return this.m;
    }

    public String H() {
        return this.l;
    }

    public String I() {
        return this.c;
    }

    public String X() {
        return this.d;
    }

    public Uri Y() {
        return this.g;
    }

    @KeepForSdk
    public Set<Scope> Z() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public String aa() {
        return this.h;
    }

    public final String ba() {
        return this.j;
    }

    public final String ca() {
        JSONObject da = da();
        da.remove("serverAuthCode");
        return da.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.Z().equals(Z());
    }

    public Account getAccount() {
        String str = this.e;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + Z().hashCode();
    }

    public String i() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.b);
        SafeParcelWriter.writeString(parcel, 2, I(), false);
        SafeParcelWriter.writeString(parcel, 3, X(), false);
        SafeParcelWriter.writeString(parcel, 4, F(), false);
        SafeParcelWriter.writeString(parcel, 5, i(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, Y(), i2, false);
        SafeParcelWriter.writeString(parcel, 7, aa(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.i);
        SafeParcelWriter.writeString(parcel, 9, this.j, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.k, false);
        SafeParcelWriter.writeString(parcel, 11, H(), false);
        SafeParcelWriter.writeString(parcel, 12, G(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private static GoogleSignInAccount a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(a.currentTimeMillis() / 1000) : l2).longValue();
        Preconditions.checkNotEmpty(str7);
        Preconditions.checkNotNull(set);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
        return googleSignInAccount;
    }
}
