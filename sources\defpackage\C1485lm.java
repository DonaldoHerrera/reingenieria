package defpackage;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

/* renamed from: lm reason: default package and case insensitive filesystem */
/* compiled from: AudioAttributes */
public final class C1485lm {
    public static final C1485lm a = new a().a();
    public final int b;
    public final int c;
    public final int d;
    private AudioAttributes e;

    /* renamed from: lm$a */
    /* compiled from: AudioAttributes */
    public static final class a {
        private int a = 0;
        private int b = 0;
        private int c = 1;

        public C1485lm a() {
            return new C1485lm(this.a, this.b, this.c);
        }
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.e == null) {
            this.e = new Builder().setContentType(this.b).setFlags(this.c).setUsage(this.d).build();
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1485lm.class != obj.getClass()) {
            return false;
        }
        C1485lm lmVar = (C1485lm) obj;
        if (!(this.b == lmVar.b && this.c == lmVar.c && this.d == lmVar.d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + this.b) * 31) + this.c) * 31) + this.d;
    }

    private C1485lm(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
