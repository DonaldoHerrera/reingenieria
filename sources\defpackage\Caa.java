package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.r;

/* renamed from: Caa reason: default package */
/* compiled from: PaymentFailureEvent */
public abstract class Caa extends J implements r {
    public static Caa a(String str) {
        return new C3485_Z(J.b(), J.c(), str);
    }

    public abstract String h();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payment failure: ");
        sb.append(h());
        return sb.toString();
    }

    public C3816lea a() {
        return C3816lea.a("Payment failure", C3808kea.a("Reason", h()));
    }
}
