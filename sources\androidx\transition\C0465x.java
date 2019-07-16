package androidx.transition;

import androidx.transition.Transition.c;
import java.util.ArrayList;

/* renamed from: androidx.transition.x reason: case insensitive filesystem */
/* compiled from: FragmentTransitionSupport */
class C0465x implements c {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ Object e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ C0467z g;

    C0465x(C0467z zVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = zVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    public void a(Transition transition) {
    }

    public void b(Transition transition) {
        Object obj = this.a;
        if (obj != null) {
            this.g.a(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.g.a(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            this.g.a(obj3, this.f, null);
        }
    }

    public void c(Transition transition) {
    }

    public void d(Transition transition) {
    }
}
