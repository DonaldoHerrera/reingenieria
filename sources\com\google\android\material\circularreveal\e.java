package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget */
public interface e extends a {

    /* compiled from: CircularRevealWidget */
    public static class a implements TypeEvaluator<d> {
        public static final TypeEvaluator<d> a = new a();
        private final d b = new d();

        /* renamed from: a */
        public d evaluate(float f, d dVar, d dVar2) {
            this.b.a(Tz.b(dVar.a, dVar2.a, f), Tz.b(dVar.b, dVar2.b, f), Tz.b(dVar.c, dVar2.c, f));
            return this.b;
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class b extends Property<e, d> {
        public static final Property<e, d> a = new b("circularReveal");

        private b(String str) {
            super(d.class, str);
        }

        /* renamed from: a */
        public d get(e eVar) {
            return eVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(e eVar, d dVar) {
            eVar.setRevealInfo(dVar);
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class c extends Property<e, Integer> {
        public static final Property<e, Integer> a = new c("circularRevealScrimColor");

        private c(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(e eVar) {
            return Integer.valueOf(eVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(e eVar, Integer num) {
            eVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class d {
        public float a;
        public float b;
        public float c;

        public void a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        private d() {
        }

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public void a(d dVar) {
            a(dVar.a, dVar.b, dVar.c);
        }

        public boolean a() {
            return this.c == Float.MAX_VALUE;
        }

        public d(d dVar) {
            this(dVar.a, dVar.b, dVar.c);
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(d dVar);
}
