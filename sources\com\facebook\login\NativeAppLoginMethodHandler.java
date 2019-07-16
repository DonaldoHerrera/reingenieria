package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C0538h;
import com.facebook.C0594t;
import com.facebook.internal.da;
import com.facebook.internal.ia;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private Result b(Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = a(extras);
        String str = "error_code";
        String obj = extras.get(str) != null ? extras.get(str).toString() : null;
        String b = b(extras);
        String string = extras.getString("e2e");
        if (!ia.b(string)) {
            c(string);
        }
        if (a == null && obj == null && b == null) {
            try {
                return Result.a(request, LoginMethodHandler.a(request.h(), extras, C0538h.FACEBOOK_APPLICATION_WEB, request.a()));
            } catch (C0594t e) {
                return Result.a(request, null, e.getMessage());
            }
        } else if (da.a.contains(a)) {
            return null;
        } else {
            if (da.b.contains(a)) {
                return Result.a(request, (String) null);
            }
            return Result.a(request, a, b, obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, int i2, Intent intent) {
        Result result;
        Request i3 = this.b.i();
        if (intent == null) {
            result = Result.a(i3, "Operation canceled");
        } else if (i2 == 0) {
            result = a(i3, intent);
        } else if (i2 != -1) {
            result = Result.a(i3, "Unexpected resultCode from authorization.", null);
        } else {
            result = b(i3, intent);
        }
        if (result != null) {
            this.b.b(result);
        } else {
            this.b.m();
        }
        return true;
    }

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    private Result a(Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = a(extras);
        String str = "error_code";
        String obj = extras.get(str) != null ? extras.get(str).toString() : null;
        if ("CONNECTION_FAILURE".equals(obj)) {
            return Result.a(request, a, b(extras), obj);
        }
        return Result.a(request, a);
    }

    private String a(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    private String b(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* access modifiers changed from: protected */
    public boolean a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.b.f().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
