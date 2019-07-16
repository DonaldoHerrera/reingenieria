package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.O;
import androidx.transition.Transition.b;
import androidx.transition.Transition.c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.transition.z reason: case insensitive filesystem */
/* compiled from: FragmentTransitionSupport */
public class C0467z extends O {
    public boolean a(Object obj) {
        return obj instanceof Transition;
    }

    public Object b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.a((Transition) obj);
        return transitionSet;
    }

    public void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int D = transitionSet.D();
                while (i < D) {
                    a((Object) transitionSet.a(i), arrayList);
                    i++;
                }
            } else if (!a(transition) && O.a(transition.z())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.a((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public void b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List z = transitionSet.z();
        z.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O.a(z, (View) arrayList.get(i));
        }
        z.add(view);
        arrayList.add(view);
        a((Object) transitionSet, arrayList);
    }

    public void c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            a(view, rect);
            transition.a((b) new C0463v(this, rect));
        }
    }

    public Object b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.a((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.a((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.a((Transition) obj3);
        }
        return transitionSet;
    }

    private static boolean a(Transition transition) {
        return !O.a(transition.r()) || !O.a(transition.s()) || !O.a(transition.t());
    }

    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.z().clear();
            transitionSet.z().addAll(arrayList2);
            a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).a((c) new C0464w(this, view, arrayList));
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().a(transition).a(transition2).b(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.a(transition);
        }
        transitionSet.a(transition3);
        return transitionSet;
    }

    public void b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).d(view);
        }
    }

    public void a(ViewGroup viewGroup, Object obj) {
        C0444da.a(viewGroup, (Transition) obj);
    }

    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C0465x xVar = new C0465x(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.a((c) xVar);
    }

    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int D = transitionSet.D();
            while (i2 < D) {
                a((Object) transitionSet.a(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!a(transition)) {
            List z = transition.z();
            if (z.size() == arrayList.size() && z.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.a((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.d((View) arrayList.get(size));
                }
            }
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).a(view);
        }
    }

    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).a((b) new C0466y(this, rect));
        }
    }
}
