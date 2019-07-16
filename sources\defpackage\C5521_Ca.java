package defpackage;

import com.soundcloud.android.sync.SyncJobResult;
import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.na;
import java.util.Collections;
import java.util.List;

/* renamed from: _Ca reason: default package and case insensitive filesystem */
/* compiled from: TimelineOperations */
public abstract class C5521_Ca<StorageModel, ViewModel> {
    private final na a;
    private final C5554aDa<StorageModel> b;
    private final T c;
    private final HPa d;
    private final List<ViewModel> e = Collections.emptyList();

    public C5521_Ca(na naVar, C5554aDa<StorageModel> ada, T t, HPa hPa) {
        this.a = naVar;
        this.b = ada;
        this.c = t;
        this.d = hPa;
    }

    private IPa<List<ViewModel>> b(long j, boolean z) {
        String str = "Timeline";
        if (z) {
            SDb.a(str).a("No items after previous sync, return empty page", new Object[0]);
            return IPa.a(this.e);
        } else if (j == Long.MAX_VALUE) {
            SDb.a(str).a("First page; triggering full sync", new Object[0]);
            return this.c.a(this.a).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5492ZCa<Object,Object>(this, j));
        } else {
            SDb.a(str).a("Not on first page; triggering backfill sync", new Object[0]);
            return this.c.a(this.a, "com.soundcloud.android.sync.action.APPEND").a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5405WCa<Object,Object>(this, j));
        }
    }

    /* access modifiers changed from: protected */
    public IPa<List<ViewModel>> a(boolean z) {
        return this.b.a(30).b(this.d).r().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5347UCa<Object,Object>(this)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5463YCa<Object,Object>(this, z));
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(List<ViewModel> list);

    /* access modifiers changed from: protected */
    public abstract IPa<List<ViewModel>> b(List<StorageModel> list);

    public /* synthetic */ MPa a(boolean z, List list) throws Exception {
        return a(list, Long.MAX_VALUE, z);
    }

    /* access modifiers changed from: protected */
    public IPa<List<ViewModel>> a() {
        return this.c.a(this.a, "com.soundcloud.android.sync.action.HARD_REFRESH").a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5376VCa<Object,Object>(this));
    }

    public /* synthetic */ MPa a(SyncJobResult syncJobResult) throws Exception {
        return b(syncJobResult, Long.MAX_VALUE);
    }

    /* access modifiers changed from: private */
    public IPa<List<ViewModel>> a(List<ViewModel> list, long j, boolean z) {
        if (a(list)) {
            return b(j, z);
        }
        return IPa.a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public IPa<List<ViewModel>> b(SyncJobResult syncJobResult, long j) {
        SDb.a("Timeline").a("Sync finished; new items? => %s", syncJobResult);
        if (!syncJobResult.e()) {
            return IPa.a(this.e);
        }
        if (j == Long.MAX_VALUE) {
            return a(true);
        }
        return a(j, true);
    }

    /* access modifiers changed from: protected */
    public IPa<List<ViewModel>> a(long j, boolean z) {
        return this.b.a(j, 30).r().b(this.d).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5347UCa<Object,Object>(this)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5434XCa<Object,Object>(this, j, z));
    }
}
