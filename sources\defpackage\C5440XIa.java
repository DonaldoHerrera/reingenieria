package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* renamed from: XIa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistCardRenderer */
public class C5440XIa extends C5541_ta<C3863rda> {
    private final Resources a;
    private final C4655rja b;
    private final N c;
    private final C7287rra d;
    private final C5204PIa e;
    private final F f;
    private int g = l.default_playlist_card;

    /* renamed from: XIa$a */
    /* compiled from: PlaylistCardRenderer */
    static class a extends ViewHolder implements C5264RIa {
        private TextView a;
        private TextView b;
        /* access modifiers changed from: private */
        public ImageView c;
        TextView d;
        TextView e;
        private ToggleButton f;
        /* access modifiers changed from: private */
        public View g;
        private ToggleButton h;
        private defpackage.C5204PIa.a i;

        a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(i.duration);
            this.b = (TextView) view.findViewById(i.genre);
            this.c = (ImageView) view.findViewById(i.image);
            this.d = (TextView) view.findViewById(i.title);
            this.e = (TextView) view.findViewById(i.creator);
            this.f = (ToggleButton) view.findViewById(i.toggle_like);
            this.g = view.findViewById(i.overflow_button);
            this.h = (ToggleButton) view.findViewById(i.toggle_repost);
            this.f.setOnClickListener(new C4833DIa(this));
            ToggleButton toggleButton = this.h;
            if (toggleButton != null) {
                toggleButton.setOnClickListener(new C4864EIa(this));
            }
        }

        private void c() {
            defpackage.C5204PIa.a aVar = this.i;
            if (aVar != null) {
                aVar.a(this.h);
            }
        }

        public /* synthetic */ void a(View view) {
            b();
        }

        public /* synthetic */ void b(View view) {
            c();
        }

        public void a(String str, boolean z) {
            ToggleButton toggleButton = this.h;
            if (toggleButton != null) {
                toggleButton.setTextOn(str);
                this.h.setTextOff(str);
                this.h.setChecked(z);
                this.h.setVisibility(0);
            }
        }

        public void b(String str, boolean z) {
            this.f.setTextOn(str);
            this.f.setTextOff(str);
            this.f.setChecked(z);
        }

        public void b(String str) {
            this.b.setText(String.format("#%s", new Object[]{str}));
            this.b.setVisibility(0);
        }

        private void b() {
            defpackage.C5204PIa.a aVar = this.i;
            if (aVar != null) {
                aVar.b(this.f);
            }
        }

        public void a(String str) {
            this.a.setText(str);
            this.a.setVisibility(0);
        }

        public void a(defpackage.C5204PIa.a aVar) {
            this.i = aVar;
        }

        public void a() {
            ToggleButton toggleButton = this.h;
            if (toggleButton != null) {
                toggleButton.setVisibility(8);
            }
        }
    }

    public C5440XIa(Resources resources, C4655rja rja, N n, C7287rra rra, C5204PIa pIa, F f2) {
        this.a = resources;
        this.b = rja;
        this.c = n;
        this.d = rra;
        this.e = pIa;
        this.f = f2;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.g, viewGroup, false);
        inflate.setTag(new a(inflate));
        return inflate;
    }

    public void a(int i, View view, C3863rda rda) {
        a(rda, view, C4928GKa.a(), C5512Zta.a.a());
    }

    public void a(C3863rda rda, View view, C4928GKa<v> gKa, C5512Zta zta) {
        a aVar = (a) view.getTag();
        a(aVar, (C3855qda) rda);
        a(aVar, rda, gKa, zta);
    }

    private void b(a aVar, C3855qda qda) {
        this.c.a(qda.a(), qda.b(), C3721b.b(this.a), aVar.c, false);
    }

    public void a(int i) {
        this.g = i;
    }

    private void a(a aVar, C3863rda rda, C4928GKa<v> gKa, C5512Zta zta) {
        this.e.a((C5264RIa) aVar, (C3855qda) rda, a(gKa));
        aVar.g.setOnClickListener(new C4926GIa(this, rda, gKa, zta));
    }

    public /* synthetic */ void a(C3863rda rda, C4928GKa gKa, C5512Zta zta, View view) {
        this.d.a(view, rda, a(gKa), zta);
    }

    private C3710l a(C4928GKa<v> gKa) {
        C3710l a2 = C3710l.a(this.f.b());
        if (gKa.c()) {
            a2.a((v) gKa.b());
        }
        return a2;
    }

    private void a(a aVar, C3855qda qda) {
        b(aVar, qda);
        aVar.d.setText(qda.B());
        aVar.e.setText(qda.d());
        aVar.e.setOnClickListener(new C4895FIa(this, qda));
    }

    public /* synthetic */ void a(C3855qda qda, View view) {
        this.b.a(C4621nja.c(qda.e()));
    }
}
