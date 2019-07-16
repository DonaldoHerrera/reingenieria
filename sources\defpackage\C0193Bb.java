package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: Bb reason: default package and case insensitive filesystem */
/* compiled from: FontsContractCompat */
public class C0193Bb {
    static final Z<String, Typeface> a = new Z<>(16);
    private static final C0208Gb b = new C0208Gb("fonts", 10, 10000);
    static final Object c = new Object();
    static final C0485ba<String, ArrayList<defpackage.C0208Gb.a<c>>> d = new C0485ba<>();
    private static final Comparator<byte[]> e = new C0190Ab();

    /* renamed from: Bb$a */
    /* compiled from: FontsContractCompat */
    public static class a {
        private final int a;
        private final b[] b;

        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = bVarArr;
        }

        public b[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: Bb$b */
    /* compiled from: FontsContractCompat */
    public static class b {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public b(Uri uri, int i, int i2, boolean z, int i3) {
            C0263Ub.a(uri);
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    /* renamed from: Bb$c */
    /* compiled from: FontsContractCompat */
    private static final class c {
        final Typeface a;
        final int b;

        c(Typeface typeface, int i) {
            this.a = typeface;
            this.b = i;
        }
    }

    static c a(Context context, C1807wb wbVar, int i) {
        try {
            a a2 = a(context, (CancellationSignal) null, wbVar);
            int i2 = -3;
            if (a2.b() == 0) {
                Typeface a3 = C0517cb.a(context, null, a2.a(), i);
                if (a3 != null) {
                    i2 = 0;
                }
                return new c(a3, i2);
            }
            if (a2.b() == 1) {
                i2 = -2;
            }
            return new c(null, i2);
        } catch (NameNotFoundException unused) {
            return new c(null, -1);
        }
    }

    /* JADX INFO: used method not loaded: Gb.a(java.util.concurrent.Callable, Gb$a):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        b.a((java.util.concurrent.Callable) r1, (defpackage.C0208Gb.a) new defpackage.C1897zb(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        return r2;
     */
    public static Typeface a(Context context, C1807wb wbVar, defpackage.C0277Xa.a aVar, Handler handler, boolean z, int i, int i2) {
        Object obj;
        Typeface typeface;
        StringBuilder sb = new StringBuilder();
        sb.append(wbVar.c());
        sb.append("-");
        sb.append(i2);
        String sb2 = sb.toString();
        Typeface typeface2 = (Typeface) a.get(sb2);
        if (typeface2 != null) {
            if (aVar != null) {
                aVar.a(typeface2);
            }
            return typeface2;
        } else if (!z || i != -1) {
            C1837xb xbVar = new C1837xb(context, wbVar, i2, sb2);
            Typeface typeface3 = 0;
            if (z) {
                try {
                    typeface = ((c) b.a((Callable<T>) xbVar, i)).a;
                } catch (InterruptedException unused) {
                    typeface = typeface3;
                }
                return typeface;
            }
            if (aVar == null) {
                obj = typeface3;
            } else {
                obj = new C1867yb(aVar, handler);
            }
            synchronized (c) {
                ArrayList arrayList = (ArrayList) d.get(sb2);
                if (arrayList != null) {
                    if (obj != 0) {
                        arrayList.add(obj);
                    }
                } else if (obj != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj);
                    d.put(sb2, arrayList2);
                }
            }
        } else {
            c a2 = a(context, wbVar, i2);
            if (aVar != null) {
                int i3 = a2.b;
                if (i3 == 0) {
                    aVar.a(a2.a, handler);
                } else {
                    aVar.a(i3, handler);
                }
            }
            return a2.a;
        }
    }

    public static Map<Uri, ByteBuffer> a(Context context, b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (b bVar : bVarArr) {
            if (bVar.a() == 0) {
                Uri c2 = bVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, C1443kb.a(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static a a(Context context, CancellationSignal cancellationSignal, C1807wb wbVar) throws NameNotFoundException {
        ProviderInfo a2 = a(context.getPackageManager(), wbVar, context.getResources());
        if (a2 == null) {
            return new a(1, null);
        }
        return new a(0, a(context, wbVar, a2.authority, cancellationSignal));
    }

    public static ProviderInfo a(PackageManager packageManager, C1807wb wbVar, Resources resources) throws NameNotFoundException {
        String d2 = wbVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(d2);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(wbVar.e())) {
            List a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, e);
            List a3 = a(wbVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a3.get(i));
                Collections.sort(arrayList, e);
                if (a(a2, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(d2);
            sb2.append(", but package was not ");
            sb2.append(wbVar.e());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    private static List<List<byte[]>> a(C1807wb wbVar, Resources resources) {
        if (wbVar.a() != null) {
            return wbVar.a();
        }
        return C0254Sa.a(resources, wbVar.b());
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    static b[] a(Context context, C1807wb wbVar, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri uri;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        String str3 = "content";
        Uri build = new Builder().scheme(str3).authority(str2).build();
        Uri build2 = new Builder().scheme(str3).authority(str2).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            if (VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{wbVar.f()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{wbVar.f()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    b bVar = new b(uri, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i);
                    arrayList2.add(bVar);
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return (b[]) arrayList.toArray(new b[0]);
        } catch (Throwable th) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
