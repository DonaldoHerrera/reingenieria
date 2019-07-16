package com.soundcloud.android.tracks;

import com.soundcloud.android.collections.data.J;
import com.soundcloud.android.playback.C4420sa;
import java.util.Date;

/* renamed from: com.soundcloud.android.tracks.ma reason: case insensitive filesystem */
/* compiled from: TrackItem */
public abstract class C6185ma extends C3855qda {

    /* renamed from: com.soundcloud.android.tracks.ma$a */
    /* compiled from: TrackItem */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(long j);

        public abstract a a(C4928GKa<String> gKa);

        public abstract a a(C3508cda cda);

        public abstract a a(String str);

        public abstract a a(Date date);

        public abstract a a(C3823mda mda);

        public abstract a a(C3879tda tda);

        public abstract a a(C3903wda wda);

        public abstract a a(boolean z);

        public abstract C6185ma a();

        public abstract a b(int i);

        public abstract a b(long j);

        public abstract a b(C4928GKa<String> gKa);

        public abstract a b(C3508cda cda);

        public abstract a b(String str);

        public abstract a b(Date date);

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(int i);

        public abstract a d(String str);

        public abstract a d(boolean z);

        public abstract a e(String str);

        public abstract a e(boolean z);

        public abstract a f(String str);

        public abstract a f(boolean z);

        public abstract a g(String str);

        public abstract a g(boolean z);

        public abstract a h(String str);

        public abstract a h(boolean z);

        public abstract a i(boolean z);

        public abstract a j(boolean z);

        public abstract a k(boolean z);
    }

    private static a X() {
        return new a();
    }

    public static C6185ma a(C3509cea cea, boolean z, boolean z2, C3823mda mda) {
        return a(cea, mda, z, z2).a();
    }

    public abstract int C();

    public abstract Date D();

    public abstract boolean E();

    public abstract C4928GKa<String> F();

    public abstract boolean G();

    public abstract long H();

    public abstract Date I();

    public boolean J() {
        return S() > 0;
    }

    public abstract boolean K();

    public abstract boolean L();

    public abstract boolean M();

    public abstract boolean N();

    public abstract boolean O();

    public abstract boolean P();

    public boolean Q() {
        return r() == C3823mda.UNAVAILABLE;
    }

    public abstract String R();

    public abstract int S();

    public abstract String T();

    public abstract long U();

    public abstract a V();

    public abstract String W();

    public abstract C3508cda a();

    public abstract C4928GKa<String> b();

    public long g() {
        return C4420sa.a(this);
    }

    public String h() {
        return "track";
    }

    public String toString() {
        return a().toString();
    }

    public static C6185ma a(C3493aea aea, boolean z, boolean z2, C3823mda mda) {
        return a(aea.b(), mda, z, z2).a(C4928GKa.b(aea.a())).a();
    }

    public static C6185ma a(C3509cea cea, C3823mda mda, boolean z, boolean z2, boolean z3) {
        return a(cea, mda, z, z2).e(z3).a();
    }

    public C6185ma a(C3879tda tda, C3903wda wda) {
        return V().a(tda).a(wda).a();
    }

    public C6185ma a(boolean z) {
        return V().e(z).a();
    }

    public static a a(C3509cea cea, C3823mda mda, boolean z, boolean z2) {
        return X().a(mda).j(z).b(cea.l()).k(z2).d(cea.q()).b(cea.y()).b(C4928GKa.b(cea.k())).b(cea.d()).b(cea.j()).g(cea.w()).a(cea.e()).a(cea.g()).a(cea.f()).a(cea.d()).d(cea.o()).f(cea.A()).c(cea.a()).g(cea.s()).i(cea.v()).h(cea.u()).d(cea.b()).c(cea.n()).e(cea.x().a()).c(cea.p()).a(cea.c()).a(cea.i()).b(cea.t()).h(cea.z()).a(C4928GKa.a()).b(cea.h()).f(cea.r()).e(false);
    }

    public C6185ma a(C3509cea cea) {
        return V().b(cea.l()).d(cea.q()).b(cea.y()).b(C4928GKa.b(cea.k())).b(cea.d()).b(cea.j()).g(cea.w()).a(cea.e()).a(cea.g()).a(cea.f()).a(cea.d()).d(cea.o()).f(cea.A()).c(cea.a()).g(cea.s()).i(cea.v()).h(cea.u()).d(cea.b()).c(cea.n()).e(cea.x().a()).c(cea.p()).a(cea.c()).a(cea.i()).b(cea.t()).h(cea.z()).b(cea.h()).f(cea.r()).a();
    }

    public C6185ma a(J j) {
        return V().j(j.a()).a();
    }

    public C6185ma a(com.soundcloud.android.foundation.events.C.a aVar) {
        a k = V().k(aVar.c());
        if (aVar.a() != null) {
            k.d(aVar.a().intValue());
        }
        return k.a();
    }
}
