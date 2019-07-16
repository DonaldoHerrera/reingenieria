package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: qt reason: default package and case insensitive filesystem */
public abstract class C1646qt {
    public final String a(Object obj) throws IOException {
        return a(obj, false);
    }

    public abstract C1735tt a(OutputStream outputStream, Charset charset) throws IOException;

    public abstract C1795vt a(InputStream inputStream) throws IOException;

    public abstract C1795vt a(InputStream inputStream, Charset charset) throws IOException;

    public abstract C1795vt a(String str) throws IOException;

    public final String b(Object obj) throws IOException {
        return a(obj, true);
    }

    private final String a(Object obj, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1735tt a = a((OutputStream) byteArrayOutputStream, Jt.a);
        if (z) {
            a.g();
        }
        a.a(obj);
        a.a();
        return byteArrayOutputStream.toString("UTF-8");
    }
}
