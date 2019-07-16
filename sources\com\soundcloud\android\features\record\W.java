package com.soundcloud.android.features.record;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* compiled from: RemainingTimeCalculator */
class W {
    private final File a;
    private File b;
    private final int c;
    private int d;
    private long e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;

    W(Context context, int i2) {
        this.a = C6630iGa.a(context);
        this.c = i2;
    }

    /* access modifiers changed from: 0000 */
    public void a(File file) {
        this.b = file;
    }

    public void b() {
        this.b = null;
        this.i = -1;
        this.g = -1;
        this.f = 0;
        this.d = 0;
        this.e = (long) 0;
    }

    /* access modifiers changed from: 0000 */
    public long c() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0;
        }
        StatFs statFs = new StatFs(this.a.getAbsolutePath());
        long max = (long) Math.max(0, statFs.getAvailableBlocks() - 100);
        long blockSize = (long) statFs.getBlockSize();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.g == -1 || max != this.h) {
            this.g = currentTimeMillis;
            this.h = max;
        }
        File file = this.b;
        if (file != null) {
            this.b = new File(file.getAbsolutePath());
            long length = this.b.length();
            if (this.i == -1 || length > this.j) {
                long j2 = length - this.j;
                long j3 = currentTimeMillis - this.i;
                this.i = currentTimeMillis;
                this.j = length;
                this.e += (long) ((int) (((double) j2) / (((double) j3) / 1000.0d)));
                double d2 = (double) this.e;
                int i2 = this.f + 1;
                this.f = i2;
                this.d = (int) (d2 / ((double) i2));
                if (this.f % 5 == 0) {
                    this.e = 0;
                    this.f = 0;
                }
            }
        }
        return Math.max(0, ((this.h * blockSize) / ((long) (this.c + this.d))) - ((currentTimeMillis - this.g) / 1000));
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        if (this.a == null || !C6630iGa.a() || new StatFs(this.a.getAbsolutePath()).getAvailableBlocks() <= 100) {
            return false;
        }
        return true;
    }
}
