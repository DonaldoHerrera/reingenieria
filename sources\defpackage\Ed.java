package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;

/* renamed from: Ed reason: default package */
/* compiled from: Palette */
class Ed extends AsyncTask<Bitmap, Void, Fd> {
    final /* synthetic */ c a;
    final /* synthetic */ a b;

    Ed(a aVar, c cVar) {
        this.b = aVar;
        this.a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Fd doInBackground(Bitmap... bitmapArr) {
        try {
            return this.b.a();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Fd fd) {
        this.a.a(fd);
    }
}
