package com.soundcloud.android.crop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: Crop */
public class b {
    private Intent a = new Intent();

    /* compiled from: Crop */
    interface a {
    }

    private b(Uri uri, Uri uri2) {
        this.a.setData(uri);
        this.a.putExtra("output", uri2);
    }

    public static b a(Uri uri, Uri uri2) {
        return new b(uri, uri2);
    }

    public b a() {
        this.a.putExtra("aspect_x", 1);
        this.a.putExtra("aspect_y", 1);
        return this;
    }

    public b a(int i, int i2) {
        this.a.putExtra("max_x", i);
        this.a.putExtra("max_y", i2);
        return this;
    }

    public void a(Activity activity) {
        a(activity, 6709);
    }

    public void a(Activity activity, int i) {
        activity.startActivityForResult(a((Context) activity), i);
    }

    public Intent a(Context context) {
        this.a.setClass(context, CropImageActivity.class);
        return this.a;
    }

    public static Throwable a(Intent intent) {
        return (Throwable) intent.getSerializableExtra("error");
    }
}
