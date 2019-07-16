package defpackage;

import java.util.List;

/* renamed from: _fa reason: default package */
/* compiled from: VaultFactory.kt */
public final class _fa {
    public static final <Key, Model, NetworkModel> Zfa<Key, List<Model>> a(C3961cga<Key, NetworkModel> cga, C4618nga<NetworkModel> nga, C4610mga<Key, Model> mga, HPa hPa, Sfa<Key, Model> sfa, C4634pga<Key> pga, C4643qga qga, C4594kga<Key> kga, C4602lga<Key> lga) {
        C3961cga<Key, NetworkModel> cga2 = cga;
        C4594kga<Key> kga2 = kga;
        C4602lga<Key> lga2 = lga;
        C7471uYa.b(cga, "networkFetcher");
        C4618nga<NetworkModel> nga2 = nga;
        C7471uYa.b(nga, "storageWriter");
        C4610mga<Key, Model> mga2 = mga;
        C7471uYa.b(mga, "storageReader");
        HPa hPa2 = hPa;
        C7471uYa.b(hPa, "scheduler");
        Sfa<Key, Model> sfa2 = sfa;
        C7471uYa.b(sfa2, "keyExtractor");
        C4634pga<Key> pga2 = pga;
        C7471uYa.b(pga2, "timeToLiveStorage");
        C4643qga qga2 = qga;
        C7471uYa.b(qga2, "timeToLiveStrategy");
        C7471uYa.b(kga2, "tombstoneStorage");
        C7471uYa.b(lga2, "tombstonesStrategy");
        Qfa qfa = new Qfa(new C4586jga(cga, kga2, lga2), nga2, mga2, hPa2, sfa2, pga2, qga2);
        return qfa;
    }
}
