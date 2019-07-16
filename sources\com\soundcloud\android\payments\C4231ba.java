package com.soundcloud.android.payments;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.r;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/payments/PaymentErrorEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "Lcom/soundcloud/android/foundation/events/MetricEvent;", "errorType", "", "(Ljava/lang/String;)V", "getErrorType", "()Ljava/lang/String;", "id", "kotlin.jvm.PlatformType", "timeStamp", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "timestamp", "toMetric", "Lcom/soundcloud/android/foundation/events/technical/Metric;", "toString", "Companion", "payments_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.payments.ba reason: case insensitive filesystem */
/* compiled from: PaymentErrorEvent.kt */
public final class C4231ba extends J implements r {
    public static final a a = new a(null);
    private final long b = J.c();
    private final String c = J.b();
    private final String d;

    /* renamed from: com.soundcloud.android.payments.ba$a */
    /* compiled from: PaymentErrorEvent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4231ba(String str) {
        C7471uYa.b(str, "errorType");
        this.d = str;
    }

    public C3816lea a() {
        return C3816lea.a.a("PaymentError", C3808kea.a.a("Error Type", this.d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.d, (java.lang.Object) ((com.soundcloud.android.payments.C4231ba) r2).d) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4231ba) {
            }
            return false;
        }
        return true;
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentErrorEvent(errorType=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
