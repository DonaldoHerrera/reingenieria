package defpackage;

import java.util.ArrayList;

/* renamed from: Ea reason: default package and case insensitive filesystem */
/* compiled from: Snapshot */
public class C0201Ea {
    private int a;
    private int b;
    private int c;
    private int d;
    private ArrayList<a> e = new ArrayList<>();

    /* renamed from: Ea$a */
    /* compiled from: Snapshot */
    static class a {
        private C1656ra a;
        private C1656ra b;
        private int c;
        private b d;
        private int e;

        public a(C1656ra raVar) {
            this.a = raVar;
            this.b = raVar.g();
            this.c = raVar.b();
            this.d = raVar.f();
            this.e = raVar.a();
        }

        public void a(C1716ta taVar) {
            taVar.a(this.a.h()).a(this.b, this.c, this.d, this.e);
        }

        public void b(C1716ta taVar) {
            this.a = taVar.a(this.a.h());
            C1656ra raVar = this.a;
            if (raVar != null) {
                this.b = raVar.g();
                this.c = this.a.b();
                this.d = this.a.f();
                this.e = this.a.a();
                return;
            }
            this.b = null;
            this.c = 0;
            this.d = b.STRONG;
            this.e = 0;
        }
    }

    public C0201Ea(C1716ta taVar) {
        this.a = taVar.v();
        this.b = taVar.w();
        this.c = taVar.s();
        this.d = taVar.i();
        ArrayList b2 = taVar.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a((C1656ra) b2.get(i)));
        }
    }

    public void a(C1716ta taVar) {
        taVar.r(this.a);
        taVar.s(this.b);
        taVar.o(this.c);
        taVar.g(this.d);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((a) this.e.get(i)).a(taVar);
        }
    }

    public void b(C1716ta taVar) {
        this.a = taVar.v();
        this.b = taVar.w();
        this.c = taVar.s();
        this.d = taVar.i();
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((a) this.e.get(i)).b(taVar);
        }
    }
}
