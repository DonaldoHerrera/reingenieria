package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: qI reason: default package and case insensitive filesystem */
/* compiled from: UniqueTabHistoryController */
public class C3211qI extends C3144nI {
    private Set<Integer> c = new LinkedHashSet();

    public C3211qI(C3049iI iIVar, C3068jI jIVar) {
        super(iIVar, jIVar);
    }

    public /* bridge */ /* synthetic */ boolean a(int i, C3106lI lIVar) throws UnsupportedOperationException {
        return super.a(i, lIVar);
    }

    public /* bridge */ /* synthetic */ void b(Bundle bundle) {
        super.b(bundle);
    }

    /* access modifiers changed from: 0000 */
    public ArrayList<Integer> c() {
        return new ArrayList<>(this.c);
    }

    public /* bridge */ /* synthetic */ void a(Bundle bundle) {
        super.a(bundle);
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.c.size();
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        ArrayList c2 = c();
        int intValue = ((Integer) c2.get(this.c.size() - 1)).intValue();
        int intValue2 = ((Integer) c2.get(this.c.size() - 2)).intValue();
        this.c.remove(Integer.valueOf(intValue));
        this.c.remove(Integer.valueOf(intValue2));
        return intValue2;
    }

    public void a(int i) {
        this.c.remove(Integer.valueOf(i));
        this.c.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    public void a(ArrayList<Integer> arrayList) {
        this.c.clear();
        this.c.addAll(arrayList);
    }
}
