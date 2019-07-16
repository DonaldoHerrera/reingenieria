package com.soundcloud.android.comments;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ:\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0012J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0012J \u0010&\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010\"\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010\u0011H\u0012J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u0015H\u0016J\"\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/soundcloud/android/comments/TrackCommentOperations;", "", "apiClientRx", "Lcom/soundcloud/android/libs/api/ApiClientRx;", "scheduler", "Lio/reactivex/Scheduler;", "userWriter", "Lcom/soundcloud/android/foundation/domain/users/UserWriter;", "trackRepository", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "(Lcom/soundcloud/android/libs/api/ApiClientRx;Lio/reactivex/Scheduler;Lcom/soundcloud/android/foundation/domain/users/UserWriter;Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;)V", "addComment", "Lio/reactivex/Single;", "Lcom/soundcloud/android/foundation/domain/comments/Comment;", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "commentText", "", "timestamp", "", "isReply", "", "secretToken", "commentsFromThreads", "", "threads", "Lcom/soundcloud/android/foundation/api/ModelCollection;", "Lcom/soundcloud/android/comments/ApiCommentThread;", "deleteComment", "Lio/reactivex/Completable;", "commentUrn", "forTrack", "Lcom/soundcloud/android/comments/TrackCommentsResponse;", "getResponse", "track", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "request", "Lcom/soundcloud/android/libs/api/ApiRequest;", "nextPage", "nextPageLink", "reportComment", "shouldDelete", "toMobileUsers", "Ljava/util/HashSet;", "Lcom/soundcloud/android/foundation/domain/users/ApiUser;", "Lkotlin/collections/HashSet;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackCommentOperations.kt */
public class gb {
    private static final C4990IKa<Pca<C2873b>> a = new fb();
    public static final a b = new a(null);
    private final efa c;
    private final HPa d;
    /* access modifiers changed from: private */
    public final C3800jea e;
    private final C3760eea f;

    /* compiled from: TrackCommentOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public gb(efa efa, HPa hPa, C3800jea jea, C3760eea eea) {
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(jea, "userWriter");
        C7471uYa.b(eea, "trackRepository");
        this.c = efa;
        this.d = hPa;
        this.e = jea;
        this.f = eea;
    }

    /* access modifiers changed from: private */
    public HashSet<C3776gea> b(Pca<C2873b> pca) {
        List<C2873b> f2 = pca.f();
        C7471uYa.a((Object) f2, "collection");
        HashSet<C3776gea> hashSet = new HashSet<>();
        for (C2873b a2 : f2) {
            Pca<C2870a> a3 = a2.a();
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a3, 10));
            for (C2870a b2 : a3) {
                arrayList.add(b2.b());
            }
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public IPa<Db> a(C3508cda cda, String str) {
        C7471uYa.b(cda, "trackUrn");
        IPa<Db> d2 = Nda.a(this.f.a(cda, defpackage.C3760eea.a.SYNC_MISSING)).d((C7118pQa<? super T, ? extends MPa<? extends R>>) new ib<Object,Object>(this, cda, str));
        C7471uYa.a((Object) d2, "trackRepository.track(tr…          }\n            }");
        return d2;
    }

    /* access modifiers changed from: private */
    public IPa<Db> a(C3509cea cea, hfa hfa) {
        IPa<Db> a2 = this.c.a(hfa, a).b(this.d).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new kb<Object,Object>(this, cea));
        C7471uYa.a((Object) a2, "apiClientRx.mappedRespon…         }\n\n            }");
        return a2;
    }

    /* access modifiers changed from: private */
    public List<C3791ida> a(Pca<C2873b> pca) {
        List<C2873b> f2 = pca.f();
        C7471uYa.a((Object) f2, "threads.collection");
        ArrayList arrayList = new ArrayList();
        for (C2873b bVar : f2) {
            Pca a2 = bVar.a();
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) a2, 10));
            int i = 0;
            for (Object next : a2) {
                int i2 = i + 1;
                if (i >= 0) {
                    C2870a aVar = (C2870a) next;
                    C3508cda d2 = aVar.d();
                    C3508cda c2 = bVar.c();
                    long b2 = bVar.b();
                    Date c3 = aVar.c();
                    String a3 = aVar.a();
                    C3508cda l = aVar.b().l();
                    boolean z = i != 0;
                    C3791ida ida = r9;
                    C3791ida ida2 = new C3791ida(d2, c2, b2, c3, a3, l, z);
                    arrayList2.add(ida);
                    i = i2;
                } else {
                    C6782kWa.c();
                    throw null;
                }
            }
            arrayList.addAll(C7676xWa.l(arrayList2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public IPa<Db> a(C3509cea cea, String str) {
        hfa b2 = hfa.b(str).c().b();
        C7471uYa.a((Object) b2, "ApiRequest.get(nextPageL…).forPrivateApi().build()");
        return a(cea, b2);
    }

    public IPa<C3791ida> a(C3508cda cda, String str, long j, boolean z, String str2) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(str, "commentText");
        String str3 = "secret_token";
        IPa<C3791ida> e2 = this.c.a(hfa.c(C2226PO.TRACK_COMMENTS.a(cda)).a(str3, C4928GKa.b(str2)).c().a((Object) LWa.a(NVa.a("body", str), NVa.a("track_time", Long.valueOf(j)))).b(), C2870a.class).b(this.d).e(new hb(cda, j, z));
        C7471uYa.a((Object) e2, "apiClientRx.mappedRespon…          )\n            }");
        return e2;
    }

    public C6979nPa a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "commentUrn");
        C6979nPa b2 = this.c.a(hfa.c(C2226PO.TRACK_REPORT_COMMENT.a()).c().a((Object) LWa.b(NVa.a("comment_urn", cda.b()), NVa.a("should_delete", Boolean.valueOf(z)))).b()).b(this.d);
        C7471uYa.a((Object) b2, "apiClientRx.ignoreResult…  .subscribeOn(scheduler)");
        return b2;
    }

    public C6979nPa a(C3508cda cda) {
        C7471uYa.b(cda, "commentUrn");
        C2226PO po = C2226PO.TRACK_DELETE_COMMENT;
        String b2 = cda.b();
        C7471uYa.a((Object) b2, "commentUrn.content");
        C6979nPa b3 = this.c.a(hfa.a(po.a(b2)).c().b()).b(this.d);
        C7471uYa.a((Object) b3, "apiClientRx.ignoreResult…  .subscribeOn(scheduler)");
        return b3;
    }
}
