package com.soundcloud.android.ads.injector;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.ads.injector.u.a;
import com.soundcloud.android.ads.injector.u.b;
import com.soundcloud.android.ads.injector.u.c;
import com.soundcloud.android.ads.injector.u.d;
import com.soundcloud.android.ads.injector.u.e;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.p;
import java.util.HashMap;

/* compiled from: AdInjectionPreferencesFragment.kt */
public final class s extends androidx.preference.s {
    public u a;
    public C3814lca b;
    public Na c;
    private HashMap d;

    /* access modifiers changed from: private */
    public final void Tb() {
        q _b = _b();
        a(_b, (PXa<RVa>) new a<RVa>(_b, this));
    }

    /* access modifiers changed from: private */
    public final void Ub() {
        q ac = ac();
        a(ac, (PXa<RVa>) new b<RVa>(ac, this));
    }

    /* access modifiers changed from: private */
    public final a Vb() {
        ListPreference d2 = d(p.audio_ad_injection_companion_html_key);
        int e = d2.e(d2.la());
        if (e == 0) {
            return a.NONE;
        }
        if (e == 1) {
            return a.RESPONSIVE;
        }
        if (e == 2) {
            return a.NON_RESPONSIVE;
        }
        throw new IllegalStateException("invalid audio html companion");
    }

    /* access modifiers changed from: private */
    public final c Wb() {
        ListPreference d2 = d(p.audio_ad_injection_html_leave_behind_key);
        int e = d2.e(d2.la());
        if (e == 0) {
            return c.NONE;
        }
        if (e == 1) {
            return c.TIAA;
        }
        throw new IllegalStateException("invalid audio html leave behind");
    }

    /* access modifiers changed from: private */
    public final b Xb() {
        ListPreference d2 = d(p.audio_ad_injection_companion_key);
        int e = d2.e(d2.la());
        if (e == 0) {
            return b.NONE;
        }
        if (e == 1) {
            return b.BUS;
        }
        if (e == 2) {
            return b.FULL_BLEED_CAT;
        }
        throw new IllegalStateException("invalid audio image companion");
    }

    /* access modifiers changed from: private */
    public final d Yb() {
        ListPreference d2 = d(p.audio_ad_injection_image_leave_behind_key);
        int e = d2.e(d2.la());
        if (e == 0) {
            return d.NONE;
        }
        if (e == 1) {
            return d.CAT;
        }
        throw new IllegalStateException("invalid audio image leave behind");
    }

    /* access modifiers changed from: private */
    public final int Zb() {
        String ia = c(p.audio_ad_inject_skip_offset_key).ia();
        C7471uYa.a((Object) ia, "R.string.audio_ad_inject…EditTextPreference().text");
        return Integer.parseInt(ia);
    }

    private final q _b() {
        C3814lca lca = this.b;
        if (lca != null) {
            return lca.h();
        }
        C7471uYa.b("playQueueManager");
        throw null;
    }

    private final q ac() {
        C3814lca lca = this.b;
        if (lca != null) {
            return lca.n();
        }
        C7471uYa.b("playQueueManager");
        throw null;
    }

    /* access modifiers changed from: private */
    public final e bc() {
        ListPreference d2 = d(p.ad_injection_video_type_key);
        int e = d2.e(d2.la());
        if (e == 0) {
            return e.LETTERBOX_JEEP;
        }
        if (e == 1) {
            return e.FULLSCREEN_JEEP;
        }
        throw new IllegalStateException("invalid video aspect ratio");
    }

    /* access modifiers changed from: private */
    public final c cc() {
        ListPreference d2 = d(p.video_ad_injection_html_leave_behind_key);
        int e = d2.e(d2.la());
        if (e == 0) {
            return c.NONE;
        }
        if (e == 1) {
            return c.TIAA;
        }
        throw new IllegalStateException("invalid video html leave behind");
    }

    /* access modifiers changed from: private */
    public final d dc() {
        ListPreference d2 = d(p.video_ad_injection_image_leave_behind_key);
        int e = d2.e(d2.la());
        if (e == 0) {
            return d.NONE;
        }
        if (e == 1) {
            return d.CAT;
        }
        throw new IllegalStateException("invalid video image leave behind");
    }

    /* access modifiers changed from: private */
    public final int ec() {
        String ia = c(p.video_ad_inject_skip_offset_key).ia();
        C7471uYa.a((Object) ia, "R.string.video_ad_inject…EditTextPreference().text");
        return Integer.parseInt(ia);
    }

    /* access modifiers changed from: private */
    public final void fc() {
        q ac = ac();
        a(ac, (PXa<RVa>) new c<RVa>(ac, this));
    }

    /* access modifiers changed from: private */
    public final void gc() {
        q ac = ac();
        a(ac, (PXa<RVa>) new d<RVa>(ac, this));
    }

    /* access modifiers changed from: private */
    public final void hc() {
        q ac = ac();
        a(ac, (PXa<RVa>) new e<RVa>(ac, this));
    }

    /* access modifiers changed from: private */
    public final void ic() {
        q ac = ac();
        a(ac, (PXa<RVa>) new f<RVa>(ac, this));
    }

    /* access modifiers changed from: private */
    public final void jc() {
        q ac = ac();
        a(ac, (PXa<RVa>) new g<RVa>(ac, this));
    }

    /* access modifiers changed from: private */
    public final void kc() {
        q ac = ac();
        a(ac, (PXa<RVa>) new h<RVa>(ac, this));
    }

    public void Qb() {
        HashMap hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final Na Rb() {
        Na na = this.c;
        if (na != null) {
            return na;
        }
        C7471uYa.b("adsOperations");
        throw null;
    }

    public final u Sb() {
        u uVar = this.a;
        if (uVar != null) {
            return uVar;
        }
        C7471uYa.b("fakeAds");
        throw null;
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        addPreferencesFromResource(com.soundcloud.android.ia.s.ad_injection_prefs);
        a(c(p.audio_ad_inject_skip_offset_key));
        a(c(p.video_ad_inject_skip_offset_key));
        a(p.audio_ad_inject_submit_key, (PXa<RVa>) new i<RVa>(this));
        a(p.video_ad_inject_submit_key, (PXa<RVa>) new j<RVa>(this));
        a(p.current_track_interstitial_submit_key, (PXa<RVa>) new k<RVa>(this));
        a(p.next_track_interstitial_submit_key, (PXa<RVa>) new l<RVa>(this));
        a(p.empty_audio_ad_submit_key, (PXa<RVa>) new m<RVa>(this));
        a(p.empty_video_ad_submit_key, (PXa<RVa>) new n<RVa>(this));
        a(p.error_audio_ad_submit_key, (PXa<RVa>) new o<RVa>(this));
        a(p.error_video_ad_submit_key, (PXa<RVa>) new p<RVa>(this));
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }

    private final void a(int i, PXa<RVa> pXa) {
        e(i).a((Preference.c) new q(pXa));
    }

    private final EditTextPreference c(int i) {
        Preference e = e(i);
        if (e instanceof EditTextPreference) {
            return (EditTextPreference) e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(e);
        sb.append(" not of type ");
        sb.append(EditTextPreference.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private final ListPreference d(int i) {
        Preference e = e(i);
        if (e instanceof ListPreference) {
            return (ListPreference) e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(e);
        sb.append(" not of type ");
        sb.append(ListPreference.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private final Preference e(int i) {
        Preference c2 = getPreferenceScreen().c((CharSequence) getString(i));
        C7471uYa.a((Object) c2, "preferenceScreen.findPreference(getString(this))");
        return c2;
    }

    private final void a(EditTextPreference editTextPreference) {
        editTextPreference.a((CharSequence) editTextPreference.ia());
        editTextPreference.a((Preference.b) new r(editTextPreference));
    }

    private final void a(q qVar, PXa<RVa> pXa) {
        if (qVar instanceof F) {
            pXa.d();
            requireActivity().finish();
            return;
        }
        C3814lca lca = this.b;
        if (lca == null) {
            C7471uYa.b("playQueueManager");
            throw null;
        } else if (lca.b(qVar)) {
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append("We can only apply this ad to tracks, not ");
            sb.append(qVar.b());
            Toast.makeText(activity, sb.toString(), 1).show();
        } else if (qVar.e()) {
            FragmentActivity activity2 = getActivity();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("We already have an ad injected here. ");
            sb2.append(qVar.b());
            Toast.makeText(activity2, sb2.toString(), 1).show();
        } else {
            FragmentActivity activity3 = getActivity();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("We can only inject this ad after a track not ");
            sb3.append(qVar.b());
            Toast.makeText(activity3, sb3.toString(), 1).show();
        }
    }
}
