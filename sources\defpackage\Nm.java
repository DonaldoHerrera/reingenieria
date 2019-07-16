package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

/* renamed from: Nm reason: default package */
/* compiled from: CryptoInfo */
public final class Nm {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    private final CryptoInfo i = new CryptoInfo();
    private final a j;

    @TargetApi(24)
    /* renamed from: Nm$a */
    /* compiled from: CryptoInfo */
    private static final class a {
        private final CryptoInfo a;
        private final Pattern b;

        private a(CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        public void a(int i, int i2) {
            this.b.set(i, i2);
            this.a.setPattern(this.b);
        }
    }

    public Nm() {
        this.j = C0471ar.a >= 24 ? new a(this.i) : null;
    }

    public void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f = i2;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.a = bArr2;
        this.c = i3;
        this.g = i4;
        this.h = i5;
        CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (C0471ar.a >= 24) {
            this.j.a(i4, i5);
        }
    }

    public CryptoInfo a() {
        return this.i;
    }
}
