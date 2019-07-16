package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.A;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: MediaRouteChooserDialog */
public class g extends A {
    private final h c;
    private final a d;
    private TextView e;
    private androidx.mediarouter.media.g f;
    private ArrayList<androidx.mediarouter.media.h.g> g;
    private b h;
    private ListView i;
    private boolean j;
    private long k;
    private final Handler l;

    /* compiled from: MediaRouteChooserDialog */
    private final class a extends androidx.mediarouter.media.h.a {
        a() {
        }

        public void a(h hVar, androidx.mediarouter.media.h.g gVar) {
            g.this.b();
        }

        public void b(h hVar, androidx.mediarouter.media.h.g gVar) {
            g.this.b();
        }

        public void d(h hVar, androidx.mediarouter.media.h.g gVar) {
            g.this.b();
        }

        public void e(h hVar, androidx.mediarouter.media.h.g gVar) {
            g.this.dismiss();
        }
    }

    /* compiled from: MediaRouteChooserDialog */
    private final class b extends ArrayAdapter<androidx.mediarouter.media.h.g> implements OnItemClickListener {
        private final LayoutInflater a;
        private final Drawable b;
        private final Drawable c;
        private final Drawable d;
        private final Drawable e;

        public b(Context context, List<androidx.mediarouter.media.h.g> list) {
            super(context, 0, list);
            this.a = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C1659rd.mediaRouteDefaultIconDrawable, C1659rd.mediaRouteTvIconDrawable, C1659rd.mediaRouteSpeakerIconDrawable, C1659rd.mediaRouteSpeakerGroupIconDrawable});
            this.b = obtainStyledAttributes.getDrawable(0);
            this.c = obtainStyledAttributes.getDrawable(1);
            this.d = obtainStyledAttributes.getDrawable(2);
            this.e = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        private Drawable a(androidx.mediarouter.media.h.g gVar) {
            int e2 = gVar.e();
            if (e2 == 1) {
                return this.c;
            }
            if (e2 == 2) {
                return this.d;
            }
            if (gVar instanceof f) {
                return this.e;
            }
            return this.b;
        }

        private Drawable b(androidx.mediarouter.media.h.g gVar) {
            Uri g = gVar.g();
            if (g != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(g), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load ");
                    sb.append(g);
                    Log.w("MediaRouteChooserDialog", sb.toString(), e2);
                }
            }
            return a(gVar);
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.a.inflate(C1839xd.mr_chooser_list_item, viewGroup, false);
            }
            androidx.mediarouter.media.h.g gVar = (androidx.mediarouter.media.h.g) getItem(i);
            TextView textView = (TextView) view.findViewById(C1749ud.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(C1749ud.mr_chooser_route_desc);
            textView.setText(gVar.i());
            String c2 = gVar.c();
            boolean z = true;
            if (!(gVar.b() == 2 || gVar.b() == 1)) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(c2)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(c2);
            }
            view.setEnabled(gVar.u());
            ImageView imageView = (ImageView) view.findViewById(C1749ud.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(b(gVar));
            }
            return view;
        }

        public boolean isEnabled(int i) {
            return ((androidx.mediarouter.media.h.g) getItem(i)).u();
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            androidx.mediarouter.media.h.g gVar = (androidx.mediarouter.media.h.g) getItem(i);
            if (gVar.u()) {
                gVar.x();
                g.this.dismiss();
            }
        }
    }

    /* compiled from: MediaRouteChooserDialog */
    static final class c implements Comparator<androidx.mediarouter.media.h.g> {
        public static final c a = new c();

        c() {
        }

        /* renamed from: a */
        public int compare(androidx.mediarouter.media.h.g gVar, androidx.mediarouter.media.h.g gVar2) {
            return gVar.i().compareToIgnoreCase(gVar2.i());
        }
    }

    public g(Context context) {
        this(context, 0);
    }

    public void a(androidx.mediarouter.media.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f.equals(gVar)) {
            this.f = gVar;
            if (this.j) {
                this.c.a((androidx.mediarouter.media.h.a) this.d);
                this.c.a(gVar, this.d, 1);
            }
            b();
        }
    }

    public void b() {
        if (this.j) {
            ArrayList arrayList = new ArrayList(this.c.d());
            a((List<androidx.mediarouter.media.h.g>) arrayList);
            Collections.sort(arrayList, c.a);
            if (SystemClock.uptimeMillis() - this.k >= 300) {
                b(arrayList);
                return;
            }
            this.l.removeMessages(1);
            Handler handler = this.l;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.k + 300);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        getWindow().setLayout(C.a(getContext()), -2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = true;
        this.c.a(this.f, this.d, 1);
        b();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1839xd.mr_chooser_dialog);
        this.g = new ArrayList<>();
        this.h = new b(getContext(), this.g);
        this.i = (ListView) findViewById(C1749ud.mr_chooser_list);
        this.i.setAdapter(this.h);
        this.i.setOnItemClickListener(this.h);
        this.i.setEmptyView(findViewById(16908292));
        this.e = (TextView) findViewById(C1749ud.mr_chooser_title);
        c();
    }

    public void onDetachedFromWindow() {
        this.j = false;
        this.c.a((androidx.mediarouter.media.h.a) this.d);
        this.l.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public g(Context context, int i2) {
        Context a2 = E.a(context, i2, false);
        super(a2, E.b(a2));
        this.f = androidx.mediarouter.media.g.a;
        this.l = new f(this);
        this.c = h.a(getContext());
        this.d = new a();
    }

    public void setTitle(int i2) {
        this.e.setText(i2);
    }

    public void a(List<androidx.mediarouter.media.h.g> list) {
        int size = list.size();
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                if (!a((androidx.mediarouter.media.h.g) list.get(i2))) {
                    list.remove(i2);
                }
                size = i2;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(List<androidx.mediarouter.media.h.g> list) {
        this.k = SystemClock.uptimeMillis();
        this.g.clear();
        this.g.addAll(list);
        this.h.notifyDataSetChanged();
    }

    public boolean a(androidx.mediarouter.media.h.g gVar) {
        return !gVar.t() && gVar.u() && gVar.a(this.f);
    }
}
