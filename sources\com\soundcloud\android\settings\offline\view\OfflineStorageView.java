package com.soundcloud.android.settings.offline.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.settings.C5988u;

public class OfflineStorageView extends FrameLayout {
    private UsageBarView a;
    private SeekBar b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    /* access modifiers changed from: private */
    public a h;
    /* access modifiers changed from: private */
    public C5988u i;
    private Resources j;
    private final OnSeekBarChangeListener k;

    public interface a {
        void a(long j, boolean z);
    }

    public OfflineStorageView(Context context) {
        this(context, null);
    }

    private double a(long j2) {
        return ((double) j2) / 1.073741824E9d;
    }

    private String d() {
        if (this.i.k()) {
            return this.j.getString(p.unlimited);
        }
        return b(this.i.a());
    }

    private void e() {
        this.b.setProgress(this.i.e());
        this.c.setText(d());
        this.d.setText(c());
        this.e.setText(b(this.i.i()));
        this.f.setText(b(this.i.f()));
        this.g.setText(b(this.i.h()));
    }

    private void f() {
        this.a.a().a(f.usage_bar_other, this.i.i()).a(f.usage_bar_used, this.i.f()).a(f.usage_bar_limit, this.i.d()).a(f.usage_bar_free, this.i.g());
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.a != null) {
            f();
            e();
        }
    }

    private String getFreeGigabytes() {
        return String.format(this.j.getString(p.pref_offline_storage_free_gb), new Object[]{Double.valueOf(a(this.i.b())), Double.valueOf(a(this.i.c()))});
    }

    public void setOfflineUsage(C5988u uVar) {
        this.i = uVar;
        a();
    }

    public void setOnStorageLimitChangedListener(a aVar) {
        this.h = aVar;
    }

    public OfflineStorageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        this.a = (UsageBarView) findViewById(i.offline_storage_usage_bars);
        this.b = (SeekBar) findViewById(i.offline_storage_limit_seek_bar);
        this.c = (TextView) findViewById(i.offline_storage_limit);
        this.d = (TextView) findViewById(i.offline_storage_free);
        this.e = (TextView) findViewById(i.offline_storage_legend_other);
        this.f = (TextView) findViewById(i.offline_storage_legend_used);
        this.g = (TextView) findViewById(i.offline_storage_legend_limit);
    }

    private String c() {
        return this.i.j() ? getFreeGigabytes() : this.j.getString(p.sd_card_unavailable);
    }

    public void a() {
        C5988u uVar = this.i;
        if (uVar != null) {
            uVar.l();
            g();
        }
    }

    public OfflineStorageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = new a(this);
        LayoutInflater.from(context).inflate(l.offline_storage_limit, this);
        this.j = context.getResources();
        b();
        this.b.setOnSeekBarChangeListener(this.k);
        a();
    }

    private String b(long j2) {
        return String.format(this.j.getString(p.pref_offline_storage_limit_gb), new Object[]{Double.valueOf(a(j2))});
    }
}
