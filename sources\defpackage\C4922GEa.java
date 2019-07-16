package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.soundcloud.android.utilities.android.h;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u001d\u001e\u001f !\"B\u001d\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001f\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\f0\u000bR\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\f0\u0011R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/soundcloud/android/uniflow/android/EmptyViewProvider;", "ErrorType", "", "emptyStateProvider", "Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer$UniflowEmptyStateProvider;", "renderEmptyAtTop", "", "(Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer$UniflowEmptyStateProvider;Z)V", "getEmptyStateProvider", "()Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer$UniflowEmptyStateProvider;", "errorViewProvider", "Lcom/soundcloud/android/uniflow/android/EmptyViewProvider$ErrorViewProvider;", "noDataProvider", "Lcom/soundcloud/android/uniflow/android/EmptyViewProvider$NoDataProvider;", "getRenderEmptyAtTop", "()Z", "waitingViewProvider", "Lcom/soundcloud/android/uniflow/android/EmptyViewProvider$WaitingViewProvider;", "errorView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "throwable", "errorView$uniflow_android_release", "(Landroid/view/ViewGroup;Ljava/lang/Object;)Landroid/view/View;", "noDataView", "noDataView$uniflow_android_release", "waitingView", "waitingView$uniflow_android_release", "EmptyStateProviderData", "EmptyViewGenerator", "EmptyViewType", "ErrorViewProvider", "NoDataProvider", "WaitingViewProvider", "uniflow-android_release"}, mv = {1, 1, 15})
/* renamed from: GEa reason: default package and case insensitive filesystem */
/* compiled from: EmptyViewProvider.kt */
public final class C4922GEa<ErrorType> {
    private final d a = new d<>();
    private final e b = new e<>();
    private final f c = new f<>();
    private final defpackage.C5494ZEa.c<ErrorType> d;
    private final boolean e;

    /* renamed from: GEa$a */
    /* compiled from: EmptyViewProvider.kt */
    private static final class a {
        private final int a;
        private final c b;

        public a(int i, c cVar) {
            C7471uYa.b(cVar, "emptyViewType");
            this.a = i;
            this.b = cVar;
        }

        public final c a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!(this.a == aVar.a) || !C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.a * 31;
            c cVar = this.b;
            return i + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EmptyStateProviderData(newLayoutId=");
            sb.append(this.a);
            sb.append(", emptyViewType=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: GEa$b */
    /* compiled from: EmptyViewProvider.kt */
    private class b {
        private Integer a;
        private View b;

        public b() {
        }

        public final View a(ViewGroup viewGroup, PXa<a> pXa) {
            C7471uYa.b(viewGroup, "parent");
            C7471uYa.b(pXa, "generator");
            a aVar = (a) pXa.d();
            Integer num = this.a;
            int b2 = aVar.b();
            if (num != null && num.intValue() == b2) {
                View view = this.b;
                if (view != null) {
                    return view;
                }
                throw new IllegalStateException("Required value was null.");
            }
            View a2 = h.a(viewGroup, aVar.b());
            a2.setLayoutParams(a(aVar.a()));
            this.b = a2;
            this.a = Integer.valueOf(aVar.b());
            return a2;
        }

        private final LayoutParams a(c cVar) {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            boolean z = true;
            if (!(!C7471uYa.a((Object) cVar, (Object) C0147c.a)) || !C4922GEa.this.b()) {
                z = false;
            }
            if (z) {
                layoutParams.addRule(14);
                layoutParams.addRule(10);
            } else {
                layoutParams.addRule(13);
            }
            return layoutParams;
        }
    }

    @EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/uniflow/android/EmptyViewProvider$EmptyViewType;", "", "()V", "Error", "OK", "Waiting", "Lcom/soundcloud/android/uniflow/android/EmptyViewProvider$EmptyViewType$Waiting;", "Lcom/soundcloud/android/uniflow/android/EmptyViewProvider$EmptyViewType$OK;", "Lcom/soundcloud/android/uniflow/android/EmptyViewProvider$EmptyViewType$Error;", "uniflow-android_release"}, mv = {1, 1, 15})
    /* renamed from: GEa$c */
    /* compiled from: EmptyViewProvider.kt */
    private static abstract class c {

        /* renamed from: GEa$c$a */
        /* compiled from: EmptyViewProvider.kt */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: GEa$c$b */
        /* compiled from: EmptyViewProvider.kt */
        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: GEa$c$c reason: collision with other inner class name */
        /* compiled from: EmptyViewProvider.kt */
        public static final class C0147c extends c {
            public static final C0147c a = new C0147c();

            private C0147c() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: GEa$d */
    /* compiled from: EmptyViewProvider.kt */
    private final class d extends b {
        public d() {
            super();
        }

        public final View a(ViewGroup viewGroup, ErrorType errortype) {
            C7471uYa.b(viewGroup, "parent");
            View a = a(viewGroup, new C4953HEa(this, errortype));
            C4922GEa.this.a().a(a, errortype);
            return a;
        }
    }

    /* renamed from: GEa$e */
    /* compiled from: EmptyViewProvider.kt */
    private final class e extends b {
        public e() {
            super();
        }

        public final View a(ViewGroup viewGroup) {
            C7471uYa.b(viewGroup, "parent");
            View a = a(viewGroup, new C4984IEa(this));
            C4922GEa.this.a().a(a);
            return a;
        }
    }

    /* renamed from: GEa$f */
    /* compiled from: EmptyViewProvider.kt */
    private final class f extends b {
        public f() {
            super();
        }

        public final View a(ViewGroup viewGroup) {
            C7471uYa.b(viewGroup, "parent");
            View a = a(viewGroup, new C5015JEa(this));
            C4922GEa.this.a().b(a);
            return a;
        }
    }

    public C4922GEa(defpackage.C5494ZEa.c<ErrorType> cVar, boolean z) {
        C7471uYa.b(cVar, "emptyStateProvider");
        this.d = cVar;
        this.e = z;
    }

    public final defpackage.C5494ZEa.c<ErrorType> a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final View a(ViewGroup viewGroup, ErrorType errortype) {
        C7471uYa.b(viewGroup, "parent");
        return this.a.a(viewGroup, errortype);
    }

    public final View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.c.a(viewGroup);
    }

    public final View a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return this.b.a(viewGroup);
    }
}
