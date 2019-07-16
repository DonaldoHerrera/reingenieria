package androidx.room;

import android.content.Context;
import androidx.room.t.b;
import androidx.room.t.c;
import androidx.room.t.d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.a reason: case insensitive filesystem */
/* compiled from: DatabaseConfiguration */
public class C0432a {
    public final c a;
    public final Context b;
    public final String c;
    public final d d;
    public final List<b> e;
    public final boolean f;
    public final c g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    private final Set<Integer> m;

    public C0432a(Context context, String str, c cVar, d dVar, List<b> list, boolean z, c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = cVar2;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r4.contains(java.lang.Integer.valueOf(r3)) != false) goto L_0x0021;
     */
    public boolean a(int i2, int i3) {
        boolean z = true;
        if ((i2 > i3) && this.l) {
            return false;
        }
        if (this.k) {
            Set<Integer> set = this.m;
            if (set != null) {
            }
            return z;
        }
        z = false;
        return z;
    }
}
