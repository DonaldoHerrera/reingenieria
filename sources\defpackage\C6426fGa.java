package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* renamed from: fGa reason: default package and case insensitive filesystem */
/* compiled from: FileHelper.kt */
final class C6426fGa<V> implements Callable<Object> {
    final /* synthetic */ C6494gGa a;
    final /* synthetic */ Uri b;

    C6426fGa(C6494gGa gga, Uri uri) {
        this.a = gga;
        this.b = uri;
    }

    public final C6979nPa call() {
        if (this.a.a.getContentResolver().delete(this.b, null, null) != -1) {
            return C6979nPa.e();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to delete the file ");
        sb.append(this.b);
        throw new FileNotFoundException(sb.toString());
    }
}
