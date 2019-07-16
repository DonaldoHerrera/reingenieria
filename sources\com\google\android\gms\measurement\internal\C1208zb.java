package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.Ib;

/* renamed from: com.google.android.gms.measurement.internal.zb reason: case insensitive filesystem */
final class C1208zb implements Runnable {
    private final /* synthetic */ Ib a;
    private final /* synthetic */ ServiceConnection b;
    private final /* synthetic */ Ab c;

    C1208zb(Ab ab, Ib ib, ServiceConnection serviceConnection) {
        this.c = ab;
        this.a = ib;
        this.b = serviceConnection;
    }

    public final void run() {
        Ab ab = this.c;
        C1198xb xbVar = ab.b;
        String a2 = ab.a;
        Ib ib = this.a;
        ServiceConnection serviceConnection = this.b;
        Bundle a3 = xbVar.a(a2, ib);
        xbVar.a.d().i();
        if (a3 != null) {
            long j = a3.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                xbVar.a.e().s().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a3.getString(Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    xbVar.a.e().s().a("No referrer defined in install referrer response");
                } else {
                    xbVar.a.e().A().a("InstallReferrer API result", string);
                    Vd F = xbVar.a.F();
                    String str = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a4 = F.a(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
                    if (a4 == null) {
                        xbVar.a.e().s().a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a4.getString(Constants.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a3.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                xbVar.a.e().s().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a4.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == xbVar.a.g().l.a()) {
                            xbVar.a.a();
                            xbVar.a.e().A().a("Campaign has already been logged");
                        } else {
                            xbVar.a.g().l.a(j);
                            xbVar.a.a();
                            String str2 = "referrer API";
                            xbVar.a.e().A().a("Logging Install Referrer campaign from sdk with ", str2);
                            a4.putString("_cis", str2);
                            xbVar.a.x().b("auto", "_cmp", a4);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(xbVar.a.getContext(), serviceConnection);
        }
    }
}
