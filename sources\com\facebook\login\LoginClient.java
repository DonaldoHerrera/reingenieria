package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.C0594t;
import com.facebook.common.f;
import com.facebook.internal.ia;
import com.facebook.internal.ja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new t();
    LoginMethodHandler[] a;
    int b = -1;
    Fragment c;
    b d;
    a e;
    boolean f;
    Request g;
    Map<String, String> h;
    Map<String, String> i;
    private z j;

    public static class Request implements Parcelable {
        public static final Creator<Request> CREATOR = new u();
        private final s a;
        private Set<String> b;
        private final C0569b c;
        private final String d;
        private final String e;
        private boolean f;
        private String g;
        private String h;
        private String i;

        /* synthetic */ Request(Parcel parcel, t tVar) {
            this(parcel);
        }

        /* access modifiers changed from: 0000 */
        public void a(Set<String> set) {
            ja.a((Object) set, "permissions");
            this.b = set;
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return this.e;
        }

        /* access modifiers changed from: 0000 */
        public String c() {
            return this.h;
        }

        /* access modifiers changed from: 0000 */
        public C0569b d() {
            return this.c;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public String e() {
            return this.i;
        }

        /* access modifiers changed from: 0000 */
        public String f() {
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        public s g() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public Set<String> h() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public boolean i() {
            for (String a2 : this.b) {
                if (D.a(a2)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean j() {
            return this.f;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            s sVar = this.a;
            String str = null;
            parcel.writeString(sVar != null ? sVar.name() : null);
            parcel.writeStringList(new ArrayList(this.b));
            C0569b bVar = this.c;
            if (bVar != null) {
                str = bVar.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeByte(this.f ? (byte) 1 : 0);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
        }

        Request(s sVar, Set<String> set, C0569b bVar, String str, String str2, String str3) {
            this.f = false;
            this.a = sVar;
            if (set == null) {
                set = new HashSet<>();
            }
            this.b = set;
            this.c = bVar;
            this.h = str;
            this.d = str2;
            this.e = str3;
        }

        /* access modifiers changed from: 0000 */
        public void b(String str) {
            this.g = str;
        }

        /* access modifiers changed from: 0000 */
        public String a() {
            return this.d;
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            this.f = z;
        }

        /* access modifiers changed from: 0000 */
        public void a(String str) {
            this.i = str;
        }

        private Request(Parcel parcel) {
            boolean z = false;
            this.f = false;
            String readString = parcel.readString();
            C0569b bVar = null;
            this.a = readString != null ? s.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                bVar = C0569b.valueOf(readString2);
            }
            this.c = bVar;
            this.d = parcel.readString();
            this.e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            }
            this.f = z;
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
        }
    }

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new v();
        final a a;
        final AccessToken b;
        final String c;
        final String d;
        final Request e;
        public Map<String, String> f;
        public Map<String, String> g;

        enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String e;

            private a(String str) {
                this.e = str;
            }

            /* access modifiers changed from: 0000 */
            public String a() {
                return this.e;
            }
        }

        /* synthetic */ Result(Parcel parcel, t tVar) {
            this(parcel);
        }

        static Result a(Request request, AccessToken accessToken) {
            Result result = new Result(request, a.SUCCESS, accessToken, null, null);
            return result;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
            ia.a(parcel, this.f);
            ia.a(parcel, this.g);
        }

        Result(Request request, a aVar, AccessToken accessToken, String str, String str2) {
            ja.a((Object) aVar, "code");
            this.e = request;
            this.b = accessToken;
            this.c = str;
            this.a = aVar;
            this.d = str2;
        }

        static Result a(Request request, String str) {
            Result result = new Result(request, a.CANCEL, null, str, null);
            return result;
        }

        static Result a(Request request, String str, String str2) {
            return a(request, str, str2, null);
        }

        static Result a(Request request, String str, String str2, String str3) {
            String[] strArr = {str, str2};
            Request request2 = request;
            Result result = new Result(request2, a.ERROR, null, TextUtils.join(": ", ia.a((T[]) strArr)), str3);
            return result;
        }

        private Result(Parcel parcel) {
            this.a = a.valueOf(parcel.readString());
            this.b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f = ia.a(parcel);
            this.g = ia.a(parcel);
        }
    }

    interface a {
        void a();

        void b();
    }

    public interface b {
        void a(Result result);
    }

    public LoginClient(Fragment fragment) {
        this.c = fragment;
    }

    static String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static int h() {
        return com.facebook.internal.C0551l.b.Login.a();
    }

    private void n() {
        a(Result.a(this.g, "Login attempt failed.", null));
    }

    private z o() {
        z zVar = this.j;
        if (zVar == null || !zVar.a().equals(this.g.a())) {
            this.j = new z(c(), this.g.a());
        }
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment) {
        if (this.c == null) {
            this.c = fragment;
            return;
        }
        throw new C0594t("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: protected */
    public LoginMethodHandler[] b(Request request) {
        ArrayList arrayList = new ArrayList();
        s g2 = request.g();
        if (g2.d()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (g2.e()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (g2.c()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (g2.a()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (g2.f()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (g2.b()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* access modifiers changed from: 0000 */
    public FragmentActivity c() {
        return this.c.getActivity();
    }

    /* access modifiers changed from: 0000 */
    public LoginMethodHandler d() {
        int i2 = this.b;
        if (i2 >= 0) {
            return this.a[i2];
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public Fragment f() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.g != null && this.b >= 0;
    }

    public Request i() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean l() {
        LoginMethodHandler d2 = d();
        if (!d2.c() || b()) {
            boolean a2 = d2.a(this.g);
            if (a2) {
                o().b(this.g.b(), d2.b());
            } else {
                o().a(this.g.b(), d2.b());
                a("not_tried", d2.b(), true);
            }
            return a2;
        }
        a("no_internet_permission", "1", false);
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        if (this.b >= 0) {
            a(d().b(), "skipped", null, null, d().a);
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.a;
            if (loginMethodHandlerArr != null) {
                int i2 = this.b;
                if (i2 < loginMethodHandlerArr.length - 1) {
                    this.b = i2 + 1;
                }
            }
            if (this.g != null) {
                n();
            }
            return;
        } while (!l());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelableArray(this.a, i2);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.g, i2);
        ia.a(parcel, this.h);
        ia.a(parcel, this.i);
    }

    /* access modifiers changed from: 0000 */
    public void c(Request request) {
        if (!g()) {
            a(request);
        }
    }

    private void d(Result result) {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(result);
        }
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.a = new LoginMethodHandler[readParcelableArray.length];
        for (int i2 = 0; i2 < readParcelableArray.length; i2++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.a;
            loginMethodHandlerArr[i2] = (LoginMethodHandler) readParcelableArray[i2];
            loginMethodHandlerArr[i2].a(this);
        }
        this.b = parcel.readInt();
        this.g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.h = ia.a(parcel);
        this.i = ia.a(parcel);
    }

    /* access modifiers changed from: 0000 */
    public void a(Request request) {
        if (request != null) {
            if (this.g != null) {
                throw new C0594t("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.m() || b()) {
                this.g = request;
                this.a = b(request);
                m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(Result result) {
        Result result2;
        if (result.b != null) {
            AccessToken c2 = AccessToken.c();
            AccessToken accessToken = result.b;
            if (!(c2 == null || accessToken == null)) {
                try {
                    if (c2.l().equals(accessToken.l())) {
                        result2 = Result.a(this.g, result.b);
                        a(result2);
                        return;
                    }
                } catch (Exception e2) {
                    a(Result.a(this.g, "Caught exception", e2.getMessage()));
                    return;
                }
            }
            result2 = Result.a(this.g, "User logged in as different Facebook user.", null);
            a(result2);
            return;
        }
        throw new C0594t("Can't validate without a token");
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (this.b >= 0) {
            d().a();
        }
    }

    public boolean a(int i2, int i3, Intent intent) {
        if (this.g != null) {
            return d().a(i2, i3, intent);
        }
        return false;
    }

    private void a(String str, String str2, boolean z) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        if (this.h.containsKey(str) && z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.h.get(str));
            sb.append(",");
            sb.append(str2);
            str2 = sb.toString();
        }
        this.h.put(str, str2);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        if (this.f) {
            return true;
        }
        if (a("android.permission.INTERNET") != 0) {
            FragmentActivity c2 = c();
            a(Result.a(this.g, c2.getString(f.com_facebook_internet_permission_error_title), c2.getString(f.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f = true;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(Result result) {
        LoginMethodHandler d2 = d();
        if (d2 != null) {
            a(d2.b(), result, d2.a);
        }
        Map<String, String> map = this.h;
        if (map != null) {
            result.f = map;
        }
        Map<String, String> map2 = this.i;
        if (map2 != null) {
            result.g = map2;
        }
        this.a = null;
        this.b = -1;
        this.g = null;
        this.h = null;
        d(result);
    }

    /* access modifiers changed from: 0000 */
    public void b(Result result) {
        if (result.b == null || !AccessToken.m()) {
            a(result);
        } else {
            c(result);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        this.d = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        this.e = aVar;
    }

    /* access modifiers changed from: 0000 */
    public int a(String str) {
        return c().checkCallingOrSelfPermission(str);
    }

    private void a(String str, Result result, Map<String, String> map) {
        a(str, result.a.a(), result.c, result.d, map);
    }

    private void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.g == null) {
            o().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            o().a(this.g.b(), str, str2, str3, str4, map);
        }
    }
}
