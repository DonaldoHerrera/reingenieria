package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;

/* renamed from: UGa reason: default package and case insensitive filesystem */
/* compiled from: BugReporter.kt */
final class C5351UGa<T> implements LPa<T> {
    final /* synthetic */ C5322TGa a;
    final /* synthetic */ File b;
    final /* synthetic */ Context c;

    C5351UGa(C5322TGa tGa, File file, Context context) {
        this.a = tGa;
        this.b = file;
        this.c = context;
    }

    public final void a(JPa<Uri> jPa) {
        C7471uYa.b(jPa, "emitter");
        if (this.b.exists() && !this.b.delete()) {
            SDb.b("Failed to delete file: %s", this.b.getAbsolutePath());
            jPa.onSuccess(Uri.EMPTY);
        }
        try {
            this.a.c();
            Process start = new ProcessBuilder(new String[0]).redirectErrorStream(true).command(new String[]{"logcat", "-v", "time", "-df", this.b.getAbsolutePath()}).start();
            int waitFor = start.waitFor();
            if (waitFor != 0) {
                C7471uYa.a((Object) start, "logcatProcess");
                SDb.b("logcat failed with exit code %d. Output: %s", Integer.valueOf(waitFor), C7720yAb.a(C7720yAb.a(start.getInputStream())).a(C5053KKa.c));
                jPa.onSuccess(Uri.EMPTY);
            }
        } catch (IOException e) {
            SDb.a(e, "failed to collect logcat log", new Object[0]);
            jPa.onSuccess(Uri.EMPTY);
        }
        jPa.onSuccess(FileProvider.a(this.c, "com.soundcloud.android.provider.FileProvider", this.b));
    }
}
