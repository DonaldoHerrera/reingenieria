package com.soundcloud.android.cast;

import com.google.android.gms.cast.C0632f;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0667t;

/* compiled from: SimpleCastSessionManagerListener */
abstract class G implements C0667t<C0636d> {
    G() {
    }

    public abstract void a(String str);

    public void c(C0636d dVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionStartFailed() called with: castSession = [");
        sb.append(dVar);
        sb.append("], error = [");
        sb.append(i);
        sb.append(": ");
        sb.append(C0632f.getStatusCodeString(i));
        sb.append("]");
        a(sb.toString());
    }

    /* renamed from: d */
    public void a(C0636d dVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionSuspended() called with: castSession = [");
        sb.append(dVar);
        sb.append("], reason = [");
        sb.append(i);
        sb.append(": ");
        sb.append(a(i));
        sb.append("]");
        a(sb.toString());
    }

    /* renamed from: b */
    public void a(C0636d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionStarting() called with: castSession = [");
        sb.append(dVar);
        sb.append("]");
        a(sb.toString());
    }

    /* renamed from: a */
    public void b(C0636d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionEnding() called with: castSession = [");
        sb.append(dVar);
        sb.append("]");
        a(sb.toString());
    }

    public void b(C0636d dVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionStarted() called with: castSession = [");
        sb.append(dVar);
        sb.append("], sessionId = [");
        sb.append(str);
        sb.append("]");
        a(sb.toString());
    }

    /* renamed from: a */
    public void b(C0636d dVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionEnded() called with: castSession = [");
        sb.append(dVar);
        sb.append("], error = [");
        sb.append(i);
        sb.append(": ");
        sb.append(C0632f.getStatusCodeString(i));
        sb.append("]");
        a(sb.toString());
    }

    /* renamed from: b */
    public void d(C0636d dVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionResumeFailed() called with: castSession = [");
        sb.append(dVar);
        sb.append("], error = [");
        sb.append(i);
        sb.append(": ");
        sb.append(C0632f.getStatusCodeString(i));
        sb.append("]");
        a(sb.toString());
    }

    public void a(C0636d dVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionResuming() called with: castSession = [");
        sb.append(dVar);
        sb.append("], sessionId = [");
        sb.append(str);
        sb.append("]");
        a(sb.toString());
    }

    public void a(C0636d dVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionResumed() called with: castSession = [");
        sb.append(dVar);
        sb.append("], wasSuspended = [");
        sb.append(z);
        sb.append("]");
        a(sb.toString());
    }

    private static String a(int i) {
        if (i == 1) {
            return "CAUSE_SERVICE_DISCONNECTED";
        }
        if (i == 2) {
            return "CAUSE_NETWORK_LOST";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UNKNOWN REASON: ");
        sb.append(i);
        return sb.toString();
    }
}
