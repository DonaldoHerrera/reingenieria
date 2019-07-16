package com.soundcloud.android.player.ui.waveform;

/* compiled from: WaveformData.kt */
public final class c {
    public static final b a(b bVar, double d) {
        int i;
        b bVar2 = bVar;
        C7471uYa.b(bVar2, "$this$scale");
        int i2 = 0;
        if (d >= ((double) 0)) {
            double size = ((double) bVar.b().size()) / d;
            int ceil = (int) Math.ceil(d);
            if (d == ((double) bVar.b().size())) {
                return bVar2;
            }
            int[] iArr = new int[ceil];
            int i3 = 0;
            while (i2 < ceil) {
                double d2 = ((double) i2) * size;
                int i4 = i2 + 1;
                double d3 = ((double) i4) * size;
                int i5 = (int) d2;
                double d4 = size;
                double d5 = ((double) 1) - (d2 - ((double) i5));
                double doubleValue = ((Number) bVar.b().get(i5)).doubleValue() * d5;
                int i6 = i5 + 1;
                while (true) {
                    i = (int) d3;
                    if (i6 < i && i6 < bVar.b().size()) {
                        doubleValue += (double) ((Number) bVar.b().get(i6)).intValue();
                        d5 += 1.0d;
                        i6++;
                    }
                }
                if (d3 < ((double) bVar.b().size())) {
                    double d6 = d3 - ((double) i);
                    doubleValue += ((Number) bVar.b().get(i)).doubleValue() * d6;
                    d5 += d6;
                }
                iArr[i2] = (int) Math.round(doubleValue / d5);
                if (iArr[i2] > i3) {
                    i3 = iArr[i2];
                }
                i2 = i4;
                size = d4;
            }
            return b.a.a(i3, iArr);
        }
        throw new IllegalArgumentException("invalid width");
    }
}
