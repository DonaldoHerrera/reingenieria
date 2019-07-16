package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cU reason: default package and case insensitive filesystem */
/* compiled from: DeviceManagement.kt */
public final class C2492cU {
    private final boolean a;
    private final boolean b;

    @JsonCreator
    public C2492cU(@JsonProperty("authorized") boolean z, @JsonProperty("recoverable") boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return !this.a && this.b;
    }

    public final boolean b() {
        return !this.a;
    }

    public final boolean c() {
        return !this.a && !this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2492cU) {
                C2492cU cUVar = (C2492cU) obj;
                if (this.a == cUVar.a) {
                    if (this.b == cUVar.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.b;
        if (!z2) {
            i = z2;
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceManagement(authorized=");
        sb.append(this.a);
        sb.append(", recoverable=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
