package com.soundcloud.android;

import android.accounts.AccountManager;
import android.app.AlarmManager;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import androidx.core.app.n;
import com.facebook.B;
import com.soundcloud.android.features.record.ba;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.image.C3734o;
import com.soundcloud.android.image.S;
import com.soundcloud.android.image.T;
import com.soundcloud.android.likes.C3971b;
import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.onboarding.g;
import com.soundcloud.android.playback.Ab;
import com.soundcloud.android.playback.C4302ec;
import com.soundcloud.android.playback.C4352oc;
import com.soundcloud.android.playback.C4413qc;
import com.soundcloud.android.playback.C4432uc;
import com.soundcloud.android.playback.Xb;
import com.soundcloud.android.playback.core.c;
import com.soundcloud.android.playback.players.o;
import com.soundcloud.android.playback.players.playback.local.d;
import com.soundcloud.android.playback.ui.C4454gb;
import com.soundcloud.android.playback.ui.C4457hb;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.properties.m.t;
import com.soundcloud.android.tracks.Ca;
import com.soundcloud.android.view.J;
import com.soundcloud.android.view.K;
import com.soundcloud.android.view.U;
import com.soundcloud.android.view.Y;
import java.util.Locale;

/* renamed from: com.soundcloud.android.l reason: case insensitive filesystem */
/* compiled from: ApplicationModule */
public class C2933l {
    static C1937AR a(C2210OR or) {
        return or;
    }

    static AccountManager a(Application application) {
        return AccountManager.get(application);
    }

    static r a(C3814lca lca) {
        return lca;
    }

    static C3971b a(C3989m mVar) {
        return mVar;
    }

    static AlarmManager b(Application application) {
        return (AlarmManager) application.getSystemService("alarm");
    }

    static AudioManager c(Application application) {
        return (AudioManager) application.getSystemService("audio");
    }

    static ConnectivityManager d(Application application) {
        return (ConnectivityManager) application.getSystemService("connectivity");
    }

    static Context e(Application application) {
        return application;
    }

    static B e() {
        return new B();
    }

    static C1600pd f(Application application) {
        return C1600pd.a((Context) application);
    }

    static n g(Application application) {
        return n.a((Context) application);
    }

    static C5408WFa h(Application application) {
        return C5408WFa.a(Locale.getDefault(), application.getResources());
    }

    static PowerManager i(Application application) {
        return (PowerManager) application.getSystemService("power");
    }

    static Resources j(Application application) {
        return application.getResources();
    }

    static TelephonyManager k(Application application) {
        return (TelephonyManager) application.getSystemService("phone");
    }

    static WifiManager l(Application application) {
        return (WifiManager) application.getSystemService("wifi");
    }

    static C6766kGa a(C5327TLa tLa) {
        return new C5695cHa(tLa);
    }

    static S b(Context context) {
        return new T(context);
    }

    static C5327TLa c() {
        return new C5297SLa(RPa.a());
    }

    static C3824mea d() {
        return new C7017nua();
    }

    static HPa g() {
        return C6645iVa.b();
    }

    static Z<C3508cda, C5325TJa> h() {
        return new Z<>(20);
    }

    static C5606ava i() {
        return new C5606ava(new C6631iHa());
    }

    /* access modifiers changed from: protected */
    public C7730yHa f() {
        return new C7730yHa();
    }

    /* access modifiers changed from: protected */
    public C5222Pwa j() {
        return new C5192Owa();
    }

    /* access modifiers changed from: protected */
    public U k() {
        return J.a;
    }

    /* access modifiers changed from: protected */
    public Y l() {
        return K.a;
    }

    static C5694cGa b() {
        return C5626bGa.a;
    }

    /* access modifiers changed from: protected */
    public C6834lGa a(ConnectivityManager connectivityManager, TelephonyManager telephonyManager, C6766kGa kga) {
        return new C6970nGa(connectivityManager, telephonyManager);
    }

    static g a(C2041FV fv) {
        return new g(fv);
    }

    /* access modifiers changed from: protected */
    public C2325UT a(dfa dfa, efa efa, C2137KU ku, C2436_U _u, C3184oU oUVar, C2343VT vt, a aVar, HPa hPa, C3223qU qUVar, C3041hU hUVar, C3734o oVar, C3129mM mMVar) {
        C2325UT ut = new C2325UT(dfa, efa, ku, _u, oUVar, vt, aVar, hPa, qUVar, hUVar, oVar, mMVar);
        return ut;
    }

    static com.soundcloud.android.playback.players.r a(C4432uc ucVar, Xb xb, C4413qc qcVar, C4302ec ecVar, Ab ab, C4352oc ocVar, C3381yS ySVar) {
        return com.soundcloud.android.playback.players.r.a(ecVar, qcVar).a((c) xb).a((o) ucVar).a((d) ab).a((com.soundcloud.android.playback.core.d) ocVar).a((C3952ana) ySVar).a();
    }

    /* access modifiers changed from: protected */
    public C2436_U a(C2380XU xu, C1960BU bu, j jVar, C3700b bVar) {
        return new C2454aU(xu, bu, jVar, bVar);
    }

    static C6291dHa a(C4806CMa<C5381VHa> cMa) {
        return (C6291dHa) cMa.get();
    }

    static ba a(com.soundcloud.android.features.record.J j, Application application) {
        return ba.a((Context) application, j);
    }

    static AppWidgetManager a(Context context) {
        return AppWidgetManager.getInstance(context);
    }

    static HPa a() {
        return RPa.a();
    }

    static C4454gb a(C5408WFa wFa) {
        return new C4457hb(wFa);
    }

    static C5604aua a(Ca ca, C4785Bra bra, C5141NFa nFa, Vda vda) {
        return new C5367Uta(ca, nFa, bra, vda);
    }

    static C3236rN a(j jVar, C7319sKa ska) {
        return new C3236rN(jVar, ska.a());
    }

    static C6336dua a(C3236rN rNVar, C4806CMa<C6404eua> cMa) {
        if (rNVar.c()) {
            return (C6336dua) cMa.get();
        }
        return C2519a.a;
    }

    static C2034FO a(a aVar) {
        if (aVar.a((a) t.a)) {
            return C3337wO.a;
        }
        return C3377yO.a;
    }
}
