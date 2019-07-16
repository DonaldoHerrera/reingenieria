package com.facebook;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.y reason: case insensitive filesystem */
/* compiled from: FacebookSdk */
class C0599y implements Callable<File> {
    C0599y() {
    }

    public File call() throws Exception {
        return B.m.getCacheDir();
    }
}
