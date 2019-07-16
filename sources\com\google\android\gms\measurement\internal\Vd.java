package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zf;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class Vd extends C1120hc {
    private static final String[] c = {"firebase_", "google_", "ga_"};
    private static final List<String> d = Collections.unmodifiableList(Arrays.asList(new String[]{"source", Constants.MEDIUM, "campaign", "term", "content"}));
    private SecureRandom e;
    private final AtomicLong f = new AtomicLong(0);
    private int g;
    private Integer h = null;

    Vd(Mb mb) {
        super(mb);
    }

    static boolean a(String str) {
        Preconditions.checkNotEmpty(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    static boolean e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    @VisibleForTesting
    private static boolean g(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private static int h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    static MessageDigest s() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(String str, String str2) {
        if (str2 == null) {
            e().u().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            e().u().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                e().u().a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    e().u().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(String str, String str2) {
        if (str2 == null) {
            e().u().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            e().u().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        e().u().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            e().u().a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!g(str)) {
                if (this.a.l()) {
                    e().u().a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1124ib.a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (this.a.l()) {
                e().u().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!g(str2)) {
            e().u().a("Invalid admob_app_id. Analytics disabled.", C1124ib.a(str2));
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = f().u();
        a();
        return u.equals(str);
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    /* access modifiers changed from: protected */
    public final boolean q() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void r() {
        i();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                e().v().a("Utils falling back to Random for random id");
            }
        }
        this.f.set(nextLong);
    }

    public final long t() {
        long andIncrement;
        long j;
        if (this.f.get() == 0) {
            synchronized (this.f) {
                long nextLong = new Random(System.nanoTime() ^ c().currentTimeMillis()).nextLong();
                int i = this.g + 1;
                this.g = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f) {
            this.f.compareAndSet(-1, 1);
            andIncrement = this.f.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    public final SecureRandom u() {
        i();
        if (this.e == null) {
            this.e = new SecureRandom();
        }
        return this.e;
    }

    public final int v() {
        if (this.h == null) {
            this.h = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
        }
        return this.h.intValue();
    }

    /* access modifiers changed from: 0000 */
    public final String w() {
        byte[] bArr = new byte[16];
        u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    static boolean e(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: 0000 */
    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            String str5 = "gclid";
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter(str5);
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(Constants.MEDIUM, str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str5, str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String str6 = "aclid";
            String queryParameter3 = uri.getQueryParameter(str6);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(str6, queryParameter3);
            }
            String str7 = "cp1";
            String queryParameter4 = uri.getQueryParameter(str7);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(str7, queryParameter4);
            }
            String str8 = "anid";
            String queryParameter5 = uri.getQueryParameter(str8);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(str8, queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            e().v().a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    /* access modifiers changed from: 0000 */
    public final int b(String str) {
        String str2 = "event";
        if (!c(str2, str)) {
            return 2;
        }
        if (!a(str2, C1145mc.a, str)) {
            return 13;
        }
        if (!a(str2, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final int c(String str) {
        String str2 = "user property";
        if (!c(str2, str)) {
            return 6;
        }
        if (!a(str2, C1155oc.a, str)) {
            return 15;
        }
        if (!a(str2, 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d(String str) {
        i();
        if (Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        e().z().a("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = a("user property referrer", str, h(str), obj, false);
        } else {
            z = a("user property", str, h(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: 0000 */
    public final Object c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return a(h(str), obj, true);
        }
        return a(h(str), obj, false);
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    private static boolean b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    @VisibleForTesting
    private final boolean c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e2) {
            e().s().a("Error obtaining certificate", e2);
        } catch (NameNotFoundException e3) {
            e().s().a("Package name not found", e3);
        }
        return true;
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            e().u().a("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr2 = c;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            e().u().a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Preconditions.checkNotNull(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (e(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                e().u().a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Bundle> b(List<zzq> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzq zzq : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzq.a);
            bundle.putString("origin", zzq.b);
            bundle.putLong("creation_timestamp", zzq.d);
            bundle.putString("name", zzq.c.b);
            C1130jc.a(bundle, zzq.c.i());
            bundle.putBoolean("active", zzq.e);
            String str = zzq.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzai zzai = zzq.g;
            if (zzai != null) {
                bundle.putString("timed_out_event_name", zzai.a);
                zzah zzah = zzq.g.b;
                if (zzah != null) {
                    bundle.putBundle("timed_out_event_params", zzah.i());
                }
            }
            bundle.putLong("trigger_timeout", zzq.h);
            zzai zzai2 = zzq.i;
            if (zzai2 != null) {
                bundle.putString("triggered_event_name", zzai2.a);
                zzah zzah2 = zzq.i.b;
                if (zzah2 != null) {
                    bundle.putBundle("triggered_event_params", zzah2.i());
                }
            }
            bundle.putLong("triggered_timestamp", zzq.c.c);
            bundle.putLong("time_to_live", zzq.j);
            zzai zzai3 = zzq.k;
            if (zzai3 != null) {
                bundle.putString("expired_event_name", zzai3.a);
                zzah zzah3 = zzq.k.b;
                if (zzah3 != null) {
                    bundle.putBundle("expired_event_params", zzah3.i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(String str, int i, String str2) {
        if (str2 == null) {
            e().u().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            e().u().a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    private final boolean a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    e().x().a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            e().x().a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            e().x().a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    static boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static String a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final Object a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return a(256, obj, true);
        }
        if (!e(str)) {
            i = 100;
        }
        return a(i, obj, false);
    }

    static Bundle[] a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (a(r2, 40, r15) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (a(r2, 40, r15) == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147  */
    public final Bundle a(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        Set<String> set;
        int i;
        String str3;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        String str4 = str;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        String[] strArr = null;
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = new Bundle(bundle2);
        if (f().e(str4, C1127j.Ca)) {
            set = new TreeSet<>(bundle.keySet());
        } else {
            set = bundle.keySet();
        }
        int i6 = 0;
        for (String str5 : set) {
            if (list2 == null || !list2.contains(str5)) {
                i = 14;
                String str6 = "event param";
                if (z) {
                    if (b(str6, str5)) {
                        if (!a(str6, strArr, str5)) {
                            i5 = 14;
                            if (i5 == 0) {
                                if (c(str6, str5)) {
                                    if (a(str6, strArr, str5)) {
                                    }
                                }
                                i = 3;
                            } else {
                                i = i5;
                            }
                            String str7 = "_ev";
                            if (i == 0) {
                                if (a(bundle3, i)) {
                                    bundle3.putString(str7, a(str5, 40, true));
                                    if (i == 3) {
                                        a(bundle3, (Object) str5);
                                    }
                                }
                                bundle3.remove(str5);
                            } else {
                                Object obj = bundle2.get(str5);
                                i();
                                if (z2) {
                                    if (obj instanceof Parcelable[]) {
                                        i4 = ((Parcelable[]) obj).length;
                                    } else {
                                        if (obj instanceof ArrayList) {
                                            i4 = ((ArrayList) obj).size();
                                        }
                                        z4 = true;
                                        if (!z4) {
                                            i3 = 17;
                                            str3 = str7;
                                            i2 = 40;
                                            if (i3 != 0 || str3.equals(str5)) {
                                                if (a(str5)) {
                                                    i6++;
                                                    if (i6 > 25) {
                                                        StringBuilder sb = new StringBuilder(48);
                                                        sb.append("Event can't contain more than 25 params");
                                                        e().u().a(sb.toString(), k().a(str2), k().a(bundle2));
                                                        a(bundle3, 5);
                                                        bundle3.remove(str5);
                                                    }
                                                }
                                                String str8 = str2;
                                            } else {
                                                if (a(bundle3, i3)) {
                                                    bundle3.putString(str3, a(str5, i2, true));
                                                    a(bundle3, bundle2.get(str5));
                                                }
                                                bundle3.remove(str5);
                                            }
                                        }
                                    }
                                    if (i4 > 1000) {
                                        e().x().a("Parameter array is too long; discarded. Value kind, name, array length", "param", str5, Integer.valueOf(i4));
                                        z4 = false;
                                        if (!z4) {
                                        }
                                    }
                                    z4 = true;
                                    if (!z4) {
                                    }
                                }
                                if ((!f().f(str4) || !e(str2)) && !e(str5)) {
                                    str3 = str7;
                                    i2 = 40;
                                    z3 = a("param", str5, 100, obj, z2);
                                } else {
                                    str3 = str7;
                                    i2 = 40;
                                    z3 = a("param", str5, 256, obj, z2);
                                }
                                i3 = z3 ? 0 : 4;
                                if (i3 != 0) {
                                }
                                if (a(str5)) {
                                }
                                String str82 = str2;
                            }
                            strArr = null;
                        }
                    }
                    i5 = 3;
                    if (i5 == 0) {
                    }
                    String str72 = "_ev";
                    if (i == 0) {
                    }
                    strArr = null;
                }
                i5 = 0;
                if (i5 == 0) {
                }
                String str722 = "_ev";
                if (i == 0) {
                }
                strArr = null;
            }
            i = 0;
            String str7222 = "_ev";
            if (i == 0) {
            }
            strArr = null;
        }
        return bundle3;
    }

    private static boolean a(Bundle bundle, int i) {
        String str = "_err";
        if (bundle.getLong(str) != 0) {
            return false;
        }
        bundle.putLong(str, (long) i);
        return true;
    }

    private static void a(Bundle bundle, Object obj) {
        Preconditions.checkNotNull(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    e().x().a("Not putting event parameter. Invalid value type. name, type", k().b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    public final void a(int i, String str, String str2, int i2) {
        a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (f().e(str, C1127j.va)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.a.a();
        this.a.x().b("auto", "_err", bundle);
    }

    @VisibleForTesting
    static long a(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i = 0;
        Preconditions.checkState(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    static boolean a(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        if (VERSION.SDK_INT >= 24) {
            return b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* access modifiers changed from: 0000 */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = a(str, bundle.get(str));
                if (a == null) {
                    e().x().a("Param value can't be null", k().b(str));
                } else {
                    a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    public final zzai a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (b(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            String str4 = "_o";
            bundle2.putString(str4, str3);
            zzai zzai = new zzai(str2, new zzah(a(a(str, str2, bundle2, CollectionUtils.listOf(str4), false, false))), str3, j);
            return zzai;
        }
        e().s().a("Invalid conditional property event name", k().c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    public final long a(Context context, String str) {
        i();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest s = s();
        if (s == null) {
            e().s().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!c(context, str)) {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(getContext().getPackageName(), 64);
                    if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                        return a(s.digest(packageInfo.signatures[0].toByteArray()));
                    }
                    e().v().a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e2) {
                e().s().a("Package name not found", e2);
            }
        }
        return 0;
    }

    static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int a(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(getContext(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public static long a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle, long j) {
        String str = "_et";
        long j2 = bundle.getLong(str);
        if (j2 != 0) {
            e().v().a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong(str, j + j2);
    }

    public final void a(zf zfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zfVar.h(bundle);
        } catch (RemoteException e2) {
            this.a.e().v().a("Error returning string value to wrapper", e2);
        }
    }

    public final void a(zf zfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zfVar.h(bundle);
        } catch (RemoteException e2) {
            this.a.e().v().a("Error returning long value to wrapper", e2);
        }
    }

    public final void a(zf zfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zfVar.h(bundle);
        } catch (RemoteException e2) {
            this.a.e().v().a("Error returning int value to wrapper", e2);
        }
    }

    public final void a(zf zfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zfVar.h(bundle);
        } catch (RemoteException e2) {
            this.a.e().v().a("Error returning byte array to wrapper", e2);
        }
    }

    public final void a(zf zfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zfVar.h(bundle);
        } catch (RemoteException e2) {
            this.a.e().v().a("Error returning boolean value to wrapper", e2);
        }
    }

    public final void a(zf zfVar, Bundle bundle) {
        try {
            zfVar.h(bundle);
        } catch (RemoteException e2) {
            this.a.e().v().a("Error returning bundle value to wrapper", e2);
        }
    }

    public static Bundle a(List<zzjn> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzjn zzjn : list) {
            String str = zzjn.f;
            if (str != null) {
                bundle.putString(zzjn.b, str);
            } else {
                Long l = zzjn.d;
                if (l != null) {
                    bundle.putLong(zzjn.b, l.longValue());
                } else {
                    Double d2 = zzjn.h;
                    if (d2 != null) {
                        bundle.putDouble(zzjn.b, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public final void a(zf zfVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zfVar.h(bundle);
        } catch (RemoteException e2) {
            this.a.e().v().a("Error returning bundle list to wrapper", e2);
        }
    }

    public final URL a(long j, String str, String str2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            return new URL(String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(v())}), str2, str}));
        } catch (IllegalArgumentException | MalformedURLException e2) {
            e().s().a("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
