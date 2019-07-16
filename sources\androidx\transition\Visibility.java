package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.c;

public abstract class Visibility extends Transition {
    private static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    private int L = 3;

    private static class a extends AnimatorListenerAdapter implements c, C0025a {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        a(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            a(true);
        }

        public void a(Transition transition) {
            a(true);
        }

        public void b(Transition transition) {
        }

        public void c(Transition transition) {
            a(false);
        }

        public void d(Transition transition) {
            a();
            transition.b((c) this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                wa.a(this.a, this.b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                wa.a(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        private void a() {
            if (!this.f) {
                wa.a(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            if (this.d && this.e != z) {
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    this.e = z;
                    na.a(viewGroup, z);
                }
            }
        }
    }

    private static class b {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        b() {
        }
    }

    public Visibility() {
    }

    private b b(ha haVar, ha haVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        String str = "android:visibility:parent";
        String str2 = "android:visibility:visibility";
        if (haVar == null || !haVar.a.containsKey(str2)) {
            bVar.c = -1;
            bVar.e = null;
        } else {
            bVar.c = ((Integer) haVar.a.get(str2)).intValue();
            bVar.e = (ViewGroup) haVar.a.get(str);
        }
        if (haVar2 == null || !haVar2.a.containsKey(str2)) {
            bVar.d = -1;
            bVar.f = null;
        } else {
            bVar.d = ((Integer) haVar2.a.get(str2)).intValue();
            bVar.f = (ViewGroup) haVar2.a.get(str);
        }
        if (haVar == null || haVar2 == null) {
            if (haVar == null && bVar.d == 0) {
                bVar.b = true;
                bVar.a = true;
            } else if (haVar2 == null && bVar.c == 0) {
                bVar.b = false;
                bVar.a = true;
            }
        } else if (bVar.c == bVar.d && bVar.e == bVar.f) {
            return bVar;
        } else {
            int i = bVar.c;
            int i2 = bVar.d;
            if (i != i2) {
                if (i == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (i2 == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        }
        return bVar;
    }

    private void d(ha haVar) {
        String str = "android:visibility:visibility";
        haVar.a.put(str, Integer.valueOf(haVar.b.getVisibility()));
        haVar.a.put("android:visibility:parent", haVar.b.getParent());
        int[] iArr = new int[2];
        haVar.b.getLocationOnScreen(iArr);
        haVar.a.put("android:visibility:screenLocation", iArr);
    }

    public String[] A() {
        return K;
    }

    public int D() {
        return this.L;
    }

    public Animator a(ViewGroup viewGroup, View view, ha haVar, ha haVar2) {
        return null;
    }

    public void a(int i) {
        if ((i & -4) == 0) {
            this.L = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator b(ViewGroup viewGroup, View view, ha haVar, ha haVar2) {
        return null;
    }

    public void c(ha haVar) {
        d(haVar);
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.e);
        int b2 = C0286Za.b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (b2 != 0) {
            a(b2);
        }
    }

    public void a(ha haVar) {
        d(haVar);
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        b b2 = b(haVar, haVar2);
        if (!b2.a || (b2.e == null && b2.f == null)) {
            return null;
        }
        if (b2.b) {
            return a(viewGroup, haVar, b2.c, haVar2, b2.d);
        }
        return b(viewGroup, haVar, b2.c, haVar2, b2.d);
    }

    public Animator a(ViewGroup viewGroup, ha haVar, int i, ha haVar2, int i2) {
        if ((this.L & 1) != 1 || haVar2 == null) {
            return null;
        }
        if (haVar == null) {
            View view = (View) haVar2.b.getParent();
            if (b(a(view, false), b(view, false)).a) {
                return null;
            }
        }
        return a(viewGroup, haVar2.b, haVar, haVar2);
    }

    public boolean a(ha haVar, ha haVar2) {
        boolean z = false;
        if (haVar == null && haVar2 == null) {
            return false;
        }
        if (!(haVar == null || haVar2 == null)) {
            String str = "android:visibility:visibility";
            if (haVar2.a.containsKey(str) != haVar.a.containsKey(str)) {
                return false;
            }
        }
        b b2 = b(haVar, haVar2);
        if (b2.a && (b2.c == 0 || b2.d == 0)) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r6.z != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee A[RETURN] */
    public Animator b(ViewGroup viewGroup, ha haVar, int i, ha haVar2, int i2) {
        if ((this.L & 2) != 2) {
            return null;
        }
        View view = haVar != null ? haVar.b : null;
        View view2 = haVar2 != null ? haVar2.b : null;
        if (view2 == null || view2.getParent() == null) {
            if (view2 != null) {
                view = view2;
            } else {
                if (view != null) {
                    if (view.getParent() != null) {
                        if (view.getParent() instanceof View) {
                            View view3 = (View) view.getParent();
                            if (!b(b(view3, true), a(view3, true)).a) {
                                view = ga.a(viewGroup, view, view3);
                            } else {
                                if (view3.getParent() == null) {
                                    int id = view3.getId();
                                    if (id != -1) {
                                        if (viewGroup.findViewById(id) != null) {
                                        }
                                    }
                                }
                                view = null;
                            }
                        }
                    }
                }
                view = null;
                view2 = null;
                if (view == null && haVar != null) {
                    int[] iArr = (int[]) haVar.a.get("android:visibility:screenLocation");
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view.offsetLeftAndRight((i3 - iArr2[0]) - view.getLeft());
                    view.offsetTopAndBottom((i4 - iArr2[1]) - view.getTop());
                    ma a2 = na.a(viewGroup);
                    a2.a(view);
                    Animator b2 = b(viewGroup, view, haVar, haVar2);
                    if (b2 == null) {
                        a2.b(view);
                    } else {
                        b2.addListener(new Ba(this, a2, view));
                    }
                    return b2;
                } else if (view2 == null) {
                    return null;
                } else {
                    int visibility = view2.getVisibility();
                    wa.a(view2, 0);
                    Animator b3 = b(viewGroup, view2, haVar, haVar2);
                    if (b3 != null) {
                        a aVar = new a(view2, i2, true);
                        b3.addListener(aVar);
                        C0437a.a(b3, aVar);
                        a((c) aVar);
                    } else {
                        wa.a(view2, visibility);
                    }
                    return b3;
                }
            }
        } else if (i2 == 4 || view == view2) {
            view = null;
            if (view == null) {
            }
            if (view2 == null) {
            }
        } else if (!this.z) {
            view = ga.a(viewGroup, view, (View) view.getParent());
        }
        view2 = null;
        if (view == null) {
        }
        if (view2 == null) {
        }
    }
}
