package com.google.android.exoplayer2.video;

/* compiled from: DolbyVisionConfig */
public final class j {
    public final int a;
    public final int b;
    public final String c;

    private j(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public static j a(Pq pq) {
        String str;
        pq.f(2);
        int t = pq.t();
        int i = t >> 1;
        int t2 = ((pq.t() >> 3) & 31) | ((t & 1) << 5);
        if (i == 4 || i == 5) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        sb.append(str2);
        sb.append(t2);
        return new j(i, t2, sb.toString());
    }
}
