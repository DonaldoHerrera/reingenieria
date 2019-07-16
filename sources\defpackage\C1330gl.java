package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.B;
import com.facebook.internal.E;
import com.facebook.internal.ea;
import com.facebook.internal.ia;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gl reason: default package and case insensitive filesystem */
/* compiled from: DeviceRequestsHelper */
public class C1330gl {
    private static final String a = "gl";
    private static HashMap<String, RegistrationListener> b = new HashMap<>();

    public static String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static boolean b() {
        return VERSION.SDK_INT >= 16 && E.b(B.f()).k().contains(ea.Enabled);
    }

    public static boolean c(String str) {
        if (b()) {
            return e(str);
        }
        return false;
    }

    @TargetApi(16)
    private static void d(String str) {
        RegistrationListener registrationListener = (RegistrationListener) b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) B.e().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                ia.a(a, (Exception) e);
            }
            b.remove(str);
        }
    }

    @TargetApi(16)
    private static boolean e(String str) {
        if (b.containsKey(str)) {
            return true;
        }
        String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", B.q().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) B.e().getSystemService("servicediscovery");
        C1299fl flVar = new C1299fl(format, str);
        b.put(str, flVar);
        nsdManager.registerService(nsdServiceInfo, 1, flVar);
        return true;
    }

    public static Bitmap b(String str) {
        EnumMap enumMap = new EnumMap(C2459bF.class);
        enumMap.put(C2459bF.MARGIN, Integer.valueOf(2));
        try {
            C3268tF a2 = new C2970eF().a(str, C2421_E.QR_CODE, 200, 200, enumMap);
            int j = a2.j();
            int k = a2.k();
            int[] iArr = new int[(j * k)];
            for (int i = 0; i < j; i++) {
                int i2 = i * k;
                for (int i3 = 0; i3 < k; i3++) {
                    iArr[i2 + i3] = a2.a(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(k, j, Config.ARGB_8888);
            try {
                createBitmap.setPixels(iArr, 0, k, 0, 0, k, j);
                return createBitmap;
            } catch (C3046iF unused) {
                return createBitmap;
            }
        } catch (C3046iF unused2) {
            return null;
        }
    }

    public static void a(String str) {
        d(str);
    }
}
