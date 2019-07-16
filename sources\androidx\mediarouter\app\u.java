package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.appcompat.app.C0325l;
import androidx.mediarouter.app.OverlayListView.a.C0010a;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.g;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: MediaRouteControllerDialog */
public class u extends C0325l {
    static final boolean d = Log.isLoggable("MediaRouteCtrlDialog", 3);
    static final int e = ((int) TimeUnit.SECONDS.toMillis(30));
    private boolean A;
    private LinearLayout B;
    private RelativeLayout C;
    private LinearLayout D;
    private View E;
    OverlayListView F;
    f G;
    private List<g> H;
    Set<g> I;
    private Set<g> J;
    Set<g> K;
    SeekBar L;
    e M;
    g N;
    private int O;
    private int P;
    private int Q;
    private final int R;
    Map<g, SeekBar> S;
    MediaControllerCompat T;
    c U;
    PlaybackStateCompat V;
    MediaDescriptionCompat W;
    b X;
    Bitmap Y;
    Uri Z;
    boolean aa;
    Bitmap ba;
    int ca;
    boolean da;
    boolean ea;
    final h f;
    boolean fa;
    private final d g;
    boolean ga;
    final g h;
    boolean ha;
    Context i;
    int ia;
    private boolean j;
    private int ja;
    private boolean k;
    private int ka;
    private int l;
    private Interpolator la;
    private View m;
    private Interpolator ma;
    private Button n;
    private Interpolator na;
    private Button o;
    private Interpolator oa;
    private ImageButton p;
    final AccessibilityManager pa;
    private ImageButton q;
    Runnable qa;
    private MediaRouteExpandCollapseButton r;
    private FrameLayout s;
    private LinearLayout t;
    FrameLayout u;
    private FrameLayout v;
    private ImageView w;
    private TextView x;
    private TextView y;
    private TextView z;

    /* compiled from: MediaRouteControllerDialog */
    private final class a implements OnClickListener {
        a() {
        }

        public void onClick(View view) {
            int id = view.getId();
            int i = 1;
            if (id == 16908313 || id == 16908314) {
                if (u.this.h.w()) {
                    h hVar = u.this.f;
                    if (id == 16908313) {
                        i = 2;
                    }
                    hVar.a(i);
                }
                u.this.dismiss();
            } else if (id == C1749ud.mr_control_playback_ctrl) {
                u uVar = u.this;
                if (uVar.T != null) {
                    PlaybackStateCompat playbackStateCompat = uVar.V;
                    if (playbackStateCompat != null) {
                        int i2 = 0;
                        if (playbackStateCompat.getState() != 3) {
                            i = 0;
                        }
                        if (i != 0 && u.this.c()) {
                            u.this.T.getTransportControls().pause();
                            i2 = C1869yd.mr_controller_pause;
                        } else if (i != 0 && u.this.e()) {
                            u.this.T.getTransportControls().stop();
                            i2 = C1869yd.mr_controller_stop;
                        } else if (i == 0 && u.this.d()) {
                            u.this.T.getTransportControls().play();
                            i2 = C1869yd.mr_controller_play;
                        }
                        AccessibilityManager accessibilityManager = u.this.pa;
                        if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                            obtain.setPackageName(u.this.i.getPackageName());
                            obtain.setClassName(a.class.getName());
                            obtain.getText().add(u.this.i.getString(i2));
                            u.this.pa.sendAccessibilityEvent(obtain);
                        }
                    }
                }
            } else if (id == C1749ud.mr_close) {
                u.this.dismiss();
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog */
    private class b extends AsyncTask<Void, Void, Bitmap> {
        private final Bitmap a;
        private final Uri b;
        private int c;
        private long d;

        b() {
            MediaDescriptionCompat mediaDescriptionCompat = u.this.W;
            Uri uri = null;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (u.a(iconBitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                iconBitmap = null;
            }
            this.a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = u.this.W;
            if (mediaDescriptionCompat2 != null) {
                uri = mediaDescriptionCompat2.getIconUri();
            }
            this.b = uri;
        }

        public Bitmap a() {
            return this.a;
        }

        public Uri b() {
            return this.b;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            u.this.b();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0049 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0054 A[Catch:{ IOException -> 0x00a5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC, Splitter:B:58:0x00c2] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00c9 A[SYNTHETIC, Splitter:B:62:0x00c9] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00e9 A[ADDED_TO_REGION] */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            Bitmap bitmap;
            InputStream inputStream;
            String str = "Unable to open: ";
            Bitmap bitmap2 = this.a;
            int i = 0;
            String str2 = "MediaRouteCtrlDialog";
            if (bitmap2 != null) {
                bitmap = bitmap2;
            } else {
                Uri uri = this.b;
                if (uri != null) {
                    try {
                        inputStream = a(uri);
                        if (inputStream == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(this.b);
                            Log.w(str2, sb.toString());
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            return null;
                        }
                        Options options = new Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStream, null, options);
                        if (options.outWidth == 0 || options.outHeight == 0) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return null;
                        }
                        inputStream.reset();
                        try {
                            inputStream.close();
                            inputStream = a(this.b);
                            if (inputStream == null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append(this.b);
                                Log.w(str2, sb2.toString());
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                return null;
                            }
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / u.this.a(options.outWidth, options.outHeight)));
                            if (isCancelled()) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                return null;
                            }
                            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append(this.b);
                                Log.w(str2, sb3.toString(), e);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                bitmap = null;
                                if (u.a(bitmap)) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused7) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        inputStream = null;
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(str);
                        sb32.append(this.b);
                        Log.w(str2, sb32.toString(), e);
                        if (inputStream != null) {
                        }
                        bitmap = null;
                        if (u.a(bitmap)) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                        if (inputStream != null) {
                        }
                        throw th;
                    }
                }
                bitmap = null;
            }
            if (u.a(bitmap)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't use recycled bitmap: ");
                sb4.append(bitmap);
                Log.w(str2, sb4.toString());
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                defpackage.Fd.a aVar = new defpackage.Fd.a(bitmap);
                aVar.a(1);
                Fd a2 = aVar.a();
                if (!a2.d().isEmpty()) {
                    i = ((defpackage.Fd.d) a2.d().get(0)).d();
                }
                this.c = i;
            }
            return bitmap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            u uVar = u.this;
            uVar.X = null;
            if (!C0243Pb.a(uVar.Y, this.a) || !C0243Pb.a(u.this.Z, this.b)) {
                u uVar2 = u.this;
                uVar2.Y = this.a;
                uVar2.ba = bitmap;
                uVar2.Z = this.b;
                uVar2.ca = this.c;
                boolean z = true;
                uVar2.aa = true;
                long uptimeMillis = SystemClock.uptimeMillis() - this.d;
                u uVar3 = u.this;
                if (uptimeMillis <= 120) {
                    z = false;
                }
                uVar3.c(z);
            }
        }

        private InputStream a(Uri uri) throws IOException {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = u.this.i.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(u.e);
                openConnection.setReadTimeout(u.e);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }
    }

    /* compiled from: MediaRouteControllerDialog */
    private final class c extends Callback {
        c() {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            u.this.W = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            u.this.i();
            u.this.c(false);
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            u uVar = u.this;
            uVar.V = playbackStateCompat;
            uVar.c(false);
        }

        public void onSessionDestroyed() {
            u uVar = u.this;
            MediaControllerCompat mediaControllerCompat = uVar.T;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(uVar.U);
                u.this.T = null;
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog */
    private final class d extends androidx.mediarouter.media.h.a {
        d() {
        }

        public void b(h hVar, g gVar) {
            u.this.c(true);
        }

        public void f(h hVar, g gVar) {
            u.this.c(false);
        }

        public void g(h hVar, g gVar) {
            SeekBar seekBar = (SeekBar) u.this.S.get(gVar);
            int o = gVar.o();
            if (u.d) {
                StringBuilder sb = new StringBuilder();
                sb.append("onRouteVolumeChanged(), route.getVolume:");
                sb.append(o);
                Log.d("MediaRouteCtrlDialog", sb.toString());
            }
            if (seekBar != null && u.this.N != gVar) {
                seekBar.setProgress(o);
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog */
    private class e implements OnSeekBarChangeListener {
        private final Runnable a = new v(this);

        e() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                g gVar = (g) seekBar.getTag();
                if (u.d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
                    sb.append(i);
                    sb.append(")");
                    Log.d("MediaRouteCtrlDialog", sb.toString());
                }
                gVar.a(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            u uVar = u.this;
            if (uVar.N != null) {
                uVar.L.removeCallbacks(this.a);
            }
            u.this.N = (g) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            u.this.L.postDelayed(this.a, 500);
        }
    }

    /* compiled from: MediaRouteControllerDialog */
    private class f extends ArrayAdapter<g> {
        final float a;

        public f(Context context, List<g> list) {
            super(context, 0, list);
            this.a = E.e(context);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3 = 0;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C1839xd.mr_controller_volume_item, viewGroup, false);
            } else {
                u.this.a(view);
            }
            g gVar = (g) getItem(i);
            if (gVar != null) {
                boolean u = gVar.u();
                TextView textView = (TextView) view.findViewById(C1749ud.mr_name);
                textView.setEnabled(u);
                textView.setText(gVar.i());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(C1749ud.mr_volume_slider);
                E.a(viewGroup.getContext(), mediaRouteVolumeSlider, (View) u.this.F);
                mediaRouteVolumeSlider.setTag(gVar);
                u.this.S.put(gVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.a(!u);
                mediaRouteVolumeSlider.setEnabled(u);
                if (u) {
                    if (u.this.a(gVar)) {
                        mediaRouteVolumeSlider.setMax(gVar.q());
                        mediaRouteVolumeSlider.setProgress(gVar.o());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(u.this.M);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(C1749ud.mr_volume_item_icon);
                if (u) {
                    i2 = 255;
                } else {
                    i2 = (int) (this.a * 255.0f);
                }
                imageView.setAlpha(i2);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C1749ud.volume_item_container);
                if (u.this.K.contains(gVar)) {
                    i3 = 4;
                }
                linearLayout.setVisibility(i3);
                Set<g> set = u.this.I;
                if (set != null && set.contains(gVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        public boolean isEnabled(int i) {
            return false;
        }
    }

    public u(Context context) {
        this(context, 0);
    }

    private void a(Token token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaDescriptionCompat mediaDescriptionCompat;
        MediaControllerCompat mediaControllerCompat = this.T;
        PlaybackStateCompat playbackStateCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.U);
            this.T = null;
        }
        if (token != null && this.k) {
            try {
                this.T = new MediaControllerCompat(this.i, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.T;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.registerCallback(this.U);
            }
            MediaControllerCompat mediaControllerCompat3 = this.T;
            if (mediaControllerCompat3 == null) {
                mediaMetadataCompat = null;
            } else {
                mediaMetadataCompat = mediaControllerCompat3.getMetadata();
            }
            if (mediaMetadataCompat == null) {
                mediaDescriptionCompat = null;
            } else {
                mediaDescriptionCompat = mediaMetadataCompat.getDescription();
            }
            this.W = mediaDescriptionCompat;
            MediaControllerCompat mediaControllerCompat4 = this.T;
            if (mediaControllerCompat4 != null) {
                playbackStateCompat = mediaControllerCompat4.getPlaybackState();
            }
            this.V = playbackStateCompat;
            i();
            c(false);
        }
    }

    private void b(View view, int i2) {
        r rVar = new r(this, b(view), i2, view);
        rVar.setDuration((long) this.ia);
        if (VERSION.SDK_INT >= 21) {
            rVar.setInterpolator(this.la);
        }
        view.startAnimation(rVar);
    }

    private int f(boolean z2) {
        if (!z2 && this.D.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + this.B.getPaddingTop() + this.B.getPaddingBottom();
        if (z2) {
            paddingTop += this.C.getMeasuredHeight();
        }
        if (this.D.getVisibility() == 0) {
            paddingTop += this.D.getMeasuredHeight();
        }
        return (!z2 || this.D.getVisibility() != 0) ? paddingTop : paddingTop + this.E.getMeasuredHeight();
    }

    private void g(boolean z2) {
        List y2 = m() == null ? null : m().y();
        if (y2 == null) {
            this.H.clear();
            this.G.notifyDataSetChanged();
        } else if (C.c(this.H, y2)) {
            this.G.notifyDataSetChanged();
        } else {
            Map a2 = z2 ? C.a((ListView) this.F, (ArrayAdapter<E>) this.G) : null;
            Map a3 = z2 ? C.a(this.i, this.F, this.G) : null;
            this.I = C.a(this.H, y2);
            this.J = C.b(this.H, y2);
            this.H.addAll(0, this.I);
            this.H.removeAll(this.J);
            this.G.notifyDataSetChanged();
            if (!z2 || !this.fa || this.I.size() + this.J.size() <= 0) {
                this.I = null;
                this.J = null;
                return;
            }
            b(a2, a3);
        }
    }

    private void h(boolean z2) {
        int i2 = 0;
        this.E.setVisibility((this.D.getVisibility() != 0 || !z2) ? 8 : 0);
        LinearLayout linearLayout = this.B;
        if (this.D.getVisibility() == 8 && !z2) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    private boolean k() {
        return this.m == null && !(this.W == null && this.V == null);
    }

    private void l() {
        k kVar = new k(this);
        int firstVisiblePosition = this.F.getFirstVisiblePosition();
        boolean z2 = false;
        for (int i2 = 0; i2 < this.F.getChildCount(); i2++) {
            View childAt = this.F.getChildAt(i2);
            if (this.I.contains((g) this.G.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) this.ja);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z2) {
                    alphaAnimation.setAnimationListener(kVar);
                    z2 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    private androidx.mediarouter.media.h.f m() {
        g gVar = this.h;
        if (gVar instanceof androidx.mediarouter.media.h.f) {
            return (androidx.mediarouter.media.h.f) gVar;
        }
        return null;
    }

    private boolean n() {
        MediaDescriptionCompat mediaDescriptionCompat = this.W;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.W;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        b bVar = this.X;
        Bitmap a2 = bVar == null ? this.Y : bVar.a();
        b bVar2 = this.X;
        Uri b2 = bVar2 == null ? this.Z : bVar2.b();
        if (a2 != iconBitmap) {
            return true;
        }
        if (a2 != null || a(b2, uri)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    private void o() {
        boolean z2;
        boolean z3;
        PlaybackStateCompat playbackStateCompat;
        int i2;
        int i3;
        if (k()) {
            MediaDescriptionCompat mediaDescriptionCompat = this.W;
            CharSequence charSequence = null;
            CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
            boolean z4 = true;
            boolean z5 = !TextUtils.isEmpty(title);
            MediaDescriptionCompat mediaDescriptionCompat2 = this.W;
            if (mediaDescriptionCompat2 != null) {
                charSequence = mediaDescriptionCompat2.getSubtitle();
            }
            boolean z6 = !TextUtils.isEmpty(charSequence);
            if (this.h.l() != -1) {
                this.x.setText(C1869yd.mr_controller_casting_screen);
            } else {
                PlaybackStateCompat playbackStateCompat2 = this.V;
                if (playbackStateCompat2 == null || playbackStateCompat2.getState() == 0) {
                    this.x.setText(C1869yd.mr_controller_no_media_selected);
                } else if (z5 || z6) {
                    if (z5) {
                        this.x.setText(title);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z6) {
                        this.y.setText(charSequence);
                        z2 = true;
                        int i4 = 8;
                        this.x.setVisibility(z3 ? 0 : 8);
                        this.y.setVisibility(z2 ? 0 : 8);
                        playbackStateCompat = this.V;
                        if (playbackStateCompat != null) {
                            boolean z7 = playbackStateCompat.getState() == 6 || this.V.getState() == 3;
                            Context context = this.p.getContext();
                            if (z7 && c()) {
                                i3 = C1659rd.mediaRoutePauseDrawable;
                                i2 = C1869yd.mr_controller_pause;
                            } else if (z7 && e()) {
                                i3 = C1659rd.mediaRouteStopDrawable;
                                i2 = C1869yd.mr_controller_stop;
                            } else if (z7 || !d()) {
                                i3 = 0;
                                i2 = 0;
                                z4 = false;
                            } else {
                                i3 = C1659rd.mediaRoutePlayDrawable;
                                i2 = C1869yd.mr_controller_play;
                            }
                            ImageButton imageButton = this.p;
                            if (z4) {
                                i4 = 0;
                            }
                            imageButton.setVisibility(i4);
                            if (z4) {
                                this.p.setImageResource(E.b(context, i3));
                                this.p.setContentDescription(context.getResources().getText(i2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    z2 = false;
                    int i42 = 8;
                    this.x.setVisibility(z3 ? 0 : 8);
                    this.y.setVisibility(z2 ? 0 : 8);
                    playbackStateCompat = this.V;
                    if (playbackStateCompat != null) {
                    }
                } else {
                    this.x.setText(C1869yd.mr_controller_no_info_available);
                }
            }
            z3 = true;
            z2 = false;
            int i422 = 8;
            this.x.setVisibility(z3 ? 0 : 8);
            this.y.setVisibility(z2 ? 0 : 8);
            playbackStateCompat = this.V;
            if (playbackStateCompat != null) {
            }
        }
    }

    private void p() {
        int i2 = 8;
        if (!a(this.h)) {
            this.D.setVisibility(8);
        } else if (this.D.getVisibility() == 8) {
            this.D.setVisibility(0);
            this.L.setMax(this.h.q());
            this.L.setProgress(this.h.o());
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.r;
            if (m() != null) {
                i2 = 0;
            }
            mediaRouteExpandCollapseButton.setVisibility(i2);
        }
    }

    public View a(Bundle bundle) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z2) {
        if (this.N != null) {
            this.da = true;
            this.ea = z2 | this.ea;
            return;
        }
        int i2 = 0;
        this.da = false;
        this.ea = false;
        if (!this.h.w() || this.h.t()) {
            dismiss();
        } else if (this.j) {
            this.z.setText(this.h.i());
            Button button = this.n;
            if (!this.h.a()) {
                i2 = 8;
            }
            button.setVisibility(i2);
            if (this.m == null && this.aa) {
                if (a(this.ba)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't set artwork image with recycled bitmap: ");
                    sb.append(this.ba);
                    Log.w("MediaRouteCtrlDialog", sb.toString());
                } else {
                    this.w.setImageBitmap(this.ba);
                    this.w.setBackgroundColor(this.ca);
                }
                b();
            }
            p();
            o();
            d(z2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(boolean z2) {
        this.u.requestLayout();
        this.u.getViewTreeObserver().addOnGlobalLayoutListener(new q(this, z2));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0155  */
    public void e(boolean z2) {
        int i2;
        int size;
        int i3;
        int min;
        int max;
        int height;
        int max2;
        int b2 = b((View) this.B);
        a((View) this.B, -1);
        h(k());
        View decorView = getWindow().getDecorView();
        decorView.measure(MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        a((View) this.B, b2);
        if (this.m == null && (this.w.getDrawable() instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) this.w.getDrawable()).getBitmap();
            if (bitmap != null) {
                i2 = a(bitmap.getWidth(), bitmap.getHeight());
                this.w.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ScaleType.FIT_XY : ScaleType.FIT_CENTER);
                int f2 = f(k());
                size = this.H.size();
                if (m() != null) {
                    i3 = 0;
                } else {
                    i3 = this.P * m().y().size();
                }
                if (size > 0) {
                    i3 += this.R;
                }
                min = Math.min(i3, this.Q);
                if (!this.fa) {
                    min = 0;
                }
                max = Math.max(i2, min) + f2;
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                height = rect.height() - (this.t.getMeasuredHeight() - this.u.getMeasuredHeight());
                if (this.m == null || i2 <= 0 || max > height) {
                    if (b((View) this.F) + this.B.getMeasuredHeight() >= this.u.getMeasuredHeight()) {
                        this.w.setVisibility(8);
                    }
                    max = min + f2;
                    i2 = 0;
                } else {
                    this.w.setVisibility(0);
                    a((View) this.w, i2);
                }
                if (k() || max > height) {
                    this.C.setVisibility(8);
                } else {
                    this.C.setVisibility(0);
                }
                boolean z3 = true;
                h(this.C.getVisibility() != 0);
                if (this.C.getVisibility() != 0) {
                    z3 = false;
                }
                int f3 = f(z3);
                max2 = Math.max(i2, min) + f3;
                if (max2 > height) {
                    min -= max2 - height;
                    max2 = height;
                }
                this.B.clearAnimation();
                this.F.clearAnimation();
                this.u.clearAnimation();
                if (!z2) {
                    b((View) this.B, f3);
                    b((View) this.F, min);
                    b((View) this.u, max2);
                } else {
                    a((View) this.B, f3);
                    a((View) this.F, min);
                    a((View) this.u, max2);
                }
                a((View) this.s, rect.height());
                g(z2);
            }
        }
        i2 = 0;
        int f22 = f(k());
        size = this.H.size();
        if (m() != null) {
        }
        if (size > 0) {
        }
        min = Math.min(i3, this.Q);
        if (!this.fa) {
        }
        max = Math.max(i2, min) + f22;
        Rect rect2 = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect2);
        height = rect2.height() - (this.t.getMeasuredHeight() - this.u.getMeasuredHeight());
        if (this.m == null) {
        }
        if (b((View) this.F) + this.B.getMeasuredHeight() >= this.u.getMeasuredHeight()) {
        }
        max = min + f22;
        i2 = 0;
        if (k()) {
        }
        this.C.setVisibility(8);
        boolean z32 = true;
        h(this.C.getVisibility() != 0);
        if (this.C.getVisibility() != 0) {
        }
        int f32 = f(z32);
        max2 = Math.max(i2, min) + f32;
        if (max2 > height) {
        }
        this.B.clearAnimation();
        this.F.clearAnimation();
        this.u.clearAnimation();
        if (!z2) {
        }
        a((View) this.s, rect2.height());
        g(z2);
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        if (this.m == null && n()) {
            b bVar = this.X;
            if (bVar != null) {
                bVar.cancel(true);
            }
            this.X = new b();
            this.X.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        int a2 = C.a(this.i);
        getWindow().setLayout(a2, -2);
        View decorView = getWindow().getDecorView();
        this.l = (a2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.i.getResources();
        this.O = resources.getDimensionPixelSize(C1689sd.mr_controller_volume_group_list_item_icon_size);
        this.P = resources.getDimensionPixelSize(C1689sd.mr_controller_volume_group_list_item_height);
        this.Q = resources.getDimensionPixelSize(C1689sd.mr_controller_volume_group_list_max_height);
        this.Y = null;
        this.Z = null;
        i();
        c(false);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k = true;
        this.f.a(androidx.mediarouter.media.g.a, this.g, 2);
        a(this.f.c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(C1839xd.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        a aVar = new a();
        this.s = (FrameLayout) findViewById(C1749ud.mr_expandable_area);
        this.s.setOnClickListener(new m(this));
        this.t = (LinearLayout) findViewById(C1749ud.mr_dialog_area);
        this.t.setOnClickListener(new n(this));
        int c2 = E.c(this.i);
        this.n = (Button) findViewById(16908314);
        this.n.setText(C1869yd.mr_controller_disconnect);
        this.n.setTextColor(c2);
        this.n.setOnClickListener(aVar);
        this.o = (Button) findViewById(16908313);
        this.o.setText(C1869yd.mr_controller_stop_casting);
        this.o.setTextColor(c2);
        this.o.setOnClickListener(aVar);
        this.z = (TextView) findViewById(C1749ud.mr_name);
        this.q = (ImageButton) findViewById(C1749ud.mr_close);
        this.q.setOnClickListener(aVar);
        this.v = (FrameLayout) findViewById(C1749ud.mr_custom_control);
        this.u = (FrameLayout) findViewById(C1749ud.mr_default_control);
        o oVar = new o(this);
        this.w = (ImageView) findViewById(C1749ud.mr_art);
        this.w.setOnClickListener(oVar);
        findViewById(C1749ud.mr_control_title_container).setOnClickListener(oVar);
        this.B = (LinearLayout) findViewById(C1749ud.mr_media_main_control);
        this.E = findViewById(C1749ud.mr_control_divider);
        this.C = (RelativeLayout) findViewById(C1749ud.mr_playback_control);
        this.x = (TextView) findViewById(C1749ud.mr_control_title);
        this.y = (TextView) findViewById(C1749ud.mr_control_subtitle);
        this.p = (ImageButton) findViewById(C1749ud.mr_control_playback_ctrl);
        this.p.setOnClickListener(aVar);
        this.D = (LinearLayout) findViewById(C1749ud.mr_volume_control);
        this.D.setVisibility(8);
        this.L = (SeekBar) findViewById(C1749ud.mr_volume_slider);
        this.L.setTag(this.h);
        this.M = new e();
        this.L.setOnSeekBarChangeListener(this.M);
        this.F = (OverlayListView) findViewById(C1749ud.mr_volume_group_list);
        this.H = new ArrayList();
        this.G = new f(this.F.getContext(), this.H);
        this.F.setAdapter(this.G);
        this.K = new HashSet();
        E.a(this.i, this.B, this.F, m() != null);
        E.a(this.i, (MediaRouteVolumeSlider) this.L, (View) this.B);
        this.S = new HashMap();
        this.S.put(this.h, this.L);
        this.r = (MediaRouteExpandCollapseButton) findViewById(C1749ud.mr_group_expand_collapse);
        this.r.setOnClickListener(new p(this));
        f();
        this.ia = this.i.getResources().getInteger(C1779vd.mr_controller_volume_group_list_animation_duration_ms);
        this.ja = this.i.getResources().getInteger(C1779vd.mr_controller_volume_group_list_fade_in_duration_ms);
        this.ka = this.i.getResources().getInteger(C1779vd.mr_controller_volume_group_list_fade_out_duration_ms);
        this.m = a(bundle);
        View view = this.m;
        if (view != null) {
            this.v.addView(view);
            this.v.setVisibility(0);
        }
        this.j = true;
        j();
    }

    public void onDetachedFromWindow() {
        this.f.a((androidx.mediarouter.media.h.a) this.g);
        a((Token) null);
        this.k = false;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.h.b(i2 == 25 ? -1 : 1);
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public u(Context context, int i2) {
        Context a2 = E.a(context, i2, true);
        super(a2, E.b(a2));
        this.A = true;
        this.qa = new l(this);
        this.i = getContext();
        this.U = new c();
        this.f = h.a(this.i);
        this.g = new d();
        this.h = this.f.e();
        a(this.f.c());
        this.R = this.i.getResources().getDimensionPixelSize(C1689sd.mr_controller_volume_group_list_padding_top);
        this.pa = (AccessibilityManager) this.i.getSystemService("accessibility");
        if (VERSION.SDK_INT >= 21) {
            this.ma = AnimationUtils.loadInterpolator(a2, C1809wd.mr_linear_out_slow_in);
            this.na = AnimationUtils.loadInterpolator(a2, C1809wd.mr_fast_out_slow_in);
        }
        this.oa = new AccelerateDecelerateInterpolator();
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        Set<g> set = this.I;
        if (set == null || set.size() == 0) {
            b(true);
        } else {
            l();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return (this.V.getActions() & 516) != 0;
    }

    private void b(Map<g, Rect> map, Map<g, BitmapDrawable> map2) {
        this.F.setEnabled(false);
        this.F.requestLayout();
        this.ga = true;
        this.F.getViewTreeObserver().addOnGlobalLayoutListener(new s(this, map, map2));
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        if (VERSION.SDK_INT >= 21) {
            this.la = this.fa ? this.ma : this.na;
        } else {
            this.la = this.oa;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z2) {
        this.I = null;
        this.J = null;
        this.ga = false;
        if (this.ha) {
            this.ha = false;
            d(z2);
        }
        this.F.setEnabled(true);
    }

    static boolean a(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        a((View) (LinearLayout) view.findViewById(C1749ud.volume_item_container), this.P);
        View findViewById = view.findViewById(C1749ud.mr_volume_item_icon);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        int i2 = this.O;
        layoutParams.width = i2;
        layoutParams.height = i2;
        findViewById.setLayoutParams(layoutParams);
    }

    private static int b(View view) {
        return view.getLayoutParams().height;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.aa = false;
        this.ba = null;
        this.ca = 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return (this.V.getActions() & 514) != 0;
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        a(true);
        this.F.requestLayout();
        this.F.getViewTreeObserver().addOnGlobalLayoutListener(new j(this));
    }

    /* access modifiers changed from: 0000 */
    public void a(Map<g, Rect> map, Map<g, BitmapDrawable> map2) {
        androidx.mediarouter.app.OverlayListView.a aVar;
        Map<g, Rect> map3 = map;
        Set<g> set = this.I;
        if (set != null && this.J != null) {
            int size = set.size() - this.J.size();
            t tVar = new t(this);
            int firstVisiblePosition = this.F.getFirstVisiblePosition();
            boolean z2 = false;
            for (int i2 = 0; i2 < this.F.getChildCount(); i2++) {
                View childAt = this.F.getChildAt(i2);
                g gVar = (g) this.G.getItem(firstVisiblePosition + i2);
                Rect rect = (Rect) map3.get(gVar);
                int top = childAt.getTop();
                int i3 = rect != null ? rect.top : (this.P * size) + top;
                AnimationSet animationSet = new AnimationSet(true);
                Set<g> set2 = this.I;
                if (set2 != null && set2.contains(gVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration((long) this.ja);
                    animationSet.addAnimation(alphaAnimation);
                    i3 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i3 - top), 0.0f);
                translateAnimation.setDuration((long) this.ia);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(this.la);
                if (!z2) {
                    animationSet.setAnimationListener(tVar);
                    z2 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map3.remove(gVar);
                map2.remove(gVar);
            }
            Map<g, BitmapDrawable> map4 = map2;
            for (Entry entry : map2.entrySet()) {
                g gVar2 = (g) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map3.get(gVar2);
                if (this.J.contains(gVar2)) {
                    aVar = new androidx.mediarouter.app.OverlayListView.a(bitmapDrawable, rect2);
                    aVar.a(1.0f, 0.0f);
                    aVar.a((long) this.ka);
                    aVar.a(this.la);
                } else {
                    int i4 = this.P * size;
                    androidx.mediarouter.app.OverlayListView.a aVar2 = new androidx.mediarouter.app.OverlayListView.a(bitmapDrawable, rect2);
                    aVar2.a(i4);
                    aVar2.a((long) this.ia);
                    aVar2.a(this.la);
                    aVar2.a((C0010a) new i(this, gVar2));
                    this.K.add(gVar2);
                    aVar = aVar2;
                }
                this.F.a(aVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return (this.V.getActions() & 1) != 0;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2) {
        int firstVisiblePosition = this.F.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.F.getChildCount(); i2++) {
            View childAt = this.F.getChildAt(i2);
            g gVar = (g) this.G.getItem(firstVisiblePosition + i2);
            if (z2) {
                Set<g> set = this.I;
                if (set != null && set.contains(gVar)) {
                }
            }
            ((LinearLayout) childAt.findViewById(C1749ud.volume_item_container)).setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
            alphaAnimation.setDuration(0);
            animationSet.addAnimation(alphaAnimation);
            new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
        }
        this.F.b();
        if (!z2) {
            b(false);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(g gVar) {
        return this.A && gVar.p() == 1;
    }

    static void a(View view, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private static boolean a(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, int i3) {
        if (i2 >= i3) {
            return (int) (((((float) this.l) * ((float) i3)) / ((float) i2)) + 0.5f);
        }
        return (int) (((((float) this.l) * 9.0f) / 16.0f) + 0.5f);
    }
}
