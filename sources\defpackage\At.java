package defpackage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

/* renamed from: At reason: default package */
public final class At extends C1646qt {
    public static At a() {
        return Dt.a;
    }

    public final C1795vt a(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, Jt.a));
    }

    public final C1795vt a(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return a(inputStream);
        }
        return a((Reader) new InputStreamReader(inputStream, charset));
    }

    public final C1795vt a(String str) {
        return a((Reader) new StringReader(str));
    }

    private final C1795vt a(Reader reader) {
        return new Ft(this, new C0228Lv(reader));
    }

    public final C1735tt a(OutputStream outputStream, Charset charset) {
        return new Ct(this, new C0248Qv(new OutputStreamWriter(outputStream, charset)));
    }
}
