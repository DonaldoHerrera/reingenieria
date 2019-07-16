package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qvb reason: default package and case insensitive filesystem */
/* compiled from: DFS */
public class C7227qvb {

    /* renamed from: qvb$a */
    /* compiled from: DFS */
    public static abstract class a<N, R> implements c<N, R> {
        public void a(N n) {
        }
    }

    /* renamed from: qvb$b */
    /* compiled from: DFS */
    public interface b<N> {
        Iterable<? extends N> a(N n);
    }

    /* renamed from: qvb$c */
    /* compiled from: DFS */
    public interface c<N, R> {
        R a();

        void a(N n);

        boolean b(N n);
    }

    /* renamed from: qvb$d */
    /* compiled from: DFS */
    public interface d<N> {
        boolean a(N n);
    }

    /* renamed from: qvb$e */
    /* compiled from: DFS */
    public static class e<N> implements d<N> {
        private final Set<N> a;

        public e() {
            this(new HashSet());
        }

        private static /* synthetic */ void a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        public boolean a(N n) {
            return this.a.add(n);
        }

        public e(Set<N> set) {
            if (set != null) {
                this.a = set;
            } else {
                a(0);
                throw null;
            }
        }
    }

    public static <N, R> R a(Collection<N> collection, b<N> bVar, d<N> dVar, c<N, R> cVar) {
        if (collection == null) {
            a(0);
            throw null;
        } else if (bVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (cVar != null) {
            for (N a2 : collection) {
                a(a2, bVar, dVar, cVar);
            }
            return cVar.a();
        } else {
            a(3);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R a(Collection<N> collection, b<N> bVar, c<N, R> cVar) {
        if (collection == null) {
            a(4);
            throw null;
        } else if (bVar == null) {
            a(5);
            throw null;
        } else if (cVar != null) {
            return a(collection, bVar, (d<N>) new e<N>(), cVar);
        } else {
            a(6);
            throw null;
        }
    }

    public static <N> Boolean a(Collection<N> collection, b<N> bVar, _Xa<N, Boolean> _xa) {
        if (collection == null) {
            a(7);
            throw null;
        } else if (bVar == null) {
            a(8);
            throw null;
        } else if (_xa != null) {
            return (Boolean) a(collection, bVar, (c<N, R>) new C7158pvb<N,R>(_xa, new boolean[1]));
        } else {
            a(9);
            throw null;
        }
    }

    public static <N> void a(N n, b<N> bVar, d<N> dVar, c<N, ?> cVar) {
        if (n == null) {
            a(22);
            throw null;
        } else if (bVar == null) {
            a(23);
            throw null;
        } else if (dVar == null) {
            a(24);
            throw null;
        } else if (cVar == null) {
            a(25);
            throw null;
        } else if (dVar.a(n) && cVar.b(n)) {
            for (Object a2 : bVar.a(n)) {
                a((N) a2, bVar, dVar, cVar);
            }
            cVar.a(n);
        }
    }
}
