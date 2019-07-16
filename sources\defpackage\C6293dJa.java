package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.C6158da;
import com.soundcloud.android.tracks.C6185ma;

/* renamed from: dJa reason: default package and case insensitive filesystem */
/* compiled from: TrackCardViewHolder */
class C6293dJa extends ViewHolder implements C5264RIa {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private ToggleButton g;
    protected View h;
    private View i;
    private ToggleButton j;
    private View k;
    private defpackage.C5204PIa.a l;
    private final N m;
    /* access modifiers changed from: private */
    public final C4655rja n;
    private final Resources o;

    /* renamed from: dJa$a */
    /* compiled from: TrackCardViewHolder */
    private class a implements OnClickListener {
        private final C3508cda a;

        a(C3508cda cda) {
            this.a = cda;
        }

        public void onClick(View view) {
            C6293dJa.this.n.a(C4621nja.c(this.a));
        }
    }

    C6293dJa(View view, N n2, C4655rja rja, Resources resources) {
        super(view);
        this.m = n2;
        this.n = rja;
        this.o = resources;
        c(view);
    }

    private void c(View view) {
        this.a = (ImageView) view.findViewById(i.image);
        this.b = (TextView) view.findViewById(i.title);
        this.c = (TextView) view.findViewById(i.creator);
        this.d = (TextView) view.findViewById(i.play_count);
        this.e = (TextView) view.findViewById(i.duration);
        this.f = (TextView) view.findViewById(i.genre);
        this.g = (ToggleButton) view.findViewById(i.toggle_like);
        this.h = view.findViewById(i.overflow_button);
        this.i = view.findViewById(i.now_playing);
        this.j = (ToggleButton) view.findViewById(i.toggle_repost);
        this.k = view.findViewById(i.go_indicator);
        ToggleButton toggleButton = this.j;
        if (toggleButton != null) {
            toggleButton.setOnClickListener(new C5144NIa(this));
        }
        this.g.setOnClickListener(new C5113MIa(this));
    }

    private void e() {
        defpackage.C5204PIa.a aVar = this.l;
        if (aVar != null) {
            aVar.b(this.g);
        }
    }

    private void f() {
        defpackage.C5204PIa.a aVar = this.l;
        if (aVar != null) {
            aVar.a(this.j);
        }
    }

    public /* synthetic */ void b(View view) {
        e();
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.i.setVisibility(0);
    }

    public /* synthetic */ void a(View view) {
        f();
    }

    public void b(String str, boolean z) {
        this.g.setTextOn(str);
        this.g.setTextOff(str);
        this.g.setChecked(z);
    }

    public void d(String str) {
        this.b.setText(str);
    }

    public void a(String str, boolean z) {
        ToggleButton toggleButton = this.j;
        if (toggleButton != null) {
            toggleButton.setTextOn(str);
            this.j.setTextOff(str);
            this.j.setChecked(z);
            this.j.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void e(String str) {
        this.d.setText(str);
        this.d.setVisibility(0);
    }

    public void b(String str) {
        this.f.setText(String.format("#%s", new Object[]{str}));
        this.f.setVisibility(0);
    }

    private void b(C3855qda qda) {
        this.m.a(qda.a(), qda.b(), C3721b.b(this.o), b(), false);
    }

    public void a(String str) {
        this.e.setText(str);
        this.e.setVisibility(0);
    }

    public void a(defpackage.C5204PIa.a aVar) {
        this.l = aVar;
    }

    public void a() {
        ToggleButton toggleButton = this.j;
        if (toggleButton != null) {
            toggleButton.setVisibility(8);
        }
    }

    public ImageView b() {
        return this.a;
    }

    private void a(OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: 0000 */
    public void a(C3855qda qda) {
        b(qda);
        d(qda.B());
        c(qda.d());
        a((OnClickListener) new a(qda.e()));
        c(qda);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.d.setVisibility(8);
        this.i.setVisibility(8);
        ToggleButton toggleButton = this.j;
        if (toggleButton != null) {
            toggleButton.setVisibility(8);
        }
    }

    private void a(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public void c(String str) {
        this.c.setText(str);
    }

    private void c(C3855qda qda) {
        a(this.k, 8);
        if (qda instanceof C6185ma) {
            C6185ma maVar = (C6185ma) qda;
            if (C6158da.b(maVar) || C6158da.a(maVar)) {
                a(this.k, 0);
            }
        }
    }
}
