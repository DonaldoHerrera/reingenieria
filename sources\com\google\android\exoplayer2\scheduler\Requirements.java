package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.PowerManager;

public final class Requirements implements Parcelable {
    public static final Creator<Requirements> CREATOR = new a();
    private final int a;

    public Requirements(int i) {
        if ((i & 2) != 0) {
            i |= 1;
        }
        this.a = i;
    }

    private boolean e(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i = C0471ar.a;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    public boolean a() {
        return (this.a & 8) != 0;
    }

    public boolean b() {
        return (this.a & 4) != 0;
    }

    public boolean c() {
        return (this.a & 1) != 0;
    }

    public boolean d() {
        return (this.a & 2) != 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Requirements.class != obj.getClass()) {
            return false;
        }
        if (this.a != ((Requirements) obj).a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    private int c(Context context) {
        if (!c()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || !a(connectivityManager)) {
            return this.a & 3;
        }
        if (!d() || !connectivityManager.isActiveNetworkMetered()) {
            return 0;
        }
        return 2;
    }

    private boolean d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        return z;
    }

    public boolean a(Context context) {
        return b(context) == 0;
    }

    public int b(Context context) {
        int c = c(context);
        if (a() && !d(context)) {
            c |= 8;
        }
        return (!b() || e(context)) ? c : c | 4;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        if (C0471ar.a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean z = false;
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
            z = true;
        }
        return !z;
    }
}
