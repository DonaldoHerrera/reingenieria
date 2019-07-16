package com.soundcloud.android.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/payments/UpdateCheckout;", "", "state", "", "reason", "payload", "signature", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayload", "()Ljava/lang/String;", "getReason", "getSignature", "getState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments_release"}, mv = {1, 1, 15})
/* compiled from: UpdateCheckout.kt */
public final class Pa {
    public static final a a = new a(null);
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    /* compiled from: UpdateCheckout.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Pa a(C4631ola ola) {
            C7471uYa.b(ola, "payload");
            return new Pa("success", "ok", ola.a, ola.b);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final Pa a(String str) {
            C7471uYa.b(str, "reason");
            return new Pa("failure", str, null, null);
        }
    }

    @JsonCreator
    public Pa(@JsonProperty("state") String str, @JsonProperty("reason") String str2, @JsonProperty("payload") String str3, @JsonProperty("signature") String str4) {
        C7471uYa.b(str, "state");
        C7471uYa.b(str2, "reason");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @NXa
    public static final Pa a(String str) {
        return a.a(str);
    }

    @NXa
    public static final Pa a(C4631ola ola) {
        return a.a(ola);
    }

    public final String a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Pa) {
                Pa pa = (Pa) obj;
                if (C7471uYa.a((Object) this.b, (Object) pa.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) pa.c)) {
                        if (C7471uYa.a((Object) this.d, (Object) pa.d)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateCheckout(state=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", signature=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
