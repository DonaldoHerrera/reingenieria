package com.soundcloud.android.onboarding.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: AutoValue_AgeRestrictionError */
final class I extends C4218p {
    private final String a;

    I(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null minimumAge");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("minimum_age")
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4218p)) {
            return false;
        }
        return this.a.equals(((C4218p) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgeRestrictionError{minimumAge=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
