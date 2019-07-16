package defpackage;

/* renamed from: ZMa reason: default package and case insensitive filesystem */
/* compiled from: InitializationTask */
class C5502ZMa<Result> extends C5532_Na<Void, Void, Result> {
    final C5531_Ma<Result> p;

    public C5502ZMa(C5531_Ma<Result> _ma) {
        this.p = _ma;
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
        this.p.a(result);
        StringBuilder sb = new StringBuilder();
        sb.append(this.p.v());
        sb.append(" Initialization was cancelled");
        this.p.d.a((Exception) new C5473YMa(sb.toString()));
    }

    /* access modifiers changed from: protected */
    public void c(Result result) {
        this.p.b(result);
        this.p.d.a(result);
    }

    /* access modifiers changed from: protected */
    public void f() {
        super.f();
        C5149NNa a = a("onPreExecute");
        try {
            boolean K = this.p.K();
            a.b();
            if (K) {
                return;
            }
        } catch (C6502gOa e) {
            throw e;
        } catch (Exception e2) {
            C5328TMa.e().e("Fabric", "Failure onPreExecute()", e2);
            a.b();
        } catch (Throwable th) {
            a.b();
            b(true);
            throw th;
        }
        b(true);
    }

    public C5474YNa j() {
        return C5474YNa.HIGH;
    }

    /* access modifiers changed from: protected */
    public Result a(Void... voidArr) {
        C5149NNa a = a("doInBackground");
        Result d = !e() ? this.p.d() : null;
        a.b();
        return d;
    }

    private C5149NNa a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.p.v());
        sb.append(".");
        sb.append(str);
        C5149NNa nNa = new C5149NNa(sb.toString(), "KitInitialization");
        nNa.a();
        return nNa;
    }
}
