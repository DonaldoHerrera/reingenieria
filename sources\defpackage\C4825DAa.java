package defpackage;

import com.soundcloud.android.collections.data.C2848d;
import com.soundcloud.android.collections.data.C2850f;
import com.soundcloud.android.collections.data.C2853i;
import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.collections.data.L;
import com.soundcloud.android.collections.data.ea;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0012J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0012J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0012J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH\u0012J\b\u0010\u001b\u001a\u00020\u001aH\u0012JB\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d\"\b\b\u0000\u0010\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010!\u001a\u00020\r2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0$0#H\u0012J\b\u0010%\u001a\u00020\u001aH\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/soundcloud/android/sync/delta/DeltaSyncer;", "Ljava/util/concurrent/Callable;", "", "apiClient", "Lcom/soundcloud/android/libs/api/ApiClient;", "likesReadStorage", "Lcom/soundcloud/android/collections/data/LikesReadStorage;", "likesWriteStorage", "Lcom/soundcloud/android/collections/data/LikesWriteStorage;", "(Lcom/soundcloud/android/libs/api/ApiClient;Lcom/soundcloud/android/collections/data/LikesReadStorage;Lcom/soundcloud/android/collections/data/LikesWriteStorage;)V", "call", "()Ljava/lang/Boolean;", "getCreateEndpoint", "", "soundType", "Lcom/soundcloud/android/collections/data/Type;", "getDeleteEndpoint", "getDeltaSyncUpdate", "Lcom/soundcloud/android/sync/delta/DeltaSyncResponse;", "deltaSyncRequest", "Lcom/soundcloud/android/sync/delta/DeltaSyncRequest;", "getStoredLikesFor", "", "Lcom/soundcloud/android/collections/data/Like;", "type", "pushLocalLikes", "", "pushLocalState", "sendLikeUpdate", "", "T", "Lcom/soundcloud/android/collections/data/ApiLikeFoundation;", "localLikes", "endpoint", "typeToken", "Lcom/soundcloud/java/reflect/TypeToken;", "Lcom/soundcloud/android/foundation/api/ModelCollection;", "syncLocalState", "Companion", "deltasync_release"}, mv = {1, 1, 15})
/* renamed from: DAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncer.kt */
public class C4825DAa implements Callable<Boolean> {
    private static final C4794CAa a = new C4794CAa();
    private static final C4763BAa b = new C4763BAa();
    public static final a c = new a(null);
    private final dfa d;
    private final K e;
    private final L f;

    /* renamed from: DAa$a */
    /* compiled from: DeltaSyncer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4825DAa(dfa dfa, K k, L l) {
        C7471uYa.b(dfa, "apiClient");
        C7471uYa.b(k, "likesReadStorage");
        C7471uYa.b(l, "likesWriteStorage");
        this.d = dfa;
        this.e = k;
        this.f = l;
    }

    private void a() {
        d(ea.TRACK);
        d(ea.PLAYLIST);
    }

    private void b() {
        C5136NAa a2 = a(C7719yAa.a.a(c(ea.TRACK), c(ea.PLAYLIST))).a().a();
        if (a2 != null) {
            List a3 = C4732AAa.a(a2);
            if (!a3.isEmpty()) {
                this.f.a((Collection<C2853i>) a3);
            }
        }
    }

    private List<C2862s> c(ea eaVar) {
        return this.e.a(eaVar);
    }

    private void d(ea eaVar) {
        List b2 = this.e.b(eaVar);
        if (!b2.isEmpty()) {
            this.f.b(a(b2, a(eaVar), a));
        }
        List c2 = this.e.c(eaVar);
        if (!c2.isEmpty()) {
            this.f.a(a(c2, b(eaVar), b), eaVar);
        }
    }

    public Boolean call() {
        a();
        b();
        return Boolean.valueOf(true);
    }

    private String a(ea eaVar) {
        return eaVar == ea.TRACK ? "/likes/tracks/create" : "/likes/playlists/create";
    }

    private C7788zAa a(C7719yAa yaa) {
        Object a2 = this.d.a(hfa.c("/you/update_collections").a((Object) yaa).c().b(), C4990IKa.a(C7788zAa.class));
        C7471uYa.a(a2, "apiClient.fetchMappedRes…yncResponse::class.java))");
        return (C7788zAa) a2;
    }

    private String b(ea eaVar) {
        return eaVar == ea.TRACK ? "/likes/tracks/delete" : "/likes/playlists/delete";
    }

    private <T extends C2848d> Collection<C2862s> a(List<C2862s> list, String str, C4990IKa<Pca<T>> iKa) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C2862s a2 : list) {
            arrayList.add(KWa.a(NVa.a("target_urn", a2.a().b())));
        }
        Pca pca = (Pca) this.d.a(hfa.c(str).c().a((Object) KWa.a(NVa.a("likes", arrayList))).b(), iKa);
        if (pca != null) {
            List f2 = pca.f();
            if (f2 != null) {
                Collection<C2862s> a3 = C2850f.a.a(f2);
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return C6918mWa.a();
    }
}
