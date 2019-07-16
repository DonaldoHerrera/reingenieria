package com.soundcloud.android.features.discovery;

@EVa(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/soundcloud/android/features/discovery/DiscoveryAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel;", "singleSelectionContentCardRenderer", "Lcom/soundcloud/android/features/discovery/SingleSelectionContentCardRenderer;", "multipleContentSelectionCardRenderer", "Lcom/soundcloud/android/features/discovery/MultipleContentSelectionCardRenderer;", "promotedTrackCardRenderer", "Lcom/soundcloud/android/features/discovery/PromotedTrackCardRenderer;", "upsellHeaderItemRenderer", "Lcom/soundcloud/android/features/upsell/UpsellHeaderItemRenderer;", "emptyCardRenderer", "Lcom/soundcloud/android/discovery/EmptyCardRenderer;", "(Lcom/soundcloud/android/features/discovery/SingleSelectionContentCardRenderer;Lcom/soundcloud/android/features/discovery/MultipleContentSelectionCardRenderer;Lcom/soundcloud/android/features/discovery/PromotedTrackCardRenderer;Lcom/soundcloud/android/features/upsell/UpsellHeaderItemRenderer;Lcom/soundcloud/android/discovery/EmptyCardRenderer;)V", "getBasicItemViewType", "", "position", "promotedTrackCardBound", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$PromotedTrackCard;", "promotedTrackClick", "promotedTrackCreatorClick", "promoterClick", "selectionItemClick", "Lcom/soundcloud/android/discovery/SelectionItemViewModel;", "upsellHeaderItemClick", "", "Kind", "discovery_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.features.discovery.a reason: case insensitive filesystem */
/* compiled from: DiscoveryAdapter.kt */
public class C3543a extends C5407WEa<C3794jY> {
    private final T g;
    private final J h;
    private final O i;
    private final Cca<C3794jY> j;

    /* renamed from: com.soundcloud.android.features.discovery.a$a reason: collision with other inner class name */
    /* compiled from: DiscoveryAdapter.kt */
    public enum C0079a {
        MULTIPLE_CONTENT_SELECTION_CARD,
        SINGLE_CONTENT_SELECTION_CARD,
        PROMOTED_TRACK_CARD,
        EMPTY_CARD,
        UPSELL_HEADER_CARD
    }

    public C3543a(T t, J j2, O o, Cca<C3794jY> cca, C3914yY yYVar) {
        C7471uYa.b(t, "singleSelectionContentCardRenderer");
        C7471uYa.b(j2, "multipleContentSelectionCardRenderer");
        C7471uYa.b(o, "promotedTrackCardRenderer");
        C7471uYa.b(cca, "upsellHeaderItemRenderer");
        C7471uYa.b(yYVar, "emptyCardRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(C0079a.SINGLE_CONTENT_SELECTION_CARD.ordinal(), t), new C5693cFa(C0079a.MULTIPLE_CONTENT_SELECTION_CARD.ordinal(), j2), new C5693cFa(C0079a.PROMOTED_TRACK_CARD.ordinal(), o), new C5693cFa(C0079a.EMPTY_CARD.ordinal(), yYVar), new C5693cFa(C0079a.UPSELL_HEADER_CARD.ordinal(), cca)});
        this.g = t;
        this.h = j2;
        this.i = o;
        this.j = cca;
    }

    public int f(int i2) {
        C3794jY jYVar = (C3794jY) g(i2);
        if (jYVar instanceof d) {
            return C0079a.SINGLE_CONTENT_SELECTION_CARD.ordinal();
        }
        if (jYVar instanceof b) {
            return C0079a.MULTIPLE_CONTENT_SELECTION_CARD.ordinal();
        }
        if (jYVar instanceof c) {
            return C0079a.PROMOTED_TRACK_CARD.ordinal();
        }
        if (jYVar instanceof a) {
            return C0079a.EMPTY_CARD.ordinal();
        }
        if (jYVar instanceof e) {
            return C0079a.UPSELL_HEADER_CARD.ordinal();
        }
        throw new FVa();
    }

    public APa<c> j() {
        return this.i.a();
    }

    public APa<c> k() {
        return this.i.b();
    }

    public APa<c> l() {
        return this.i.c();
    }

    public APa<c> m() {
        return this.i.d();
    }

    public APa<C3445NY> n() {
        APa<C3445NY> b = APa.b((EPa<? extends T>) this.g.a(), (EPa<? extends T>) this.h.b());
        C7471uYa.a((Object) b, "Observable.merge(singleS…rer.selectionItemClick())");
        return b;
    }

    public APa<RVa> o() {
        return this.j.a();
    }
}
