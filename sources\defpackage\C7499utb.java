package defpackage;

import java.util.List;

/* renamed from: utb reason: default package and case insensitive filesystem */
/* compiled from: TypeSubstitution.kt */
public final class C7499utb extends Wtb {
    private final C4905Fdb[] c;
    private final Stb[] d;
    private final boolean e;

    public /* synthetic */ C7499utb(C4905Fdb[] fdbArr, Stb[] stbArr, boolean z, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            z = false;
        }
        this(fdbArr, stbArr, z);
    }

    public Stb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "key");
        C5122Mcb c2 = xtb.za().c();
        if (!(c2 instanceof C4905Fdb)) {
            c2 = null;
        }
        C4905Fdb fdb = (C4905Fdb) c2;
        if (fdb != null) {
            int index = fdb.getIndex();
            C4905Fdb[] fdbArr = this.c;
            if (index < fdbArr.length && C7471uYa.a((Object) fdbArr[index].Q(), (Object) fdb.Q())) {
                return this.d[index];
            }
        }
        return null;
    }

    public boolean b() {
        return this.e;
    }

    public boolean d() {
        return this.d.length == 0;
    }

    public final Stb[] e() {
        return this.d;
    }

    public final C4905Fdb[] f() {
        return this.c;
    }

    public C7499utb(C4905Fdb[] fdbArr, Stb[] stbArr, boolean z) {
        C7471uYa.b(fdbArr, "parameters");
        C7471uYa.b(stbArr, "arguments");
        this.c = fdbArr;
        this.d = stbArr;
        this.e = z;
        boolean z2 = this.c.length <= this.d.length;
        if (TVa.a && !z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Number of arguments should not be less then number of parameters, but: parameters=");
            sb.append(this.c.length);
            sb.append(", args=");
            sb.append(this.d.length);
            throw new AssertionError(sb.toString());
        }
    }

    public C7499utb(List<? extends C4905Fdb> list, List<? extends Stb> list2) {
        C7471uYa.b(list, "parameters");
        C7471uYa.b(list2, "argumentsList");
        Object[] array = list.toArray(new C4905Fdb[0]);
        String str = "null cannot be cast to non-null type kotlin.Array<T>";
        if (array != null) {
            C4905Fdb[] fdbArr = (C4905Fdb[]) array;
            Object[] array2 = list2.toArray(new Stb[0]);
            if (array2 != null) {
                this(fdbArr, (Stb[]) array2, false, 4, null);
                return;
            }
            throw new OVa(str);
        }
        throw new OVa(str);
    }
}
