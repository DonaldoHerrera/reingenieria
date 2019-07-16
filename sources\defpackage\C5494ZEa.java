package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.recyclerview.widget.C0425t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.ha;
import com.soundcloud.android.utilities.android.MultiSwipeRefreshLayout;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0003IJKBm\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005JH\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020,2\b\b\u0001\u0010.\u001a\u00020,H\u0017J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u001fH\u0016J\u0006\u00101\u001a\u00020\u0019J\u0016\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000105H\u0002J\u001a\u00106\u001a\u0002H7\"\n\b\u0002\u00107\u0018\u0001*\u00020\u0012H\b¢\u0006\u0002\u00108J\u0006\u00109\u001a\u00020\bJ\u0006\u0010:\u001a\u00020\bJ\b\u0010;\u001a\u00020\u0019H\u0002J\u0016\u0010<\u001a\u00020\u00192\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0002J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190?J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0016\u0010@\u001a\u00020\u00192\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0002J\u001a\u0010A\u001a\u00020\u00192\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010CJ\u0010\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\bH\u0002J\u000e\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u00020,J\u001c\u0010H\u001a\u00020\u00192\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010CH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer;", "ItemT", "ErrorType", "", "adapter", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "sameIdentity", "Lkotlin/Function2;", "", "sameContent", "emptyStateProvider", "Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer$UniflowEmptyStateProvider;", "animateLayoutChangesInItems", "smoothScrollToInsertedItem", "(Lcom/soundcloud/android/uniflow/android/UniflowAdapter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer$UniflowEmptyStateProvider;ZZ)V", "emptyAdapter", "Lcom/soundcloud/android/uniflow/android/EmptyAdapter;", "emptyLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "emptyViewObserver", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "layoutManagerProvider", "Lkotlin/Function0;", "onNextPage", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "onRefresh", "paginator", "Lcom/soundcloud/android/uniflow/android/RecyclerViewPaginator;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "requestMoreOnScroll", "swipeRefreshLayout", "Lcom/soundcloud/android/utilities/android/MultiSwipeRefreshLayout;", "attach", "view", "Landroid/view/View;", "renderEmptyAtTop", "emptyViewContainer", "", "recyclerViewId", "swipeToRefreshId", "configureRecyclerView", "recyclerView1", "detach", "getAppendState", "Lcom/soundcloud/android/uniflow/android/AppendState;", "asyncLoadingState", "Lcom/soundcloud/android/uniflow/AsyncLoadingState;", "getLayoutManager", "T", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "isEmpty", "isRefreshing", "nextPage", "onNewItems", "newItems", "", "Lio/reactivex/Observable;", "populateAdapter", "render", "state", "Lcom/soundcloud/android/uniflow/android/CollectionRendererState;", "setAnimateItemChanges", "supportsChangeAnimations", "smoothScrollToPosition", "position", "updateEmptyView", "AdapterDiffCallback", "AdapterListUpdateCallback", "UniflowEmptyStateProvider", "uniflow-android_release"}, mv = {1, 1, 15})
/* renamed from: ZEa reason: default package and case insensitive filesystem */
/* compiled from: UniflowLibCollectionRenderer.kt */
public class C5494ZEa<ItemT, ErrorType> {
    private RecyclerView a;
    private MultiSwipeRefreshLayout b;
    private androidx.recyclerview.widget.RecyclerView.c c;
    /* access modifiers changed from: private */
    public final C6781kVa<RVa> d;
    /* access modifiers changed from: private */
    public final C6781kVa<RVa> e;
    private boolean f;
    private C4829DEa<ErrorType> g;
    private i h;
    private C5349UEa i;
    private PXa<? extends i> j;
    private final C5407WEa<ItemT> k;
    /* access modifiers changed from: private */
    public final C6308dYa<ItemT, ItemT, Boolean> l;
    /* access modifiers changed from: private */
    public final C6308dYa<ItemT, ItemT, Boolean> m;
    private final c<ErrorType> n;
    private final boolean o;
    private final boolean p;

    /* renamed from: ZEa$a */
    /* compiled from: UniflowLibCollectionRenderer.kt */
    private final class a extends androidx.recyclerview.widget.C0425t.a {
        private final List<ItemT> a;
        private final List<ItemT> b;
        final /* synthetic */ C5494ZEa c;

        public a(C5494ZEa zEa, List<? extends ItemT> list, List<? extends ItemT> list2) {
            C7471uYa.b(list, "oldItems");
            C7471uYa.b(list2, "newItems");
            this.c = zEa;
            this.a = list;
            this.b = list2;
        }

        public int a() {
            return this.b.size();
        }

        public int b() {
            return this.a.size();
        }

        public boolean a(int i, int i2) {
            return ((Boolean) this.c.m.invoke(this.a.get(i), this.b.get(i2))).booleanValue();
        }

        public boolean b(int i, int i2) {
            return ((Boolean) this.c.l.invoke(this.a.get(i), this.b.get(i2))).booleanValue();
        }
    }

    /* renamed from: ZEa$b */
    /* compiled from: UniflowLibCollectionRenderer.kt */
    private static final class b<ItemT> implements O {
        private Integer a;
        private C5407WEa<ItemT> b;

        public final Integer a() {
            return this.a;
        }

        public void b(int i, int i2) {
            C5407WEa<ItemT> wEa = this.b;
            if (wEa != null) {
                wEa.c(i, i2);
            } else {
                C7471uYa.b("adapter");
                throw null;
            }
        }

        public void c(int i, int i2) {
            C5407WEa<ItemT> wEa = this.b;
            if (wEa != null) {
                wEa.a(i, i2);
            } else {
                C7471uYa.b("adapter");
                throw null;
            }
        }

        public final void a(C5407WEa<ItemT> wEa) {
            C7471uYa.b(wEa, "adapter");
            this.b = wEa;
        }

        public void a(int i, int i2, Object obj) {
            C5407WEa<ItemT> wEa = this.b;
            if (wEa != null) {
                wEa.a(i, i2, obj);
            } else {
                C7471uYa.b("adapter");
                throw null;
            }
        }

        public void a(int i, int i2) {
            this.a = Integer.valueOf(i);
            C5407WEa<ItemT> wEa = this.b;
            if (wEa != null) {
                wEa.b(i, i2);
            } else {
                C7471uYa.b("adapter");
                throw null;
            }
        }
    }

    @EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0002H'¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\fH'J\b\u0010\u000f\u001a\u00020\fH'¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer$UniflowEmptyStateProvider;", "ErrorType", "", "configureErrorView", "", "view", "Landroid/view/View;", "errorType", "(Landroid/view/View;Ljava/lang/Object;)V", "configureNoDataView", "configureWaitingView", "errorView", "", "(Ljava/lang/Object;)I", "noDataView", "waitingView", "uniflow-android_release"}, mv = {1, 1, 15})
    /* renamed from: ZEa$c */
    /* compiled from: UniflowLibCollectionRenderer.kt */
    public interface c<ErrorType> {

        /* renamed from: ZEa$c$a */
        /* compiled from: UniflowLibCollectionRenderer.kt */
        public static final class a {
            public static <ErrorType> void a(c<ErrorType> cVar, View view) {
                C7471uYa.b(view, "view");
            }

            public static <ErrorType> void a(c<ErrorType> cVar, View view, ErrorType errortype) {
                C7471uYa.b(view, "view");
            }

            public static <ErrorType> void b(c<ErrorType> cVar, View view) {
                C7471uYa.b(view, "view");
            }
        }

        int a(ErrorType errortype);

        void a(View view);

        void a(View view, ErrorType errortype);

        int b();

        void b(View view);

        int c();
    }

    public C5494ZEa(C5407WEa<ItemT> wEa, C6308dYa<? super ItemT, ? super ItemT, Boolean> dya, C6308dYa<? super ItemT, ? super ItemT, Boolean> dya2, c<ErrorType> cVar, boolean z, boolean z2) {
        C7471uYa.b(wEa, "adapter");
        C7471uYa.b(dya, "sameIdentity");
        C7471uYa.b(dya2, "sameContent");
        this.k = wEa;
        this.l = dya;
        this.m = dya2;
        this.n = cVar;
        this.o = z;
        this.p = z2;
        C6781kVa<RVa> s = C6781kVa.s();
        String str = "PublishSubject.create<Unit>()";
        C7471uYa.a((Object) s, str);
        this.d = s;
        C6781kVa<RVa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.e = s2;
        C5407WEa<ItemT> wEa2 = this.k;
        if (!(wEa2 instanceof C5407WEa)) {
            wEa2 = null;
        }
        if (wEa2 != null) {
            wEa2.a((OnClickListener) new C5465YEa(this));
        }
    }

    /* access modifiers changed from: private */
    public final void h() {
        if (this.f) {
            this.e.a(RVa.a);
        }
    }

    public void a(RecyclerView recyclerView) {
        C7471uYa.b(recyclerView, "recyclerView1");
    }

    public final APa<RVa> f() {
        return this.e;
    }

    public final C6781kVa<RVa> g() {
        return this.d;
    }

    public static /* synthetic */ void a(C5494ZEa zEa, View view, boolean z, PXa pXa, int i2, int i3, int i4, int i5, Object obj) {
        if (obj == null) {
            boolean z2 = (i5 & 2) != 0 ? false : z;
            if ((i5 & 4) != 0) {
                pXa = new C5625bFa(view);
            }
            zEa.a(view, z2, pXa, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attach");
    }

    public final void b() {
        C5349UEa uEa = this.i;
        if (uEa != null) {
            uEa.b();
        }
        this.i = null;
        androidx.recyclerview.widget.RecyclerView.c cVar = this.c;
        if (cVar != null) {
            this.k.b(cVar);
        }
        this.g = null;
        this.h = null;
        this.c = null;
        this.b = null;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.a = null;
        this.j = null;
    }

    public final RecyclerView c() {
        return this.a;
    }

    public final boolean d() {
        return this.k.i();
    }

    public final boolean e() {
        MultiSwipeRefreshLayout multiSwipeRefreshLayout = this.b;
        return multiSwipeRefreshLayout != null && multiSwipeRefreshLayout.b();
    }

    public void a(View view, boolean z, PXa<? extends i> pXa, int i2, int i3, int i4) {
        C7471uYa.b(view, "view");
        C7471uYa.b(pXa, "layoutManagerProvider");
        if (this.a == null) {
            this.a = (RecyclerView) view.findViewById(i3);
            this.b = (MultiSwipeRefreshLayout) view.findViewById(i4);
            this.j = pXa;
            RecyclerView recyclerView = this.a;
            String str = "Required value was null.";
            if (recyclerView != null) {
                recyclerView.setLayoutManager((i) pXa.d());
                RecyclerView recyclerView2 = this.a;
                if (recyclerView2 != null) {
                    a(recyclerView2);
                    c<ErrorType> cVar = this.n;
                    if (cVar != null) {
                        this.g = new C4829DEa<>(cVar, z, i2);
                        this.h = new LinearLayoutManager(view.getContext());
                    }
                    MultiSwipeRefreshLayout multiSwipeRefreshLayout = this.b;
                    if (multiSwipeRefreshLayout != null) {
                        multiSwipeRefreshLayout.setSwipeableChildren(this.a);
                        multiSwipeRefreshLayout.setOnRefreshListener(new C5523_Ea(this));
                        multiSwipeRefreshLayout.setColorSchemeResources(e.soundcloudOrange);
                    }
                    RecyclerView recyclerView3 = this.a;
                    if (recyclerView3 != null) {
                        this.i = new C5349UEa(recyclerView3, new C5557aFa(this));
                        C5349UEa uEa = this.i;
                        if (uEa != null) {
                            uEa.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalStateException("Recycler View already attached. Did you forget to detach?");
    }

    public /* synthetic */ C5494ZEa(C5407WEa wEa, C6308dYa dya, C6308dYa dya2, c cVar, boolean z, boolean z2, int i2, C7264rYa rya) {
        if ((i2 & 4) != 0) {
            dya2 = C5436XEa.a;
        }
        this(wEa, dya, dya2, cVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    private final void b(C4736AEa<? extends ItemT, ErrorType> aEa) {
        C4829DEa<ErrorType> dEa = this.g;
        if (dEa != null) {
            dEa.a(C4891FEa.a.a(aEa.a().a(), aEa.a().d()));
            dEa.e();
        }
    }

    private final void b(List<? extends ItemT> list) {
        this.k.f();
        for (Object a2 : list) {
            this.k.a(a2);
        }
    }

    public final void a(C4736AEa<? extends ItemT, ErrorType> aEa) {
        C7471uYa.b(aEa, "state");
        this.f = aEa.a().c();
        C5407WEa<ItemT> wEa = this.k;
        androidx.recyclerview.widget.RecyclerView.a aVar = null;
        if (!(wEa instanceof C5407WEa)) {
            wEa = null;
        }
        if (wEa != null) {
            wEa.a(a(aEa.a()));
        }
        MultiSwipeRefreshLayout multiSwipeRefreshLayout = this.b;
        if (multiSwipeRefreshLayout != null) {
            multiSwipeRefreshLayout.setRefreshing(aEa.a().e());
        }
        if (aEa.b().isEmpty()) {
            RecyclerView recyclerView = this.a;
            if (recyclerView != null) {
                aVar = recyclerView.getAdapter();
            }
            C4829DEa<ErrorType> dEa = this.g;
            if (aVar != dEa) {
                RecyclerView recyclerView2 = this.a;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(dEa);
                }
                RecyclerView recyclerView3 = this.a;
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutManager(this.h);
                }
                a(true);
            }
            b(aEa);
            return;
        }
        RecyclerView recyclerView4 = this.a;
        if (recyclerView4 != null) {
            aVar = recyclerView4.getAdapter();
        }
        if (aVar != this.k) {
            b(aEa.b());
            a(this.o);
            RecyclerView recyclerView5 = this.a;
            if (recyclerView5 != null) {
                recyclerView5.setAdapter(this.k);
            }
            RecyclerView recyclerView6 = this.a;
            if (recyclerView6 != null) {
                PXa<? extends i> pXa = this.j;
                if (pXa != null) {
                    recyclerView6.setLayoutManager((i) pXa.d());
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            this.k.e();
            return;
        }
        a(aEa.b());
    }

    public final void a(int i2) {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.j(i2);
        }
    }

    private final C7796zEa a(C6900mEa<ErrorType> mea) {
        if (mea.d()) {
            return C7796zEa.LOADING;
        }
        if (mea.a() != null) {
            return C7796zEa.ERROR;
        }
        return C7796zEa.IDLE;
    }

    private final void a(boolean z) {
        RecyclerView recyclerView = this.a;
        f itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
        if (itemAnimator instanceof ha) {
            ((ha) itemAnimator).a(z);
        }
    }

    public final C5407WEa<ItemT> a() {
        return this.k;
    }

    private final void a(List<? extends ItemT> list) {
        androidx.recyclerview.widget.C0425t.b a2 = C0425t.a(new a(this, a().h(), list), true);
        C7471uYa.a((Object) a2, "DiffUtil.calculateDiff(A…ldItems, newItems), true)");
        if (this.p) {
            b bVar = new b();
            bVar.a(a());
            b(list);
            a2.a((O) bVar);
            Integer a3 = bVar.a();
            if (a3 != null) {
                a(a3.intValue());
                return;
            }
            return;
        }
        b(list);
        a2.a((androidx.recyclerview.widget.RecyclerView.a) a());
    }
}
