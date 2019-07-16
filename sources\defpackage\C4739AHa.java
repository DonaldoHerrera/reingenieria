package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Build.VERSION;
import androidx.appcompat.app.C0325l;
import androidx.core.app.b;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.p;
import java.io.File;
import java.io.IOException;

/* renamed from: AHa reason: default package and case insensitive filesystem */
/* compiled from: IOUtils */
public class C4739AHa {
    public static File a(Context context, String str, String str2) {
        try {
            File file = new File(new File(context.getCacheDir(), str), str2);
            file.mkdirs();
            file.createNewFile();
            return file;
        } catch (IOException e) {
            SDb.a(e, "Error while creating cache file", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void b(Activity activity) {
        b.a(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 9002);
    }

    /* access modifiers changed from: private */
    public static void b(Fragment fragment) {
        fragment.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 9002);
    }

    public static boolean a(Context context) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            networkInfo = null;
        } else {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public static WifiLock a(Context context, String str) {
        return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).createWifiLock(3, str);
    }

    public static boolean a(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            String str = "android.permission.READ_EXTERNAL_STORAGE";
            if (a.a((Context) activity, str) != 0) {
                if (b.a(activity, str)) {
                    C0325l.a aVar = new C0325l.a(activity);
                    aVar.b(p.crop_external_permission_rationale);
                    aVar.c(p.ok_got_it, (OnClickListener) new C4769BGa(activity));
                    aVar.c();
                } else {
                    b(activity);
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(Fragment fragment) {
        if (VERSION.SDK_INT >= 23) {
            String str = "android.permission.READ_EXTERNAL_STORAGE";
            if (a.a(fragment.getContext(), str) != 0) {
                if (fragment.shouldShowRequestPermissionRationale(str)) {
                    C0325l.a aVar = new C0325l.a(fragment.getContext());
                    aVar.b(p.crop_external_permission_rationale);
                    aVar.c(p.ok_got_it, (OnClickListener) new C4800CGa(fragment));
                    aVar.c();
                } else {
                    b(fragment);
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(int i, int[] iArr) {
        return i == 9002 && iArr.length > 0 && iArr[0] == 0;
    }
}
