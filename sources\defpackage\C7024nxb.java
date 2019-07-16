package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: nxb reason: default package and case insensitive filesystem */
/* compiled from: Regex.kt */
public final class C7024nxb extends VVa<C6615hxb> implements C6751jxb {
    final /* synthetic */ C7093oxb a;

    C7024nxb(C7093oxb oxb) {
        this.a = oxb;
    }

    public /* bridge */ boolean a(C6615hxb hxb) {
        return super.contains(hxb);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof C6615hxb : true) {
            return a((C6615hxb) obj);
        }
        return false;
    }

    public int f() {
        return this.a.c().groupCount() + 1;
    }

    public C6615hxb get(int i) {
        C6785kZa a2 = C7231qxb.b(this.a.c(), i);
        if (a2.f().intValue() < 0) {
            return null;
        }
        String group = this.a.c().group(i);
        C7471uYa.a((Object) group, "matchResult.group(index)");
        return new C6615hxb(group, a2);
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<C6615hxb> iterator() {
        return Ywb.d(C7676xWa.d(C6918mWa.a((Collection<?>) this)), new C6955mxb(this)).iterator();
    }
}
