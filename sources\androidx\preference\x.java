package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceGroup.b;
import androidx.recyclerview.widget.C0425t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PreferenceGroupAdapter */
public class x extends androidx.recyclerview.widget.RecyclerView.a<C> implements a, b {
    private PreferenceGroup c;
    private List<Preference> d;
    private List<Preference> e;
    private List<a> f;
    private a g;
    private Handler h;
    private C0394b i;
    private Runnable j;

    /* compiled from: PreferenceGroupAdapter */
    private static class a {
        int a;
        int b;
        String c;

        a() {
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c)) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return ((((527 + this.a) * 31) + this.b) * 31) + this.c.hashCode();
        }

        a(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }
    }

    public x(PreferenceGroup preferenceGroup) {
        this(preferenceGroup, new Handler());
    }

    private void a(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.ha();
        int ea = preferenceGroup.ea();
        for (int i2 = 0; i2 < ea; i2++) {
            Preference g2 = preferenceGroup.g(i2);
            list.add(g2);
            d(g2);
            if (g2 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) g2;
                if (preferenceGroup2.fa()) {
                    a(list, preferenceGroup2);
                }
            }
            g2.a((a) this);
        }
    }

    private void d(Preference preference) {
        a a2 = a(preference, (a) null);
        if (!this.f.contains(a2)) {
            this.f.add(a2);
        }
    }

    public void c(Preference preference) {
        this.h.removeCallbacks(this.j);
        this.h.post(this.j);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        for (Preference a2 : this.e) {
            a2.a((a) null);
        }
        ArrayList<Preference> arrayList = new ArrayList<>(this.e.size());
        a((List<Preference>) arrayList, this.c);
        List<Preference> a3 = this.i.a(this.c);
        List<Preference> list = this.d;
        this.d = a3;
        this.e = arrayList;
        z x = this.c.x();
        if (x == null || x.e() == null) {
            e();
        } else {
            C0425t.a(new w(this, list, a3, x.e())).a((androidx.recyclerview.widget.RecyclerView.a) this);
        }
        for (Preference a4 : arrayList) {
            a4.a();
        }
    }

    private x(PreferenceGroup preferenceGroup, Handler handler) {
        this.g = new a();
        this.j = new v(this);
        this.c = preferenceGroup;
        this.h = handler;
        this.i = new C0394b(preferenceGroup, this);
        this.c.a((a) this);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.c;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            a(((PreferenceScreen) preferenceGroup2).ia());
        } else {
            a(true);
        }
        f();
    }

    public int b() {
        return this.d.size();
    }

    public void b(Preference preference) {
        int indexOf = this.d.indexOf(preference);
        if (indexOf != -1) {
            a(indexOf, (Object) preference);
        }
    }

    public int b(int i2) {
        this.g = a(f(i2), this.g);
        int indexOf = this.f.indexOf(this.g);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f.size();
        this.f.add(new a(this.g));
        return size;
    }

    private a a(Preference preference, a aVar) {
        if (aVar == null) {
            aVar = new a();
        }
        aVar.c = preference.getClass().getName();
        aVar.a = preference.u();
        aVar.b = preference.L();
        return aVar;
    }

    public C b(ViewGroup viewGroup, int i2) {
        a aVar = (a) this.f.get(i2);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(null, J.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(J.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = androidx.core.content.a.c(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(aVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C1778vc.a(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i3 = aVar.b;
            if (i3 != 0) {
                from.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C(inflate);
    }

    public long a(int i2) {
        if (!d()) {
            return -1;
        }
        return f(i2).getId();
    }

    /* renamed from: a */
    public void b(C c2, int i2) {
        f(i2).a(c2);
    }

    public Preference f(int i2) {
        if (i2 < 0 || i2 >= b()) {
            return null;
        }
        return (Preference) this.d.get(i2);
    }

    public int a(String str) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, ((Preference) this.d.get(i2)).g())) {
                return i2;
            }
        }
        return -1;
    }

    public int a(Preference preference) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference2 = (Preference) this.d.get(i2);
            if (preference2 != null && preference2.equals(preference)) {
                return i2;
            }
        }
        return -1;
    }
}
