package defpackage;

import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: Avb reason: default package */
/* compiled from: Jsr305State.kt */
final class Avb extends C7540vYa implements PXa<String[]> {
    final /* synthetic */ C7848zvb a;

    Avb(C7848zvb zvb) {
        this.a = zvb;
        super(0);
    }

    public final String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a.c().a());
        Dvb d = this.a.d();
        if (d != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("under-migration:");
            sb.append(d.a());
            arrayList.add(sb.toString());
        }
        for (Entry entry : this.a.e().entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append((String) entry.getKey());
            sb2.append(':');
            sb2.append(((Dvb) entry.getValue()).a());
            arrayList.add(sb2.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
