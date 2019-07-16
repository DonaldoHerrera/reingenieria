package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;

public final class Qa extends AsyncTask<Uri, Long, Bitmap> {
    private static final C0710ia a = new C0710ia("FetchBitmapTask");
    private final C0703f b;
    private final C0695b c;

    public Qa(Context context, C0695b bVar) {
        this(context, 0, 0, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, 10000, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Bitmap doInBackground(Uri... uriArr) {
        if (uriArr.length == 1 && uriArr[0] != null) {
            try {
                return this.b.a(uriArr[0]);
            } catch (RemoteException e) {
                a.a(e, "Unable to call %s on %s.", "doFetch", C0703f.class.getSimpleName());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C0695b bVar = this.c;
        if (bVar != null) {
            bVar.a(bitmap);
        }
    }

    public Qa(Context context, int i, int i2, boolean z, C0695b bVar) {
        this(context, i, i2, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, 10000, bVar);
    }

    private Qa(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5, C0695b bVar) {
        this.b = ta.a(context.getApplicationContext(), this, new C0699d(this), i, i2, z, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, 10000);
        this.c = bVar;
    }
}
