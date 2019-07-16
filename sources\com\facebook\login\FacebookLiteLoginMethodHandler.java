package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.Z;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<FacebookLiteLoginMethodHandler> CREATOR = new C0580m();

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Request request) {
        String e = LoginClient.e();
        Intent a = Z.a((Context) this.b.c(), request.a(), (Collection<String>) request.h(), e, request.j(), request.i(), request.d(), a(request.b()), request.c());
        a("e2e", e);
        return a(a, LoginClient.h());
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
