package com.facebook.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0538h;
import com.facebook.C0594t;
import com.facebook.internal.C0556q;
import com.facebook.internal.ia;
import com.facebook.internal.oa;
import com.facebook.login.LoginClient.Request;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR = new O();
    private oa d;
    private String e;

    static class a extends com.facebook.internal.oa.a {
        private String h;
        private String i;
        private String j = "fbconnect://success";

        public a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        public a a(boolean z) {
            this.j = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public a b(String str) {
            this.h = str;
            return this;
        }

        public a a(String str) {
            this.i = str;
            return this;
        }

        public oa a() {
            Bundle e = e();
            e.putString("redirect_uri", this.j);
            e.putString("client_id", b());
            e.putString("e2e", this.h);
            e.putString("response_type", "token,signed_request");
            e.putString("return_scopes", "true");
            e.putString("auth_type", this.i);
            return oa.a(c(), "oauth", e, f(), d());
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        oa oaVar = this.d;
        if (oaVar != null) {
            oaVar.cancel();
            this.d = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return "web_view";
    }

    /* access modifiers changed from: 0000 */
    public void b(Request request, Bundle bundle, C0594t tVar) {
        super.a(request, bundle, tVar);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public C0538h e() {
        return C0538h.WEB_VIEW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.e = parcel.readString();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Request request) {
        Bundle b = b(request);
        N n = new N(this, request);
        this.e = LoginClient.e();
        a("e2e", this.e);
        FragmentActivity c = this.b.c();
        boolean e2 = ia.e((Context) c);
        a aVar = new a(c, request.a(), b);
        aVar.b(this.e);
        aVar.a(e2);
        aVar.a(request.c());
        aVar.a(n);
        this.d = aVar.a();
        C0556q qVar = new C0556q();
        qVar.setRetainInstance(true);
        qVar.a((Dialog) this.d);
        qVar.show(c.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }
}
