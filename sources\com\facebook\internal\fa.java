package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.K.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* compiled from: UrlRedirectCache */
class fa {
    static final String a = "fa";
    private static final String b;
    private static K c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("_Redirect");
        b = sb.toString();
    }

    fa() {
    }

    static synchronized K a() throws IOException {
        K k;
        synchronized (fa.class) {
            if (c == null) {
                c = new K(a, new d());
            }
            k = c;
        }
        return k;
    }

    static Uri a(Uri uri) {
        InputStreamReader inputStreamReader;
        Throwable th;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        try {
            K a2 = a();
            InputStreamReader inputStreamReader2 = null;
            boolean z = false;
            while (true) {
                try {
                    InputStream a3 = a2.a(uri2, b);
                    if (a3 == null) {
                        break;
                    }
                    z = true;
                    inputStreamReader = new InputStreamReader(a3);
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, cArr.length);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        ia.a((Closeable) inputStreamReader);
                        inputStreamReader2 = inputStreamReader;
                        uri2 = sb.toString();
                    } catch (IOException unused) {
                        ia.a((Closeable) inputStreamReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        ia.a((Closeable) inputStreamReader);
                        throw th;
                    }
                } catch (IOException unused2) {
                    inputStreamReader = inputStreamReader2;
                    ia.a((Closeable) inputStreamReader);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                    ia.a((Closeable) inputStreamReader);
                    throw th;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                ia.a((Closeable) inputStreamReader2);
                return parse;
            }
            ia.a((Closeable) inputStreamReader2);
            return null;
        } catch (IOException unused3) {
            inputStreamReader = null;
            ia.a((Closeable) inputStreamReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            ia.a((Closeable) inputStreamReader);
            throw th;
        }
    }

    static void a(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                outputStream = a().b(uri.toString(), b);
                outputStream.write(uri2.toString().getBytes());
            } catch (IOException unused) {
            } catch (Throwable th) {
                ia.a((Closeable) outputStream);
                throw th;
            }
            ia.a((Closeable) outputStream);
        }
    }
}
