package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.cast.framework.C0672y;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.J;
import com.google.android.gms.cast.framework.K;
import com.google.android.gms.cast.framework.L;
import com.google.android.gms.cast.framework.T;
import com.google.android.gms.cast.framework.U;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import java.util.Map;

public final class ta {
    private static final C0710ia a = new C0710ia("CastDynamiteModule");

    public static K a(Context context, CastOptions castOptions, Ka ka, Map<String, IBinder> map) {
        try {
            return a(context).a(Er.a(context.getApplicationContext()), castOptions, ka, map);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newCastContextImpl", Ia.class.getSimpleName());
            return null;
        }
    }

    public static U a(Context context, String str, String str2, C0672y yVar) {
        try {
            return a(context).a(str, str2, yVar);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newSessionImpl", Ia.class.getSimpleName());
            return null;
        }
    }

    public static L a(Context context, CastOptions castOptions, Dr dr, J j) {
        try {
            return a(context).a(castOptions, dr, j);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", Ia.class.getSimpleName());
            return null;
        }
    }

    public static T a(Service service, Dr dr, Dr dr2) {
        try {
            return a(service.getApplicationContext()).a(Er.a(service), dr, dr2);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", Ia.class.getSimpleName());
            return null;
        }
    }

    public static C0703f a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, C0705g gVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return a(context.getApplicationContext()).a(Er.a(asyncTask), gVar, i, i2, z, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, 10000);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", Ia.class.getSimpleName());
            return null;
        }
    }

    private static Ia a(Context context) {
        try {
            IBinder a2 = DynamiteModule.a(context, DynamiteModule.h, "com.google.android.gms.cast.framework.dynamite").a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof Ia) {
                return (Ia) queryLocalInterface;
            }
            return new Ha(a2);
        } catch (a e) {
            throw new RuntimeException(e);
        }
    }
}
