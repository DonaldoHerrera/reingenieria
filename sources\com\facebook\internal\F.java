package com.facebook.internal;

import java.io.File;

/* compiled from: FileLruCache */
class F implements f {
    final /* synthetic */ long a;
    final /* synthetic */ File b;
    final /* synthetic */ String c;
    final /* synthetic */ K d;

    F(K k, long j, File file, String str) {
        this.d = k;
        this.a = j;
        this.b = file;
        this.c = str;
    }

    public void onClose() {
        if (this.a < this.d.i.get()) {
            this.b.delete();
        } else {
            this.d.a(this.c, this.b);
        }
    }
}
