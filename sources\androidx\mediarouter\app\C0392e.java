package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.appcompat.app.A;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.mediarouter.app.e reason: case insensitive filesystem */
/* compiled from: MediaRouteCastDialog */
public class C0392e extends A {
    static final int c = ((int) TimeUnit.SECONDS.toMillis(30));
    MediaDescriptionCompat A;
    a B;
    Bitmap C;
    Uri D;
    boolean E;
    Bitmap F;
    int G;
    final h d;
    private final c e;
    private g f;
    final h.g g;
    final List<h.g> h;
    Context i;
    private boolean j;
    private boolean k;
    private long l;
    private final Handler m;
    private RecyclerView n;
    private d o;
    C0014e p;
    int q;
    private ImageButton r;
    private Button s;
    private RelativeLayout t;
    private ImageView u;
    private TextView v;
    private TextView w;
    private String x;
    MediaControllerCompat y;
    b z;

    /* renamed from: androidx.mediarouter.app.e$a */
    /* compiled from: MediaRouteCastDialog */
    private class a extends AsyncTask<Void, Void, Bitmap> {
        private final Bitmap a;
        private final Uri b;
        private int c;

        a() {
            MediaDescriptionCompat mediaDescriptionCompat = C0392e.this.A;
            Uri uri = null;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (C0392e.a(iconBitmap)) {
                Log.w("MediaRouteCastDialog", "Can't fetch the given art bitmap because it's already recycled.");
                iconBitmap = null;
            }
            this.a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = C0392e.this.A;
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
            C0392e.this.b();
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
            String str2 = "MediaRouteCastDialog";
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
                            options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / C0392e.this.a(options.outWidth, options.outHeight)));
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
                        } catch (IOException e) {
                            e = e;
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
                                if (C0392e.a(bitmap)) {
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
                    } catch (IOException e2) {
                        e = e2;
                        inputStream = null;
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(str);
                        sb32.append(this.b);
                        Log.w(str2, sb32.toString(), e);
                        if (inputStream != null) {
                        }
                        bitmap = null;
                        if (C0392e.a(bitmap)) {
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
            if (C0392e.a(bitmap)) {
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
            C0392e eVar = C0392e.this;
            eVar.B = null;
            if (!C0243Pb.a(eVar.C, this.a) || !C0243Pb.a(C0392e.this.D, this.b)) {
                C0392e eVar2 = C0392e.this;
                eVar2.C = this.a;
                eVar2.F = bitmap;
                eVar2.D = this.b;
                eVar2.G = this.c;
                eVar2.E = true;
                eVar2.d();
            }
        }

        private InputStream a(Uri uri) throws IOException {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = C0392e.this.i.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(C0392e.c);
                openConnection.setReadTimeout(C0392e.c);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }
    }

    /* renamed from: androidx.mediarouter.app.e$b */
    /* compiled from: MediaRouteCastDialog */
    private final class b extends Callback {
        b() {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            C0392e.this.A = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            C0392e.this.e();
            C0392e.this.d();
        }

        public void onSessionDestroyed() {
            C0392e eVar = C0392e.this;
            MediaControllerCompat mediaControllerCompat = eVar.y;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(eVar.z);
                C0392e.this.y = null;
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.e$c */
    /* compiled from: MediaRouteCastDialog */
    private final class c extends androidx.mediarouter.media.h.a {
        c() {
        }

        public void a(h hVar, h.g gVar) {
            C0392e.this.c();
        }

        public void b(h hVar, h.g gVar) {
            C0392e.this.c();
            C0392e.this.d();
        }

        public void d(h hVar, h.g gVar) {
            C0392e.this.c();
        }

        public void e(h hVar, h.g gVar) {
            C0392e.this.d();
        }

        public void f(h hVar, h.g gVar) {
            C0392e.this.d();
        }
    }

    /* renamed from: androidx.mediarouter.app.e$d */
    /* compiled from: MediaRouteCastDialog */
    private final class d extends androidx.recyclerview.widget.RecyclerView.a<ViewHolder> {
        private final ArrayList<C0012d> c = new ArrayList<>();
        private final ArrayList<h.g> d = new ArrayList<>();
        private final ArrayList<h.g> e = new ArrayList<>();
        private final LayoutInflater f;
        private final Drawable g;
        private final Drawable h;
        private final Drawable i;
        private final Drawable j;

        /* renamed from: androidx.mediarouter.app.e$d$a */
        /* compiled from: MediaRouteCastDialog */
        private class a extends ViewHolder {
            ImageView a;
            TextView b;

            a(View view) {
                super(view);
                this.a = (ImageView) view.findViewById(C1749ud.mr_cast_group_icon);
                this.b = (TextView) view.findViewById(C1749ud.mr_cast_group_name);
            }

            public void a(C0012d dVar) {
                h.g gVar = (h.g) dVar.a();
                this.a.setImageDrawable(d.this.a(gVar));
                this.b.setText(gVar.i());
            }
        }

        /* renamed from: androidx.mediarouter.app.e$d$b */
        /* compiled from: MediaRouteCastDialog */
        private class b extends ViewHolder {
            TextView a;
            MediaRouteVolumeSlider b;

            b(View view) {
                super(view);
                this.a = (TextView) view.findViewById(C1749ud.mr_group_volume_route_name);
                this.b = (MediaRouteVolumeSlider) view.findViewById(C1749ud.mr_group_volume_slider);
            }

            public void a(C0012d dVar) {
                h.g gVar = (h.g) dVar.a();
                this.a.setText(gVar.i().toUpperCase());
                this.b.a(C0392e.this.q);
                this.b.setTag(gVar);
                this.b.setProgress(C0392e.this.g.o());
                this.b.setOnSeekBarChangeListener(C0392e.this.p);
            }
        }

        /* renamed from: androidx.mediarouter.app.e$d$c */
        /* compiled from: MediaRouteCastDialog */
        private class c extends ViewHolder {
            TextView a;

            c(View view) {
                super(view);
                this.a = (TextView) view.findViewById(C1749ud.mr_dialog_header_name);
            }

            public void a(C0012d dVar) {
                this.a.setText(dVar.a().toString().toUpperCase());
            }
        }

        /* renamed from: androidx.mediarouter.app.e$d$d reason: collision with other inner class name */
        /* compiled from: MediaRouteCastDialog */
        private class C0012d {
            private final Object a;
            private final int b;

            C0012d(Object obj, int i) {
                this.a = obj;
                this.b = i;
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        /* renamed from: androidx.mediarouter.app.e$d$e reason: collision with other inner class name */
        /* compiled from: MediaRouteCastDialog */
        private class C0013e extends ViewHolder {
            ImageView a;
            TextView b;
            CheckBox c;
            MediaRouteVolumeSlider d;

            C0013e(View view) {
                super(view);
                this.a = (ImageView) view.findViewById(C1749ud.mr_cast_route_icon);
                this.b = (TextView) view.findViewById(C1749ud.mr_cast_route_name);
                this.c = (CheckBox) view.findViewById(C1749ud.mr_cast_checkbox);
                this.d = (MediaRouteVolumeSlider) view.findViewById(C1749ud.mr_cast_volume_slider);
            }

            public void a(C0012d dVar) {
                h.g gVar = (h.g) dVar.a();
                this.a.setImageDrawable(d.this.a(gVar));
                this.b.setText(gVar.i());
                this.c.setChecked(d.this.b(gVar));
                this.d.a(C0392e.this.q);
                this.d.setTag(gVar);
                this.d.setProgress(gVar.o());
                this.d.setOnSeekBarChangeListener(C0392e.this.p);
            }
        }

        d() {
            this.f = LayoutInflater.from(C0392e.this.i);
            this.g = E.d(C0392e.this.i);
            this.h = E.h(C0392e.this.i);
            this.i = E.f(C0392e.this.i);
            this.j = E.g(C0392e.this.i);
            f();
        }

        private Drawable c(h.g gVar) {
            int e2 = gVar.e();
            if (e2 == 1) {
                return this.h;
            }
            if (e2 == 2) {
                return this.i;
            }
            if (gVar instanceof f) {
                return this.j;
            }
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        public Drawable a(h.g gVar) {
            Uri g2 = gVar.g();
            if (g2 != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(C0392e.this.i.getContentResolver().openInputStream(g2), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load ");
                    sb.append(g2);
                    Log.w("RecyclerAdapter", sb.toString(), e2);
                }
            }
            return c(gVar);
        }

        /* access modifiers changed from: 0000 */
        public boolean b(h.g gVar) {
            if (gVar.w()) {
                return true;
            }
            h.g gVar2 = C0392e.this.g;
            if (gVar2 instanceof f) {
                for (h.g h2 : ((f) gVar2).y()) {
                    if (h2.h().equals(gVar.h())) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void f() {
            this.c.clear();
            h.g gVar = C0392e.this.g;
            if (gVar instanceof f) {
                this.c.add(new C0012d(gVar, 1));
                for (h.g dVar : ((f) C0392e.this.g).y()) {
                    this.c.add(new C0012d(dVar, 3));
                }
            } else {
                this.c.add(new C0012d(gVar, 3));
            }
            this.d.clear();
            this.e.clear();
            for (h.g gVar2 : C0392e.this.h) {
                if (!b(gVar2)) {
                    if (gVar2 instanceof f) {
                        this.e.add(gVar2);
                    } else {
                        this.d.add(gVar2);
                    }
                }
            }
            if (this.d.size() > 0) {
                this.c.add(new C0012d(C0392e.this.i.getString(C1869yd.mr_dialog_device_header), 2));
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    this.c.add(new C0012d((h.g) it.next(), 3));
                }
            }
            if (this.e.size() > 0) {
                this.c.add(new C0012d(C0392e.this.i.getString(C1869yd.mr_dialog_route_header), 2));
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    this.c.add(new C0012d((h.g) it2.next(), 4));
                }
            }
            e();
        }

        public ViewHolder b(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new b(this.f.inflate(C1839xd.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i2 == 2) {
                return new c(this.f.inflate(C1839xd.mr_dialog_header_item, viewGroup, false));
            }
            if (i2 == 3) {
                return new C0013e(this.f.inflate(C1839xd.mr_cast_route_item, viewGroup, false));
            }
            if (i2 == 4) {
                return new a(this.f.inflate(C1839xd.mr_cast_group_item, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        public void b(ViewHolder viewHolder, int i2) {
            int b2 = b(i2);
            C0012d f2 = f(i2);
            if (b2 == 1) {
                ((b) viewHolder).a(f2);
            } else if (b2 == 2) {
                ((c) viewHolder).a(f2);
            } else if (b2 == 3) {
                ((C0013e) viewHolder).a(f2);
            } else if (b2 != 4) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((a) viewHolder).a(f2);
            }
        }

        public int b() {
            return this.c.size();
        }

        public int b(int i2) {
            return ((C0012d) this.c.get(i2)).b();
        }

        public C0012d f(int i2) {
            return (C0012d) this.c.get(i2);
        }
    }

    /* renamed from: androidx.mediarouter.app.e$e reason: collision with other inner class name */
    /* compiled from: MediaRouteCastDialog */
    private class C0014e implements OnSeekBarChangeListener {
        C0014e() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public C0392e(Context context) {
        this(context, 0);
    }

    private void a(Token token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaControllerCompat mediaControllerCompat = this.y;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.z);
            this.y = null;
        }
        if (token != null && this.k) {
            try {
                this.y = new MediaControllerCompat(this.i, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCastDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.y;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.registerCallback(this.z);
            }
            MediaControllerCompat mediaControllerCompat3 = this.y;
            if (mediaControllerCompat3 == null) {
                mediaMetadataCompat = null;
            } else {
                mediaMetadataCompat = mediaControllerCompat3.getMetadata();
            }
            if (mediaMetadataCompat != null) {
                mediaDescriptionCompat = mediaMetadataCompat.getDescription();
            }
            this.A = mediaDescriptionCompat;
            e();
            d();
        }
    }

    private boolean g() {
        MediaDescriptionCompat mediaDescriptionCompat = this.A;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.A;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        a aVar = this.B;
        Bitmap a2 = aVar == null ? this.C : aVar.a();
        a aVar2 = this.B;
        Uri b2 = aVar2 == null ? this.D : aVar2.b();
        if (a2 != iconBitmap) {
            return true;
        }
        if (a2 != null || !C0243Pb.a(b2, uri)) {
            return false;
        }
        return true;
    }

    private void h() {
        MediaDescriptionCompat mediaDescriptionCompat = this.A;
        CharSequence charSequence = null;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z2 = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.A;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.getSubtitle();
        }
        boolean z3 = !TextUtils.isEmpty(charSequence);
        if (z2) {
            this.v.setText(title);
        } else {
            this.v.setText(this.x);
        }
        if (z3) {
            this.w.setText(charSequence);
            this.w.setVisibility(0);
            return;
        }
        this.w.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.E = false;
        this.F = null;
        this.G = 0;
    }

    public void c() {
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.d.d());
            a((List<h.g>) arrayList);
            Collections.sort(arrayList, c.a);
            if (SystemClock.uptimeMillis() - this.l >= 300) {
                b(arrayList);
                return;
            }
            this.m.removeMessages(1);
            Handler handler = this.m;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.l + 300);
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        if (!this.g.w() || this.g.t()) {
            dismiss();
        } else if (this.j) {
            if (this.E) {
                if (a(this.F)) {
                    this.u.setVisibility(8);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't set artwork image with recycled bitmap: ");
                    sb.append(this.F);
                    Log.w("MediaRouteCastDialog", sb.toString());
                } else {
                    this.u.setVisibility(0);
                    this.u.setImageBitmap(this.F);
                    this.u.setBackgroundColor(this.G);
                    this.t.setBackgroundDrawable(new BitmapDrawable(this.F));
                }
                b();
            } else {
                this.u.setVisibility(8);
            }
            h();
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (g()) {
            a aVar = this.B;
            if (aVar != null) {
                aVar.cancel(true);
            }
            this.B = new a();
            this.B.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        getWindow().setLayout(-1, -1);
        this.C = null;
        this.D = null;
        e();
        d();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k = true;
        this.d.a(this.f, this.e, 1);
        c();
        a(this.d.c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1839xd.mr_cast_dialog);
        this.r = (ImageButton) findViewById(C1749ud.mr_cast_close_button);
        this.r.setOnClickListener(new C0390c(this));
        this.s = (Button) findViewById(C1749ud.mr_cast_stop_button);
        this.s.setOnClickListener(new C0391d(this));
        this.o = new d();
        this.n = (RecyclerView) findViewById(C1749ud.mr_cast_list);
        this.n.setAdapter(this.o);
        this.n.setLayoutManager(new LinearLayoutManager(this.i));
        this.p = new C0014e();
        this.q = E.a(this.i, 0);
        this.t = (RelativeLayout) findViewById(C1749ud.mr_cast_meta);
        this.u = (ImageView) findViewById(C1749ud.mr_cast_meta_art);
        this.v = (TextView) findViewById(C1749ud.mr_cast_meta_title);
        this.w = (TextView) findViewById(C1749ud.mr_cast_meta_subtitle);
        this.x = this.i.getResources().getString(C1869yd.mr_cast_dialog_title_view_placeholder);
        this.j = true;
        f();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k = false;
        this.d.a((androidx.mediarouter.media.h.a) this.e);
        this.m.removeMessages(1);
        a((Token) null);
    }

    public C0392e(Context context, int i2) {
        Context a2 = E.a(context, i2, false);
        super(a2, E.b(a2));
        this.f = g.a;
        this.h = new ArrayList();
        this.m = new C0389b(this);
        this.i = getContext();
        this.d = h.a(this.i);
        this.e = new c();
        this.g = this.d.e();
        this.z = new b();
        a(this.d.c());
    }

    /* access modifiers changed from: 0000 */
    public void b(List<h.g> list) {
        this.l = SystemClock.uptimeMillis();
        this.h.clear();
        this.h.addAll(list);
        this.o.f();
    }

    public void a(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f.equals(gVar)) {
            this.f = gVar;
            if (this.k) {
                this.d.a((androidx.mediarouter.media.h.a) this.e);
                this.d.a(gVar, this.e, 1);
            }
            c();
        }
    }

    public void a(List<h.g> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!a((h.g) list.get(size))) {
                list.remove(size);
            }
        }
    }

    public boolean a(h.g gVar) {
        return !gVar.t() && gVar.u() && gVar.a(this.f);
    }

    static boolean a(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, int i3) {
        return this.u.getHeight();
    }
}
