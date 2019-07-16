package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.Z;
import com.facebook.login.LoginClient.Request;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<KatanaProxyLoginMethodHandler> CREATOR = new r();

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Request request) {
        String e = LoginClient.e();
        Intent b = Z.b(this.b.c(), request.a(), request.h(), e, request.j(), request.i(), request.d(), a(request.b()), request.c());
        a("e2e", e);
        return a(b, LoginClient.h());
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
