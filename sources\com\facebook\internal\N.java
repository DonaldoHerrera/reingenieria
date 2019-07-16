package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C0594t;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageDownloader */
public class N {
    private static Handler a;
    private static ra b = new ra(8);
    private static ra c = new ra(2);
    private static final Map<d, c> d = new HashMap();

    /* compiled from: ImageDownloader */
    private static class a implements Runnable {
        private Context a;
        private d b;
        private boolean c;

        a(Context context, d dVar, boolean z) {
            this.a = context;
            this.b = dVar;
            this.c = z;
        }

        public void run() {
            N.b(this.b, this.a, this.c);
        }
    }

    /* compiled from: ImageDownloader */
    private static class b implements Runnable {
        private Context a;
        private d b;

        b(Context context, d dVar) {
            this.a = context;
            this.b = dVar;
        }

        public void run() {
            N.b(this.b, this.a);
        }
    }

    /* compiled from: ImageDownloader */
    private static class c {
        com.facebook.internal.ra.a a;
        P b;
        boolean c;

        private c() {
        }

        /* synthetic */ c(M m) {
            this();
        }
    }

    /* compiled from: ImageDownloader */
    private static class d {
        Uri a;
        Object b;

        d(Uri uri, Object obj) {
            this.a = uri;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.a == this.a && dVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((1073 + this.a.hashCode()) * 37) + this.b.hashCode();
        }
    }

    public static void b(P p) {
        if (p != null) {
            d dVar = new d(p.d(), p.b());
            synchronized (d) {
                c cVar = (c) d.get(dVar);
                if (cVar != null) {
                    cVar.b = p;
                    cVar.c = false;
                    cVar.a.a();
                } else {
                    a(p, dVar, p.e());
                }
            }
        }
    }

    public static boolean a(P p) {
        boolean z;
        d dVar = new d(p.d(), p.b());
        synchronized (d) {
            c cVar = (c) d.get(dVar);
            z = true;
            if (cVar == null) {
                z = false;
            } else if (cVar.a.cancel()) {
                d.remove(dVar);
            } else {
                cVar.c = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    public static void b(d dVar, Context context, boolean z) {
        InputStream inputStream;
        boolean z2 = false;
        if (z) {
            Uri a2 = fa.a(dVar.a);
            if (a2 != null) {
                inputStream = S.a(a2, context);
                if (inputStream != null) {
                    z2 = true;
                }
                if (!z2) {
                    inputStream = S.a(dVar.a, context);
                }
                if (inputStream == null) {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    ia.a((Closeable) inputStream);
                    a(dVar, (Exception) null, decodeStream, z2);
                    return;
                }
                c a3 = a(dVar);
                if (a3 != null && !a3.c) {
                    a(a3.b, dVar);
                    return;
                }
                return;
            }
        }
        inputStream = null;
        if (!z2) {
        }
        if (inputStream == null) {
        }
    }

    private static void a(P p, d dVar, boolean z) {
        a(p, dVar, c, (Runnable) new a(p.c(), dVar, z));
    }

    private static void a(P p, d dVar) {
        a(p, dVar, b, (Runnable) new b(p.c(), dVar));
    }

    private static void a(P p, d dVar, ra raVar, Runnable runnable) {
        synchronized (d) {
            c cVar = new c(null);
            cVar.b = p;
            d.put(dVar, cVar);
            cVar.a = raVar.a(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v15, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.facebook.t] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* JADX WARNING: type inference failed for: r10v21 */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        r10 = 0;
        r2 = false;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        r9 = th;
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4
  assigns: []
  uses: []
  mth insns count: 97
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 17 */
    public static void b(d dVar, Context context) {
        Bitmap bitmap;
        ? r0;
        ? r10;
        HttpURLConnection httpURLConnection;
        ? r02;
        ? r102;
        ? r03;
        ? r103;
        ? r104;
        ? r04 = 0;
        boolean z = true;
        try {
            httpURLConnection = (HttpURLConnection) new URL(dVar.a.toString()).openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    ? a2 = S.a(context, httpURLConnection);
                    r103 = a2;
                    r104 = a2;
                    bitmap = BitmapFactory.decodeStream(a2);
                    r03 = r04;
                    r102 = a2;
                } else if (responseCode == 301 || responseCode == 302) {
                    String headerField = httpURLConnection.getHeaderField("location");
                    if (!ia.b(headerField)) {
                        Uri parse = Uri.parse(headerField);
                        fa.a(dVar.a, parse);
                        c a3 = a(dVar);
                        if (a3 != null && !a3.c) {
                            a(a3.b, new d(parse, dVar.b), false);
                        }
                    }
                    r102 = 0;
                    bitmap = null;
                    z = false;
                    r03 = r04;
                } else {
                    ? errorStream = httpURLConnection.getErrorStream();
                    try {
                        r103 = errorStream;
                        r104 = errorStream;
                        StringBuilder sb = new StringBuilder();
                        if (errorStream != 0) {
                            InputStreamReader inputStreamReader = new InputStreamReader(errorStream);
                            char[] cArr = new char[128];
                            while (true) {
                                int read = inputStreamReader.read(cArr, 0, cArr.length);
                                if (read <= 0) {
                                    break;
                                }
                                sb.append(cArr, 0, read);
                            }
                            ia.a((Closeable) inputStreamReader);
                        } else {
                            sb.append("Unexpected error while downloading an image.");
                        }
                        ? tVar = new C0594t(sb.toString());
                        bitmap = null;
                        r03 = tVar;
                        r102 = errorStream;
                    } catch (IOException e) {
                        r10 = r103;
                        r4 = e;
                        ia.a((Closeable) r10);
                        ia.a((URLConnection) httpURLConnection);
                        ? r8 = r4;
                        bitmap = null;
                        r0 = r8;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        r02 = r104;
                        ia.a((Closeable) r02);
                        ia.a((URLConnection) httpURLConnection);
                        throw th;
                    }
                }
                ia.a((Closeable) r102);
                ia.a((URLConnection) httpURLConnection);
                r0 = r03;
            } catch (IOException e2) {
                r10 = 0;
                r4 = e2;
                ia.a((Closeable) r10);
                ia.a((URLConnection) httpURLConnection);
                ? r82 = r4;
                bitmap = null;
                r0 = r82;
                if (z) {
                }
            } catch (Throwable th2) {
            }
        } catch (IOException e3) {
            r10 = 0;
            httpURLConnection = null;
            r4 = e3;
            ia.a((Closeable) r10);
            ia.a((URLConnection) httpURLConnection);
            ? r822 = r4;
            bitmap = null;
            r0 = r822;
            if (z) {
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            r02 = r04;
            ia.a((Closeable) r02);
            ia.a((URLConnection) httpURLConnection);
            throw th;
        }
        if (z) {
            a(dVar, (Exception) r0, bitmap, false);
        }
    }

    private static void a(d dVar, Exception exc, Bitmap bitmap, boolean z) {
        c a2 = a(dVar);
        if (a2 != null && !a2.c) {
            P p = a2.b;
            com.facebook.internal.P.b a3 = p.a();
            if (a3 != null) {
                Handler a4 = a();
                M m = new M(p, exc, z, bitmap, a3);
                a4.post(m);
            }
        }
    }

    private static synchronized Handler a() {
        Handler handler;
        synchronized (N.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    private static c a(d dVar) {
        c cVar;
        synchronized (d) {
            cVar = (c) d.remove(dVar);
        }
        return cVar;
    }
}
