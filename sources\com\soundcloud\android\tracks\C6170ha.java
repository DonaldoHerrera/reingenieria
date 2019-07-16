package com.soundcloud.android.tracks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.ia.q;
import java.lang.ref.WeakReference;

/* renamed from: com.soundcloud.android.tracks.ha reason: case insensitive filesystem */
/* compiled from: TrackInfoFragment */
public class C6170ha extends C2418ZW implements OnClickListener {
    Ca b;
    C5327TLa c;
    C3700b d;
    C6179ka e;
    C4655rja f;
    private APa<C6185ma> g;
    private VPa h;

    /* renamed from: com.soundcloud.android.tracks.ha$a */
    /* compiled from: TrackInfoFragment */
    static class a implements a {
        private final WeakReference<C6170ha> a;
        private final C3508cda b;
        private final String c;
        private final C4655rja d;
        private final Long e;

        a(C6170ha haVar, C3508cda cda, String str, C4655rja rja, Long l) {
            this.d = rja;
            this.b = cda;
            this.c = str;
            this.e = l;
            this.a = new WeakReference<>(haVar);
        }

        private C3710l b() {
            return C3710l.a("track_info", "new");
        }

        public void a() {
            C6170ha haVar = (C6170ha) this.a.get();
            if (haVar != null && !haVar.isDetached()) {
                this.d.a(C4621nja.a(new Y(this.b, this.e.longValue(), this.c), b()));
                haVar.dismiss();
            }
        }
    }

    /* renamed from: com.soundcloud.android.tracks.ha$b */
    /* compiled from: TrackInfoFragment */
    private class b extends C5037Jua<C6185ma> {
        private final Long d;

        b(Long l) {
            this.d = l;
        }

        public void a(C6185ma maVar) {
            View view = C6170ha.this.getView();
            C3508cda a = maVar.a();
            String A = maVar.A();
            C6170ha haVar = C6170ha.this;
            a aVar = new a(haVar, a, A, haVar.f, this.d);
            C6170ha.this.e.a(view, maVar, (a) aVar);
            if (maVar.F().c()) {
                C6170ha.this.e.a(view, maVar);
            } else {
                C6170ha.this.e.b(view);
            }
        }

        public void a(Throwable th) {
            super.a(th);
            C6170ha haVar = C6170ha.this;
            haVar.e.a(haVar.getView());
        }
    }

    public C6170ha() {
        SoundCloudApplication.f().a(this);
        setRetainInstance(true);
    }

    public static C6170ha a(C3508cda cda, Long l) {
        Bundle bundle = new Bundle();
        C5526_Ha.b(bundle, "Urn", cda);
        bundle.putLong("COMMENT_POSITION", l.longValue());
        C6170ha haVar = new C6170ha();
        haVar.setArguments(bundle);
        return haVar;
    }

    public void onClick(View view) {
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, q.Theme_TrackInfoDialog);
        this.g = this.b.a(C5526_Ha.b(getArguments(), "Urn")).a(RPa.a()).c();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.e.a(getActivity().getLayoutInflater(), viewGroup);
    }

    public void onDestroy() {
        this.h.dispose();
        super.onDestroy();
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        this.d.a(Yca.PLAYER_INFO);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Long valueOf = Long.valueOf(0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            valueOf = Long.valueOf(arguments.getLong("COMMENT_POSITION"));
        }
        this.h = (VPa) this.g.c(new b(valueOf));
        view.setOnClickListener(this);
    }
}
