package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* renamed from: Fr reason: default package */
public abstract class Fr<T> {
    private final String zzic;
    private T zzid;

    @KeepForSdk
    /* renamed from: Fr$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    protected Fr(String str) {
        this.zzic = str;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract T getRemoteCreator(IBinder iBinder);

    /* access modifiers changed from: protected */
    @KeepForSdk
    public final T getRemoteCreatorInstance(Context context) throws a {
        if (this.zzid == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.zzid = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zzic).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new a("Could not access creator.", e3);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.zzid;
    }
}
