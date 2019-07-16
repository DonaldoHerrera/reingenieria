package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.CamcorderProfile;
import android.os.Build;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.view.WindowManager;

@EVa(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0012J\b\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\b\u0010$\u001a\u00020\u0010H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8VX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006&"}, d2 = {"Lcom/soundcloud/android/utils/DeviceHelper;", "", "context", "Landroid/content/Context;", "buildHelper", "Lcom/soundcloud/android/utils/BuildHelper;", "appConfiguration", "Lcom/soundcloud/appconfig/ApplicationConfiguration;", "(Landroid/content/Context;Lcom/soundcloud/android/utils/BuildHelper;Lcom/soundcloud/appconfig/ApplicationConfiguration;)V", "udid", "", "getUdid", "()Ljava/lang/String;", "udid$delegate", "Lkotlin/Lazy;", "avoidHighQualityImagery", "", "getAndroidReleaseVersion", "getAppVersionCode", "", "getAppVersionName", "getCurrentOrientation", "Lcom/soundcloud/android/utils/DeviceOrientation;", "getDeviceName", "getDeviceType", "Lcom/soundcloud/android/utils/DeviceType;", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "getPackageName", "getUniqueDeviceId", "getUserAgent", "hasCamcorderProfile", "camcorderProfile", "isLandscape", "isLowMemoryDevice", "isPortrait", "isTablet", "Companion", "features-base_release"}, mv = {1, 1, 15})
/* renamed from: jHa reason: default package and case insensitive filesystem */
/* compiled from: DeviceHelper.kt */
public class C6699jHa {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C6699jHa.class), "udid", "getUdid()Ljava/lang/String;"))};
    public static final a b = new a(null);
    private final C7744yVa c = BVa.a(new C6767kHa(this));
    private final Context d;
    private final C5467YGa e;
    private final C7181qKa f;

    /* renamed from: jHa$a */
    /* compiled from: DeviceHelper.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final String a() {
            String str = "Device";
            String str2 = "Hardware";
            String str3 = "Manufacturer";
            String str4 = "Model";
            String str5 = "Product";
            String str6 = "Type";
            String aVar = C4804CKa.a("Build").a("Brand", (Object) Build.BRAND).a(str, (Object) Build.DEVICE).a(str2, (Object) Build.HARDWARE).a(str3, (Object) Build.MANUFACTURER).a(str4, (Object) Build.MODEL).a(str5, (Object) Build.PRODUCT).a(str6, (Object) Build.TYPE).toString();
            C7471uYa.a((Object) aVar, "MoreObjects.toStringHelp…              .toString()");
            return aVar;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6699jHa(Context context, C5467YGa yGa, C7181qKa qka) {
        C7471uYa.b(context, "context");
        C7471uYa.b(yGa, "buildHelper");
        C7471uYa.b(qka, "appConfiguration");
        this.d = context;
        this.e = yGa;
        this.f = qka;
    }

    /* access modifiers changed from: private */
    public String o() {
        return Secure.getString(this.d.getContentResolver(), "android_id");
    }

    public int b() {
        return this.f.b();
    }

    public String c() {
        return this.f.g();
    }

    public C6903mHa d() {
        Resources resources = this.d.getResources();
        C7471uYa.a((Object) resources, "context.resources");
        int i = resources.getConfiguration().orientation;
        if (i == 1) {
            return C6903mHa.PORTRAIT;
        }
        if (i != 2) {
            return C6903mHa.UNKNOWN;
        }
        return C6903mHa.LANDSCAPE;
    }

    public String e() {
        String c2 = this.e.c();
        String d2 = this.e.d();
        if (C5206PKa.b(d2)) {
            if (C5206PKa.b(c2)) {
                C7471uYa.a((Object) d2, "model");
                C7471uYa.a((Object) c2, "manufacturer");
                if (!Cxb.b(d2, c2, false, 2, null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c2);
                    sb.append(" ");
                    sb.append(d2);
                    c2 = sb.toString();
                }
            }
            c2 = d2;
        } else if (!C5206PKa.b(c2)) {
            c2 = "unknown device";
        }
        C7471uYa.a((Object) c2, "deviceName");
        return c2;
    }

    public C6971nHa f() {
        return n() ? C6971nHa.TABLET : C6971nHa.PHONE;
    }

    public DisplayMetrics g() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = this.d.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new OVa("null cannot be cast to non-null type android.view.WindowManager");
    }

    public String h() {
        String packageName = this.d.getPackageName();
        C7471uYa.a((Object) packageName, "context.packageName");
        return packageName;
    }

    public String i() {
        C7744yVa yva = this.c;
        DZa dZa = a[0];
        return (String) yva.getValue();
    }

    public String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("SoundCloud/");
        sb.append(this.f.g());
        sb.append(" (Android ");
        sb.append(this.e.a());
        sb.append("; ");
        sb.append(C7315sGa.b.d(e()));
        sb.append(')');
        return sb.toString();
    }

    public boolean k() {
        return d() == C6903mHa.LANDSCAPE;
    }

    public boolean l() {
        return Runtime.getRuntime().maxMemory() < ((long) 52428800);
    }

    public boolean m() {
        return d() == C6903mHa.PORTRAIT;
    }

    public boolean n() {
        return this.f.l();
    }

    public boolean a(int i) {
        return CamcorderProfile.hasProfile(i);
    }

    public boolean a() {
        return l() || n();
    }
}
