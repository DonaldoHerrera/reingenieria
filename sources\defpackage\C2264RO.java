package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ads.C2594la;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.j;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* renamed from: RO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule */
public class C2264RO {
    /* access modifiers changed from: protected */
    public String a(C2322UP up) {
        return up.b();
    }

    /* access modifiers changed from: protected */
    public String b(Resources resources) {
        return resources.getString(p.mobile_api_base_url);
    }

    /* access modifiers changed from: protected */
    public String c(Resources resources) {
        return resources.getString(p.public_api_base_url);
    }

    public static Nea b() {
        Mea mea = new Mea();
        mea.a(C3341wS.class, (JsonSerializer<T>) new C3361xS<T>());
        mea.a(Zda.class, (JsonDeserializer<T>) new C6490gDa<T>());
        return mea;
    }

    static Nea c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            SDb.e("Do not instantiate JacksonJsonTransformer on the main thread, as it is expensive.", new Object[0]);
        }
        return b();
    }

    /* access modifiers changed from: protected */
    @C3132mP
    public String a(Resources resources) {
        return resources.getString(p.eventgateway_url);
    }

    static dfa a(C4806CMa<C7440tyb> cMa, C7054oVa<C2961dP> ova, C4806CMa<Nea> cMa2, C6699jHa jha, C2594la laVar, C2322UP up, C3218qP qPVar, C2526g gVar, C5018JHa jHa, C7181qKa qka, C2137KU ku, a aVar) {
        C3037hP hPVar = new C3037hP(cMa, ova, cMa2, jha, laVar, up, qPVar, gVar, jHa, qka.a(), ku, aVar);
        hPVar.a(true);
        return hPVar;
    }

    static C3218qP b(Context context) {
        return C3218qP.a(context);
    }

    static efa a(dfa dfa) {
        return new C3094kP((C3037hP) dfa);
    }

    static IPa<efa> a(C4806CMa<efa> cMa, HPa hPa) {
        return IPa.a((LPa<T>) new C2169MO<T>(cMa)).b(hPa);
    }

    static Locale a() {
        return Locale.getDefault();
    }

    static Vxb a(Context context) {
        File file = new File(context.getCacheDir(), "okhttp_cache");
        Vxb vxb = null;
        try {
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            vxb = new Vxb(file, 262144000);
            return vxb;
        } catch (SecurityException unused) {
        }
    }

    static C7440tyb a(Vxb vxb, C2999fP fPVar, j jVar, C3469VY vy, SocketFactory socketFactory) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C6358eGa ega = new C6358eGa("OkHttpClient");
            if (jVar.l()) {
                vy.a(ega, new HVa[0]);
            } else {
                throw ega;
            }
        }
        a aVar = new a();
        aVar.a(20, TimeUnit.SECONDS);
        aVar.b(20, TimeUnit.SECONDS);
        aVar.c(20, TimeUnit.SECONDS);
        aVar.a(socketFactory);
        aVar.a(vxb);
        aVar.a((C7164pyb) fPVar);
        if (jVar.k()) {
            aVar.b(new StethoInterceptor());
        }
        return aVar.a();
    }
}
