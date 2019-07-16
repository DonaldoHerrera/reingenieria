package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* renamed from: gGa reason: default package and case insensitive filesystem */
/* compiled from: FileHelper.kt */
public class C6494gGa {
    /* access modifiers changed from: private */
    public final Context a;

    public C6494gGa(Context context) {
        C7471uYa.b(context, "context");
        this.a = context;
    }

    public InputStream b(String str) {
        C7471uYa.b(str, "filename");
        InputStream open = this.a.getAssets().open(str);
        C7471uYa.a((Object) open, "context.assets.open(filename)");
        return open;
    }

    public Uri a(File file) throws Exception {
        C7471uYa.b(file, "file");
        Context context = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getPackageName());
        sb.append(".provider.FileProvider");
        Uri a2 = FileProvider.a(context, sb.toString(), file);
        C7471uYa.a((Object) a2, "FileProvider.getUriForFi…ider.FileProvider\", file)");
        return a2;
    }

    public File a(String str, byte[] bArr) throws Exception {
        Throwable th;
        C7471uYa.b(str, "filename");
        C7471uYa.b(bArr, "bytes");
        FileOutputStream openFileOutput = this.a.openFileOutput(str, 0);
        try {
            openFileOutput.write(bArr);
            RVa rVa = RVa.a;
            BXa.a(openFileOutput, null);
            File fileStreamPath = this.a.getFileStreamPath(str);
            C7471uYa.a((Object) fileStreamPath, "context.getFileStreamPath(filename)");
            return fileStreamPath;
        } catch (Throwable th2) {
            BXa.a(openFileOutput, th);
            throw th2;
        }
    }

    public C6979nPa a(Uri uri) {
        C7471uYa.b(uri, "uri");
        C6979nPa a2 = C6979nPa.a((Callable<?>) new C6426fGa<Object>(this, uri));
        C7471uYa.a((Object) a2, "Completable.fromCallable…)\n            }\n        }");
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        defpackage.BXa.a(r3, r0);
     */
    public String a(String str) throws IOException {
        C7471uYa.b(str, "filename");
        InputStream b = b(str);
        byte[] a2 = AXa.a(b);
        BXa.a(b, null);
        Charset charset = StandardCharsets.UTF_8;
        C7471uYa.a((Object) charset, "UTF_8");
        return new String(a2, charset);
    }
}
