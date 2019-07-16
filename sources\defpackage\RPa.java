package defpackage;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: RPa reason: default package */
/* compiled from: AndroidSchedulers */
public final class RPa {
    private static final HPa a = PPa.b(new QPa());

    /* renamed from: RPa$a */
    /* compiled from: AndroidSchedulers */
    private static final class a {
        static final HPa a = new SPa(new Handler(Looper.getMainLooper()), false);
    }

    public static HPa a() {
        return PPa.a(a);
    }

    @SuppressLint({"NewApi"})
    public static HPa a(Looper looper, boolean z) {
        if (looper != null) {
            int i = VERSION.SDK_INT;
            if (i < 16) {
                z = false;
            } else if (z && i < 22) {
                Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                } catch (NoSuchMethodError unused) {
                    z = false;
                }
                obtain.recycle();
            }
            return new SPa(new Handler(looper), z);
        }
        throw new NullPointerException("looper == null");
    }
}
