package com.soundcloud.android.stream;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.soundcloud.android.stream.ja reason: case insensitive filesystem */
/* compiled from: StreamEntityMapper.kt */
public final class C6086ja {
    public static final C4991ILa<C3919yda> a = new C6082ha();
    public static final C4991ILa<C3919yda> b = new C6084ia();
    public static final C6086ja c = new C6086ja();

    private C6086ja() {
    }

    /* access modifiers changed from: private */
    public final C3508cda c(C5326TKa tKa) {
        C3508cda cda;
        String str;
        int c2 = tKa.c("sound_id");
        if (b(tKa) == 0) {
            cda = C3508cda.d((long) c2);
            str = "Urn.forTrack(soundId.toLong())";
        } else {
            cda = C3508cda.c((long) c2);
            str = "Urn.forPlaylist(soundId.toLong())";
        }
        C7471uYa.a((Object) cda, str);
        return cda;
    }

    private final C3903wda d(C5326TKa tKa) {
        String e = tKa.e("reposter_username");
        if (e == null || !(!Cxb.a(e))) {
            return null;
        }
        C3508cda f = C3508cda.f((long) tKa.c("reposter_id"));
        C7471uYa.a((Object) f, "reposterUrn");
        return new C3903wda(e, f);
    }

    /* access modifiers changed from: private */
    public final C3919yda b(C3508cda cda, C5326TKa tKa) {
        C3903wda d = d(tKa);
        long d2 = tKa.d("_id");
        Date b2 = tKa.b("created_at");
        C7471uYa.a((Object) b2, "cursorReader.getDateFromTimestamp(CREATED_AT)");
        C3919yda yda = new C3919yda(d2, cda, b2, tKa.e(d != null ? "reposter_avatar_url" : "sound_user_avatar_url"), d, null);
        return yda;
    }

    /* access modifiers changed from: private */
    public final C3919yda a(C3508cda cda, C5326TKa tKa) {
        C3919yda b2 = b(cda, tKa);
        String str = "ad_urn";
        if (!tKa.f(str) || !tKa.g(str)) {
            return b2;
        }
        C3508cda cda2 = new C3508cda(tKa.e(str));
        String e = tKa.e("tracking_track_clicked_urls");
        C7471uYa.a((Object) e, "cursorReader.getString(T…CKING_TRACK_CLICKED_URLS)");
        List a2 = a(e);
        String e2 = tKa.e("tracking_track_impression_urls");
        C7471uYa.a((Object) e2, "cursorReader.getString(T…NG_TRACK_IMPRESSION_URLS)");
        List a3 = a(e2);
        String e3 = tKa.e("tracking_track_played_urls");
        C7471uYa.a((Object) e3, "cursorReader.getString(T…ACKING_TRACK_PLAYED_URLS)");
        List a4 = a(e3);
        String e4 = tKa.e("tracking_promoter_clicked_urls");
        C7471uYa.a((Object) e4, "cursorReader.getString(T…NG_PROMOTER_CLICKED_URLS)");
        List a5 = a(e4);
        C3895vda a6 = a(tKa);
        C3887uda uda = new C3887uda(a2, null, a5, a4, a3);
        C3879tda tda = new C3879tda(cda2, uda, a6, false, 8, null);
        return C3919yda.a(b2, 0, null, null, null, null, tda, 31, null);
    }

    private final int b(C5326TKa tKa) {
        return tKa.c("sound_type");
    }

    private final C3895vda a(C5326TKa tKa) {
        String str = "promoter_id";
        if (!tKa.g(str)) {
            return null;
        }
        C3508cda f = C3508cda.f(tKa.d(str));
        C7471uYa.a((Object) f, "Urn.forUser(cursorReader…motedTracks.PROMOTER_ID))");
        String e = tKa.e("promoter_name");
        C7471uYa.a((Object) e, "cursorReader.getString(T…otedTracks.PROMOTER_NAME)");
        return new C3895vda(f, e, tKa.e("promoter_avatar_url"));
    }

    private final List<String> a(String str) {
        List list;
        boolean z;
        List a2 = new C7162pxb(" ").a((CharSequence) str, 0);
        if (!a2.isEmpty()) {
            ListIterator listIterator = a2.listIterator(a2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((String) listIterator.previous()).length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    list = C7676xWa.d((Iterable) a2, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = C6918mWa.a();
        if (list != null) {
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return C6918mWa.b((Object[]) (String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new OVa("null cannot be cast to non-null type java.util.Collection<T>");
    }
}
