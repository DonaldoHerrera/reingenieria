package defpackage;

import java.util.ArrayList;

/* renamed from: zb reason: default package and case insensitive filesystem */
/* compiled from: FontsContractCompat */
class C1897zb implements a<c> {
    final /* synthetic */ String a;

    C1897zb(String str) {
        this.a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 >= r1.size()) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        ((defpackage.C0208Gb.a) r1.get(r0)).a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r0 = 0;
     */
    public void a(c cVar) {
        synchronized (C0193Bb.c) {
            ArrayList arrayList = (ArrayList) C0193Bb.d.get(this.a);
            if (arrayList != null) {
                C0193Bb.d.remove(this.a);
            }
        }
    }
}
