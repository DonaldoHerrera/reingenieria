package defpackage;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 #*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001#B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ6\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u001f\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001dJ-\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00018\u0001H\u0000¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "ItemType", "ErrorType", "", "asyncLoadingState", "Lcom/soundcloud/android/uniflow/AsyncLoadingState;", "data", "(Lcom/soundcloud/android/uniflow/AsyncLoadingState;Ljava/lang/Object;)V", "getAsyncLoadingState", "()Lcom/soundcloud/android/uniflow/AsyncLoadingState;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/soundcloud/android/uniflow/AsyncLoadingState;Ljava/lang/Object;)Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "equals", "", "other", "hashCode", "", "toNextPageError", "error", "(Ljava/lang/Object;)Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "toString", "", "update", "updateFunction", "Lkotlin/Function1;", "updateWithRefreshState", "isRefreshing", "refreshError", "updateWithRefreshState$uniflow_core", "(ZLjava/lang/Object;)Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Companion", "uniflow-core"}, mv = {1, 1, 15})
/* renamed from: lEa reason: default package and case insensitive filesystem */
/* compiled from: AsyncLoaderState.kt */
public final class C6832lEa<ItemType, ErrorType> {
    public static final a a = new a(null);
    private final C6900mEa<ErrorType> b;
    private final ItemType c;

    /* renamed from: lEa$a */
    /* compiled from: AsyncLoaderState.kt */
    public static final class a {
        private a() {
        }

        public final <ItemType, ErrorType> C6832lEa<ItemType, ErrorType> a() {
            C6900mEa mea = new C6900mEa(true, false, null, null, false, 30, null);
            return new C6832lEa<>(mea, null, 2, null);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6832lEa() {
        this(null, null, 3, null);
    }

    public C6832lEa(C6900mEa<ErrorType> mea, ItemType itemtype) {
        C7471uYa.b(mea, "asyncLoadingState");
        this.b = mea;
        this.c = itemtype;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=ItemType, for r2v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=mEa, code=mEa<ErrorType>, for r1v0, types: [mEa] */
    public static /* synthetic */ C6832lEa a(C6832lEa lea, C6900mEa<ErrorType> mea, ItemType itemtype, int i, Object obj) {
        if ((i & 1) != 0) {
            mea = lea.b;
        }
        if ((i & 2) != 0) {
            itemtype = lea.c;
        }
        return lea.a(mea, itemtype);
    }

    public final C6832lEa<ItemType, ErrorType> a(C6900mEa<ErrorType> mea, ItemType itemtype) {
        C7471uYa.b(mea, "asyncLoadingState");
        return new C6832lEa<>(mea, itemtype);
    }

    public final C6900mEa<ErrorType> a() {
        return this.b;
    }

    public final ItemType b() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6832lEa) {
                C6832lEa lea = (C6832lEa) obj;
                if (C7471uYa.a((Object) this.b, (Object) lea.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6900mEa<ErrorType> mea = this.b;
        int i = 0;
        int hashCode = (mea != null ? mea.hashCode() : 0) * 31;
        ItemType itemtype = this.c;
        if (itemtype != null) {
            i = itemtype.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncLoaderState(asyncLoadingState=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6832lEa(C6900mEa mea, Object obj, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            mea = new C6900mEa(false, false, null, null, false, 31, null);
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        this(mea, obj);
    }

    public final C6832lEa<ItemType, ErrorType> a(boolean z, ErrorType errortype) {
        if (z) {
            if (!this.b.e()) {
                return a(this, this.b.f(), null, 2, null);
            }
        } else if (errortype != null) {
            return a(this, this.b.a(errortype), null, 2, null);
        }
        return this;
    }
}
