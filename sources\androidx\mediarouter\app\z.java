package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.A;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaRouteDevicePickerDialog */
public class z extends A {
    private final h c;
    private final a d;
    Context e;
    private g f;
    List<h.g> g;
    private ImageButton h;
    private b i;
    private RecyclerView j;
    private boolean k;
    private long l;
    private long m;
    private final Handler n;

    /* compiled from: MediaRouteDevicePickerDialog */
    private final class a extends androidx.mediarouter.media.h.a {
        a() {
        }

        public void a(h hVar, h.g gVar) {
            z.this.b();
        }

        public void b(h hVar, h.g gVar) {
            z.this.b();
        }

        public void d(h hVar, h.g gVar) {
            z.this.b();
        }

        public void e(h hVar, h.g gVar) {
            z.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDevicePickerDialog */
    private final class b extends androidx.recyclerview.widget.RecyclerView.a<ViewHolder> {
        ArrayList<C0015b> c;
        private final LayoutInflater d;
        private final Drawable e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;

        /* compiled from: MediaRouteDevicePickerDialog */
        private class a extends ViewHolder {
            TextView a;

            a(View view) {
                super(view);
                this.a = (TextView) view.findViewById(C1749ud.mr_dialog_header_name);
            }

            public void a(C0015b bVar) {
                this.a.setText(bVar.a().toString());
            }
        }

        /* renamed from: androidx.mediarouter.app.z$b$b reason: collision with other inner class name */
        /* compiled from: MediaRouteDevicePickerDialog */
        private class C0015b {
            private final Object a;
            private final int b;

            C0015b(Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else if (obj instanceof h.g) {
                    this.b = 2;
                } else {
                    this.b = 0;
                    Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                }
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        /* compiled from: MediaRouteDevicePickerDialog */
        private class c extends ViewHolder {
            View a;
            TextView b;
            ImageView c;

            c(View view) {
                super(view);
                this.a = view;
                this.b = (TextView) view.findViewById(C1749ud.mr_picker_route_name);
                this.c = (ImageView) view.findViewById(C1749ud.mr_picker_route_icon);
            }

            public void a(C0015b bVar) {
                h.g gVar = (h.g) bVar.a();
                this.a.setOnClickListener(new A(this, gVar));
                this.b.setText(gVar.i());
                this.c.setImageDrawable(b.this.a(gVar));
            }
        }

        b() {
            this.d = LayoutInflater.from(z.this.e);
            this.e = E.d(z.this.e);
            this.f = E.h(z.this.e);
            this.g = E.f(z.this.e);
            this.h = E.g(z.this.e);
            f();
        }

        /* access modifiers changed from: 0000 */
        public Drawable a(h.g gVar) {
            Uri g2 = gVar.g();
            if (g2 != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(z.this.e.getContentResolver().openInputStream(g2), null);
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
            return b(gVar);
        }

        public ViewHolder b(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new a(this.d.inflate(C1839xd.mr_dialog_header_item, viewGroup, false));
            }
            if (i2 == 2) {
                return new c(this.d.inflate(C1839xd.mr_picker_route_item, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void f() {
            this.c = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (int size = z.this.g.size() - 1; size >= 0; size--) {
                h.g gVar = (h.g) z.this.g.get(size);
                if (gVar instanceof f) {
                    arrayList.add(gVar);
                    z.this.g.remove(size);
                }
            }
            this.c.add(new C0015b(z.this.e.getString(C1869yd.mr_dialog_device_header)));
            for (h.g bVar : z.this.g) {
                this.c.add(new C0015b(bVar));
            }
            this.c.add(new C0015b(z.this.e.getString(C1869yd.mr_dialog_route_header)));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(new C0015b((h.g) it.next()));
            }
            e();
        }

        public void b(ViewHolder viewHolder, int i2) {
            int b = b(i2);
            C0015b f2 = f(i2);
            if (b == 1) {
                ((a) viewHolder).a(f2);
            } else if (b != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((c) viewHolder).a(f2);
            }
        }

        public int b() {
            return this.c.size();
        }

        private Drawable b(h.g gVar) {
            int e2 = gVar.e();
            if (e2 == 1) {
                return this.f;
            }
            if (e2 == 2) {
                return this.g;
            }
            if (gVar instanceof f) {
                return this.h;
            }
            return this.e;
        }

        public C0015b f(int i2) {
            return (C0015b) this.c.get(i2);
        }

        public int b(int i2) {
            return ((C0015b) this.c.get(i2)).b();
        }
    }

    /* compiled from: MediaRouteDevicePickerDialog */
    static final class c implements Comparator<h.g> {
        public static final c a = new c();

        c() {
        }

        /* renamed from: a */
        public int compare(h.g gVar, h.g gVar2) {
            return gVar.i().compareToIgnoreCase(gVar2.i());
        }
    }

    public z(Context context) {
        this(context, 0);
    }

    public void a(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f.equals(gVar)) {
            this.f = gVar;
            if (this.k) {
                this.c.a((androidx.mediarouter.media.h.a) this.d);
                this.c.a(gVar, this.d, 1);
            }
            b();
        }
    }

    public void b() {
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.c.d());
            a((List<h.g>) arrayList);
            Collections.sort(arrayList, c.a);
            if (SystemClock.uptimeMillis() - this.m >= this.l) {
                b(arrayList);
                return;
            }
            this.n.removeMessages(1);
            Handler handler = this.n;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.m + this.l);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        getWindow().setLayout(-1, -1);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k = true;
        this.c.a(this.f, this.d, 1);
        b();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1839xd.mr_picker_dialog);
        this.g = new ArrayList();
        this.h = (ImageButton) findViewById(C1749ud.mr_picker_close_button);
        this.h.setOnClickListener(new y(this));
        this.i = new b();
        this.j = (RecyclerView) findViewById(C1749ud.mr_picker_list);
        this.j.setAdapter(this.i);
        this.j.setLayoutManager(new LinearLayoutManager(this.e));
        c();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k = false;
        this.c.a((androidx.mediarouter.media.h.a) this.d);
        this.n.removeMessages(1);
    }

    public z(Context context, int i2) {
        Context a2 = E.a(context, i2, false);
        super(a2, E.b(a2));
        this.f = g.a;
        this.n = new x(this);
        Context context2 = getContext();
        this.c = h.a(context2);
        this.d = new a();
        this.e = context2;
        this.l = (long) context2.getResources().getInteger(C1779vd.mr_update_routes_delay_ms);
    }

    public void a(List<h.g> list) {
        int size = list.size();
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                if (!a((h.g) list.get(i2))) {
                    list.remove(i2);
                }
                size = i2;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(List<h.g> list) {
        this.m = SystemClock.uptimeMillis();
        this.g.clear();
        this.g.addAll(list);
        this.i.f();
    }

    public boolean a(h.g gVar) {
        return !gVar.t() && gVar.u() && gVar.a(this.f);
    }
}
