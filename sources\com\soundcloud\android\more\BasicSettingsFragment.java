package com.soundcloud.android.more;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.settings.C5954k;
import com.soundcloud.android.soul.components.cells.standard.CellStandard;
import com.soundcloud.android.soul.components.cells.standard.CellStandard.a.c;
import com.soundcloud.android.soul.components.cells.standard.CellStandard.b;
import com.soundcloud.android.view.BaseFragment;

public class BasicSettingsFragment extends BaseFragment {
    C5039Jwa c;
    private VPa d = C4881Eua.b();

    private int Rb() {
        return l.settings_basic;
    }

    /* access modifiers changed from: protected */
    public Integer Qb() {
        return Integer.valueOf(p.title_basic_settings);
    }

    public /* synthetic */ void a(View view) {
        C5232QGa.a((DialogFragment) new C5954k(), getActivity().getFragmentManager(), "clear_cache");
    }

    public /* synthetic */ void b(View view) {
        C5039Jwa jwa = this.c;
        jwa.a(!jwa.b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SoundCloudApplication.f().a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(Rb(), viewGroup, false);
    }

    public void onDestroyView() {
        this.d.dispose();
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((CellStandard) view.findViewById(i.basic_settings_pref_clear_cache)).setOnClickListener(new C4047a(this));
        CellStandard cellStandard = (CellStandard) view.findViewById(i.basic_settings_pref_popup_comments_in_player);
        cellStandard.setOnClickListener(new C4048b(this));
        APa h = this.c.a().h(new C4049c(this));
        cellStandard.getClass();
        this.d = h.f((C6776kQa<? super T>) new v<Object>(cellStandard));
    }

    public /* synthetic */ b b(Boolean bool) throws Exception {
        return new b(getResources().getString(p.pref_waveform_comments), new c(bool.booleanValue()));
    }
}
