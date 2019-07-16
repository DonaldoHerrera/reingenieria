package defpackage;

import java.util.Date;
import java.util.List;

/* renamed from: Eda reason: default package */
/* compiled from: Playlist */
public abstract class Eda {

    /* renamed from: Eda$a */
    /* compiled from: Playlist */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(long j);

        public abstract a a(C4928GKa<String> gKa);

        public abstract a a(C3508cda cda);

        public abstract a a(String str);

        public abstract a a(Date date);

        public a a(List<String> list) {
            return g(C4928GKa.c(list));
        }

        public abstract a a(boolean z);

        public abstract Eda a();

        public abstract a b(int i);

        public abstract a b(C4928GKa<String> gKa);

        public abstract a b(C3508cda cda);

        public a b(String str) {
            return a(C4928GKa.b(str));
        }

        public abstract a b(Date date);

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a c(C4928GKa<String> gKa);

        public a c(String str) {
            return d(C4928GKa.b(str));
        }

        public abstract a c(Date date);

        public abstract a c(boolean z);

        public abstract a d(C4928GKa<String> gKa);

        public a d(String str) {
            return f(C4928GKa.b(str));
        }

        public abstract a e(C4928GKa<String> gKa);

        public abstract a e(String str);

        public abstract a f(C4928GKa<String> gKa);

        public abstract a g(C4928GKa<List<String>> gKa);
    }

    public static Eda a(C3927zda zda) {
        return a().b(zda.a()).e(zda.getTitle()).a(zda.s().l()).a(zda.s().m()).a(zda.s().o()).b(zda.i()).a(zda.h()).c(zda.q()).c(zda.n().a()).b(zda.b()).a(zda.o().a()).b(zda.o().b()).d(zda.m()).c(C4928GKa.c(zda.j())).b(zda.t()).c(zda.k()).e(C4928GKa.b(zda.l())).a(zda.p()).a(zda.g()).c(zda.r()).b(new Date(0)).a();
    }

    public abstract Date b();

    public abstract boolean c();

    public abstract String d();

    public abstract C3508cda e();

    public abstract long f();

    public abstract C4928GKa<String> g();

    public abstract C4928GKa<String> h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract Date k();

    public abstract int l();

    public abstract C4928GKa<String> m();

    public abstract C4928GKa<String> n();

    public abstract int o();

    public abstract C4928GKa<String> p();

    public abstract C4928GKa<String> q();

    public abstract C4928GKa<List<String>> r();

    public abstract String s();

    public abstract int t();

    public abstract Date u();

    public abstract C3508cda v();

    public static a a() {
        return new a().c(C4928GKa.a()).g(C4928GKa.a()).b(C4928GKa.a());
    }
}
