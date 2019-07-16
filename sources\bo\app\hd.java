package bo.app;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;

public class hd {
    private final String a;
    private final String b;
    private final String c;
    private final gt d;
    private final gs e;
    private final gw f;
    private final hh g;
    private final Object h;
    private final boolean i;
    private final Options j = new Options();

    public hd(String str, String str2, String str3, gt gtVar, gw gwVar, hh hhVar, gi giVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gtVar;
        this.e = giVar.j();
        this.f = gwVar;
        this.g = hhVar;
        this.h = giVar.n();
        this.i = giVar.m();
        a(giVar.k(), this.j);
    }

    private void a(Options options, Options options2) {
        options2.inDensity = options.inDensity;
        options2.inDither = options.inDither;
        options2.inInputShareable = options.inInputShareable;
        options2.inJustDecodeBounds = options.inJustDecodeBounds;
        options2.inPreferredConfig = options.inPreferredConfig;
        options2.inPurgeable = options.inPurgeable;
        options2.inSampleSize = options.inSampleSize;
        options2.inScaled = options.inScaled;
        options2.inScreenDensity = options.inScreenDensity;
        options2.inTargetDensity = options.inTargetDensity;
        options2.inTempStorage = options.inTempStorage;
        if (VERSION.SDK_INT >= 10) {
            b(options, options2);
        }
        if (VERSION.SDK_INT >= 11) {
            c(options, options2);
        }
    }

    @TargetApi(10)
    private void b(Options options, Options options2) {
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    @TargetApi(11)
    private void c(Options options, Options options2) {
        options2.inBitmap = options.inBitmap;
        options2.inMutable = options.inMutable;
    }

    public gs d() {
        return this.e;
    }

    public gw e() {
        return this.f;
    }

    public hh f() {
        return this.g;
    }

    public Object g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public Options i() {
        return this.j;
    }

    public String b() {
        return this.b;
    }

    public gt c() {
        return this.d;
    }

    public String a() {
        return this.a;
    }
}
