package com.google.android.exoplayer2.extractor.mp4;

/* compiled from: TrackEncryptionBox */
public final class o {
    public final boolean a;
    public final String b;
    public final a c;
    public final int d;
    public final byte[] e;

    public o(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        boolean z3 = i == 0;
        if (bArr2 != null) {
            z2 = false;
        }
        C1852xq.a(z2 ^ z3);
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new a(a(str), bArr, i2, i3);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return 1;
        }
        if (c2 == 2 || c2 == 3) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported protection scheme type '");
        sb.append(str);
        sb.append("'. Assuming AES-CTR crypto mode.");
        Iq.d("TrackEncryptionBox", sb.toString());
        return 1;
    }
}
