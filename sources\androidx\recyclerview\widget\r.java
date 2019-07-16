package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator */
public class r extends ha {
    private static TimeInterpolator h;
    private ArrayList<ViewHolder> i = new ArrayList<>();
    private ArrayList<ViewHolder> j = new ArrayList<>();
    private ArrayList<b> k = new ArrayList<>();
    private ArrayList<a> l = new ArrayList<>();
    ArrayList<ArrayList<ViewHolder>> m = new ArrayList<>();
    ArrayList<ArrayList<b>> n = new ArrayList<>();
    ArrayList<ArrayList<a>> o = new ArrayList<>();
    ArrayList<ViewHolder> p = new ArrayList<>();
    ArrayList<ViewHolder> q = new ArrayList<>();
    ArrayList<ViewHolder> r = new ArrayList<>();
    ArrayList<ViewHolder> s = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    private static class a {
        public ViewHolder a;
        public ViewHolder b;
        public int c;
        public int d;
        public int e;
        public int f;

        private a(ViewHolder viewHolder, ViewHolder viewHolder2) {
            this.a = viewHolder;
            this.b = viewHolder2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            sb.append(this.f);
            sb.append('}');
            return sb.toString();
        }

        a(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class b {
        public ViewHolder a;
        public int b;
        public int c;
        public int d;
        public int e;

        b(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.a = viewHolder;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void u(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.r.add(viewHolder);
        animate.setDuration(f()).alpha(0.0f).setListener(new C0419m(this, viewHolder, animate, view)).start();
    }

    private void v(ViewHolder viewHolder) {
        if (h == null) {
            h = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(h);
        d(viewHolder);
    }

    public boolean a(ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
        v(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            j(viewHolder);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList<b> arrayList = this.k;
        b bVar = new b(viewHolder, translationX, translationY, i4, i5);
        arrayList.add(bVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void b(ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.q.add(viewHolder);
        ViewPropertyAnimator duration = animate.setDuration(e());
        C0421o oVar = new C0421o(this, viewHolder, i6, view, i7, animate);
        duration.setListener(oVar).start();
    }

    public void d(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((b) this.k.get(size)).a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                j(viewHolder);
                this.k.remove(size);
            }
        }
        a((List<a>) this.l, viewHolder);
        if (this.i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            l(viewHolder);
        }
        if (this.j.remove(viewHolder)) {
            view.setAlpha(1.0f);
            h(viewHolder);
        }
        for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.o.get(size2);
            a((List<a>) arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.o.remove(size2);
            }
        }
        for (int size3 = this.n.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    j(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.m.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                h(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.m.remove(size5);
                }
            }
        }
        this.r.remove(viewHolder);
        this.p.remove(viewHolder);
        this.s.remove(viewHolder);
        this.q.remove(viewHolder);
        j();
    }

    public boolean f(ViewHolder viewHolder) {
        v(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.j.add(viewHolder);
        return true;
    }

    public boolean g(ViewHolder viewHolder) {
        v(viewHolder);
        this.i.add(viewHolder);
        return true;
    }

    public void i() {
        boolean z = !this.i.isEmpty();
        boolean z2 = !this.k.isEmpty();
        boolean z3 = !this.l.isEmpty();
        boolean z4 = !this.j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                u((ViewHolder) it.next());
            }
            this.i.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.k);
                this.n.add(arrayList);
                this.k.clear();
                C0416j jVar = new C0416j(this, arrayList);
                if (z) {
                    C1778vc.a(((b) arrayList.get(0)).a.itemView, (Runnable) jVar, f());
                } else {
                    jVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.l);
                this.o.add(arrayList2);
                this.l.clear();
                C0417k kVar = new C0417k(this, arrayList2);
                if (z) {
                    C1778vc.a(((a) arrayList2.get(0)).a.itemView, (Runnable) kVar, f());
                } else {
                    kVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.j);
                this.m.add(arrayList3);
                this.j.clear();
                C0418l lVar = new C0418l(this, arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long f = z ? f() : 0;
                    long e = z2 ? e() : 0;
                    if (z3) {
                        j2 = d();
                    }
                    C1778vc.a(((ViewHolder) arrayList3.get(0)).itemView, (Runnable) lVar, f + Math.max(e, j2));
                } else {
                    lVar.run();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        if (!g()) {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void t(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.p.add(viewHolder);
        animate.alpha(1.0f).setDuration(c()).setListener(new C0420n(this, viewHolder, view, animate)).start();
    }

    public boolean g() {
        return !this.j.isEmpty() || !this.l.isEmpty() || !this.k.isEmpty() || !this.i.isEmpty() || !this.q.isEmpty() || !this.r.isEmpty() || !this.p.isEmpty() || !this.s.isEmpty() || !this.n.isEmpty() || !this.m.isEmpty() || !this.o.isEmpty();
    }

    private void b(a aVar) {
        ViewHolder viewHolder = aVar.a;
        if (viewHolder != null) {
            a(aVar, viewHolder);
        }
        ViewHolder viewHolder2 = aVar.b;
        if (viewHolder2 != null) {
            a(aVar, viewHolder2);
        }
    }

    public boolean a(ViewHolder viewHolder, ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        if (viewHolder == viewHolder2) {
            return a(viewHolder, i2, i3, i4, i5);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        v(viewHolder);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            v(viewHolder2);
            viewHolder2.itemView.setTranslationX((float) (-i6));
            viewHolder2.itemView.setTranslationY((float) (-i7));
            viewHolder2.itemView.setAlpha(0.0f);
        }
        ArrayList<a> arrayList = this.l;
        a aVar = new a(viewHolder, viewHolder2, i2, i3, i4, i5);
        arrayList.add(aVar);
        return true;
    }

    public void b() {
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = (b) this.k.get(size);
            View view = bVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            j(bVar.a);
            this.k.remove(size);
        }
        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
            l((ViewHolder) this.i.get(size2));
            this.i.remove(size2);
        }
        int size3 = this.j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ViewHolder viewHolder = (ViewHolder) this.j.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            h(viewHolder);
            this.j.remove(size3);
        }
        for (int size4 = this.l.size() - 1; size4 >= 0; size4--) {
            b((a) this.l.get(size4));
        }
        this.l.clear();
        if (g()) {
            for (int size5 = this.n.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = (b) arrayList.get(size6);
                    View view2 = bVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    j(bVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.m.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    ViewHolder viewHolder2 = (ViewHolder) arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    h(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.o.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    b((a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.o.remove(arrayList3);
                    }
                }
            }
            a((List<ViewHolder>) this.r);
            a((List<ViewHolder>) this.q);
            a((List<ViewHolder>) this.p);
            a((List<ViewHolder>) this.s);
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        View view;
        ViewHolder viewHolder = aVar.a;
        View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        ViewHolder viewHolder2 = aVar.b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(d());
            this.s.add(aVar.a);
            duration.translationX((float) (aVar.e - aVar.c));
            duration.translationY((float) (aVar.f - aVar.d));
            duration.alpha(0.0f).setListener(new C0422p(this, aVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.s.add(aVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(d()).alpha(1.0f).setListener(new C0423q(this, aVar, animate, view2)).start();
        }
    }

    private void a(List<a> list, ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = (a) list.get(size);
            if (a(aVar, viewHolder) && aVar.a == null && aVar.b == null) {
                list.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, ViewHolder viewHolder) {
        boolean z = false;
        if (aVar.b == viewHolder) {
            aVar.b = null;
        } else if (aVar.a != viewHolder) {
            return false;
        } else {
            aVar.a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        a(viewHolder, z);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(List<ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((ViewHolder) list.get(size)).itemView.animate().cancel();
        }
    }

    public boolean a(ViewHolder viewHolder, List<Object> list) {
        return !list.isEmpty() || super.a(viewHolder, list);
    }
}
