package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.B;
import com.facebook.C0594t;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.c reason: case insensitive filesystem */
/* compiled from: AttributionIdentifiers */
public class C0542c {
    private static final String a = "com.facebook.internal.c";
    private static C0542c b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private long g;

    /* renamed from: com.facebook.internal.c$a */
    /* compiled from: AttributionIdentifiers */
    private static final class a implements IInterface {
        private IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        public String C() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean D() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.a;
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    /* compiled from: AttributionIdentifiers */
    private static final class b implements ServiceConnection {
        private AtomicBoolean a;
        private final BlockingQueue<IBinder> b;

        private b() {
            this.a = new AtomicBoolean(false);
            this.b = new LinkedBlockingDeque();
        }

        public IBinder a() throws InterruptedException {
            if (!this.a.compareAndSet(true, true)) {
                return (IBinder) this.b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[Catch:{ Exception -> 0x00c9, all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[Catch:{ Exception -> 0x00c9, all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[Catch:{ Exception -> 0x00c9, all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ef  */
    public static C0542c a(Context context) {
        Cursor cursor;
        Uri uri;
        String e2;
        Uri parse;
        String str = "limit_tracking";
        String str2 = "androidid";
        String str3 = "aid";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.e(a, "getAttributionIdentifiers should not be called from the main thread");
        }
        if (b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C0542c cVar = b;
            if (currentTimeMillis - cVar.g < 3600000) {
                return cVar;
            }
        }
        C0542c b2 = b(context);
        Cursor cursor2 = null;
        try {
            String[] strArr = {str3, str2, str};
            if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) != null) {
                parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
            } else if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) != null) {
                parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
            } else {
                uri = null;
                e2 = e(context);
                if (e2 != null) {
                    b2.e = e2;
                }
                if (uri != null) {
                    a(b2);
                    return b2;
                }
                Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex(str3);
                            int columnIndex2 = query.getColumnIndex(str2);
                            int columnIndex3 = query.getColumnIndex(str);
                            b2.c = query.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && b2.a() == null) {
                                b2.d = query.getString(columnIndex2);
                                b2.f = Boolean.parseBoolean(query.getString(columnIndex3));
                            }
                            if (query != null) {
                                query.close();
                            }
                            a(b2);
                            return b2;
                        }
                    } catch (Exception e3) {
                        Exception exc = e3;
                        cursor = query;
                        e = exc;
                        try {
                            String str4 = a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Caught unexpected exception in getAttributionId(): ");
                            sb.append(e.toString());
                            ia.b(str4, sb.toString());
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cursor2 = query;
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                a(b2);
                if (query != null) {
                    query.close();
                }
                return b2;
            }
            uri = parse;
            e2 = e(context);
            if (e2 != null) {
            }
            if (uri != null) {
            }
        } catch (Exception e4) {
            e = e4;
            cursor = null;
            String str42 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Caught unexpected exception in getAttributionId(): ");
            sb2.append(e.toString());
            ia.b(str42, sb2.toString());
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private static C0542c b(Context context) {
        C0542c c2 = c(context);
        if (c2 != null) {
            return c2;
        }
        C0542c d2 = d(context);
        return d2 == null ? new C0542c() : d2;
    }

    private static C0542c c(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new C0594t("getAndroidId cannot be called on the main thread.");
            } else if (!f(context)) {
                return null;
            } else {
                Method a2 = ia.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                if (a2 == null) {
                    return null;
                }
                Object a3 = ia.a((Object) null, a2, context);
                if (a3 == null) {
                    return null;
                }
                Method a4 = ia.a(a3.getClass(), "getId", (Class<?>[]) new Class[0]);
                Method a5 = ia.a(a3.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                if (a4 != null) {
                    if (a5 != null) {
                        C0542c cVar = new C0542c();
                        cVar.d = (String) ia.a(a3, a4, new Object[0]);
                        cVar.f = ((Boolean) ia.a(a3, a5, new Object[0])).booleanValue();
                        return cVar;
                    }
                }
                return null;
            }
        } catch (Exception e2) {
            ia.a("android_id", e2);
            return null;
        }
    }

    private static C0542c d(Context context) {
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                a aVar = new a(bVar.a());
                C0542c cVar = new C0542c();
                cVar.d = aVar.C();
                cVar.f = aVar.D();
                return cVar;
            } catch (Exception e2) {
                ia.a("android_id", e2);
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    private static String e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    private static boolean f(Context context) {
        Method a2 = ia.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (a2 == null) {
            return false;
        }
        Object a3 = ia.a((Object) null, a2, context);
        return (a3 instanceof Integer) && ((Integer) a3).intValue() == 0;
    }

    public String b() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public String c() {
        return this.c;
    }

    private static C0542c a(C0542c cVar) {
        cVar.g = System.currentTimeMillis();
        b = cVar;
        return cVar;
    }

    public String a() {
        if (!B.t() || !B.d()) {
            return null;
        }
        return this.d;
    }
}
