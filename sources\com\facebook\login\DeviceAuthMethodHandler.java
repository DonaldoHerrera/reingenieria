package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.C0538h;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Creator<DeviceAuthMethodHandler> CREATOR = new C0578k();
    private static ScheduledThreadPoolExecutor c;

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private void b(Request request) {
        FragmentActivity c2 = this.b.c();
        if (c2 != null && !c2.isFinishing()) {
            DeviceAuthDialog d = d();
            d.show(c2.getSupportFragmentManager(), "login_with_facebook");
            d.a(request);
        }
    }

    public static synchronized ScheduledThreadPoolExecutor e() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (c == null) {
                c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = c;
        }
        return scheduledThreadPoolExecutor;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Request request) {
        b(request);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return "device_auth";
    }

    /* access modifiers changed from: protected */
    public DeviceAuthDialog d() {
        return new DeviceAuthDialog();
    }

    public int describeContents() {
        return 0;
    }

    public void f() {
        this.b.b(Result.a(this.b.i(), "User canceled log in."));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void a(Exception exc) {
        this.b.b(Result.a(this.b.i(), null, exc.getMessage()));
    }

    public void a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C0538h hVar, Date date, Date date2, Date date3) {
        AccessToken accessToken = new AccessToken(str, str2, str3, collection, collection2, collection3, hVar, date, date2, date3);
        this.b.b(Result.a(this.b.i(), accessToken));
    }
}
