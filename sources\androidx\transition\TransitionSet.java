package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.b;
import androidx.transition.Transition.c;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {
    private ArrayList<Transition> K = new ArrayList<>();
    private boolean L = true;
    int M;
    boolean N = false;
    private int O = 0;

    static class a extends C0440ba {
        TransitionSet a;

        a(TransitionSet transitionSet) {
            this.a = transitionSet;
        }

        public void b(Transition transition) {
            TransitionSet transitionSet = this.a;
            if (!transitionSet.N) {
                transitionSet.C();
                this.a.N = true;
            }
        }

        public void d(Transition transition) {
            TransitionSet transitionSet = this.a;
            transitionSet.M--;
            if (transitionSet.M == 0) {
                transitionSet.N = false;
                transitionSet.i();
            }
            transition.b((c) this);
        }
    }

    public TransitionSet() {
    }

    private void E() {
        a aVar = new a(this);
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a((c) aVar);
        }
        this.M = this.K.size();
    }

    /* access modifiers changed from: protected */
    public void B() {
        if (this.K.isEmpty()) {
            C();
            i();
            return;
        }
        E();
        if (!this.L) {
            for (int i = 1; i < this.K.size(); i++) {
                ((Transition) this.K.get(i - 1)).a((c) new C0448fa(this, (Transition) this.K.get(i)));
            }
            Transition transition = (Transition) this.K.get(0);
            if (transition != null) {
                transition.B();
            }
        } else {
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).B();
            }
        }
    }

    public int D() {
        return this.K.size();
    }

    public void c(ha haVar) {
        if (b(haVar.b)) {
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.b(haVar.b)) {
                    transition.c(haVar);
                    haVar.c.add(transition);
                }
            }
        }
    }

    public void e(View view) {
        super.e(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.K.get(i)).e(view);
        }
    }

    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            transitionSet.a(((Transition) this.K.get(i)).clone());
        }
        return transitionSet;
    }

    public TransitionSet d(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            ((Transition) this.K.get(i)).d(view);
        }
        super.d(view);
        return this;
    }

    public TransitionSet b(int i) {
        if (i == 0) {
            this.L = true;
        } else if (i == 1) {
            this.L = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    public TransitionSet a(Transition transition) {
        this.K.add(transition);
        transition.u = this;
        long j = this.f;
        if (j >= 0) {
            transition.a(j);
        }
        if ((this.O & 1) != 0) {
            transition.a(m());
        }
        if ((this.O & 2) != 0) {
            transition.a(p());
        }
        if ((this.O & 4) != 0) {
            transition.a(o());
        }
        if ((this.O & 8) != 0) {
            transition.a(l());
        }
        return this;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.i);
        b(C0286Za.b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    public TransitionSet b(long j) {
        super.b(j);
        return this;
    }

    public void c(View view) {
        super.c(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.K.get(i)).c(view);
        }
    }

    public TransitionSet b(c cVar) {
        super.b(cVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void b(ha haVar) {
        super.b(haVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.K.get(i)).b(haVar);
        }
    }

    public Transition a(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return (Transition) this.K.get(i);
    }

    public TransitionSet a(long j) {
        super.a(j);
        if (this.f >= 0) {
            int size = this.K.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.K.get(i)).a(j);
            }
        }
        return this;
    }

    public TransitionSet a(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<Transition> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.K.get(i)).a(timeInterpolator);
            }
        }
        super.a(timeInterpolator);
        return this;
    }

    public TransitionSet a(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            ((Transition) this.K.get(i)).a(view);
        }
        super.a(view);
        return this;
    }

    public TransitionSet a(c cVar) {
        super.a(cVar);
        return this;
    }

    public void a(PathMotion pathMotion) {
        super.a(pathMotion);
        this.O |= 4;
        for (int i = 0; i < this.K.size(); i++) {
            ((Transition) this.K.get(i)).a(pathMotion);
        }
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, ia iaVar, ia iaVar2, ArrayList<ha> arrayList, ArrayList<ha> arrayList2) {
        long q = q();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.K.get(i);
            if (q > 0 && (this.L || i == 0)) {
                long q2 = transition.q();
                if (q2 > 0) {
                    transition.b(q2 + q);
                } else {
                    transition.b(q);
                }
            }
            transition.a(viewGroup, iaVar, iaVar2, arrayList, arrayList2);
        }
    }

    public void a(ha haVar) {
        if (b(haVar.b)) {
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.b(haVar.b)) {
                    transition.a(haVar);
                    haVar.c.add(transition);
                }
            }
        }
    }

    public void a(C0446ea eaVar) {
        super.a(eaVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.K.get(i)).a(eaVar);
        }
    }

    public void a(b bVar) {
        super.a(bVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.K.get(i)).a(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            Transition transition = (Transition) this.K.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(transition.a(sb2.toString()));
            a2 = sb.toString();
        }
        return a2;
    }
}
