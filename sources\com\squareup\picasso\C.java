package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* compiled from: OkHttp3Downloader */
public final class C implements r {
    final a a;
    private final Vxb b;
    private boolean c;

    public C(Context context) {
        this(W.b(context));
    }

    public Ayb a(C7647wyb wyb) throws IOException {
        return this.a.a(wyb).execute();
    }

    public C(File file) {
        this(file, W.a(file));
    }

    public C(File file, long j) {
        a aVar = new a();
        aVar.a(new Vxb(file, j));
        this(aVar.a());
        this.c = false;
    }

    public C(C7440tyb tyb) {
        this.c = true;
        this.a = tyb;
        this.b = tyb.j();
    }

    public C(a aVar) {
        this.c = true;
        this.a = aVar;
        this.b = null;
    }
}
