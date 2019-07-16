package defpackage;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: rj reason: default package and case insensitive filesystem */
/* compiled from: Sha1FileIdStrategy */
class C1665rj implements a {
    C1665rj() {
    }

    public String a(File file) throws IOException {
        return a(file.getPath());
    }

    private static String a(String str) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String a = C7391tNa.a((InputStream) bufferedInputStream2);
                C7391tNa.a((Closeable) bufferedInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                C7391tNa.a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C7391tNa.a((Closeable) bufferedInputStream);
            throw th;
        }
    }
}
