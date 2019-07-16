package androidx.transition;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.transition.Transition.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.da reason: case insensitive filesystem */
/* compiled from: TransitionManager */
public class C0444da {
    private static Transition a = new AutoTransition();
    private static ThreadLocal<WeakReference<T<ViewGroup, ArrayList<Transition>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    /* renamed from: androidx.transition.da$a */
    /* compiled from: TransitionManager */
    private static class a implements OnPreDrawListener, OnAttachStateChangeListener {
        Transition a;
        ViewGroup b;

        a(Transition transition, ViewGroup viewGroup) {
            this.a = transition;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!C0444da.c.remove(this.b)) {
                return true;
            }
            T a2 = C0444da.a();
            ArrayList arrayList = (ArrayList) a2.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a2.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.a);
            this.a.a((c) new C0442ca(this, a2));
            this.a.a(this.b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).e(this.b);
                }
            }
            this.a.a(this.b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            C0444da.c.remove(this.b);
            ArrayList arrayList = (ArrayList) C0444da.a().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).e(this.b);
                }
            }
            this.a.a(true);
        }
    }

    static T<ViewGroup, ArrayList<Transition>> a() {
        WeakReference weakReference = (WeakReference) b.get();
        if (weakReference != null) {
            T<ViewGroup, ArrayList<Transition>> t = (T) weakReference.get();
            if (t != null) {
                return t;
            }
        }
        T<ViewGroup, ArrayList<Transition>> t2 = new T<>();
        b.set(new WeakReference(t2));
        return t2;
    }

    private static void b(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            a aVar = new a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).c((View) viewGroup);
            }
        }
        if (transition != null) {
            transition.a(viewGroup, true);
        }
        O a2 = O.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (!c.contains(viewGroup) && C1778vc.B(viewGroup)) {
            c.add(viewGroup);
            if (transition == null) {
                transition = a;
            }
            Transition clone = transition.clone();
            c(viewGroup, clone);
            O.a(viewGroup, null);
            b(viewGroup, clone);
        }
    }
}
