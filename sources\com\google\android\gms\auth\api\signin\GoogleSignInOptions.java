package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
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
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements Optional, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new e();
    @VisibleForTesting
    public static final Scope a = new Scope(Scopes.PROFILE);
    @VisibleForTesting
    public static final Scope b = new Scope(Scopes.EMAIL);
    @VisibleForTesting
    public static final Scope c = new Scope(Scopes.OPEN_ID);
    @VisibleForTesting
    public static final Scope d = new Scope(Scopes.GAMES_LITE);
    @VisibleForTesting
    public static final Scope e = new Scope(Scopes.GAMES);
    public static final GoogleSignInOptions f;
    public static final GoogleSignInOptions g;
    private static Comparator<Scope> h = new d();
    @VersionField(id = 1)
    private final int i;
    /* access modifiers changed from: private */
    @Field(getter = "getScopes", id = 2)
    public final ArrayList<Scope> j;
    /* access modifiers changed from: private */
    @Field(getter = "getAccount", id = 3)
    public Account k;
    /* access modifiers changed from: private */
    @Field(getter = "isIdTokenRequested", id = 4)
    public boolean l;
    /* access modifiers changed from: private */
    @Field(getter = "isServerAuthCodeRequested", id = 5)
    public final boolean m;
    /* access modifiers changed from: private */
    @Field(getter = "isForceCodeForRefreshToken", id = 6)
    public final boolean n;
    /* access modifiers changed from: private */
    @Field(getter = "getServerClientId", id = 7)
    public String o;
    /* access modifiers changed from: private */
    @Field(getter = "getHostedDomain", id = 8)
    public String p;
    /* access modifiers changed from: private */
    @Field(getter = "getExtensions", id = 9)
    public ArrayList<GoogleSignInOptionsExtensionParcelable> q;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> r;

    public static final class a {
        private Set<Scope> a = new HashSet();
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> h = new HashMap();

        public a() {
        }

        public final a a(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public final a b() {
            this.a.add(GoogleSignInOptions.c);
            return this;
        }

        public final a c() {
            this.a.add(GoogleSignInOptions.a);
            return this;
        }

        public final GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.e) && this.a.contains(GoogleSignInOptions.d)) {
                this.a.remove(GoogleSignInOptions.d);
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                b();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, null);
            return googleSignInOptions;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            Preconditions.checkNotNull(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.j);
            this.b = googleSignInOptions.m;
            this.c = googleSignInOptions.n;
            this.d = googleSignInOptions.l;
            this.e = googleSignInOptions.o;
            this.f = googleSignInOptions.k;
            this.g = googleSignInOptions.p;
            this.h = GoogleSignInOptions.b((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.q);
        }
    }

    static {
        a aVar = new a();
        aVar.b();
        aVar.c();
        f = aVar.a();
        a aVar2 = new a();
        aVar2.a(d, new Scope[0]);
        g = aVar2.a();
    }

    @Constructor
    GoogleSignInOptions(@Param(id = 1) int i2, @Param(id = 2) ArrayList<Scope> arrayList, @Param(id = 3) Account account, @Param(id = 4) boolean z, @Param(id = 5) boolean z2, @Param(id = 6) boolean z3, @Param(id = 7) String str, @Param(id = 8) String str2, @Param(id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i2, arrayList, account, z, z2, z3, str, str2, b((List<GoogleSignInOptionsExtensionParcelable>) arrayList2));
    }

    private final JSONObject Y() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.j, h);
            ArrayList<Scope> arrayList = this.j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jSONArray.put(((Scope) obj).getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.k != null) {
                jSONObject.put("accountName", this.k.name);
            }
            jSONObject.put("idTokenRequested", this.l);
            jSONObject.put("forceCodeForRefreshToken", this.n);
            jSONObject.put("serverAuthRequested", this.m);
            if (!TextUtils.isEmpty(this.o)) {
                jSONObject.put("serverClientId", this.o);
            }
            if (!TextUtils.isEmpty(this.p)) {
                jSONObject.put("hostedDomain", this.p);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static GoogleSignInOptions a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, AccountType.GOOGLE) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap<Integer,GoogleSignInOptionsExtensionParcelable>());
        return googleSignInOptions;
    }

    /* access modifiers changed from: private */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.i()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    @KeepForSdk
    public String F() {
        return this.o;
    }

    @KeepForSdk
    public boolean G() {
        return this.n;
    }

    @KeepForSdk
    public boolean H() {
        return this.l;
    }

    @KeepForSdk
    public boolean I() {
        return this.m;
    }

    public final String X() {
        return Y().toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.k.equals(r4.getAccount()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.o.equals(r4.F()) != false) goto L_0x006b;
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.q.size() <= 0) {
                if (googleSignInOptions.q.size() <= 0) {
                    if (this.j.size() == googleSignInOptions.getScopes().size()) {
                        if (this.j.containsAll(googleSignInOptions.getScopes())) {
                            if (this.k == null) {
                                if (googleSignInOptions.getAccount() == null) {
                                }
                            }
                            if (TextUtils.isEmpty(this.o)) {
                                if (TextUtils.isEmpty(googleSignInOptions.F())) {
                                }
                            }
                            if (this.n == googleSignInOptions.G() && this.l == googleSignInOptions.H() && this.m == googleSignInOptions.I()) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    @KeepForSdk
    public Account getAccount() {
        return this.k;
    }

    @KeepForSdk
    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.j);
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.j;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((Scope) obj).getScopeUri());
        }
        Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.a aVar = new com.google.android.gms.auth.api.signin.internal.a();
        aVar.a((Object) arrayList);
        aVar.a((Object) this.k);
        aVar.a((Object) this.o);
        aVar.a(this.n);
        aVar.a(this.l);
        aVar.a(this.m);
        return aVar.a();
    }

    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> i() {
        return this.q;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.i);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i2, false);
        SafeParcelWriter.writeBoolean(parcel, 4, H());
        SafeParcelWriter.writeBoolean(parcel, 5, I());
        SafeParcelWriter.writeBoolean(parcel, 6, G());
        SafeParcelWriter.writeString(parcel, 7, F(), false);
        SafeParcelWriter.writeString(parcel, 8, this.p, false);
        SafeParcelWriter.writeTypedList(parcel, 9, i(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.i = i2;
        this.j = arrayList;
        this.k = account;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = str;
        this.p = str2;
        this.q = new ArrayList<>(map.values());
        this.r = map;
    }

    /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, d dVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }
}
