package com.google.firebase.perf.internal;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.firebase-perf.C0857ka;
import com.google.android.gms.internal.firebase-perf.C0857ka.b;
import com.google.android.gms.internal.firebase-perf.J;
import java.net.URI;

final class l extends q {
    private final C0857ka a;
    private final Context b;

    l(C0857ka kaVar, Context context) {
        this.b = context;
        this.a = kaVar;
    }

    private static boolean a(long j) {
        return j >= 0;
    }

    private static URI b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.w("FirebasePerformance", "getResultUrl throws exception", e);
            return null;
        }
    }

    private static boolean b(long j) {
        return j >= 0;
    }

    private static boolean c(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    public final boolean a() {
        boolean z;
        String str = "FirebasePerformance";
        if (c(this.a.o())) {
            String str2 = "URL is missing:";
            String valueOf = String.valueOf(this.a.o());
            Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
        URI b2 = b(this.a.o());
        if (b2 == null) {
            Log.i(str, "URL cannot be parsed");
            return false;
        }
        Context context = this.b;
        if (b2 == null) {
            z = false;
        } else {
            z = J.a(b2, context);
        }
        if (!z) {
            String valueOf2 = String.valueOf(b2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb.append("URL fails whitelist rule: ");
            sb.append(valueOf2);
            Log.i(str, sb.toString());
            return false;
        }
        String host = b2.getHost();
        if (!(host != null && !c(host) && host.length() <= 255)) {
            Log.i(str, "URL host is null or invalid");
            return false;
        }
        String scheme = b2.getScheme();
        if (!(scheme != null && ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)))) {
            Log.i(str, "URL scheme is null or invalid");
            return false;
        }
        if (!(b2.getUserInfo() == null)) {
            Log.i(str, "URL user info is null");
            return false;
        }
        int port = b2.getPort();
        if (!(port == -1 || port > 0)) {
            Log.i(str, "URL port is less than or equal to 0");
            return false;
        }
        b r = this.a.q() ? this.a.r() : null;
        if (!((r == null || r == b.HTTP_METHOD_UNKNOWN) ? false : true)) {
            String valueOf3 = String.valueOf(this.a.r());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 32);
            sb2.append("HTTP Method is null or invalid: ");
            sb2.append(valueOf3);
            Log.i(str, sb2.toString());
            return false;
        }
        if (this.a.p()) {
            if (!(this.a.w() > 0)) {
                int w = this.a.w();
                StringBuilder sb3 = new StringBuilder(49);
                sb3.append("HTTP ResponseCode is a negative value:");
                sb3.append(w);
                Log.i(str, sb3.toString());
                return false;
            }
        }
        if (this.a.s() && !b(this.a.t())) {
            long t = this.a.t();
            StringBuilder sb4 = new StringBuilder(56);
            sb4.append("Request Payload is a negative value:");
            sb4.append(t);
            Log.i(str, sb4.toString());
            return false;
        } else if (this.a.u() && !b(this.a.v())) {
            long v = this.a.v();
            StringBuilder sb5 = new StringBuilder(57);
            sb5.append("Response Payload is a negative value:");
            sb5.append(v);
            Log.i(str, sb5.toString());
            return false;
        } else if (!this.a.x() || this.a.y() <= 0) {
            long y = this.a.y();
            StringBuilder sb6 = new StringBuilder(84);
            sb6.append("Start time of the request is null, or zero, or a negative value:");
            sb6.append(y);
            Log.i(str, sb6.toString());
            return false;
        } else if (this.a.z() && !a(this.a.A())) {
            long A = this.a.A();
            StringBuilder sb7 = new StringBuilder(69);
            sb7.append("Time to complete the request is a negative value:");
            sb7.append(A);
            Log.i(str, sb7.toString());
            return false;
        } else if (this.a.B() && !a(this.a.C())) {
            long C = this.a.C();
            StringBuilder sb8 = new StringBuilder(112);
            sb8.append("Time from the start of the request to the start of the response is null or a negative value:");
            sb8.append(C);
            Log.i(str, sb8.toString());
            return false;
        } else if (!this.a.D() || this.a.E() <= 0) {
            long E = this.a.E();
            StringBuilder sb9 = new StringBuilder(108);
            sb9.append("Time from the start of the request to the end of the response is null, negative or zero:");
            sb9.append(E);
            Log.i(str, sb9.toString());
            return false;
        } else if (this.a.p()) {
            return true;
        } else {
            Log.i(str, "Did not receive a HTTP Response Code");
            return false;
        }
    }
}
