package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: oNa reason: default package and case insensitive filesystem */
/* compiled from: AdvertisingInfoServiceStrategy */
class C7046oNa implements C7115pNa {
    private final Context a;

    /* renamed from: oNa$a */
    /* compiled from: AdvertisingInfoServiceStrategy */
    private static final class a implements ServiceConnection {
        private boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() {
            if (this.a) {
                C5328TMa.e().e("Fabric", "getBinder already called");
            }
            this.a = true;
            try {
                return (IBinder) this.b.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.b.clear();
        }
    }

    /* renamed from: oNa$b */
    /* compiled from: AdvertisingInfoServiceStrategy */
    private static final class b implements IInterface {
        private final IBinder a;

        public b(IBinder iBinder) {
            this.a = iBinder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            defpackage.C5328TMa.e().d("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        public boolean C() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z = false;
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(1);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        }

        public IBinder asBinder() {
            return this.a;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            defpackage.C5328TMa.e().d("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
        public String getId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        }
    }

    public C7046oNa(Context context) {
        this.a = context.getApplicationContext();
    }

    public C6705jNa a() {
        String str = "Could not bind to Google Play Service to capture AdvertisingId";
        String str2 = "Fabric";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C5328TMa.e().d(str2, "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.a.bindService(intent, aVar, 1)) {
                    try {
                        b bVar = new b(aVar.a());
                        C6705jNa jna = new C6705jNa(bVar.getId(), bVar.C());
                        this.a.unbindService(aVar);
                        return jna;
                    } catch (Exception e) {
                        C5328TMa.e().b(str2, "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        this.a.unbindService(aVar);
                    }
                } else {
                    C5328TMa.e().d(str2, str);
                    return null;
                }
            } catch (Throwable th) {
                C5328TMa.e().a(str2, str, th);
            }
        } catch (NameNotFoundException unused) {
            C5328TMa.e().d(str2, "Unable to find Google Play Services package name");
            return null;
        } catch (Exception e2) {
            C5328TMa.e().a(str2, "Unable to determine if Google Play Services is available", e2);
            return null;
        }
    }
}
