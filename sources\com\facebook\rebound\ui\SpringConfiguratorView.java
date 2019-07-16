package com.facebook.rebound.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SpringConfiguratorView extends FrameLayout {
    /* access modifiers changed from: private */
    public static final DecimalFormat a = new DecimalFormat("#.#");
    private final d b;
    /* access modifiers changed from: private */
    public final List<C1608pl> c;
    private final C1577ol d;
    /* access modifiers changed from: private */
    public final float e;
    /* access modifiers changed from: private */
    public final float f;
    private final C1638ql g;
    /* access modifiers changed from: private */
    public final int h;
    /* access modifiers changed from: private */
    public SeekBar i;
    /* access modifiers changed from: private */
    public SeekBar j;
    private Spinner k;
    /* access modifiers changed from: private */
    public TextView l;
    /* access modifiers changed from: private */
    public TextView m;
    /* access modifiers changed from: private */
    public C1608pl n;

    private class a implements OnTouchListener {
        private a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                SpringConfiguratorView.this.c();
            }
            return true;
        }
    }

    private class b implements C1667rl {
        private b() {
        }

        public void a(C1577ol olVar) {
            float b = (float) olVar.b();
            float d = SpringConfiguratorView.this.f;
            SpringConfiguratorView.this.setTranslationY((b * (SpringConfiguratorView.this.e - d)) + d);
        }

        public void b(C1577ol olVar) {
        }

        public void c(C1577ol olVar) {
        }

        public void d(C1577ol olVar) {
        }
    }

    private class c implements OnSeekBarChangeListener {
        private c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (seekBar == SpringConfiguratorView.this.i) {
                float f = ((((float) i) * 200.0f) / 100000.0f) + 0.0f;
                double d = (double) f;
                SpringConfiguratorView.this.n.c = C1484ll.d(d);
                String format = SpringConfiguratorView.a.format(d);
                TextView j = SpringConfiguratorView.this.m;
                StringBuilder sb = new StringBuilder();
                sb.append("T:");
                sb.append(format);
                j.setText(sb.toString());
            }
            if (seekBar == SpringConfiguratorView.this.j) {
                float f2 = ((((float) i) * 50.0f) / 100000.0f) + 0.0f;
                double d2 = (double) f2;
                SpringConfiguratorView.this.n.b = C1484ll.a(d2);
                String format2 = SpringConfiguratorView.a.format(d2);
                TextView b = SpringConfiguratorView.this.l;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("F:");
                sb2.append(format2);
                b.setText(sb2.toString());
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    private class d extends BaseAdapter {
        private final Context a;
        private final List<String> b = new ArrayList();

        public d(Context context) {
            this.a = context;
        }

        public void a(String str) {
            this.b.add(str);
            notifyDataSetChanged();
        }

        public int getCount() {
            return this.b.size();
        }

        public Object getItem(int i) {
            return this.b.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = new TextView(this.a);
                textView.setLayoutParams(new LayoutParams(-1, -1));
                int a2 = b.a(12.0f, SpringConfiguratorView.this.getResources());
                textView.setPadding(a2, a2, a2, a2);
                textView.setTextColor(SpringConfiguratorView.this.h);
            } else {
                textView = (TextView) view;
            }
            textView.setText((CharSequence) this.b.get(i));
            return textView;
        }

        public void a() {
            this.b.clear();
            notifyDataSetChanged();
        }
    }

    private class e implements OnItemSelectedListener {
        private e() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SpringConfiguratorView springConfiguratorView = SpringConfiguratorView.this;
            springConfiguratorView.n = (C1608pl) springConfiguratorView.c.get(i);
            SpringConfiguratorView springConfiguratorView2 = SpringConfiguratorView.this;
            springConfiguratorView2.a(springConfiguratorView2.n);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new ArrayList();
        this.h = Color.argb(255, 225, 225, 225);
        C1727tl c2 = C1727tl.c();
        this.g = C1638ql.b();
        this.b = new d(context);
        Resources resources = getResources();
        this.f = (float) b.a(40.0f, resources);
        this.e = (float) b.a(280.0f, resources);
        this.d = c2.a();
        b bVar = new b();
        C1577ol olVar = this.d;
        olVar.b(1.0d);
        olVar.c(1.0d);
        olVar.a((C1667rl) bVar);
        addView(a(context));
        c cVar = new c();
        this.i.setMax(100000);
        this.i.setOnSeekBarChangeListener(cVar);
        this.j.setMax(100000);
        this.j.setOnSeekBarChangeListener(cVar);
        this.k.setAdapter(this.b);
        this.k.setOnItemSelectedListener(new e());
        b();
        setTranslationY(this.e);
    }

    /* access modifiers changed from: private */
    public void c() {
        double c2 = this.d.c();
        C1577ol olVar = this.d;
        double d2 = 1.0d;
        if (c2 == 1.0d) {
            d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        olVar.c(d2);
    }

    public void b() {
        Map a2 = this.g.a();
        this.b.a();
        this.c.clear();
        for (Entry entry : a2.entrySet()) {
            if (entry.getKey() != C1608pl.a) {
                this.c.add(entry.getKey());
                this.b.a((String) entry.getValue());
            }
        }
        this.c.add(C1608pl.a);
        this.b.a((String) a2.get(C1608pl.a));
        this.b.notifyDataSetChanged();
        if (this.c.size() > 0) {
            this.k.setSelection(0);
        }
    }

    private View a(Context context) {
        Resources resources = getResources();
        int a2 = b.a(5.0f, resources);
        int a3 = b.a(10.0f, resources);
        int a4 = b.a(20.0f, resources);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, a2, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(b.a(-1, b.a(300.0f, resources)));
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams a5 = b.a();
        a5.setMargins(0, a4, 0, 0);
        frameLayout2.setLayoutParams(a5);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.k = new Spinner(context, 0);
        FrameLayout.LayoutParams b2 = b.b();
        b2.gravity = 48;
        b2.setMargins(a3, a3, a3, 0);
        this.k.setLayoutParams(b2);
        frameLayout2.addView(this.k);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams b3 = b.b();
        b3.setMargins(0, 0, 0, b.a(80.0f, resources));
        b3.gravity = 80;
        linearLayout.setLayoutParams(b3);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams b4 = b.b();
        b4.setMargins(a3, a3, a3, a4);
        linearLayout2.setPadding(a3, a3, a3, a3);
        linearLayout2.setLayoutParams(b4);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        this.i = new SeekBar(context);
        this.i.setLayoutParams(layoutParams);
        linearLayout2.addView(this.i);
        this.m = new TextView(getContext());
        this.m.setTextColor(this.h);
        FrameLayout.LayoutParams a6 = b.a(b.a(50.0f, resources), -1);
        this.m.setGravity(19);
        this.m.setLayoutParams(a6);
        this.m.setMaxLines(1);
        linearLayout2.addView(this.m);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams b5 = b.b();
        b5.setMargins(a3, a3, a3, a4);
        linearLayout3.setPadding(a3, a3, a3, a3);
        linearLayout3.setLayoutParams(b5);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3);
        this.j = new SeekBar(context);
        this.j.setLayoutParams(layoutParams);
        linearLayout3.addView(this.j);
        this.l = new TextView(getContext());
        this.l.setTextColor(this.h);
        FrameLayout.LayoutParams a7 = b.a(b.a(50.0f, resources), -1);
        this.l.setGravity(19);
        this.l.setLayoutParams(a7);
        this.l.setMaxLines(1);
        linearLayout3.addView(this.l);
        View view = new View(context);
        FrameLayout.LayoutParams a8 = b.a(b.a(60.0f, resources), b.a(40.0f, resources));
        a8.gravity = 49;
        view.setLayoutParams(a8);
        view.setOnTouchListener(new a());
        view.setBackgroundColor(Color.argb(255, 0, 164, 209));
        frameLayout.addView(view);
        return frameLayout;
    }

    /* access modifiers changed from: private */
    public void a(C1608pl plVar) {
        int round = Math.round(((((float) C1484ll.c(plVar.c)) - 0.0f) * 100000.0f) / 200.0f);
        int round2 = Math.round(((((float) C1484ll.b(plVar.b)) - 0.0f) * 100000.0f) / 50.0f);
        this.i.setProgress(round);
        this.j.setProgress(round2);
    }
}
