package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.B;
import com.facebook.C0594t;
import com.facebook.C0596v;
import com.facebook.login.C0569b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeProtocol */
public final class Z {
    private static final String a = "com.facebook.internal.Z";
    /* access modifiers changed from: private */
    public static final List<e> b = g();
    private static final List<e> c = f();
    private static final Map<String, List<e>> d = e();
    /* access modifiers changed from: private */
    public static final AtomicBoolean e = new AtomicBoolean(false);
    private static final List<Integer> f = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* compiled from: NativeProtocol */
    private static class a extends e {
        private a() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public String b() {
            return null;
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "com.facebook.arstudio.player";
        }

        /* synthetic */ a(Y y) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static class b extends e {
        private b() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public String b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "com.facebook.lite";
        }

        /* synthetic */ b(Y y) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static class c extends e {
        private c() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "com.facebook.katana";
        }

        /* synthetic */ c(Y y) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static class d extends e {
        private d() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public String b() {
            return null;
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "com.facebook.orca";
        }

        /* synthetic */ d(Y y) {
            this();
        }
    }

    /* compiled from: NativeProtocol */
    private static abstract class e {
        private TreeSet<Integer> a;

        private e() {
        }

        /* access modifiers changed from: protected */
        public abstract String b();

        /* access modifiers changed from: protected */
        public abstract String c();

        /* synthetic */ e(Y y) {
            this();
        }

        public TreeSet<Integer> a() {
            TreeSet<Integer> treeSet = this.a;
            if (treeSet == null || treeSet.isEmpty()) {
                a(false);
            }
            return this.a;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            if (r0.a.isEmpty() == false) goto L_0x0015;
         */
        public synchronized void a(boolean z) {
            if (!z) {
                if (this.a != null) {
                }
            }
            this.a = Z.c(this);
        }
    }

    /* compiled from: NativeProtocol */
    public static class f {
        private e a;
        private int b;

        private f() {
        }

        public static f a(e eVar, int i) {
            f fVar = new f();
            fVar.a = eVar;
            fVar.b = i;
            return fVar;
        }

        public int b() {
            return this.b;
        }

        public static f a() {
            f fVar = new f();
            fVar.b = -1;
            return fVar;
        }
    }

    /* compiled from: NativeProtocol */
    private static class g extends e {
        private g() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "com.facebook.wakizashi";
        }

        /* synthetic */ g(Y y) {
            this();
        }
    }

    public static final int c() {
        return ((Integer) f.get(0)).intValue();
    }

    public static int d(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    private static Map<String, List<e>> e() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(null));
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", c);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", b);
        return hashMap;
    }

    private static List<e> f() {
        ArrayList arrayList = new ArrayList(g());
        arrayList.add(0, new a(null));
        return arrayList;
    }

    private static List<e> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(null));
        arrayList.add(new g(null));
        return arrayList;
    }

    static Intent b(Context context, Intent intent, e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && C0560v.a(context, resolveService.serviceInfo.packageName)) {
            return intent;
        }
        return null;
    }

    public static Bundle c(Intent intent) {
        if (!b(d(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    public static void d() {
        if (e.compareAndSet(false, true)) {
            B.m().execute(new Y());
        }
    }

    static Intent a(Context context, Intent intent, e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && C0560v.a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    public static Intent b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C0569b bVar, String str3, String str4) {
        for (e eVar : b) {
            Context context2 = context;
            Intent a2 = a(context, a(eVar, str, collection, str2, z, z2, bVar, str3, str4), eVar);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static Intent a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C0569b bVar, String str3, String str4) {
        b bVar2 = new b(null);
        Context context2 = context;
        return a(context, a((e) bVar2, str, collection, str2, z, z2, bVar, str3, str4), (e) bVar2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.e(a, r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    public static TreeSet<Integer> c(e eVar) {
        Object obj;
        String str = "Failed to query content resolver.";
        TreeSet<Integer> treeSet = new TreeSet<>();
        ContentResolver contentResolver = B.e().getContentResolver();
        String str2 = "version";
        String[] strArr = {str2};
        Uri b2 = b(eVar);
        Cursor cursor = 0;
        try {
            PackageManager packageManager = B.e().getPackageManager();
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.c());
            sb.append(".provider.PlatformProvider");
            obj = packageManager.resolveContentProvider(sb.toString(), 0);
        } catch (RuntimeException e2) {
            Log.e(a, str, e2);
            obj = cursor;
        } catch (Throwable th) {
            if (cursor != 0) {
                cursor.close();
            }
            throw th;
        }
        if (obj != 0) {
            cursor = contentResolver.query(b2, strArr, null, null, null);
            if (cursor != 0) {
                while (cursor.moveToNext()) {
                    treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str2))));
                }
            }
        }
        if (cursor != 0) {
            cursor.close();
        }
        return treeSet;
    }

    public static boolean b(int i) {
        return f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    private static Intent a(e eVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, C0569b bVar, String str3, String str4) {
        String b2 = eVar.b();
        if (b2 == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.c(), b2).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", B.q());
        if (!ia.a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!ia.b(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", bVar.a());
        }
        putExtra.putExtra("legacy_override", B.o());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }

    public static UUID b(Intent intent) {
        String str;
        UUID uuid = null;
        if (intent == null) {
            return null;
        }
        if (b(d(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str != null) {
            try {
                uuid = UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return uuid;
    }

    public static boolean e(Intent intent) {
        Bundle a2 = a(intent);
        if (a2 != null) {
            return a2.containsKey("error");
        }
        return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    private static Uri b(e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(eVar.c());
        sb.append(".provider.PlatformProvider/versions");
        return Uri.parse(sb.toString());
    }

    public static Intent a(Intent intent, Bundle bundle, C0594t tVar) {
        UUID b2 = b(intent);
        if (b2 == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", d(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", b2.toString());
        if (tVar != null) {
            bundle2.putBundle("error", a(tVar));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    public static Intent a(Context context) {
        for (e eVar : b) {
            Intent b2 = b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.c()).addCategory("android.intent.category.DEFAULT"), eVar);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public static Bundle a(Intent intent) {
        if (!b(d(intent))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    public static C0594t a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new C0594t(string2);
        }
        return new C0596v(string2);
    }

    public static Bundle a(C0594t tVar) {
        if (tVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", tVar.toString());
        if (tVar instanceof C0596v) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    public static int a(int i) {
        return a(b, new int[]{i}).b();
    }

    private static f a(List<e> list, int[] iArr) {
        d();
        if (list == null) {
            return f.a();
        }
        for (e eVar : list) {
            int a2 = a(eVar.a(), c(), iArr);
            if (a2 != -1) {
                return f.a(eVar, a2);
            }
        }
        return f.a();
    }

    public static int a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i2 = -1;
        int i3 = length;
        int i4 = -1;
        while (true) {
            if (!descendingIterator.hasNext()) {
                break;
            }
            int intValue = ((Integer) descendingIterator.next()).intValue();
            i4 = Math.max(i4, intValue);
            while (i3 >= 0 && iArr[i3] > intValue) {
                i3--;
            }
            if (i3 < 0) {
                return -1;
            }
            if (iArr[i3] == intValue) {
                if (i3 % 2 == 0) {
                    i2 = Math.min(i4, i);
                }
            }
        }
        return i2;
    }
}
