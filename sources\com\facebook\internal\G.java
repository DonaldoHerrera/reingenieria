package com.facebook.internal;

import java.io.File;

/* compiled from: FileLruCache */
class G implements Runnable {
    final /* synthetic */ File[] a;
    final /* synthetic */ K b;

    G(K k, File[] fileArr) {
        this.b = k;
        this.a = fileArr;
    }

    public void run() {
        for (File delete : this.a) {
            delete.delete();
        }
    }
}
