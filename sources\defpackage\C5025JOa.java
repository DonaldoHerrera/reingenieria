package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: JOa reason: default package and case insensitive filesystem */
/* compiled from: FileStoreImpl */
public class C5025JOa implements C4994IOa {
    private final Context a;
    private final String b;
    private final String c;

    public C5025JOa(C5531_Ma _ma) {
        if (_ma.e() != null) {
            this.a = _ma.e();
            this.b = _ma.w();
            StringBuilder sb = new StringBuilder();
            sb.append("Android/");
            sb.append(this.a.getPackageName());
            this.c = sb.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public File a() {
        return a(this.a.getFilesDir());
    }

    /* access modifiers changed from: 0000 */
    public File a(File file) {
        String str = "Fabric";
        if (file == null) {
            C5328TMa.e().d(str, "Null File");
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C5328TMa.e().w(str, "Couldn't create file");
        }
        return null;
    }
}
