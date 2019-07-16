package com.appboy;

import android.net.Uri;
import android.widget.ImageView;

class f implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ boolean c;
    final /* synthetic */ h d;

    f(h hVar, String str, ImageView imageView, boolean z) {
        this.d = hVar;
        this.a = str;
        this.b = imageView;
        this.c = z;
    }

    public void run() {
        this.d.m.a(Uri.parse(this.a).toString(), this.b, new e(this));
    }
}
