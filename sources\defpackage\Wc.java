package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: Wc reason: default package */
/* compiled from: FocusStrategy */
class Wc {

    /* renamed from: Wc$a */
    /* compiled from: FocusStrategy */
    public interface a<T> {
        void a(T t, Rect rect);
    }

    /* renamed from: Wc$b */
    /* compiled from: FocusStrategy */
    public interface b<T, V> {
        int a(T t);

        V a(T t, int i);
    }

    /* renamed from: Wc$c */
    /* compiled from: FocusStrategy */
    private static class c<T> implements Comparator<T> {
        private final Rect a = new Rect();
        private final Rect b = new Rect();
        private final boolean c;
        private final a<T> d;

        c(boolean z, a<T> aVar) {
            this.c = z;
            this.d = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.a;
            Rect rect2 = this.b;
            this.d.a(t, rect);
            this.d.a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = -1;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                if (this.c) {
                    i3 = 1;
                }
                return i3;
            } else if (i4 > i5) {
                if (!this.c) {
                    i3 = 1;
                }
                return i3;
            } else {
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                int i8 = rect.right;
                int i9 = rect2.right;
                if (i8 < i9) {
                    if (this.c) {
                        i3 = 1;
                    }
                    return i3;
                } else if (i8 <= i9) {
                    return 0;
                } else {
                    if (!this.c) {
                        i3 = 1;
                    }
                    return i3;
                }
            }
        }
    }

    private static int a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static <L, T> T a(L l, b<L, T> bVar, a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a2 = bVar.a(l);
        ArrayList arrayList = new ArrayList(a2);
        for (int i2 = 0; i2 < a2; i2++) {
            arrayList.add(bVar.a(l, i2));
        }
        Collections.sort(arrayList, new c(z, aVar));
        if (i == 1) {
            return b(t, arrayList, z2);
        }
        if (i == 2) {
            return a(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T b(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int c(int i, Rect rect, Rect rect2) {
        return Math.max(0, d(i, rect, rect2));
    }

    private static int d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int e(int i, Rect rect, Rect rect2) {
        return Math.max(1, f(i, rect, rect2));
    }

    private static int f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private static boolean b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z = false;
        if (!a(rect, rect2, i)) {
            return false;
        }
        if (!a(rect, rect3, i) || a(i, rect, rect2, rect3)) {
            return true;
        }
        if (a(i, rect, rect3, rect2)) {
            return false;
        }
        if (a(c(i, rect, rect2), g(i, rect, rect2)) < a(c(i, rect, rect3), g(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    private static <T> T a(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static <L, T> T a(L l, b<L, T> bVar, a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int a2 = bVar.a(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < a2; i2++) {
            T a3 = bVar.a(l, i2);
            if (a3 != t) {
                aVar.a(a3, rect3);
                if (b(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a3;
                }
            }
        }
        return t2;
    }

    private static boolean b(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i == 17) {
            if (rect.left < rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if (rect.top < rect2.bottom) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if (rect.right > rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a2 = a(i, rect, rect2);
        if (a(i, rect, rect3) || !a2) {
            return false;
        }
        boolean z = true;
        if (!b(i, rect, rect3)) {
            return true;
        }
        if (!(i == 17 || i == 66 || c(i, rect, rect2) < e(i, rect, rect3))) {
            z = false;
        }
        return z;
    }

    private static boolean a(Rect rect, Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 <= i3 && rect.left < i3) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 <= i5 && rect.top < i5) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 >= i7 && rect.right > i7) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean a(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }
}
