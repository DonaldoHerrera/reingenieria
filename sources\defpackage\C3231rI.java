package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: rI reason: default package and case insensitive filesystem */
/* compiled from: UnlimitedTabHistoryController */
public class C3231rI extends C3144nI {
    private Stack<Integer> c = new Stack<>();

    public C3231rI(C3049iI iIVar, C3068jI jIVar) {
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
        this.c.pop();
        return ((Integer) this.c.pop()).intValue();
    }

    public void a(int i) {
        this.c.push(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    public void a(ArrayList<Integer> arrayList) {
        this.c.clear();
        this.c.addAll(arrayList);
    }
}
