package com.soundcloud.android.settings.notifications;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: NotificationPreference.kt */
public final class h {
    private final boolean a;
    private final boolean b;

    @JsonCreator
    public h(@JsonProperty("mobile") boolean z, @JsonProperty("mail") boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @JsonProperty("mail")
    public final boolean a() {
        return this.b;
    }

    @JsonProperty("mobile")
    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.a == hVar.a) {
                    if (this.b == hVar.b) {
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
        sb.append("NotificationPreference(_mobile=");
        sb.append(this.a);
        sb.append(", _mail=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
