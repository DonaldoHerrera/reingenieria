package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: dj reason: default package and case insensitive filesystem */
/* compiled from: NativeFileUtils */
final class C1236dj {
    private static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static byte[] b(File file) {
        File a = a(file, ".dmp");
        return a == null ? new byte[0] : d(a);
    }

    static byte[] c(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] a = a((InputStream) fileInputStream);
                C7391tNa.a((Closeable) fileInputStream);
                return a;
            } catch (FileNotFoundException unused) {
                C7391tNa.a((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                C7391tNa.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C7391tNa.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
            C7391tNa.a((Closeable) fileInputStream);
            return null;
        } catch (IOException unused4) {
            fileInputStream = null;
            C7391tNa.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C7391tNa.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    private static byte[] d(File file) {
        return c(file);
    }

    private static byte[] b(File file, Context context) throws IOException {
        byte[] c = c(file);
        if (c == null || c.length == 0) {
            return null;
        }
        return a(context, new String(c));
    }

    private static File a(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static byte[] c(File file, Context context) throws IOException {
        BufferedReader bufferedReader;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new Ih(context, new C1665rj()).a(bufferedReader);
                C7391tNa.a((Closeable) bufferedReader);
                return a;
            } catch (Throwable th) {
                th = th;
                C7391tNa.a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            C7391tNa.a((Closeable) bufferedReader);
            throw th;
        }
    }

    static byte[] a(File file, Context context) throws IOException {
        File a = a(file, ".maps");
        if (a != null) {
            return c(a, context);
        }
        File a2 = a(file, ".binary_libs");
        if (a2 != null) {
            return b(a2, context);
        }
        return null;
    }

    static byte[] a(File file) {
        File a = a(file, ".device_info");
        if (a == null) {
            return null;
        }
        return c(a);
    }

    private static byte[] a(Context context, String str) throws IOException {
        return new Ih(context, new C1665rj()).a(str);
    }
}
