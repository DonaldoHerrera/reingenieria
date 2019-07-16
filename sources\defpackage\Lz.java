package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Lz reason: default package */
/* compiled from: MotionSpec */
public class Lz {
    private final C0485ba<String, Mz> a = new C0485ba<>();

    public Mz a(String str) {
        if (b(str)) {
            return (Mz) this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean b(String str) {
        return this.a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Lz.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((Lz) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(Lz.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.a);
        sb.append("}\n");
        return sb.toString();
    }

    public void a(String str, Mz mz) {
        this.a.put(str, mz);
    }

    public long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Mz mz = (Mz) this.a.d(i);
            j = Math.max(j, mz.a() + mz.b());
        }
        return j;
    }

    public static Lz a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return a(context, resourceId);
            }
        }
        return null;
    }

    public static Lz a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a((List<Animator>) arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    private static Lz a(List<Animator> list) {
        Lz lz = new Lz();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(lz, (Animator) list.get(i));
        }
        return lz;
    }

    private static void a(Lz lz, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            lz.a(objectAnimator.getPropertyName(), Mz.a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }
}
