package com.soundcloud.android.playback;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: AutoValue_PlayPublisherPayload */
final class G extends Qa {
    private final String a;
    private final String b;
    private final long c;

    G(String str, String str2, long j) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null gatewayId");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("gateway_id")
    public String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("registration_id")
    public String b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("timestamp")
    public long c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r7.c == r8.c()) goto L_0x0038;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Qa)) {
            return false;
        }
        Qa qa = (Qa) obj;
        if (this.a.equals(qa.a())) {
            String str = this.b;
            if (str != null ? str.equals(qa.b()) : qa.b() == null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.c;
        return hashCode2 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayPublisherPayload{gatewayId=");
        sb.append(this.a);
        sb.append(", regestrationId=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
