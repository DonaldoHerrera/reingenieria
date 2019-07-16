package com.soundcloud.android.collections.data;

import android.database.Cursor;
import androidx.room.B;
import androidx.room.C;
import androidx.room.C0433b;
import androidx.room.C0434c;
import androidx.room.t;
import androidx.room.w;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: LikeDao_Impl */
public final class H extends C2863t {
    /* access modifiers changed from: private */
    public final t a;
    private final C0434c b;
    /* access modifiers changed from: private */
    public final r c = new r();
    private final C0434c d;
    private final C0433b e;
    private final C f;
    private final C g;

    public H(t tVar) {
        this.a = tVar;
        this.b = new C2868y(this, tVar);
        this.d = new C2869z(this, tVar);
        this.e = new A(this, tVar);
        this.f = new B(this, tVar);
        this.g = new C(this, tVar);
    }

    public void c(I i) {
        this.a.c();
        try {
            super.c(i);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public IPa<List<I>> d(ea eaVar) {
        w a2 = w.a("SELECT * from likes WHERE type = ? AND removedAt IS NOT NULL ORDER BY createdAt DESC", 1);
        a2.a(1, (long) this.c.a(eaVar));
        return IPa.c((Callable<? extends T>) new C2867x<Object>(this, a2));
    }

    public void b(List<I> list) {
        this.a.b();
        this.a.c();
        try {
            this.d.a((Iterable<T>) list);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public void a(I i) {
        this.a.b();
        this.a.c();
        try {
            this.b.a(i);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public IPa<List<I>> c(ea eaVar) {
        w a2 = w.a("SELECT * from likes WHERE type = ? AND addedAt IS NOT NULL ORDER BY createdAt DESC", 1);
        a2.a(1, (long) this.c.a(eaVar));
        return IPa.c((Callable<? extends T>) new C2866w<Object>(this, a2));
    }

    public void b(I i) {
        this.a.b();
        this.a.c();
        try {
            this.e.a(i);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public void a(Collection<C2853i> collection) {
        this.a.c();
        try {
            super.a(collection);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public IPa<List<I>> b(ea eaVar) {
        w a2 = w.a("SELECT * from likes WHERE removedAt IS NULL AND type = ? ORDER BY createdAt DESC ", 1);
        a2.a(1, (long) this.c.a(eaVar));
        return IPa.c((Callable<? extends T>) new G<Object>(this, a2));
    }

    public int a(C3508cda cda, C3508cda cda2, ea eaVar) {
        this.a.b();
        Yd a2 = this.f.a();
        String a3 = this.c.a(cda2);
        if (a3 == null) {
            a2.c(1);
        } else {
            a2.a(1, a3);
        }
        String a4 = this.c.a(cda);
        if (a4 == null) {
            a2.c(2);
        } else {
            a2.a(2, a4);
        }
        a2.a(3, (long) this.c.a(eaVar));
        this.a.c();
        try {
            int v = a2.v();
            this.a.m();
            return v;
        } finally {
            this.a.e();
            this.f.a(a2);
        }
    }

    public APa<List<C3508cda>> b() {
        return B.a(this.a, false, new String[]{"likes"}, new C2864u(this, w.a("SELECT urn FROM likes WHERE removedAt IS NULL ORDER BY createdAt DESC ", 0)));
    }

    public void a() {
        this.a.b();
        Yd a2 = this.g.a();
        this.a.c();
        try {
            a2.v();
            this.a.m();
        } finally {
            this.a.e();
            this.g.a(a2);
        }
    }

    public APa<List<I>> a(ea eaVar) {
        w a2 = w.a("SELECT * from likes WHERE removedAt IS NULL AND type = ? ORDER BY createdAt DESC", 1);
        a2.a(1, (long) this.c.a(eaVar));
        return B.a(this.a, false, new String[]{"likes"}, new D(this, a2));
    }

    public IPa<List<I>> a(ea eaVar, long j, int i) {
        w a2 = w.a("SELECT * from likes WHERE removedAt IS NULL AND type = ? AND createdAt < ? ORDER BY createdAt DESC LIMIT ?", 3);
        a2.a(1, (long) this.c.a(eaVar));
        a2.a(2, j);
        a2.a(3, (long) i);
        return IPa.c((Callable<? extends T>) new E<Object>(this, a2));
    }

    public IPa<List<I>> a(ea eaVar, long j, long j2) {
        w a2 = w.a("SELECT * from likes WHERE removedAt IS NULL AND type = ? AND createdAt < ? AND createdAt >= ? ORDER BY createdAt DESC", 3);
        a2.a(1, (long) this.c.a(eaVar));
        a2.a(2, j);
        a2.a(3, j2);
        return IPa.c((Callable<? extends T>) new F<Object>(this, a2));
    }

    public int a(C3508cda cda, ea eaVar) {
        w a2 = w.a("SELECT COUNT(urn) FROM likes WHERE urn = ? AND type = ?", 2);
        String a3 = this.c.a(cda);
        if (a3 == null) {
            a2.c(1);
        } else {
            a2.a(1, a3);
        }
        a2.a(2, (long) this.c.a(eaVar));
        this.a.b();
        int i = 0;
        Cursor a4 = Md.a(this.a, a2, false);
        try {
            if (a4.moveToFirst()) {
                i = a4.getInt(0);
            }
            return i;
        } finally {
            a4.close();
            a2.b();
        }
    }

    public void a(List<C3508cda> list) {
        this.a.b();
        StringBuilder a2 = Nd.a();
        a2.append("DELETE FROM likes WHERE urn IN(");
        Nd.a(a2, list.size());
        a2.append(")");
        Yd a3 = this.a.a(a2.toString());
        int i = 1;
        for (C3508cda a4 : list) {
            String a5 = this.c.a(a4);
            if (a5 == null) {
                a3.c(i);
            } else {
                a3.a(i, a5);
            }
            i++;
        }
        this.a.c();
        try {
            a3.v();
            this.a.m();
        } finally {
            this.a.e();
        }
    }
}
