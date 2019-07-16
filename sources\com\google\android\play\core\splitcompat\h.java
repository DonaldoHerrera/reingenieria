package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

final class h implements l {
    private final /* synthetic */ e a;

    h(e eVar) {
        this.a = eVar;
    }

    public final void a(k kVar, File file, boolean z) throws IOException {
        this.a.b.add(file);
        if (!z) {
            this.a.c.set(false);
        }
    }
}
