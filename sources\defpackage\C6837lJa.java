package defpackage;

import android.view.View;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "Lcom/soundcloud/android/uniflow/android/UniflowLibCollectionRenderer$UniflowEmptyStateProvider;", "Lcom/soundcloud/android/view/collection/LegacyError;", "connectionErrorView", "", "errorView", "legacyError", "serverErrorView", "waitingView", "base_release"}, mv = {1, 1, 15})
/* renamed from: lJa reason: default package and case insensitive filesystem */
/* compiled from: EmptyStateProvider.kt */
public interface C6837lJa extends c<C6973nJa> {

    /* renamed from: lJa$a */
    /* compiled from: EmptyStateProvider.kt */
    public static final class a {
        public static int a(C6837lJa lja, C6973nJa nja) {
            C7471uYa.b(nja, "legacyError");
            return C6972nIa.f(nja.b()) ? lja.d() : lja.a();
        }

        public static void a(C6837lJa lja, View view) {
            C7471uYa.b(view, "view");
            defpackage.C5494ZEa.c.a.a(lja, view);
        }

        public static void a(C6837lJa lja, View view, C6973nJa nja) {
            C7471uYa.b(view, "view");
            C7471uYa.b(nja, "errorType");
            defpackage.C5494ZEa.c.a.a(lja, view, nja);
        }

        public static int b(C6837lJa lja) {
            return l.emptyview_server_error;
        }

        public static void b(C6837lJa lja, View view) {
            C7471uYa.b(view, "view");
            defpackage.C5494ZEa.c.a.b(lja, view);
        }

        public static int c(C6837lJa lja) {
            return l.emptyview_progress;
        }

        public static int a(C6837lJa lja) {
            return l.emptyview_connection_error;
        }
    }

    int a();

    int d();
}
