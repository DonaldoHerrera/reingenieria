package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: jb reason: default package and case insensitive filesystem */
/* compiled from: TypefaceCompatBaseImpl */
class C1412jb {

    /* renamed from: jb$a */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface a<T> {
        boolean a(T t);

        int b(T t);
    }

    C1412jb() {
    }

    private static <T> T a(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.b(t2) - i2) * 2) + (aVar.a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public b a(b[] bVarArr, int i) {
        return (b) a(bVarArr, i, new C1351hb(this));
    }

    /* access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = C1443kb.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!C1443kb.a(a2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(bVarArr, i).c());
            try {
                Typeface a2 = a(context, inputStream);
                C1443kb.a((Closeable) inputStream);
                return a2;
            } catch (IOException unused) {
                C1443kb.a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C1443kb.a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C1443kb.a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C1443kb.a((Closeable) inputStream2);
            throw th;
        }
    }

    private c a(b bVar, int i) {
        return (c) a(bVar.a(), i, new C1382ib(this));
    }

    public Typeface a(Context context, b bVar, Resources resources, int i) {
        c a2 = a(bVar, i);
        if (a2 == null) {
            return null;
        }
        return C0517cb.a(context, resources, a2.b(), a2.a(), i);
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = C1443kb.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!C1443kb.a(a2, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }
}
