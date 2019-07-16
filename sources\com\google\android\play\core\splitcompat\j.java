package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

final class j implements l {
    private final /* synthetic */ Set a;
    private final /* synthetic */ q b;
    private final /* synthetic */ ZipFile c;

    j(Set set, q qVar, ZipFile zipFile) {
        this.a = set;
        this.b = qVar;
        this.c = zipFile;
    }

    public final void a(k kVar, File file, boolean z) throws IOException {
        this.a.add(file);
        if (!z) {
            Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.b.a(), kVar.a, this.b.b().getAbsolutePath(), kVar.b.getName(), file.getAbsolutePath()}));
            f.b(this.c, kVar.b, file);
        }
    }
}
