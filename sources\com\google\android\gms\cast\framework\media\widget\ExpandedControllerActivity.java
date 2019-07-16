package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0642j;
import com.google.android.gms.cast.framework.C0644l;
import com.google.android.gms.cast.framework.C0645m;
import com.google.android.gms.cast.framework.C0662n;
import com.google.android.gms.cast.framework.C0663o;
import com.google.android.gms.cast.framework.C0664p;
import com.google.android.gms.cast.framework.C0665q;
import com.google.android.gms.cast.framework.C0666s;
import com.google.android.gms.cast.framework.C0667t;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.r;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.C;
import com.google.android.gms.internal.cast.C0721o;
import com.google.android.gms.internal.cast.D;
import com.google.android.gms.internal.cast.E;
import com.google.android.gms.internal.cast.F;
import com.google.android.gms.internal.cast.G;
import com.google.android.gms.internal.cast.Pa;
import com.google.android.gms.internal.cast.Ra;
import java.util.Timer;

public class ExpandedControllerActivity extends AppCompatActivity implements a {
    private ImageView[] A = new ImageView[4];
    private View B;
    private View C;
    /* access modifiers changed from: private */
    public ImageView D;
    /* access modifiers changed from: private */
    public TextView E;
    private TextView F;
    /* access modifiers changed from: private */
    public TextView G;
    private TextView H;
    private Pa I;
    private C1673rr J;
    private C0666s K;
    /* access modifiers changed from: private */
    public boolean L;
    private boolean M;
    private Timer N;
    private String O;
    private final C0667t<C0636d> a = new b(this, null);
    private final com.google.android.gms.cast.framework.media.C0650e.b b = new a(this, null);
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    /* access modifiers changed from: private */
    public TextView u;
    private SeekBar v;
    private CastSeekBar w;
    private ImageView x;
    private ImageView y;
    private int[] z;

    private class a implements com.google.android.gms.cast.framework.media.C0650e.b {
        private a() {
        }

        public final void a() {
            ExpandedControllerActivity.this.z();
        }

        public final void b() {
            ExpandedControllerActivity.this.x();
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e() {
            C0650e d = ExpandedControllerActivity.this.w();
            if (d == null || !d.m()) {
                if (!ExpandedControllerActivity.this.L) {
                    ExpandedControllerActivity.this.finish();
                }
                return;
            }
            ExpandedControllerActivity.this.L = false;
            ExpandedControllerActivity.this.y();
            ExpandedControllerActivity.this.z();
        }

        public final void h() {
            ExpandedControllerActivity.this.u.setText(ExpandedControllerActivity.this.getResources().getString(C0663o.cast_expanded_controller_loading));
        }

        /* synthetic */ a(ExpandedControllerActivity expandedControllerActivity, d dVar) {
            this();
        }
    }

    private class b implements C0667t<C0636d> {
        private b() {
        }

        public final /* bridge */ /* synthetic */ void a(r rVar) {
        }

        public final /* bridge */ /* synthetic */ void a(r rVar, int i) {
        }

        public final /* bridge */ /* synthetic */ void a(r rVar, String str) {
        }

        public final /* bridge */ /* synthetic */ void a(r rVar, boolean z) {
        }

        public final /* bridge */ /* synthetic */ void b(r rVar) {
        }

        public final /* synthetic */ void b(r rVar, int i) {
            ExpandedControllerActivity.this.finish();
        }

        public final /* bridge */ /* synthetic */ void b(r rVar, String str) {
        }

        public final /* bridge */ /* synthetic */ void c(r rVar, int i) {
        }

        public final /* bridge */ /* synthetic */ void d(r rVar, int i) {
        }

        /* synthetic */ b(ExpandedControllerActivity expandedControllerActivity, d dVar) {
            this();
        }
    }

    private final void a(View view, int i2, int i3, C1673rr rrVar) {
        ImageView imageView = (ImageView) view.findViewById(i2);
        if (i3 == C0645m.cast_button_type_empty) {
            imageView.setVisibility(4);
            return;
        }
        if (i3 != C0645m.cast_button_type_custom) {
            if (i3 == C0645m.cast_button_type_play_pause_toggle) {
                imageView.setBackgroundResource(this.c);
                Drawable a2 = h.a(this, this.q, this.e);
                Drawable a3 = h.a(this, this.q, this.d);
                Drawable a4 = h.a(this, this.q, this.f);
                imageView.setImageDrawable(a3);
                rrVar.a(imageView, a3, a2, a4, null, false);
            } else if (i3 == C0645m.cast_button_type_skip_previous) {
                imageView.setBackgroundResource(this.c);
                imageView.setImageDrawable(h.a(this, this.q, this.g));
                imageView.setContentDescription(getResources().getString(C0663o.cast_skip_prev));
                rrVar.b((View) imageView, 0);
            } else if (i3 == C0645m.cast_button_type_skip_next) {
                imageView.setBackgroundResource(this.c);
                imageView.setImageDrawable(h.a(this, this.q, this.h));
                imageView.setContentDescription(getResources().getString(C0663o.cast_skip_next));
                rrVar.a((View) imageView, 0);
            } else if (i3 == C0645m.cast_button_type_rewind_30_seconds) {
                imageView.setBackgroundResource(this.c);
                imageView.setImageDrawable(h.a(this, this.q, this.i));
                imageView.setContentDescription(getResources().getString(C0663o.cast_rewind_30));
                rrVar.b((View) imageView, 30000);
            } else if (i3 == C0645m.cast_button_type_forward_30_seconds) {
                imageView.setBackgroundResource(this.c);
                imageView.setImageDrawable(h.a(this, this.q, this.j));
                imageView.setContentDescription(getResources().getString(C0663o.cast_forward_30));
                rrVar.a((View) imageView, 30000);
            } else if (i3 == C0645m.cast_button_type_mute_toggle) {
                imageView.setBackgroundResource(this.c);
                imageView.setImageDrawable(h.a(this, this.q, this.k));
                rrVar.a(imageView);
            } else if (i3 == C0645m.cast_button_type_closed_caption) {
                imageView.setBackgroundResource(this.c);
                imageView.setImageDrawable(h.a(this, this.q, this.l));
                rrVar.a((View) imageView);
            }
        }
    }

    private final void c(String str) {
        this.I.a(Uri.parse(str));
        this.C.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final C0650e w() {
        C0636d a2 = this.K.a();
        if (a2 == null || !a2.b()) {
            return null;
        }
        return a2.g();
    }

    /* access modifiers changed from: private */
    public final void x() {
        C0650e w2 = w();
        if (w2 != null && w2.m()) {
            MediaInfo g2 = w2.g();
            if (g2 != null) {
                MediaMetadata metadata = g2.getMetadata();
                if (metadata != null) {
                    ActionBar supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.b((CharSequence) metadata.b("com.google.android.gms.cast.metadata.TITLE"));
                        supportActionBar.a((CharSequence) C0721o.a(metadata));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void y() {
        C0636d a2 = this.K.a();
        if (a2 != null) {
            CastDevice f2 = a2.f();
            if (f2 != null) {
                String G2 = f2.G();
                if (!TextUtils.isEmpty(G2)) {
                    this.u.setText(getResources().getString(C0663o.cast_casting_to_device, new Object[]{G2}));
                    return;
                }
            }
        }
        this.u.setText("");
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    public final void z() {
        MediaStatus mediaStatus;
        String str;
        C0650e w2 = w();
        String str2 = null;
        if (w2 == null) {
            mediaStatus = null;
        } else {
            mediaStatus = w2.i();
        }
        if (mediaStatus != null && mediaStatus.ja()) {
            if (PlatformVersion.isAtLeastJellyBeanMR1() && this.y.getVisibility() == 8) {
                Drawable drawable = this.x.getDrawable();
                if (drawable != null && (drawable instanceof BitmapDrawable)) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    if (bitmap != null) {
                        Bitmap a2 = h.a(this, bitmap, 0.25f, 7.5f);
                        if (a2 != null) {
                            this.y.setImageBitmap(a2);
                            this.y.setVisibility(0);
                        }
                    }
                }
            }
            AdBreakClipInfo G2 = mediaStatus.G();
            if (G2 != null) {
                str = G2.aa();
                str2 = G2.Y();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                c(str2);
            } else if (!TextUtils.isEmpty(this.O)) {
                c(this.O);
            } else {
                this.E.setVisibility(0);
                this.C.setVisibility(0);
                this.D.setVisibility(8);
            }
            TextView textView = this.F;
            if (TextUtils.isEmpty(str)) {
                str = getResources().getString(C0663o.cast_ad_label);
            }
            textView.setText(str);
            if (PlatformVersion.isAtLeastM()) {
                this.F.setTextAppearance(this.r);
            } else {
                this.F.setTextAppearance(this, this.r);
            }
            this.B.setVisibility(0);
            a(G2, w2);
            return;
        }
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.B.setVisibility(8);
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            this.y.setVisibility(8);
            this.y.setImageBitmap(null);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.K = C0635c.a((Context) this).c();
        if (this.K.a() == null) {
            finish();
        }
        this.J = new C1673rr(this);
        this.J.a(this.b);
        setContentView(C0662n.cast_expanded_controller_activity);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0294a.selectableItemBackgroundBorderless});
        this.c = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = obtainStyledAttributes(null, C0665q.CastExpandedController, C0642j.castExpandedControllerStyle, C0664p.CastExpandedController);
        this.q = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castButtonColor, 0);
        this.d = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castPlayButtonDrawable, 0);
        this.e = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castPauseButtonDrawable, 0);
        this.f = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castStopButtonDrawable, 0);
        this.g = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castSkipPreviousButtonDrawable, 0);
        this.h = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castSkipNextButtonDrawable, 0);
        this.i = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castRewind30ButtonDrawable, 0);
        this.j = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castForward30ButtonDrawable, 0);
        this.k = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castMuteToggleButtonDrawable, 0);
        this.l = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castClosedCaptionsButtonDrawable, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castControlButtons, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
            Preconditions.checkArgument(obtainTypedArray.length() == 4);
            this.z = new int[obtainTypedArray.length()];
            for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                this.z[i2] = obtainTypedArray.getResourceId(i2, 0);
            }
            obtainTypedArray.recycle();
        } else {
            int i3 = C0645m.cast_button_type_empty;
            this.z = new int[]{i3, i3, i3, i3};
        }
        this.p = obtainStyledAttributes2.getColor(C0665q.CastExpandedController_castExpandedControllerLoadingIndicatorColor, 0);
        this.m = getResources().getColor(obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castAdLabelColor, 0));
        this.n = getResources().getColor(obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castAdInProgressTextColor, 0));
        this.o = getResources().getColor(obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castAdLabelTextColor, 0));
        this.r = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castAdLabelTextAppearance, 0);
        this.s = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castAdInProgressLabelTextAppearance, 0);
        this.t = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castAdInProgressText, 0);
        int resourceId2 = obtainStyledAttributes2.getResourceId(C0665q.CastExpandedController_castDefaultAdPosterUrl, 0);
        if (resourceId2 != 0) {
            this.O = getApplicationContext().getResources().getString(resourceId2);
        }
        obtainStyledAttributes2.recycle();
        View findViewById = findViewById(C0645m.expanded_controller_layout);
        C1673rr rrVar = this.J;
        this.x = (ImageView) findViewById.findViewById(C0645m.background_image_view);
        this.y = (ImageView) findViewById.findViewById(C0645m.blurred_background_image_view);
        View findViewById2 = findViewById.findViewById(C0645m.background_place_holder_image_view);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        rrVar.a(this.x, new ImageHints(4, displayMetrics.widthPixels, displayMetrics.heightPixels), findViewById2);
        this.u = (TextView) findViewById.findViewById(C0645m.status_text);
        ProgressBar progressBar = (ProgressBar) findViewById.findViewById(C0645m.loading_indicator);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i4 = this.p;
        if (i4 != 0) {
            indeterminateDrawable.setColorFilter(i4, Mode.SRC_IN);
        }
        rrVar.b((View) progressBar);
        TextView textView = (TextView) findViewById.findViewById(C0645m.start_text);
        TextView textView2 = (TextView) findViewById.findViewById(C0645m.end_text);
        this.v = (SeekBar) findViewById.findViewById(C0645m.seek_bar);
        this.w = (CastSeekBar) findViewById.findViewById(C0645m.cast_seek_bar);
        rrVar.a(this.w, 1000);
        rrVar.a((View) textView, (C1644qr) new E(textView, rrVar.j()));
        rrVar.a((View) textView2, (C1644qr) new D(textView2, rrVar.j()));
        View findViewById3 = findViewById.findViewById(C0645m.live_indicators);
        C1673rr rrVar2 = this.J;
        rrVar2.a(findViewById3, (C1644qr) new F(findViewById3, rrVar2.j()));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(C0645m.tooltip_container);
        G g2 = new G(relativeLayout, this.w, this.J.j());
        this.J.a((View) relativeLayout, (C1644qr) g2);
        this.J.a((C) g2);
        this.A[0] = (ImageView) findViewById.findViewById(C0645m.button_0);
        this.A[1] = (ImageView) findViewById.findViewById(C0645m.button_1);
        this.A[2] = (ImageView) findViewById.findViewById(C0645m.button_2);
        this.A[3] = (ImageView) findViewById.findViewById(C0645m.button_3);
        a(findViewById, C0645m.button_0, this.z[0], rrVar);
        a(findViewById, C0645m.button_1, this.z[1], rrVar);
        a(findViewById, C0645m.button_play_pause_toggle, C0645m.cast_button_type_play_pause_toggle, rrVar);
        a(findViewById, C0645m.button_2, this.z[2], rrVar);
        a(findViewById, C0645m.button_3, this.z[3], rrVar);
        this.B = findViewById(C0645m.ad_container);
        this.D = (ImageView) this.B.findViewById(C0645m.ad_image_view);
        this.C = this.B.findViewById(C0645m.ad_background_image_view);
        this.F = (TextView) this.B.findViewById(C0645m.ad_label);
        this.F.setTextColor(this.o);
        this.F.setBackgroundColor(this.m);
        this.E = (TextView) this.B.findViewById(C0645m.ad_in_progress_label);
        this.H = (TextView) findViewById(C0645m.ad_skip_text);
        this.G = (TextView) findViewById(C0645m.ad_skip_button);
        this.G.setOnClickListener(new f(this));
        setSupportActionBar((Toolbar) findViewById(C0645m.toolbar));
        if (getSupportActionBar() != null) {
            getSupportActionBar().d(true);
            getSupportActionBar().b(C0644l.quantum_ic_keyboard_arrow_down_white_36);
        }
        y();
        x();
        if (!(this.E == null || this.t == 0)) {
            if (PlatformVersion.isAtLeastM()) {
                this.E.setTextAppearance(this.s);
            } else {
                this.E.setTextAppearance(getApplicationContext(), this.s);
            }
            this.E.setTextColor(this.n);
            this.E.setText(this.t);
        }
        this.I = new Pa(getApplicationContext(), new ImageHints(-1, this.D.getWidth(), this.D.getHeight()));
        this.I.a((Ra) new d(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.I.a();
        C1673rr rrVar = this.J;
        if (rrVar != null) {
            rrVar.a((com.google.android.gms.cast.framework.media.C0650e.b) null);
            this.J.f();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C0635c.a((Context) this).c().b(this.a, C0636d.class);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C0635c.a((Context) this).c().a(this.a, C0636d.class);
        C0636d a2 = C0635c.a((Context) this).c().a();
        if (a2 == null || (!a2.b() && !a2.c())) {
            finish();
        }
        C0650e w2 = w();
        this.L = w2 == null || !w2.m();
        y();
        z();
        super.onResume();
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() ^ 2;
            if (PlatformVersion.isAtLeastJellyBean()) {
                systemUiVisibility ^= 4;
            }
            if (PlatformVersion.isAtLeastKitKat()) {
                systemUiVisibility ^= 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
            if (PlatformVersion.isAtLeastJellyBeanMR2()) {
                setImmersive(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void a(AdBreakClipInfo adBreakClipInfo, C0650e eVar) {
        if (!this.L && !eVar.n()) {
            this.G.setVisibility(8);
            if (!(adBreakClipInfo == null || adBreakClipInfo.ca() == -1)) {
                if (!this.M) {
                    e eVar2 = new e(this, adBreakClipInfo, eVar);
                    this.N = new Timer();
                    this.N.scheduleAtFixedRate(eVar2, 0, 500);
                    this.M = true;
                }
                float ca = (float) (adBreakClipInfo.ca() - eVar.a());
                if (ca <= 0.0f) {
                    this.H.setVisibility(8);
                    if (this.M) {
                        this.N.cancel();
                        this.M = false;
                    }
                    this.G.setVisibility(0);
                    this.G.setClickable(true);
                    return;
                }
                this.H.setVisibility(0);
                this.H.setText(getResources().getString(C0663o.cast_expanded_controller_skip_ad_text, new Object[]{Integer.valueOf((int) Math.ceil((double) (ca / 1000.0f)))}));
                this.G.setClickable(false);
            }
        }
    }
}
