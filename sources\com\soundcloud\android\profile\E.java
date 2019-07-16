package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.Db.a.C0132a;
import com.soundcloud.android.profile.P.b;
import com.soundcloud.android.properties.m.r;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ProfileBucketsDataSource.kt */
final class E extends C7540vYa implements C6376eYa<Map<C3508cda, ? extends C6185ma>, Map<C3508cda, ? extends C4954HFa>, Map<C3508cda, ? extends C3863rda>, List<P>> {
    final /* synthetic */ I a;
    final /* synthetic */ C5785g b;
    final /* synthetic */ SearchQuerySourceInfo c;

    E(I i, C5785g gVar, SearchQuerySourceInfo searchQuerySourceInfo) {
        this.a = i;
        this.b = gVar;
        this.c = searchQuerySourceInfo;
        super(3);
    }

    public final List<P> a(Map<C3508cda, ? extends C6185ma> map, Map<C3508cda, C4954HFa> map2, Map<C3508cda, ? extends C3863rda> map3) {
        String str;
        ArrayList arrayList;
        C7471uYa.b(map, "availableTracks");
        C7471uYa.b(map2, "<anonymous parameter 1>");
        C7471uYa.b(map3, "availablePlaylists");
        C3508cda i = this.b.i();
        List f = this.b.e().f();
        String str2 = "apiUserProfile.spotlight.collection";
        C7471uYa.a((Object) f, str2);
        Collection arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) f, 10));
        Iterator it = f.iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            C5775e eVar = (C5775e) it.next();
            I i2 = this.a;
            C7471uYa.a((Object) eVar, str);
            arrayList2.add(I.a(i2, eVar, (C3508cda) null, 1, (Object) null));
        }
        String str3 = "apiUserProfile.topTracks.collection";
        if (this.a.g.a((a) r.a)) {
            List<C1995DP> f2 = this.b.f().f();
            C7471uYa.a((Object) f2, str3);
            ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) f2, 10));
            for (C1995DP dp : f2) {
                I i3 = this.a;
                C7471uYa.a((Object) dp, str);
                arrayList3.add(I.a(i3, dp, (C3508cda) null, 1, (Object) null));
            }
            arrayList2 = C7676xWa.c(arrayList2, (Iterable) arrayList3);
        }
        List<C1995DP> f3 = this.b.g().f();
        String str4 = "apiUserProfile.tracks.collection";
        C7471uYa.a((Object) f3, str4);
        ArrayList arrayList4 = new ArrayList(C6986nWa.a((Iterable<? extends T>) f3, 10));
        for (C1995DP dp2 : f3) {
            I i4 = this.a;
            C7471uYa.a((Object) dp2, str);
            arrayList4.add(I.a(i4, dp2, (C3508cda) null, 1, (Object) null));
        }
        List f4 = this.b.a().f();
        String str5 = "apiUserProfile.albums.collection";
        C7471uYa.a((Object) f4, str5);
        ArrayList arrayList5 = new ArrayList(C6986nWa.a((Iterable<? extends T>) f4, 10));
        Iterator it2 = f4.iterator();
        while (it2.hasNext()) {
            C3338wP wPVar = (C3338wP) it2.next();
            I i5 = this.a;
            C7471uYa.a((Object) wPVar, str);
            Iterator it3 = it2;
            arrayList5.add(I.a(i5, wPVar, (C3508cda) null, 1, (Object) null));
            it2 = it3;
        }
        List c2 = C7676xWa.c((Collection) arrayList4, (Iterable) arrayList5);
        List f5 = this.b.c().f();
        String str6 = "apiUserProfile.playlists.collection";
        C7471uYa.a((Object) f5, str6);
        ArrayList arrayList6 = new ArrayList(C6986nWa.a((Iterable<? extends T>) f5, 10));
        Iterator it4 = f5.iterator();
        while (it4.hasNext()) {
            C3338wP wPVar2 = (C3338wP) it4.next();
            I i6 = this.a;
            C7471uYa.a((Object) wPVar2, str);
            Iterator it5 = it4;
            String str7 = str6;
            arrayList6.add(I.a(i6, wPVar2, (C3508cda) null, 1, (Object) null));
            it4 = it5;
            str6 = str7;
        }
        String str8 = str6;
        List c3 = C7676xWa.c((Collection) c2, (Iterable) arrayList6);
        List<C5775e> f6 = this.b.d().f();
        String str9 = "apiUserProfile.reposts.collection";
        C7471uYa.a((Object) f6, str9);
        ArrayList arrayList7 = new ArrayList(C6986nWa.a((Iterable<? extends T>) f6, 10));
        for (C5775e eVar2 : f6) {
            I i7 = this.a;
            C7471uYa.a((Object) eVar2, str);
            arrayList7.add(i7.a(eVar2, i));
        }
        List c4 = C7676xWa.c((Collection) c3, (Iterable) arrayList7);
        List f7 = this.b.b().f();
        String str10 = "apiUserProfile.likes.collection";
        C7471uYa.a((Object) f7, str10);
        ArrayList arrayList8 = new ArrayList(C6986nWa.a((Iterable<? extends T>) f7, 10));
        Iterator it6 = f7.iterator();
        while (it6.hasNext()) {
            C5775e eVar3 = (C5775e) it6.next();
            Iterator it7 = it6;
            I i8 = this.a;
            C7471uYa.a((Object) eVar3, str);
            String str11 = str;
            String str12 = str10;
            arrayList8.add(I.a(i8, eVar3, (C3508cda) null, 1, (Object) null));
            str10 = str12;
            it6 = it7;
            str = str11;
        }
        String str13 = str10;
        List c5 = C7676xWa.c(arrayList2, (Iterable) C7676xWa.c((Collection) c4, (Iterable) arrayList8));
        PlaySessionSource a2 = PlaySessionSource.a(Yca.a(this.a.f.a()), i);
        C7471uYa.a((Object) a2, "PlaySessionSource.forArt…r.originScreen), userUrn)");
        C0132a aVar = new C0132a(c5, a2);
        ArrayList arrayList9 = new ArrayList();
        I i9 = this.a;
        List f8 = this.b.e().f();
        C7471uYa.a((Object) f8, str2);
        ArrayList arrayList10 = new ArrayList();
        Iterator it8 = f8.iterator();
        int i10 = 0;
        while (true) {
            String str14 = "item";
            if (it8.hasNext()) {
                Object next = it8.next();
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    C5775e eVar4 = (C5775e) next;
                    I i12 = this.a;
                    C7471uYa.a((Object) eVar4, str14);
                    ArrayList arrayList11 = arrayList10;
                    I i13 = i9;
                    ArrayList arrayList12 = arrayList9;
                    String str15 = str13;
                    String str16 = str8;
                    C0132a aVar2 = aVar;
                    String str17 = str5;
                    String str18 = str4;
                    P a3 = i12.a(eVar4, 0, map, map3, aVar, i10, 0, this.c, i);
                    if (a3 != null) {
                        arrayList = arrayList11;
                        arrayList.add(a3);
                    } else {
                        arrayList = arrayList11;
                    }
                    arrayList10 = arrayList;
                    str4 = str18;
                    aVar = aVar2;
                    i10 = i11;
                    i9 = i13;
                    arrayList9 = arrayList12;
                    str13 = str15;
                    str8 = str16;
                    str5 = str17;
                    Map<C3508cda, ? extends C6185ma> map4 = map;
                } else {
                    C6782kWa.c();
                    throw null;
                }
            } else {
                String str19 = str13;
                ArrayList arrayList13 = arrayList10;
                I i14 = i9;
                ArrayList arrayList14 = arrayList9;
                String str20 = str5;
                String str21 = str4;
                String str22 = str8;
                C0132a aVar3 = aVar;
                C4928GKa h = this.b.e().h();
                C7471uYa.a((Object) h, "apiUserProfile.spotlight.nextLink");
                boolean c6 = h.c();
                String str23 = str14;
                ArrayList arrayList15 = arrayList14;
                C7331sWa.a((Collection) arrayList15, (Iterable) i14.a((List<? extends P>) arrayList13, 0, c6, i, this.c));
                if (this.a.g.a((a) r.a)) {
                    I i15 = this.a;
                    List f9 = this.b.f().f();
                    C7471uYa.a((Object) f9, str3);
                    ArrayList arrayList16 = new ArrayList();
                    int i16 = 0;
                    for (Object next2 : f9) {
                        int i17 = i16 + 1;
                        if (i16 >= 0) {
                            C1995DP dp3 = (C1995DP) next2;
                            I i18 = this.a;
                            C7471uYa.a((Object) dp3, str23);
                            I i19 = i15;
                            P a4 = i18.a(dp3, 6, aVar3, map, i16, J.a(arrayList15).size(), i);
                            if (a4 != null) {
                                arrayList16.add(a4);
                            }
                            i16 = i17;
                            i15 = i19;
                        } else {
                            C6782kWa.c();
                            throw null;
                        }
                    }
                    I i20 = i15;
                    C4928GKa h2 = this.b.f().h();
                    C7471uYa.a((Object) h2, "apiUserProfile.topTracks.nextLink");
                    C7331sWa.a((Collection) arrayList15, (Iterable) i20.a((List<? extends P>) arrayList16, 6, h2.c(), i, this.c));
                }
                I i21 = this.a;
                List f10 = this.b.g().f();
                C7471uYa.a((Object) f10, str21);
                ArrayList arrayList17 = new ArrayList();
                int i22 = 0;
                for (Object next3 : f10) {
                    int i23 = i22 + 1;
                    if (i22 >= 0) {
                        C1995DP dp4 = (C1995DP) next3;
                        I i24 = this.a;
                        C7471uYa.a((Object) dp4, str23);
                        P a5 = i24.a(dp4, 1, aVar3, map, i22, J.a(arrayList15).size(), i);
                        if (a5 != null) {
                            arrayList17.add(a5);
                        }
                        i22 = i23;
                    } else {
                        C6782kWa.c();
                        throw null;
                    }
                }
                C4928GKa h3 = this.b.g().h();
                C7471uYa.a((Object) h3, "apiUserProfile.tracks.nextLink");
                C7331sWa.a((Collection) arrayList15, (Iterable) i21.a((List<? extends P>) arrayList17, 1, h3.c(), i, this.c));
                I i25 = this.a;
                List f11 = this.b.a().f();
                C7471uYa.a((Object) f11, str20);
                ArrayList arrayList18 = new ArrayList();
                int i26 = 0;
                for (Object next4 : f11) {
                    int i27 = i26 + 1;
                    if (i26 >= 0) {
                        C3338wP wPVar3 = (C3338wP) next4;
                        I i28 = this.a;
                        C7471uYa.a((Object) wPVar3, str23);
                        P a6 = i28.a(wPVar3, 2, map3, this.c, i26, i);
                        if (a6 != null) {
                            arrayList18.add(a6);
                        }
                        i26 = i27;
                    } else {
                        C6782kWa.c();
                        throw null;
                    }
                }
                C4928GKa h4 = this.b.a().h();
                C7471uYa.a((Object) h4, "apiUserProfile.albums.nextLink");
                C7331sWa.a((Collection) arrayList15, (Iterable) i25.a((List<? extends P>) arrayList18, 2, h4.c(), i, this.c));
                I i29 = this.a;
                List f12 = this.b.c().f();
                C7471uYa.a((Object) f12, str22);
                ArrayList arrayList19 = new ArrayList();
                int i30 = 0;
                for (Object next5 : f12) {
                    int i31 = i30 + 1;
                    if (i30 >= 0) {
                        C3338wP wPVar4 = (C3338wP) next5;
                        I i32 = this.a;
                        C7471uYa.a((Object) wPVar4, str23);
                        P a7 = i32.a(wPVar4, 3, map3, this.c, i30, i);
                        if (a7 != null) {
                            arrayList19.add(a7);
                        }
                        i30 = i31;
                    } else {
                        C6782kWa.c();
                        throw null;
                    }
                }
                C4928GKa h5 = this.b.c().h();
                C7471uYa.a((Object) h5, "apiUserProfile.playlists.nextLink");
                C7331sWa.a((Collection) arrayList15, (Iterable) i29.a((List<? extends P>) arrayList19, 3, h5.c(), i, this.c));
                I i33 = this.a;
                List f13 = this.b.d().f();
                C7471uYa.a((Object) f13, str9);
                ArrayList arrayList20 = new ArrayList();
                int i34 = 0;
                for (Object next6 : f13) {
                    int i35 = i34 + 1;
                    if (i34 >= 0) {
                        C5775e eVar5 = (C5775e) next6;
                        I i36 = this.a;
                        C7471uYa.a((Object) eVar5, str23);
                        ArrayList arrayList21 = arrayList15;
                        String str24 = str23;
                        P a8 = i36.a(eVar5, 4, map, map3, aVar3, i34, J.a(arrayList15).size(), this.c, i);
                        if (a8 != null) {
                            arrayList20.add(a8);
                        }
                        str23 = str24;
                        i34 = i35;
                        arrayList15 = arrayList21;
                        Map<C3508cda, ? extends C3863rda> map5 = map3;
                    } else {
                        C6782kWa.c();
                        throw null;
                    }
                }
                ArrayList arrayList22 = arrayList15;
                String str25 = str23;
                C4928GKa h6 = this.b.d().h();
                C7471uYa.a((Object) h6, "apiUserProfile.reposts.nextLink");
                ArrayList arrayList23 = arrayList22;
                C7331sWa.a((Collection) arrayList23, (Iterable) i33.a((List<? extends P>) arrayList20, 4, h6.c(), i, this.c));
                I i37 = this.a;
                List f14 = this.b.b().f();
                C7471uYa.a((Object) f14, str19);
                ArrayList arrayList24 = new ArrayList();
                int i38 = 0;
                for (Object next7 : f14) {
                    int i39 = i38 + 1;
                    if (i38 >= 0) {
                        C5775e eVar6 = (C5775e) next7;
                        I i40 = this.a;
                        C7471uYa.a((Object) eVar6, str25);
                        P a9 = i40.a(eVar6, 5, map, map3, aVar3, i38, J.a(arrayList23).size(), this.c, i);
                        if (a9 != null) {
                            arrayList24.add(a9);
                        }
                        i38 = i39;
                    } else {
                        C6782kWa.c();
                        throw null;
                    }
                }
                C4928GKa h7 = this.b.b().h();
                C7471uYa.a((Object) h7, "apiUserProfile.likes.nextLink");
                C7331sWa.a((Collection) arrayList23, (Iterable) i37.a((List<? extends P>) arrayList24, 5, h7.c(), i, this.c));
                if (!arrayList23.isEmpty()) {
                    arrayList23.add(new b());
                }
                return arrayList23;
            }
        }
    }
}
