package com.soundcloud.android.listeners.dev.eventlogger;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: DevTrackingRecordAdapter */
class m extends androidx.recyclerview.widget.RecyclerView.a<b> {
    private static final SimpleDateFormat c = new SimpleDateFormat("HH:mm:ss a", Locale.US);
    private W<C2110JM> d = new W<>();
    private C4928GKa<a> e = C4928GKa.a();

    /* compiled from: DevTrackingRecordAdapter */
    interface a {
        void a(C2110JM jm);
    }

    /* compiled from: DevTrackingRecordAdapter */
    static class b extends ViewHolder {
        final TextView a;
        final TextView b;

        b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(i.timestamp);
            this.b = (TextView) view.findViewById(i.data);
        }
    }

    m() {
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        C2110JM jm = (C2110JM) this.d.a(i);
        bVar.a.setText(c.format(new Date(jm.d())));
        bVar.b.setText(jm.b());
        this.e.a((C7733yKa<? super T>) new c<Object>(bVar, jm));
    }

    public b b(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(l.dev_tracking_record, viewGroup, false));
    }

    public int b() {
        return this.d.b();
    }

    public void a(a aVar) {
        this.e = C4928GKa.c(aVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(W<C2110JM> w) {
        this.d = w;
        e();
    }
}
