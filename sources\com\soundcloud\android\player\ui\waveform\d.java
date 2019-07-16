package com.soundcloud.android.player.ui.waveform;

import java.util.Set;

/* compiled from: WaveformDataWithComments.kt */
public final class d {
    private final b a;
    private final Set<C3799jda> b;
    private final long c;

    public d(b bVar, Set<C3799jda> set, long j) {
        C7471uYa.b(bVar, "waveformData");
        C7471uYa.b(set, "comments");
        this.a = bVar;
        this.b = set;
        this.c = j;
    }

    public final Set<C3799jda> a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (C7471uYa.a((Object) this.a, (Object) dVar.a) && C7471uYa.a((Object) this.b, (Object) dVar.b)) {
                    if (this.c == dVar.c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        b bVar = this.a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        Set<C3799jda> set = this.b;
        if (set != null) {
            i = set.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        long j = this.c;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WaveformDataWithComments(waveformData=");
        sb.append(this.a);
        sb.append(", comments=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
