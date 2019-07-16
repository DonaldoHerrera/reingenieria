package com.soundcloud.android.foundation.events;

/* renamed from: com.soundcloud.android.foundation.events.g reason: case insensitive filesystem */
/* compiled from: AutoValue_CurrentUserChangedEvent */
final class C3705g extends C3707i {
    private final int a;
    private final C3508cda b;

    C3705g(int i, C3508cda cda) {
        this.a = i;
        if (cda != null) {
            this.b = cda;
            return;
        }
        throw new NullPointerException("Null currentUserUrn");
    }

    public C3508cda b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3707i)) {
            return false;
        }
        C3707i iVar = (C3707i) obj;
        if (this.a != iVar.c() || !this.b.equals(iVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentUserChangedEvent{kind=");
        sb.append(this.a);
        sb.append(", currentUserUrn=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
