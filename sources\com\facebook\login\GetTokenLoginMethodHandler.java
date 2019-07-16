package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.C0538h;
import com.facebook.internal.ba.a;
import com.facebook.internal.ia;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Creator<GetTokenLoginMethodHandler> CREATOR = new q();
    private C0581n c;

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        C0581n nVar = this.c;
        if (nVar != null) {
            nVar.a();
            this.c.a((a) null);
            this.c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return "get_token";
    }

    /* access modifiers changed from: 0000 */
    public void b(Request request, Bundle bundle) {
        C0581n nVar = this.c;
        if (nVar != null) {
            nVar.a((a) null);
        }
        this.c = null;
        this.b.k();
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> h = request.h();
            if (stringArrayList == null || (h != null && !stringArrayList.containsAll(h))) {
                HashSet hashSet = new HashSet();
                for (String str : h) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.a((Set<String>) hashSet);
            } else {
                a(request, bundle);
                return;
            }
        }
        this.b.m();
    }

    /* access modifiers changed from: 0000 */
    public void c(Request request, Bundle bundle) {
        this.b.b(Result.a(this.b.i(), LoginMethodHandler.a(bundle, C0538h.FACEBOOK_APPLICATION_SERVICE, request.a())));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Request request) {
        this.c = new C0581n(this.b.c(), request.a());
        if (!this.c.b()) {
            return false;
        }
        this.b.j();
        this.c.a((a) new C0582o(this, request));
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(Request request, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.b.j();
            ia.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (ia.a) new p(this, bundle, request));
            return;
        }
        c(request, bundle);
    }
}
