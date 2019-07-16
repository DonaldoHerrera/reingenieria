package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

final class e implements i {
    private final /* synthetic */ q a;
    final /* synthetic */ Set b;
    final /* synthetic */ AtomicBoolean c;
    private final /* synthetic */ f d;

    e(f fVar, q qVar, Set set, AtomicBoolean atomicBoolean) {
        this.d = fVar;
        this.a = qVar;
        this.b = set;
        this.c = atomicBoolean;
    }

    public final void a(ZipFile zipFile, Set<k> set) throws IOException {
        this.d.a(this.a, set, (l) new h(this));
    }
}
