package com.soundcloud.android.settings.offline;

/* compiled from: OfflineSettingsPresenter.kt */
public final class J {
    private final long a;
    private final boolean b;

    public J(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof J) {
                J j = (J) obj;
                if (this.a == j.a) {
                    if (this.b == j.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StorageUsageLimit(limit=");
        sb.append(this.a);
        sb.append(", showBelowLimitWarning=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
