package com.soundcloud.android.accounts;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.offline.OfflineContentService;

@SuppressLint({"ValidFragment"})
public class LogoutFragment extends Fragment {
    C5327TLa a;
    C2526g b;
    C2436_U c;
    private final UPa d = new UPa();

    private final class a extends C5037Jua<C3707i> {
        private a() {
        }

        public void a(C3707i iVar) {
            FragmentActivity activity = LogoutFragment.this.getActivity();
            if (iVar.d() && activity != null && !activity.isFinishing()) {
                LogoutFragment.this.b.a((Activity) activity);
                activity.finish();
            }
        }
    }

    private final class b extends C4943Gua {
        private b() {
        }

        public void a(Throwable th) {
            super.a(th);
            FragmentActivity activity = LogoutFragment.this.getActivity();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    public LogoutFragment() {
        setRetainInstance(true);
        SoundCloudApplication.f().a(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.c.l()) {
            OfflineContentService.d((Context) getActivity());
        }
        this.d.b(this.a.a(C3876taa.i, (SUa<E>) new a<E>()));
        UPa uPa = this.d;
        C6979nPa k = this.b.k();
        b bVar = new b();
        k.c(bVar);
        uPa.b(bVar);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(l.fullscreen_progress, viewGroup, false);
    }

    public void onDestroy() {
        this.d.b();
        super.onDestroy();
    }

    LogoutFragment(C5327TLa tLa, C2526g gVar, C2436_U _u) {
        this.a = tLa;
        this.b = gVar;
        this.c = _u;
    }
}
