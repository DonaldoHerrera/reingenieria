package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@EVa(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001\u0019B'\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB3\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0012J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/policies/UpdatePoliciesCommand;", "Lcom/soundcloud/android/commands/Command;", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "Lcom/soundcloud/android/foundation/policies/ApiPolicyInfoAndMedia;", "apiClient", "Lcom/soundcloud/android/libs/api/ApiClient;", "storePolicies", "Lcom/soundcloud/android/policies/StorePoliciesCommand;", "mediaStreamsStorageWriter", "Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsStorageWriter;", "tryWithBackOffFactory", "Lcom/soundcloud/android/utils/TryWithBackOff$Factory;", "(Lcom/soundcloud/android/libs/api/ApiClient;Lcom/soundcloud/android/policies/StorePoliciesCommand;Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsStorageWriter;Lcom/soundcloud/android/utils/TryWithBackOff$Factory;)V", "tryWithBackOff", "Lcom/soundcloud/android/utils/TryWithBackOff;", "Lcom/soundcloud/android/foundation/api/ModelCollection;", "(Lcom/soundcloud/android/libs/api/ApiClient;Lcom/soundcloud/android/policies/StorePoliciesCommand;Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsStorageWriter;Lcom/soundcloud/android/utils/TryWithBackOff;)V", "buildApiRequest", "Lcom/soundcloud/android/libs/api/ApiRequest;", "trackUrns", "call", "toMediaStreamEntries", "", "Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsEntry;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: wta reason: default package and case insensitive filesystem */
/* compiled from: UpdatePoliciesCommand.kt */
public class C7636wta extends C1255eT<Collection<? extends C3508cda>, Collection<? extends C3912xea>> {
    /* access modifiers changed from: private */
    public static final C7567vta a = new C7567vta();
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public final dfa c;
    private final C7429tta d;
    private final C5014JDa e;
    private final C5439XHa<Pca<C3912xea>> f;

    /* renamed from: wta$a */
    /* compiled from: UpdatePoliciesCommand.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C7636wta(dfa dfa, C7429tta tta, C5014JDa jDa, C5439XHa<Pca<C3912xea>> xHa) {
        C7471uYa.b(dfa, "apiClient");
        C7471uYa.b(tta, "storePolicies");
        C7471uYa.b(jDa, "mediaStreamsStorageWriter");
        C7471uYa.b(xHa, "tryWithBackOff");
        this.c = dfa;
        this.d = tta;
        this.e = jDa;
        this.f = xHa;
    }

    /* access modifiers changed from: private */
    public hfa b(Collection<C3508cda> collection) {
        b c2 = hfa.c(C2226PO.POLICIES_WITH_MEDIA.a());
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) collection, 10));
        for (C3508cda b2 : collection) {
            arrayList.add(b2.b());
        }
        hfa b3 = c2.a((Object) arrayList).c().b();
        C7471uYa.a((Object) b3, "ApiRequest.post(ApiEndpo…pi()\n            .build()");
        return b3;
    }

    public C7636wta(dfa dfa, C7429tta tta, C5014JDa jDa, defpackage.C5439XHa.a aVar) {
        C7471uYa.b(dfa, "apiClient");
        C7471uYa.b(tta, "storePolicies");
        C7471uYa.b(jDa, "mediaStreamsStorageWriter");
        C7471uYa.b(aVar, "tryWithBackOffFactory");
        C5439XHa a2 = aVar.a();
        C7471uYa.a((Object) a2, "tryWithBackOffFactory.wi…ApiPolicyInfoAndMedia>>()");
        this(dfa, tta, jDa, a2);
    }

    public Collection<C3912xea> a(Collection<C3508cda> collection) throws C7360sta {
        String str = "PolicyUpdater";
        C7471uYa.b(collection, "trackUrns");
        try {
            List<List> b2 = C7676xWa.b((Iterable<? extends T>) collection, 650);
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) b2, 10));
            for (List list : b2) {
                SDb.a(str).d("Fetching policy batch: %s", Integer.valueOf(list.size()));
                Pca<C3912xea> pca = (Pca) this.f.a(new C7705xta(list, this));
                C7471uYa.a((Object) pca, "apiPolicyInfosWithMedia");
                SDb.a(str).d("Writing policy batch: %s", Integer.valueOf(pca.f().size()));
                C7429tta tta = this.d;
                ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) pca, 10));
                for (C3912xea a2 : pca) {
                    arrayList2.add(a2.a());
                }
                C6431fLa fla = (C6431fLa) tta.a(arrayList2);
                if (!fla.b()) {
                    C7471uYa.a((Object) fla, "policyResult");
                    C5529_Ka a3 = fla.a();
                    if (a3 == null) {
                        C7471uYa.a();
                        throw null;
                    }
                    throw a3;
                }
                List a4 = a(pca);
                SDb.a(str).d("Storing media stream entries: %s", Integer.valueOf(a4.size()));
                this.e.a(a4);
                SDb.a(str).d("OK!", new Object[0]);
                arrayList.add(pca.f());
            }
            return C6986nWa.b((Iterable<? extends Iterable<? extends T>>) arrayList);
        } catch (Exception e2) {
            throw new C7360sta(e2);
        }
    }

    private List<C7587wDa> a(Pca<C3912xea> pca) {
        ArrayList arrayList = new ArrayList();
        for (C3912xea xea : pca) {
            Zda b2 = xea.b();
            C7587wDa wda = b2 != null ? new C7587wDa(xea.a().c(), b2) : null;
            if (wda != null) {
                arrayList.add(wda);
            }
        }
        return arrayList;
    }
}
