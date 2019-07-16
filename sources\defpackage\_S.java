package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: _S reason: default package */
/* compiled from: BulkFetchCommand */
public abstract class _S<ApiModel, OutputModel> extends C1317gT<List<C3508cda>, Collection<OutputModel>, _S<ApiModel, OutputModel>> {
    private final dfa b;
    private final int c;
    private final HPa d;

    public _S(dfa dfa, HPa hPa) {
        this(dfa, hPa, 100);
    }

    public APa<Collection<OutputModel>> a() {
        return super.a().b(this.d);
    }

    /* access modifiers changed from: protected */
    public abstract hfa a(List<C3508cda> list);

    /* access modifiers changed from: protected */
    public abstract Collection<OutputModel> a(Collection<ApiModel> collection);

    /* access modifiers changed from: protected */
    public abstract C4990IKa<? extends Iterable<ApiModel>> b();

    public _S(dfa dfa, HPa hPa, int i) {
        this.b = dfa;
        this.d = hPa;
        this.c = i;
    }

    public Collection<OutputModel> call() throws ifa, IOException, Lea {
        ArrayList a = C2063HD.a(C1943BD.b(this.a, C5526_Ha.c));
        ArrayList arrayList = new ArrayList(a.size());
        for (List a2 : C2063HD.a((List<T>) a, this.c)) {
            C1943BD.a((Collection<T>) arrayList, (Iterable) this.b.a(a(a2), b()));
        }
        return a((Collection<ApiModel>) arrayList);
    }
}
