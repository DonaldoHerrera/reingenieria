package com.google.firebase.perf.internal;

import android.util.Log;
import com.google.android.gms.internal.firebase-perf.Da;
import java.util.Iterator;
import java.util.Map.Entry;

final class k extends q {
    private Da a;

    k(Da da) {
        this.a = da;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0052 A[SYNTHETIC] */
    private final boolean b(Da da, int i) {
        boolean z;
        boolean z2;
        if (da == null) {
            return false;
        }
        String str = "FirebasePerformance";
        if (i > 1) {
            Log.w(str, "Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Entry entry : da.t().entrySet()) {
            String str2 = (String) entry.getKey();
            if (str2 != null) {
                String trim = str2.trim();
                if (trim.isEmpty()) {
                    Log.w(str, "counterId is empty");
                } else if (trim.length() > 100) {
                    Log.w(str, "counterId exceeded max length 100");
                } else {
                    z = true;
                    if (z) {
                        String str3 = "invalid CounterId:";
                        String valueOf = String.valueOf((String) entry.getKey());
                        Log.w(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        return false;
                    }
                    if (((Long) entry.getValue()) != null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        String valueOf2 = String.valueOf(entry.getValue());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                        sb.append("invalid CounterValue:");
                        sb.append(valueOf2);
                        Log.w(str, sb.toString());
                        return false;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        for (Da b : da.u()) {
            if (!b(b, i + 1)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a() {
        boolean z;
        boolean z2;
        String str = "FirebasePerformance";
        if (!a(this.a, 0)) {
            String str2 = "Invalid Trace:";
            String valueOf = String.valueOf(this.a.p());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
        Da da = this.a;
        if (da.s() > 0) {
            z = true;
        } else {
            Iterator it = da.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((Da) it.next()).s() > 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            z = true;
        }
        if (!z || b(this.a, 0)) {
            return true;
        }
        String str3 = "Invalid Counters for Trace:";
        String valueOf2 = String.valueOf(this.a.p());
        Log.w(str, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    private final boolean a(Da da, int i) {
        boolean z;
        boolean z2;
        String str = "FirebasePerformance";
        if (da == null) {
            Log.w(str, "TraceMetric is null");
            return false;
        } else if (i > 1) {
            Log.w(str, "Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else {
            String p = da.p();
            if (p != null) {
                String trim = p.trim();
                if (!trim.isEmpty() && trim.length() <= 100) {
                    z = true;
                    if (z) {
                        String str2 = "invalid TraceId:";
                        String valueOf = String.valueOf(da.p());
                        Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        return false;
                    }
                    if (!(da != null && da.o() > 0)) {
                        long o = da.o();
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("invalid TraceDuration:");
                        sb.append(o);
                        Log.w(str, sb.toString());
                        return false;
                    } else if (!da.q()) {
                        Log.w(str, "clientStartTimeUs is null.");
                        return false;
                    } else {
                        for (Da a2 : da.u()) {
                            if (!a(a2, i + 1)) {
                                return false;
                            }
                        }
                        Iterator it = da.v().entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = true;
                                break;
                            }
                            String a3 = q.a((Entry) it.next());
                            if (a3 != null) {
                                Log.w(str, a3);
                                z2 = false;
                                break;
                            }
                        }
                        return z2;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }
}
