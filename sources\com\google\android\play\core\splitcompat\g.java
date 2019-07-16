package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

final class g implements i {
    private final /* synthetic */ Set a;
    private final /* synthetic */ q b;
    private final /* synthetic */ f c;

    g(f fVar, Set set, q qVar) {
        this.c = fVar;
        this.a = set;
        this.b = qVar;
    }

    public final void a(ZipFile zipFile, Set<k> set) throws IOException {
        this.a.addAll(this.c.a(set, this.b, zipFile));
    }
}
