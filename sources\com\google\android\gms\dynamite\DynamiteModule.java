package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
public final class DynamiteModule {
    private static Boolean a = null;
    private static i b = null;
    private static k c = null;
    private static String d = null;
    private static int e = -1;
    private static final ThreadLocal<c> f = new ThreadLocal<>();
    private static final a g = new a();
    @KeepForSdk
    public static final b h = new b();
    @KeepForSdk
    public static final b i = new c();
    @KeepForSdk
    public static final b j = new d();
    @KeepForSdk
    public static final b k = new e();
    @KeepForSdk
    public static final b l = new f();
    private static final b m = new g();
    private final Context n;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, a aVar) {
            this(str);
        }

        /* synthetic */ a(String str, Throwable th, a aVar) {
            this(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z) throws a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b reason: collision with other inner class name */
        public static class C0045b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0045b a(Context context, String str, a aVar) throws a;
    }

    private static class c {
        public Cursor a;

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private static class d implements a {
        private final int a;
        private final int b = 0;

        public d(int i, int i2) {
            this.a = i;
        }

        public final int a(Context context, String str) {
            return this.a;
        }

        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.n = context;
    }

    @KeepForSdk
    public static DynamiteModule a(Context context, b bVar, String str) throws a {
        C0045b a2;
        String str2 = ":";
        String str3 = "DynamiteModule";
        c cVar = (c) f.get();
        c cVar2 = new c(null);
        f.set(cVar2);
        try {
            a2 = bVar.a(context, str, g);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i3);
            Log.i(str3, sb.toString());
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.b == 0))) {
                int i4 = a2.a;
                int i5 = a2.b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i4);
                sb2.append(" and remote version is ");
                sb2.append(i5);
                sb2.append(".");
                throw new a(sb2.toString(), (a) null);
            } else if (a2.c == -1) {
                DynamiteModule c2 = c(context, str);
                Cursor cursor = cVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                f.set(cVar);
                return c2;
            } else if (a2.c == 1) {
                DynamiteModule a3 = a(context, str, a2.b);
                Cursor cursor2 = cVar2.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f.set(cVar);
                return a3;
            } else {
                int i6 = a2.c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i6);
                throw new a(sb3.toString(), (a) null);
            }
        } catch (a e2) {
            String str4 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            if (a2.a == 0 || bVar.a(context, str, new d(a2.a, 0)).c != -1) {
                throw new a("Remote load failed. No local fallback found.", e2, null);
            }
            DynamiteModule c3 = c(context, str);
            Cursor cursor3 = cVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f.set(cVar);
            return c3;
        } catch (Throwable th) {
            Cursor cursor4 = cVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f.set(cVar);
            throw th;
        }
    }

    private static int b(Context context, String str, boolean z) {
        String str2 = "DynamiteModule";
        i a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            if (a2.t() >= 2) {
                return a2.a(Er.a(context), str, z);
            }
            Log.w(str2, "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a2.b(Er.a(context), str, z);
        } catch (RemoteException e2) {
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    private static int c(Context context, String str, boolean z) throws a {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String str2 = z ? "api_force_staging" : "api";
            StringBuilder sb = new StringBuilder(str2.length() + 42 + String.valueOf(str).length());
            sb.append("content://com.google.android.gms.chimera/");
            sb.append(str2);
            sb.append("/");
            sb.append(str);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i2 = query.getInt(0);
                        if (i2 > 0) {
                            synchronized (DynamiteModule.class) {
                                d = query.getString(2);
                                int columnIndex = query.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    e = query.getInt(columnIndex);
                                }
                            }
                            c cVar = (c) f.get();
                            if (cVar != null && cVar.a == null) {
                                cVar.a = query;
                                query = null;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                        return i2;
                    }
                } catch (Exception e2) {
                    Throwable th = e2;
                    cursor = query;
                    e = th;
                } catch (Throwable th2) {
                    cursor2 = query;
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new a("Failed to connect to dynamite module ContentResolver.", (a) null);
        } catch (Exception e3) {
            e = e3;
            cursor = null;
            try {
                if (e instanceof a) {
                    throw e;
                }
                throw new a("V2 version check failed", e, null);
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    @KeepForSdk
    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static DynamiteModule b(Context context, String str, int i2) throws a, RemoteException {
        k kVar;
        Dr dr;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = c;
        }
        if (kVar != null) {
            c cVar = (c) f.get();
            if (cVar == null || cVar.a == null) {
                throw new a("No result cursor", (a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.a;
            Er.a(null);
            if (a().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                dr = kVar.b(Er.a(applicationContext), str, i2, Er.a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                dr = kVar.a(Er.a(applicationContext), str, i2, Er.a(cursor));
            }
            Context context2 = (Context) Er.c(dr);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a("Failed to get module context", (a) null);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (a) null);
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Selected local version of ";
        Log.i("DynamiteModule", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return new DynamiteModule(context.getApplicationContext());
    }

    @KeepForSdk
    public static int a(Context context, String str) {
        String str2 = "DynamiteModule";
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e(str2, sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w(str2, sb3.toString());
            return 0;
        } catch (Exception e2) {
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:40|41|42|43|52|53|54|55|(3:57|58|59)(2:69|70)) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c5, code lost:
        return c(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ec, code lost:
        return b(r8, r9, r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[SYNTHETIC, Splitter:B:57:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e8 A[Catch:{ a -> 0x00c6, Throwable -> 0x00f0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    public static int a(Context context, String str, boolean z) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool2 = a;
                if (bool2 == null) {
                    try {
                        Class loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        Field declaredField = loadClass.getDeclaredField("sClassLoader");
                        synchronized (loadClass) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader != null) {
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    a(classLoader);
                                    bool = Boolean.TRUE;
                                }
                            } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                int c2 = c(context, str, z);
                                if (d != null) {
                                    if (!d.isEmpty()) {
                                        h hVar = new h(d, ClassLoader.getSystemClassLoader());
                                        a((ClassLoader) hVar);
                                        declaredField.set(null, hVar);
                                        a = Boolean.TRUE;
                                        return c2;
                                    }
                                }
                                return c2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String str2 = "DynamiteModule";
                        String valueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        Log.w(str2, sb.toString());
                        bool2 = Boolean.FALSE;
                        a = bool2;
                        if (bool2.booleanValue()) {
                        }
                    }
                }
            }
        } catch (a e3) {
            String str3 = "DynamiteModule";
            String str4 = "Failed to retrieve remote module version: ";
            String valueOf2 = String.valueOf(e3.getMessage());
            Log.w(str3, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
            return 0;
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw th;
        }
    }

    private static DynamiteModule a(Context context, String str, int i2) throws a {
        Boolean bool;
        Dr dr;
        try {
            synchronized (DynamiteModule.class) {
                bool = a;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", (a) null);
            } else if (bool.booleanValue()) {
                return b(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                i a2 = a(context);
                if (a2 != null) {
                    if (a2.t() >= 2) {
                        dr = a2.b(Er.a(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        dr = a2.a(Er.a(context), str, i2);
                    }
                    if (Er.c(dr) != null) {
                        return new DynamiteModule((Context) Er.c(dr));
                    }
                    throw new a("Failed to load remote module.", (a) null);
                }
                throw new a("Failed to create IDynamiteLoader.", (a) null);
            }
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw new a("Failed to load remote module.", th, null);
        }
    }

    private static i a(Context context) {
        i iVar;
        synchronized (DynamiteModule.class) {
            if (b != null) {
                i iVar2 = b;
                return iVar2;
            } else if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof i) {
                            iVar = (i) queryLocalInterface;
                        } else {
                            iVar = new j(iBinder);
                        }
                    }
                    if (iVar != null) {
                        b = iVar;
                        return iVar;
                    }
                } catch (Exception e2) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    private static Boolean a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(e >= 2);
        }
        return valueOf;
    }

    private static void a(ClassLoader classLoader) throws a {
        k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof k) {
                    kVar = (k) queryLocalInterface;
                } else {
                    kVar = new l(iBinder);
                }
            }
            c = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, null);
        }
    }

    @KeepForSdk
    public final IBinder a(String str) throws a {
        try {
            return (IBinder) this.n.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2, null);
        }
    }
}
