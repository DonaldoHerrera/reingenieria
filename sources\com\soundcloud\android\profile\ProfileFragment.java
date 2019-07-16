package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class ProfileFragment extends LightCycleSupportFragment<ProfileFragment> {
    C5836qa a;
    @LightCycle
    ProfilePresenter b;
    C4834DJa c;

    public final class LightCycleBinder {
        public static void bind(ProfileFragment profileFragment) {
            profileFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) profileFragment.b));
        }
    }

    public ProfileFragment() {
        SoundCloudApplication.f().a(this);
    }

    private int Qb() {
        return this.a.a() ? l.profile : l.profile_no_banner;
    }

    public static ProfileFragment a(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        ProfileFragment profileFragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        C5526_Ha.b(bundle, "user_urn_key", cda);
        bundle.putParcelable("search_query_source_info_key", searchQuerySourceInfo);
        profileFragment.setArguments(bundle);
        return profileFragment;
    }

    public static C3508cda b(Fragment fragment) {
        C3508cda b2 = C5526_Ha.b(fragment.getArguments(), "user_urn_key");
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("User identifier not provided to Profile fragment");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(Qb(), viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(i.toolbar_id);
        if (toolbar != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
            this.c.f(appCompatActivity);
            appCompatActivity.setSupportActionBar(toolbar);
        }
    }

    public static SearchQuerySourceInfo a(Fragment fragment) {
        if (fragment.getArguments() != null) {
            return (SearchQuerySourceInfo) fragment.getArguments().getParcelable("search_query_source_info_key");
        }
        return null;
    }
}
