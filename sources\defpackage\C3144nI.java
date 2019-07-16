package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: nI reason: default package and case insensitive filesystem */
/* compiled from: CollectionFragNavTabHistoryController */
abstract class C3144nI extends C3125mI {
    private C3068jI b;

    C3144nI(C3049iI iIVar, C3068jI jIVar) {
        super(iIVar);
        this.b = jIVar;
    }

    /* access modifiers changed from: 0000 */
    public abstract int a();

    /* access modifiers changed from: 0000 */
    public abstract void a(ArrayList<Integer> arrayList);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[EDGE_INSN: B:12:0x0025->B:11:0x0025 ?: BREAK  , SYNTHETIC] */
    public boolean a(int i, C3106lI lIVar) throws UnsupportedOperationException {
        boolean z;
        boolean z2 = false;
        do {
            int a = this.a.a(i, lIVar);
            z = true;
            if (a <= 0) {
                if (b() <= 1) {
                    z = false;
                    if (i <= 0) {
                        break;
                    }
                } else {
                    this.b.a(a(), lIVar);
                    i--;
                }
            } else {
                i -= a;
            }
            z2 = true;
            if (i <= 0) {
                break;
                break;
            }
        } while (z);
        return z2;
    }

    /* access modifiers changed from: 0000 */
    public abstract int b();

    public void b(Bundle bundle) {
        ArrayList c = c();
        if (!c.isEmpty()) {
            bundle.putIntegerArrayList("EXTRA_STACK_HISTORY", c);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract ArrayList<Integer> c();

    public void a(Bundle bundle) {
        if (bundle != null) {
            ArrayList integerArrayList = bundle.getIntegerArrayList("EXTRA_STACK_HISTORY");
            if (integerArrayList != null) {
                a(integerArrayList);
            }
        }
    }
}
