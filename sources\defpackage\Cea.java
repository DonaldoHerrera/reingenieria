package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.soundcloud.android.foundation.events.J;

/* renamed from: Cea reason: default package */
/* compiled from: AutoValue_IntroductoryOverlay */
final class Cea extends Dea {
    private final String a;
    private final View b;
    private final int c;
    private final int d;
    private final C4928GKa<Drawable> e;
    private final C4928GKa<J> f;

    /* renamed from: Cea$a */
    /* compiled from: AutoValue_IntroductoryOverlay */
    static final class a extends defpackage.Dea.a {
        private String a;
        private View b;
        private Integer c;
        private Integer d;
        private C4928GKa<Drawable> e;
        private C4928GKa<J> f;

        a() {
        }

        public defpackage.Dea.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null overlayKey");
        }

        public defpackage.Dea.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public defpackage.Dea.a b(C4928GKa<Drawable> gKa) {
            if (gKa != null) {
                this.e = gKa;
                return this;
            }
            throw new NullPointerException("Null icon");
        }

        public defpackage.Dea.a a(View view) {
            if (view != null) {
                this.b = view;
                return this;
            }
            throw new NullPointerException("Null targetView");
        }

        public defpackage.Dea.a a(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public defpackage.Dea.a a(C4928GKa<J> gKa) {
            if (gKa != null) {
                this.f = gKa;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        public Dea a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" overlayKey");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" targetView");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" title");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" description");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" icon");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" event");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                Cea cea = new Cea(this.a, this.b, this.c.intValue(), this.d.intValue(), this.e, this.f);
                return cea;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    public int b() {
        return this.d;
    }

    public C4928GKa<J> c() {
        return this.f;
    }

    public C4928GKa<Drawable> d() {
        return this.e;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dea)) {
            return false;
        }
        Dea dea = (Dea) obj;
        if (!this.a.equals(dea.e()) || !this.b.equals(dea.f()) || this.c != dea.g() || this.d != dea.b() || !this.e.equals(dea.d()) || !this.f.equals(dea.c())) {
            z = false;
        }
        return z;
    }

    public View f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntroductoryOverlay{overlayKey=");
        sb.append(this.a);
        sb.append(", targetView=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", icon=");
        sb.append(this.e);
        sb.append(", event=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    private Cea(String str, View view, int i, int i2, C4928GKa<Drawable> gKa, C4928GKa<J> gKa2) {
        this.a = str;
        this.b = view;
        this.c = i;
        this.d = i2;
        this.e = gKa;
        this.f = gKa2;
    }
}
