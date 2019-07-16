package com.soundcloud.android.player.ui.waveform;

import java.util.List;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/player/ui/waveform/WaveformData;", "", "maxAmplitude", "", "samples", "", "(ILjava/util/List;)V", "getMaxAmplitude", "()I", "getSamples", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "player-ui-components_release"}, mv = {1, 1, 15})
/* compiled from: WaveformData.kt */
public final class b {
    public static final a a = new a(null);
    private final int b;
    private final List<Integer> c;

    /* compiled from: WaveformData.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final b a(int i, int[] iArr) {
            C7471uYa.b(iArr, "samples");
            return new b(i, C6578hWa.d(iArr));
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public b(int i, List<Integer> list) {
        C7471uYa.b(list, "samples");
        this.b = i;
        this.c = list;
    }

    public final int a() {
        return this.b;
    }

    public final List<Integer> b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!(this.b == bVar.b) || !C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.b * 31;
        List<Integer> list = this.c;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WaveformData(maxAmplitude=");
        sb.append(this.b);
        sb.append(", samples=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
