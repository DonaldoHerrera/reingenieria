package defpackage;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/discovery/SelectionItemAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/discovery/SelectionItemViewModel;", "selectionItemRendererFactory", "Lcom/soundcloud/android/discovery/SelectionItemRenderer$Factory;", "selectionItemClickListener", "Lio/reactivex/subjects/PublishSubject;", "selectionUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "(Lcom/soundcloud/android/discovery/SelectionItemRenderer$Factory;Lio/reactivex/subjects/PublishSubject;Lcom/soundcloud/android/foundation/domain/Urn;)V", "getSelectionUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "setSelectionUrn", "(Lcom/soundcloud/android/foundation/domain/Urn;)V", "getBasicItemViewType", "", "position", "updateSelection", "", "selection", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$MultipleContentSelectionCard;", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: FY reason: default package and case insensitive filesystem */
/* compiled from: SelectionItemAdapter.kt */
public class C3421FY extends C5407WEa<C3445NY> {
    private C3508cda g;

    /* renamed from: FY$a */
    /* compiled from: SelectionItemAdapter.kt */
    public static class a {
        private final defpackage.C3430IY.a a;

        public a(defpackage.C3430IY.a aVar) {
            C7471uYa.b(aVar, "selectionItemRendererFactory");
            this.a = aVar;
        }

        public C3421FY a(C6781kVa<C3445NY> kva) {
            C7471uYa.b(kva, "selectionItemClickListener");
            C3421FY fy = new C3421FY(this.a, kva, null, 4, null);
            return fy;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C3421FY.a) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            defpackage.C3430IY.a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory(selectionItemRendererFactory=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ C3421FY(defpackage.C3430IY.a aVar, C6781kVa kva, C3508cda cda, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            cda = null;
        }
        this(aVar, kva, cda);
    }

    public void a(C3508cda cda) {
        this.g = cda;
    }

    public int f(int i) {
        return 0;
    }

    public C3508cda j() {
        return this.g;
    }

    public C3421FY(defpackage.C3430IY.a aVar, C6781kVa<C3445NY> kva, C3508cda cda) {
        C7471uYa.b(aVar, "selectionItemRendererFactory");
        C7471uYa.b(kva, "selectionItemClickListener");
        super((C6289dFa<T>) aVar.a(kva));
        this.g = cda;
    }

    public void a(b bVar) {
        C7471uYa.b(bVar, "selection");
        a(bVar.d());
        f();
        a((Iterable<? extends T>) bVar.c());
    }
}
