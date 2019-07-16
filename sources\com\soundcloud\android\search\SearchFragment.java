package com.soundcloud.android.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.N;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class SearchFragment extends LightCycleSupportFragment<SearchFragment> implements C4821Cwa, C3964cja, N {
    @LightCycle
    C a;
    @LightCycle
    SupportFragmentLightCycle<Fragment> b = C4987IHa.a.b("SearchFragment");

    public final class LightCycleBinder {
        public static void bind(SearchFragment searchFragment) {
            searchFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) searchFragment.a));
            searchFragment.bind(LightCycles.lift(searchFragment.b));
        }
    }

    public SearchFragment() {
        SoundCloudApplication.f().a(this);
    }

    public void Kb() {
        this.a.h();
    }

    public boolean Sa() {
        return this.a.Sa();
    }

    public void a(String str, String str2, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        this.a.a(str, str2, gKa, gKa2);
    }

    public void b(String str, String str2, String str3, C4928GKa<C3508cda> gKa, int i) {
        this.a.a(str, str2, C4928GKa.c(str3), gKa, C4928GKa.c(Integer.valueOf(i)));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.a.a(bundle.getInt("currentDisplayingView", 0));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        return layoutInflater.inflate(l.search, viewGroup, false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.a.a(getActivity());
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("currentDisplayingView", this.a.g());
        super.onSaveInstanceState(bundle);
    }

    public void a() {
        this.a.Sa();
    }
}
