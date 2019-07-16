package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.crashlytics.android.a;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.view.EmptyView.b;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Map;

/* renamed from: sHa reason: default package and case insensitive filesystem */
/* compiled from: ErrorUtils */
public final class C7316sHa {
    private static final C7385tHa a = new C7385tHa();

    private C7316sHa() {
    }

    @Deprecated
    public static void a(Throwable th, C3466UY uy) {
        StringWriter stringWriter = new StringWriter();
        uy.printStackTrace(new PrintWriter(stringWriter));
        b(th, stringWriter.toString());
    }

    @Deprecated
    public static void b(Throwable th, Class<?> cls) {
        b(th, cls.getCanonicalName());
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    static boolean e(Throwable th) {
        if (l(th) || (th instanceof a)) {
            return false;
        }
        if (th instanceof ifa) {
            return ((ifa) th).i();
        }
        return true;
    }

    public static boolean f(Throwable th) {
        return (th instanceof ifa) && ((ifa) th).b();
    }

    public static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static boolean h(Throwable th) {
        if (th instanceof ifa) {
            return ((ifa) th).c();
        }
        return th instanceof IOException;
    }

    public static boolean i(Throwable th) {
        return h(th) || f(th);
    }

    public static void j(Throwable th) {
        if (!h(th)) {
            d(th);
        }
    }

    private static boolean k(Throwable th) {
        return (th instanceof RuntimeException) && !(th instanceof C7729yGa);
    }

    private static boolean l(Throwable th) {
        return (IOException.class.isAssignableFrom(th.getClass()) && !JsonProcessingException.class.isAssignableFrom(th.getClass())) || (th.getCause() != null && l(th.getCause()));
    }

    @Deprecated
    public static synchronized void b(Throwable th, String str) {
        synchronized (C7316sHa.class) {
            SDb.a("error-context").b(str, new Object[0]);
            if (C5328TMa.h()) {
                a.a("error-context", str);
            }
            if (!k(th)) {
                if (j.e()) {
                    if (th instanceof C5568aQa) {
                        throw new IllegalStateException(th);
                    }
                }
                if (e(th)) {
                    d(th);
                } else {
                    th.printStackTrace();
                }
            } else {
                throw ((RuntimeException) th);
            }
        }
    }

    @Deprecated
    public static void d(Throwable th) {
        a(th, Collections.emptyMap());
    }

    @Deprecated
    public static void a(Throwable th, Class<?> cls) {
        if (i(th)) {
            return;
        }
        if (j.g()) {
            c(th, cls);
        } else {
            d(th);
        }
    }

    public static void c(Throwable th, Class<?> cls) {
        new Handler(Looper.getMainLooper()).post(new C4738AGa(th, cls));
    }

    @Deprecated
    public static Throwable a(Exception exc) {
        return exc instanceof Nka ? exc.getCause() : exc;
    }

    @Deprecated
    public static void a(String str, Throwable th) {
        a(th, Collections.singletonMap("message", str));
    }

    @Deprecated
    public static void a(Throwable th, Map<String, String> map) {
        if (!e(th)) {
            SDb.a(SoundCloudApplication.a).b(th, "Swallowing silent exception: ", new Object[0]);
            return;
        }
        a.a(th, map);
    }

    public static Throwable b(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    @Deprecated
    public static synchronized void a(Throwable th, String str, String str2) {
        synchronized (C7316sHa.class) {
            if (str == null || str2 == null) {
                a(th, Collections.emptyMap());
            } else {
                a(th, Collections.singletonMap(str, str2));
            }
        }
    }

    public static void a(int i, String str, String str2) {
        SDb.a(str).a(i, str2, new Object[0]);
    }

    public static void a(Throwable th, String str) {
        if (C5328TMa.h()) {
            SDb.a(SoundCloudApplication.a).a(th, "Handling silent exception", new Object[0]);
            if (C5206PKa.b(str)) {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        a.a(readLine);
                    } catch (IOException e) {
                        SDb.a(SoundCloudApplication.a).a((Throwable) e, "An IOException was caught", new Object[0]);
                    } catch (Throwable th2) {
                        C6698jGa.a((Closeable) bufferedReader);
                        throw th2;
                    }
                }
                C6698jGa.a((Closeable) bufferedReader);
            }
            a.a(th);
        }
    }

    public static b a(Throwable th) {
        if (th instanceof ifa) {
            return ((ifa) th).c() ? b.CONNECTION_ERROR : b.SERVER_ERROR;
        } else if (th instanceof C7247rHa) {
            return b.OK;
        } else {
            return b.ERROR;
        }
    }
}
