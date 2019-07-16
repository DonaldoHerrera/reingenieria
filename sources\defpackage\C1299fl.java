package defpackage;

import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;

/* renamed from: fl reason: default package and case insensitive filesystem */
/* compiled from: DeviceRequestsHelper */
class C1299fl implements RegistrationListener {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    C1299fl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        C1330gl.a(this.b);
    }

    public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        if (!this.a.equals(nsdServiceInfo.getServiceName())) {
            C1330gl.a(this.b);
        }
    }

    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
    }

    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
    }
}
