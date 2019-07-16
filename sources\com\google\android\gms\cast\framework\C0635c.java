package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.Ga;
import com.google.android.gms.internal.cast.J;
import com.google.android.gms.internal.cast.Ka;
import com.google.android.gms.internal.cast.Na;
import com.google.android.gms.internal.cast.ta;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.cast.framework.c reason: case insensitive filesystem */
public class C0635c {
    private static final C0710ia a = new C0710ia("CastContext");
    private static C0635c b;
    private final Context c;
    private final K d;
    private final C0666s e;
    private final E f;
    private final C0641i g;
    private final C0639g h;
    private final CastOptions i;
    private Na j = new Na(h.a(this.c));
    private Ga k;
    private final List<C0668u> l;

    private C0635c(Context context, CastOptions castOptions, List<C0668u> list) {
        S s;
        E e2;
        Y y;
        C0666s sVar;
        String str = "Unable to call %s on %s.";
        this.c = context.getApplicationContext();
        this.i = castOptions;
        this.l = list;
        i();
        this.d = ta.a(this.c, castOptions, (Ka) this.j, h());
        C0641i iVar = null;
        try {
            s = this.d.k();
        } catch (RemoteException e3) {
            a.a(e3, str, "getDiscoveryManagerImpl", K.class.getSimpleName());
            s = null;
        }
        if (s == null) {
            e2 = null;
        } else {
            e2 = new E(s);
        }
        this.f = e2;
        try {
            y = this.d.c();
        } catch (RemoteException e4) {
            a.a(e4, str, "getSessionManagerImpl", K.class.getSimpleName());
            y = null;
        }
        if (y == null) {
            sVar = null;
        } else {
            sVar = new C0666s(y, this.c);
        }
        this.e = sVar;
        this.h = new C0639g(this.e);
        C0666s sVar2 = this.e;
        if (sVar2 != null) {
            iVar = new C0641i(this.i, sVar2, new J(this.c));
        }
        this.g = iVar;
    }

    public static C0635c a(Context context) throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (b == null) {
            C0640h c2 = c(context.getApplicationContext());
            b = new C0635c(context, c2.b(context.getApplicationContext()), c2.a(context.getApplicationContext()));
        }
        return b;
    }

    public static C0635c b(Context context) throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return a(context);
        } catch (RuntimeException e2) {
            a.b("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e2);
            return null;
        }
    }

    private static C0640h c(Context context) throws IllegalStateException {
        try {
            Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                a.b("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (C0640h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            throw new IllegalStateException("Failed to initialize CastContext.", e2);
        }
    }

    public static C0635c d() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return b;
    }

    private final Map<String, IBinder> h() {
        HashMap hashMap = new HashMap();
        Ga ga = this.k;
        if (ga != null) {
            hashMap.put(ga.a(), this.k.d());
        }
        List<C0668u> list = this.l;
        if (list != null) {
            for (C0668u uVar : list) {
                Preconditions.checkNotNull(uVar, "Additional SessionProvider must not be null.");
                String a2 = uVar.a();
                Preconditions.checkNotEmpty(a2, "Category for SessionProvider must not be null or empty string.");
                Preconditions.checkArgument(!hashMap.containsKey(a2), String.format("SessionProvider for category %s already added", new Object[]{a2}));
                hashMap.put(a2, uVar.d());
            }
        }
        return hashMap;
    }

    private final void i() {
        if (!TextUtils.isEmpty(this.i.H())) {
            this.k = new Ga(this.c, this.i, this.j);
        } else {
            this.k = null;
        }
    }

    public boolean e() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return this.d.B();
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "isApplicationVisible", K.class.getSimpleName());
            return false;
        }
    }

    public final boolean f() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return this.d.b();
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "hasActivityInRecents", K.class.getSimpleName());
            return false;
        }
    }

    @ShowFirstParty
    public final E g() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.f;
    }

    public g b() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return g.a(this.d.m());
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "getMergedSelectorAsBundle", K.class.getSimpleName());
            return null;
        }
    }

    public CastOptions a() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.i;
    }

    @Deprecated
    public void b(C0633a aVar) throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (aVar != null) {
            try {
                this.d.b(new C0669v(aVar));
            } catch (RemoteException e2) {
                a.a(e2, "Unable to call %s on %s.", "addVisibilityChangeListener", K.class.getSimpleName());
            }
        }
    }

    public C0666s c() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.e;
    }

    @Deprecated
    public void a(C0633a aVar) throws IllegalStateException, NullPointerException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(aVar);
        try {
            this.d.a(new C0669v(aVar));
        } catch (RemoteException e2) {
            a.a(e2, "Unable to call %s on %s.", "addVisibilityChangeListener", K.class.getSimpleName());
        }
    }

    public void a(C0638f fVar) throws IllegalStateException, NullPointerException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(fVar);
        this.e.a(fVar);
    }
}
