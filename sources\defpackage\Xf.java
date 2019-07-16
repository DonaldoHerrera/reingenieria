package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: Xf reason: default package */
public final class Xf {
    private static final String a = Hg.a(Xf.class);
    private final List<C1662rg> b;
    private final String c;
    private final boolean d;
    private final long e;

    public Xf(List<C1662rg> list, String str, boolean z, long j) {
        this.c = str;
        this.d = z;
        if (list != null) {
            this.b = list;
            this.e = j;
            return;
        }
        throw new NullPointerException();
    }

    public boolean a() {
        return this.d;
    }

    public List<C1662rg> b(EnumSet<Gf> enumSet) {
        if (enumSet == null) {
            try {
                Hg.c(a, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
                enumSet = Gf.a();
            } catch (Exception e2) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get cards with categories[");
                sb.append(enumSet);
                sb.append("]. Ignoring.");
                Hg.d(str, sb.toString(), e2);
                return null;
            }
        }
        if (enumSet.isEmpty()) {
            Hg.e(a, "The parameter passed into categories is not valid, Appboy is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (C1662rg rgVar : this.b) {
            if (rgVar.a(enumSet) && !rgVar.m()) {
                arrayList.add(rgVar);
            }
        }
        return arrayList;
    }

    public int c(EnumSet<Gf> enumSet) {
        if (enumSet == null) {
            Hg.e(a, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
            return c(Gf.a());
        }
        int i = 0;
        if (enumSet.isEmpty()) {
            Hg.e(a, "The parameters passed into categories are Empty, Appboy is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        for (C1662rg rgVar : this.b) {
            if (rgVar.a(enumSet) && !rgVar.l() && !rgVar.m()) {
                i++;
            }
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedUpdatedEvent{");
        sb.append("mFeedCards=");
        sb.append(this.b);
        sb.append(", mUserId='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mFromOfflineStorage=");
        sb.append(this.d);
        sb.append(", mTimestamp=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }

    public int a(EnumSet<Gf> enumSet) {
        if (enumSet == null) {
            Hg.c(a, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return this.b.size();
        } else if (!enumSet.isEmpty()) {
            return b(enumSet).size();
        } else {
            Hg.e(a, "The parameters passed into categories are not valid, Appboy is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
    }

    public long b() {
        return this.e;
    }
}
