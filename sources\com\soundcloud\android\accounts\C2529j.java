package com.soundcloud.android.accounts;

import android.accounts.Account;
import android.annotation.SuppressLint;

@EVa(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0012J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0012J,\u0010\u001b\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\t0\t \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\t0\t\u0018\u00010\u00110\u0011H\u0012J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0012@\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/soundcloud/android/accounts/DefaultSessionProvider;", "Lcom/soundcloud/android/foundation/accounts/SessionProvider;", "scAccountManager", "Lcom/soundcloud/android/accounts/ScAccountManager;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/accounts/ScAccountManager;Lio/reactivex/Scheduler;)V", "currentSession", "Lio/reactivex/subjects/Subject;", "Lcom/soundcloud/android/accounts/DefaultSessionProvider$UserSession;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "cancelInitSession", "", "currentAccount", "Lio/reactivex/Maybe;", "Landroid/accounts/Account;", "Lio/reactivex/Observable;", "currentUserUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "currentUserUrnOrNotSet", "Lio/reactivex/Single;", "isLoggedInUser", "", "urn", "isUserLoggedIn", "sessionFromManager", "sessionWithLazyInit", "kotlin.jvm.PlatformType", "updateSession", "session", "UserSession", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.accounts.j reason: case insensitive filesystem */
/* compiled from: DefaultSessionProvider.kt */
public class C2529j implements Ica {
    /* access modifiers changed from: private */
    public final C6985nVa<a> a;
    /* access modifiers changed from: private */
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    public UPa b = new UPa();
    /* access modifiers changed from: private */
    public final J c;
    /* access modifiers changed from: private */
    public final HPa d;

    @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/accounts/DefaultSessionProvider$UserSession;", "", "loggedInUserUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "loggedInUserAccount", "Lcom/soundcloud/java/optional/Optional;", "Landroid/accounts/Account;", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/java/optional/Optional;)V", "getLoggedInUserAccount", "()Lcom/soundcloud/java/optional/Optional;", "getLoggedInUserUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "base_release"}, mv = {1, 1, 15})
    /* renamed from: com.soundcloud.android.accounts.j$a */
    /* compiled from: DefaultSessionProvider.kt */
    public static final class a {
        public static final C0057a a = new C0057a(null);
        private final C3508cda b;
        private final C4928GKa<Account> c;

        /* renamed from: com.soundcloud.android.accounts.j$a$a reason: collision with other inner class name */
        /* compiled from: DefaultSessionProvider.kt */
        public static final class C0057a {
            private C0057a() {
            }

            @NXa
            public final a a(C3508cda cda, Account account) {
                C7471uYa.b(cda, "userUrn");
                C7471uYa.b(account, "account");
                C4928GKa c = C4928GKa.c(account);
                C7471uYa.a((Object) c, "Optional.of(account)");
                return new a(cda, c);
            }

            @NXa
            public final a b() {
                C3508cda cda = C2526g.a;
                C7471uYa.a((Object) cda, "AccountOperations.CRAWLER_USER_URN");
                C4928GKa a = C4928GKa.a();
                C7471uYa.a((Object) a, "Optional.absent()");
                return new a(cda, a);
            }

            public /* synthetic */ C0057a(C7264rYa rya) {
                this();
            }

            @NXa
            public final a a() {
                C3508cda cda = C3508cda.a;
                C7471uYa.a((Object) cda, "Urn.NOT_SET");
                C4928GKa a = C4928GKa.a();
                C7471uYa.a((Object) a, "Optional.absent()");
                return new a(cda, a);
            }
        }

        public a(C3508cda cda, C4928GKa<Account> gKa) {
            C7471uYa.b(cda, "loggedInUserUrn");
            C7471uYa.b(gKa, "loggedInUserAccount");
            this.b = cda;
            this.c = gKa;
        }

        @NXa
        public static final a a() {
            return a.a();
        }

        @NXa
        public static final a a(C3508cda cda, Account account) {
            return a.a(cda, account);
        }

        @NXa
        public static final a b() {
            return a.b();
        }

        public final C4928GKa<Account> c() {
            return this.c;
        }

        public final C3508cda d() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.b;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            C4928GKa<Account> gKa = this.c;
            if (gKa != null) {
                i = gKa.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UserSession(loggedInUserUrn=");
            sb.append(this.b);
            sb.append(", loggedInUserAccount=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    public C2529j(J j, HPa hPa) {
        C7471uYa.b(j, "scAccountManager");
        C7471uYa.b(hPa, "scheduler");
        this.c = j;
        this.d = hPa;
        C6713jVa s = C6713jVa.s();
        C7471uYa.a((Object) s, "BehaviorSubject.create()");
        this.a = s;
    }

    private void e() {
        if (!this.b.a()) {
            this.b.dispose();
        }
    }

    private APa<a> f() {
        return this.a.e((C6776kQa<? super VPa>) new t<Object>(this));
    }

    public IPa<C3508cda> b() {
        IPa<C3508cda> d2 = c().d(C3508cda.a);
        C7471uYa.a((Object) d2, "currentUserUrn().toSingle(Urn.NOT_SET)");
        return d2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [_Xa, FZa] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.soundcloud.android.accounts.q] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public C7531vPa<C3508cda> c() {
        C7531vPa f = f().f();
        ? r1 = C2532m.d;
        if (r1 != 0) {
            r1 = new q(r1);
        }
        C7531vPa<C3508cda> f2 = f.f((C7118pQa) r1);
        C7471uYa.a((Object) f2, "sessionWithLazyInit().fi…Session::loggedInUserUrn)");
        return f2;
    }

    public C7531vPa<Account> d() {
        C7531vPa<Account> f = f().f().a((C7256rQa<? super T>) C2530k.a).f(C2531l.a);
        C7471uYa.a((Object) f, "sessionWithLazyInit().fi…ggedInUserAccount.get() }");
        return f;
    }

    public IPa<Boolean> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        IPa<Boolean> h = c().f(new C2533n(cda)).h();
        C7471uYa.a((Object) h, "currentUserUrn().map { it == urn }.toSingle()");
        return h;
    }

    public IPa<Boolean> a() {
        IPa<Boolean> h = c().f(C2534o.a).h();
        C7471uYa.a((Object) h, "currentUserUrn().map { i… Urn.NOT_SET }.toSingle()");
        return h;
    }

    public void a(a aVar) {
        C7471uYa.b(aVar, "session");
        e();
        this.a.a(aVar);
    }

    /* access modifiers changed from: private */
    public a a(J j) {
        C4928GKa a2 = j.a();
        if (a2.c()) {
            Object b2 = a2.b();
            String str = "soundCloudAccount.get()";
            C7471uYa.a(b2, str);
            C3508cda a3 = j.a((Account) b2);
            if (!C7471uYa.a((Object) a3, (Object) C3508cda.a)) {
                C0057a aVar = a.a;
                Object b3 = a2.b();
                C7471uYa.a(b3, str);
                return aVar.a(a3, (Account) b3);
            }
        }
        return a.a.a();
    }
}
