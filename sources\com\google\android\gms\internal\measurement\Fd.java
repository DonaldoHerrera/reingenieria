package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class Fd {
    private static final int[] a = new int[0];
    private static final long[] b = new long[0];
    private static final float[] c = new float[0];
    private static final double[] d = new double[0];
    private static final boolean[] e = new boolean[0];
    private static final String[] f = new String[0];
    private static final byte[][] g = new byte[0][];
    public static final byte[] h = new byte[0];

    public static final int a(C1044td tdVar, int i) throws IOException {
        int a2 = tdVar.a();
        tdVar.a(i);
        int i2 = 1;
        while (tdVar.c() == i) {
            tdVar.a(i);
            i2++;
        }
        tdVar.b(a2, i);
        return i2;
    }
}
