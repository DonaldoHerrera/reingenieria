package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.b;

/* renamed from: com.google.android.gms.internal.clearcut.f reason: case insensitive filesystem */
public abstract class C0751f<T> {
    private static final Object a = new Object();
    @SuppressLint({"StaticFieldLeak"})
    private static Context b = null;
    private static boolean c = false;
    private static volatile Boolean d = null;
    private static volatile Boolean e = null;
    private final C0781p f;
    final String g;
    private final String h;
    private final T i;
    private T j;
    private volatile C0742c k;
    private volatile SharedPreferences l;

    private C0751f(C0781p pVar, String str, T t) {
        this.j = null;
        this.k = null;
        this.l = null;
        if (pVar.a == null && pVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (pVar.a == null || pVar.b == null) {
            this.f = pVar;
            String valueOf = String.valueOf(pVar.c);
            String valueOf2 = String.valueOf(str);
            this.h = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(pVar.d);
            String valueOf4 = String.valueOf(str);
            this.g = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.i = t;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /* synthetic */ C0751f(C0781p pVar, String str, Object obj, C0763j jVar) {
        this(pVar, str, obj);
    }

    private static <V> V a(C0775n<V> nVar) {
        long clearCallingIdentity;
        try {
            return nVar.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = nVar.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static void a(Context context) {
        if (b == null) {
            synchronized (a) {
                if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (b != context) {
                    d = null;
                }
                b = context;
            }
            c = false;
        }
    }

    static boolean a(String str, boolean z) {
        if (e()) {
            return ((Boolean) a((C0775n<V>) new C0760i<V>(str, false))).booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static <T> C0751f<T> b(C0781p pVar, String str, T t, C0778o<T> oVar) {
        return new C0772m(pVar, str, t, oVar);
    }

    /* access modifiers changed from: private */
    public static C0751f<String> b(C0781p pVar, String str, String str2) {
        return new C0769l(pVar, str, str2);
    }

    /* access modifiers changed from: private */
    public static C0751f<Boolean> b(C0781p pVar, String str, boolean z) {
        return new C0766k(pVar, str, Boolean.valueOf(z));
    }

    @TargetApi(24)
    private final T c() {
        boolean z;
        if (a("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String str = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(this.g);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (this.f.b != null) {
            if (this.k == null) {
                this.k = C0742c.a(b.getContentResolver(), this.f.b);
            }
            String str2 = (String) a((C0775n<V>) new C0754g<V>(this, this.k));
            if (str2 != null) {
                return a(str2);
            }
        } else if (this.f.a != null) {
            if (VERSION.SDK_INT < 24 || b.isDeviceProtectedStorage()) {
                z = true;
            } else {
                if (e == null || !e.booleanValue()) {
                    e = Boolean.valueOf(((UserManager) b.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z = e.booleanValue();
            }
            if (!z) {
                return null;
            }
            if (this.l == null) {
                this.l = b.getSharedPreferences(this.f.a, 0);
            }
            SharedPreferences sharedPreferences = this.l;
            if (sharedPreferences.contains(this.g)) {
                return a(sharedPreferences);
            }
        }
        return null;
    }

    private final T d() {
        if (!this.f.e && e()) {
            String str = (String) a((C0775n<V>) new C0757h<V>(this));
            if (str != null) {
                return a(str);
            }
        }
        return null;
    }

    private static boolean e() {
        if (d == null) {
            Context context = b;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (b.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public final T a() {
        if (b != null) {
            if (this.f.f) {
                T d2 = d();
                if (d2 != null) {
                    return d2;
                }
                T c2 = c();
                if (c2 != null) {
                    return c2;
                }
            } else {
                T c3 = c();
                if (c3 != null) {
                    return c3;
                }
                T d3 = d();
                if (d3 != null) {
                    return d3;
                }
            }
            return this.i;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract T a(String str);

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ String b() {
        return xc.a(b.getContentResolver(), this.h, (String) null);
    }
}
