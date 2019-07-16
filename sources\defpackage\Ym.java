package defpackage;

import com.google.android.exoplayer2.extractor.mp4.h;
import com.google.android.exoplayer2.extractor.mp4.k;
import java.lang.reflect.Constructor;

/* renamed from: Ym reason: default package */
/* compiled from: DefaultExtractorsFactory */
public final class Ym implements C0529cn {
    private static final Constructor<? extends _m> a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i = 1;
    private int j;

    static {
        Constructor<? extends _m> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(_m.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        a = constructor;
    }

    public synchronized _m[] a() {
        _m[] _mVarArr;
        _mVarArr = new _m[(a == null ? 13 : 14)];
        _mVarArr[0] = new C1879yn(this.e);
        int i2 = 1;
        _mVarArr[1] = new h(this.g);
        _mVarArr[2] = new k(this.f);
        _mVarArr[3] = new Fn(this.h | (this.b ? 1 : 0));
        _mVarArr[4] = new C1271eo(0, this.c | (this.b ? 1 : 0));
        _mVarArr[5] = new C0468ao();
        _mVarArr[6] = new Do(this.i, this.j);
        _mVarArr[7] = new C1579on();
        _mVarArr[8] = new Mn();
        _mVarArr[9] = new C1820wo();
        _mVarArr[10] = new Io();
        int i3 = this.d;
        if (!this.b) {
            i2 = 0;
        }
        _mVarArr[11] = new C1486ln(i2 | i3);
        _mVarArr[12] = new C0530co();
        if (a != null) {
            try {
                _mVarArr[13] = (_m) a.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
        return _mVarArr;
    }
}
