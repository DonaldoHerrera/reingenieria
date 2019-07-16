package defpackage;

import android.content.Intent;

/* renamed from: hla reason: default package and case insensitive filesystem */
/* compiled from: BillingResult */
public class C4575hla {
    private final int a;
    private final int b;
    private final Intent c;

    public C4575hla(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    private boolean e() {
        return C4623nla.a(this.c) == 0;
    }

    public String a() {
        if (this.b == 0) {
            return "payment failed";
        }
        if (e()) {
            return "unknown";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("billing error: ");
        sb.append(C4623nla.a(this.c));
        return sb.toString();
    }

    public C4631ola b() {
        return new C4631ola(this.c.getStringExtra("INAPP_PURCHASE_DATA"), this.c.getStringExtra("INAPP_DATA_SIGNATURE"));
    }

    public boolean c() {
        return this.a == 1001;
    }

    public boolean d() {
        return this.b == -1 && e();
    }
}
