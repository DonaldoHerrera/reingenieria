package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.wc reason: case insensitive filesystem */
/* compiled from: PlaybackProgress */
public class C4519wc {
    private final C3508cda a;
    private final long b;
    private final long c;
    private long d;

    public C4519wc(long j, long j2, C3508cda cda) {
        this(j, j2, (C5694cGa) C5626bGa.a, cda);
    }

    public static C4519wc a() {
        C4519wc wcVar = new C4519wc(0, 0, C3508cda.a);
        return wcVar;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.c;
    }

    public C3508cda e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4519wc.class != obj.getClass()) {
            return false;
        }
        C4519wc wcVar = (C4519wc) obj;
        if (!(this.b == wcVar.b && this.d == wcVar.d && this.c == wcVar.c)) {
            z = false;
        }
        return z;
    }

    public boolean f() {
        return this.d > 0;
    }

    public boolean g() {
        return this.c == 0 && this.d == 0;
    }

    public int hashCode() {
        long j = this.c;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.b;
        return i2 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackProgress{position=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    public C4519wc(long j, long j2, C5694cGa cga, C3508cda cda) {
        this(j, j2, cga.a(), cda);
    }

    public boolean a(long j) {
        return this.c > j;
    }

    private C4519wc(long j, long j2, long j3, C3508cda cda) {
        this.a = cda;
        this.c = j;
        this.d = j2;
        this.b = j3;
    }
}
