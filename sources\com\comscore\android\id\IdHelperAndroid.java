package com.comscore.android.id;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings.Secure;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

public class IdHelperAndroid {
    public static final String[] INVALID_ID_VALUES = {"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"};
    public static final String NO_ID_AVAILABLE = "none";
    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private static boolean c = false;
    private static final boolean d = false;

    private static final class a implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        /* access modifiers changed from: 0000 */
        public IBinder a() {
            if (!this.a) {
                this.a = true;
                return (IBinder) this.b.take();
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static final class b implements IInterface {
        private IBinder a;

        b(IBinder iBinder) {
            this.a = iBinder;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.a;
        }

        public String getId() {
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
    }

    private static DeviceId a() {
        DeviceId deviceId = new DeviceId("random", UUID.randomUUID().toString(), 7, 2, 0);
        return deviceId;
    }

    private static String a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = new a();
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aVar, 1)) {
                try {
                    return new b(aVar.a()).getId();
                } catch (Exception unused) {
                } finally {
                    context.unbindService(aVar);
                }
            }
            return "";
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    private static boolean b(Context context) {
        if (VERSION.SDK_INT <= 4) {
            return false;
        }
        if (d) {
            return true;
        }
        return a.a(context);
    }

    public static boolean checkAndroidId(String str) {
        for (String equals : INVALID_ID_VALUES) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAndroidSerial(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        for (String equals : INVALID_ID_VALUES) {
            if (equals.equals(str)) {
                return false;
            }
        }
        if (str.length() > 3 && !str.substring(0, 3).equals("***") && !str.substring(0, 3).equals("000")) {
            z = true;
        }
        return z;
    }

    @SuppressLint({"InlinedApi"})
    public static DeviceId getAndroidId(Context context) {
        if (VERSION.SDK_INT >= 3) {
            try {
                String str = (String) Secure.class.getMethod("getString", new Class[]{ContentResolver.class, String.class}).invoke(null, new Object[]{context.getContentResolver(), "android_id"});
                if (str != null && str.length() > 0) {
                    DeviceId deviceId = new DeviceId("AndroidId", str, 7, 2, 2);
                    return deviceId;
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    public static DeviceId getAndroidSerial() {
        if (VERSION.SDK_INT < 9) {
            return null;
        }
        DeviceId deviceId = new DeviceId("AndroidSerial", b.a(), 3, 1, 1);
        return deviceId;
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context) {
        return getCrossPublisherDeviceId(context, false);
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            DeviceId googlePlayAdvertisingDeviceId = getGooglePlayAdvertisingDeviceId(context, z);
            if (googlePlayAdvertisingDeviceId != null) {
                return new CrossPublisherId(googlePlayAdvertisingDeviceId.getId(), 1);
            }
            if (!b(context)) {
                DeviceId androidSerial = getAndroidSerial();
                if (androidSerial != null && checkAndroidSerial(androidSerial.getId())) {
                    return new CrossPublisherId(androidSerial.getId(), 2);
                }
                DeviceId androidId = getAndroidId(context);
                if (androidId != null && checkAndroidId(androidId.getId())) {
                    return new CrossPublisherId(androidId.getId(), 3);
                }
            }
            return new CrossPublisherId(null, 0);
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static DeviceId getDeviceId(Context context) {
        DeviceId androidSerial = getAndroidSerial();
        if (androidSerial != null && checkAndroidSerial(androidSerial.getId())) {
            return androidSerial;
        }
        DeviceId androidId = getAndroidId(context);
        return (androidId == null || !checkAndroidId(androidId.getId())) ? a() : androidId;
    }

    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context) {
        return getGooglePlayAdvertisingDeviceId(context, false);
    }

    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        } else if (!isGooglePlayServicesAvailable(context)) {
            return null;
        } else {
            DeviceId deviceId = new DeviceId("googleplayapp", isAdvertisingIdEnabled(context, z) ? a(context) : NO_ID_AVAILABLE, 0, 0, -1);
            return deviceId;
        }
    }

    public static boolean isAdvertisingIdEnabled(Context context) {
        return isAdvertisingIdEnabled(context, false);
    }

    public static boolean isAdvertisingIdEnabled(Context context, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            boolean z2 = false;
            if (!z && c) {
                return false;
            }
            a aVar = new a();
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aVar, 1)) {
                try {
                    z2 = !new b(aVar.a()).a(true);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    context.unbindService(aVar);
                    throw th;
                }
                context.unbindService(aVar);
            }
            if (!z && !z2) {
                c = true;
            }
            return z2;
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        } else if (VERSION.SDK_INT <= 8) {
            return false;
        } else {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                a aVar = new a();
                Intent intent = new Intent(b);
                intent.setPackage(a);
                if (!context.bindService(intent, aVar, 1)) {
                    return false;
                }
                context.unbindService(aVar);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static String md5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(Constants.MD5).digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                byte b3 = b2 & 255;
                if (b3 < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(b3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e2);
        }
    }
}
