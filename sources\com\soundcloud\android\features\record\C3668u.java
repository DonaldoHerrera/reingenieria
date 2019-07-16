package com.soundcloud.android.features.record;

import android.content.Context;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.util.Log;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.soundcloud.android.features.record.u reason: case insensitive filesystem */
/* compiled from: AudioConfig */
public enum C3668u {
    PCM16_44100_2(16, 44100, 2),
    PCM16_44100_1(16, 44100, 1),
    PCM16_16000_1(16, 16000, 1),
    PCM16_22050_1(16, 22050, 1),
    PCM16_8000_1(16, 8000, 1),
    PCM8_8000_1(8, 8000, 1);
    
    public static final C3668u g = null;
    private static C3668u h;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    static {
        C3668u uVar;
        g = uVar;
    }

    private C3668u(int i2, int i3, int i4) {
        this.o = 0;
        if (i2 != 8 && i2 != 16) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid bitsPerSample:");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i4 < 1 || i4 > 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid channels:");
            sb2.append(i4);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.l = i2;
            this.j = i3;
            this.k = i4;
            this.m = (i2 / 8) * i4;
            this.n = i3 * this.m;
        }
    }

    public static long a(long j2, int i2, int i3) {
        return (long) (((double) j2) * (((double) i2) / 1000.0d) * ((double) i3));
    }

    private AudioRecord b(int i2) {
        AudioRecord audioRecord = new AudioRecord(0, this.j, a(true), getFormat(), i2);
        return audioRecord;
    }

    public int a(boolean z) {
        int i2 = this.k;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 12;
        }
        return z ? 16 : 4;
    }

    public long c(long j2) {
        return j2 - (j2 % ((long) ((this.l / 8) * this.k)));
    }

    public int d() {
        return AudioTrack.getMinBufferSize(this.j, a(false), getFormat());
    }

    public int e() {
        return AudioRecord.getMinBufferSize(this.j, a(true), getFormat());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public boolean f() {
        boolean z = false;
        try {
            if (!(d() > 0)) {
                return false;
            }
            if (e() > 0) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
        }
    }

    public int getFormat() {
        return this.l == 16 ? 2 : 3;
    }

    public static synchronized C3668u c() {
        C3668u uVar;
        synchronized (C3668u.class) {
            if (h == null) {
                Iterator it = EnumSet.of(PCM16_44100_1, PCM16_22050_1, PCM16_16000_1, PCM16_8000_1).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3668u uVar2 = (C3668u) it.next();
                    if (uVar2.f()) {
                        h = uVar2;
                        break;
                    }
                }
                if (h == null) {
                    Log.w("AudioConfig", "unable to detect valid audio config for this device");
                    h = g;
                }
            }
            uVar = h;
        }
        return uVar;
    }

    public X a(int i2) {
        return new X(this, i2);
    }

    public ja b() {
        ja jaVar = new ja(1, (short) this.k, this.j, (short) this.l, 0);
        return jaVar;
    }

    public AudioRecord a() {
        int[] iArr = {64, 32, 16, 8, 4, 1};
        int length = iArr.length;
        AudioRecord audioRecord = null;
        int i2 = 0;
        while (i2 < length) {
            try {
                audioRecord = b(e() * iArr[i2]);
                if (audioRecord.getState() == 1) {
                    return audioRecord;
                }
                String simpleName = C3668u.class.getSimpleName();
                StringBuilder sb = new StringBuilder();
                sb.append("audiorecord ");
                sb.append(audioRecord);
                sb.append(" in state ");
                sb.append(audioRecord.getState());
                Log.w(simpleName, sb.toString());
                i2++;
            } catch (Exception e) {
                Log.w(C3668u.class.getSimpleName(), e);
            }
        }
        if (audioRecord != null) {
            return audioRecord;
        }
        throw new RuntimeException("Could not create AudioRecord");
    }

    public long b(long j2) {
        return a(j2, this.j, this.m);
    }

    public W a(Context context) {
        return new W(context, this.n);
    }

    public long a(long j2) {
        return (j2 * 1000) / ((long) this.n);
    }

    public static C3668u a(int i2, int i3) {
        C3668u[] values;
        for (C3668u uVar : values()) {
            if (uVar.j == i2 && i3 == uVar.k) {
                return uVar;
            }
        }
        return null;
    }
}
