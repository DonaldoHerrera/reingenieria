package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: uOa reason: default package and case insensitive filesystem */
/* compiled from: QueueFileEventStorage */
public class C7461uOa implements C7116pOa {
    private final Context a;
    private final File b;
    private final String c;
    private final File d;
    private C5056KNa e = new C5056KNa(this.d);
    private File f;

    public C7461uOa(Context context, File file, String str, String str2) throws IOException {
        this.a = context;
        this.b = file;
        this.c = str2;
        this.d = new File(this.b, str);
        e();
    }

    private void e() {
        this.f = new File(this.b, this.c);
        if (!this.f.exists()) {
            this.f.mkdirs();
        }
    }

    public OutputStream a(File file) throws IOException {
        throw null;
    }

    public void a(byte[] bArr) throws IOException {
        this.e.a(bArr);
    }

    public List<File> b() {
        return Arrays.asList(this.f.listFiles());
    }

    public boolean c() {
        return this.e.b();
    }

    public void d() {
        try {
            this.e.close();
        } catch (IOException unused) {
        }
        this.d.delete();
    }

    public int a() {
        return this.e.d();
    }

    public void a(String str) throws IOException {
        this.e.close();
        a(this.d, new File(this.f, str));
        this.e = new C5056KNa(this.d);
    }

    private void a(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        String str = "Failed to close output stream";
        String str2 = "Failed to close file input stream";
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                outputStream = a(file2);
                C7391tNa.a((InputStream) fileInputStream, outputStream, new byte[1024]);
                C7391tNa.a((Closeable) fileInputStream, str2);
                C7391tNa.a((Closeable) outputStream, str);
                file.delete();
            } catch (Throwable th) {
                th = th;
                C7391tNa.a((Closeable) fileInputStream, str2);
                C7391tNa.a((Closeable) outputStream, str);
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C7391tNa.a((Closeable) fileInputStream, str2);
            C7391tNa.a((Closeable) outputStream, str);
            file.delete();
            throw th;
        }
    }

    public List<File> a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    public void a(List<File> list) {
        for (File file : list) {
            C7391tNa.c(this.a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    public boolean a(int i, int i2) {
        return this.e.a(i, i2);
    }
}
