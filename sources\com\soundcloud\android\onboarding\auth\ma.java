package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import com.soundcloud.android.SoundCloudApplication;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: SignupLog */
public final class ma {
    private ma() {
    }

    public static boolean b(Context context) {
        long[] e = e(context);
        boolean z = false;
        if (e == null) {
            return false;
        }
        int length = e.length - 1;
        while (length >= 0 && System.currentTimeMillis() - e[length] < 3600000 && e.length - length <= 5) {
            length--;
        }
        if (e.length - length > 5) {
            z = true;
        }
        return z;
    }

    public static Thread c(Context context) {
        Thread thread = new Thread(new C4207e(context));
        thread.start();
        return thread;
    }

    private static File d(Context context) {
        return C6630iGa.a(context, ".dr");
    }

    private static long[] e(Context context) {
        ObjectInputStream objectInputStream;
        File d = d(context);
        if (d != null && d.exists()) {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(d));
                try {
                    long[] jArr = (long[]) objectInputStream.readObject();
                    C6698jGa.a((Closeable) objectInputStream);
                    return jArr;
                } catch (IOException | ClassNotFoundException e) {
                    e = e;
                    try {
                        SDb.a(SoundCloudApplication.a).a(e, "Error reading sign up log ", new Object[0]);
                        C6698jGa.a((Closeable) objectInputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        C6698jGa.a((Closeable) objectInputStream);
                        throw th;
                    }
                }
            } catch (IOException | ClassNotFoundException e2) {
                e = e2;
                objectInputStream = null;
                SDb.a(SoundCloudApplication.a).a(e, "Error reading sign up log ", new Object[0]);
                C6698jGa.a((Closeable) objectInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
                C6698jGa.a((Closeable) objectInputStream);
                throw th;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static boolean a(Context context, long j) {
        long[] jArr;
        long[] e = e(context);
        if (e == null) {
            jArr = new long[1];
        } else {
            long[] jArr2 = new long[(e.length + 1)];
            System.arraycopy(e, 0, jArr2, 0, e.length);
            jArr = jArr2;
        }
        jArr[jArr.length - 1] = j;
        return a(context, jArr);
    }

    private static boolean a(Context context, long[] jArr) {
        ObjectOutputStream objectOutputStream = null;
        try {
            File d = d(context);
            if (d == null) {
                C6698jGa.a((Closeable) null);
                return false;
            }
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(d));
            try {
                objectOutputStream2.writeObject(jArr);
                C6698jGa.a((Closeable) objectOutputStream2);
                return true;
            } catch (IOException e) {
                e = e;
                objectOutputStream = objectOutputStream2;
                try {
                    SDb.a(SoundCloudApplication.a).b(e, "Error writing to sign up log ", new Object[0]);
                    C6698jGa.a((Closeable) objectOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    C6698jGa.a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                C6698jGa.a((Closeable) objectOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            SDb.a(SoundCloudApplication.a).b(e, "Error writing to sign up log ", new Object[0]);
            C6698jGa.a((Closeable) objectOutputStream);
            return false;
        }
    }
}
