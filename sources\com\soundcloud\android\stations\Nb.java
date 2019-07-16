package com.soundcloud.android.stations;

/* compiled from: StationViewModel.kt */
public final class Nb {
    private final Sda a;
    private final boolean b;

    public Nb(Sda sda, boolean z) {
        C7471uYa.b(sda, "station");
        this.a = sda;
        this.b = z;
    }

    public final Sda a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Nb) {
                Nb nb = (Nb) obj;
                if (C7471uYa.a((Object) this.a, (Object) nb.a)) {
                    if (this.b == nb.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Sda sda = this.a;
        int hashCode = (sda != null ? sda.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationViewModel(station=");
        sb.append(this.a);
        sb.append(", isPlaying=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
