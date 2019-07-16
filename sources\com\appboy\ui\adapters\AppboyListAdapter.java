package com.appboy.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.appboy.ui.widget.BannerImageCardView;
import com.appboy.ui.widget.BaseCardView;
import com.appboy.ui.widget.CaptionedImageCardView;
import com.appboy.ui.widget.CrossPromotionSmallCardView;
import com.appboy.ui.widget.DefaultCardView;
import com.appboy.ui.widget.ShortNewsCardView;
import com.appboy.ui.widget.TextAnnouncementCardView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppboyListAdapter extends ArrayAdapter<C1662rg> {
    private static final String TAG = Hg.a(AppboyListAdapter.class);
    private final Set<String> mCardIdImpressions = new HashSet();
    private final Context mContext;

    public AppboyListAdapter(Context context, int i, List<C1662rg> list) {
        super(context, i, list);
        this.mContext = context;
    }

    private void logCardImpression(C1662rg rgVar) {
        String i = rgVar.i();
        if (!this.mCardIdImpressions.contains(i)) {
            this.mCardIdImpressions.add(i);
            rgVar.logImpression();
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Logged impression for card ");
            sb.append(i);
            Hg.d(str, sb.toString());
        } else {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Already counted impression for card ");
            sb2.append(i);
            Hg.d(str2, sb2.toString());
        }
        if (!rgVar.l()) {
            rgVar.b(true);
        }
    }

    public void batchSetCardsToRead(int i, int i2) {
        if (getCount() == 0) {
            Hg.a(TAG, "mAdapter is empty in setting some cards to viewed.");
            return;
        }
        int max = Math.max(0, i);
        int min = Math.min(getCount(), i2);
        while (true) {
            if (max >= min) {
                break;
            }
            C1662rg rgVar = (C1662rg) getItem(max);
            if (rgVar == null) {
                Hg.a(TAG, "Card was null in setting some cards to viewed.");
                break;
            }
            if (!rgVar.n()) {
                rgVar.a(true);
            }
            max++;
        }
    }

    public int getItemViewType(int i) {
        C1662rg rgVar = (C1662rg) getItem(i);
        if (rgVar instanceof C1603pg) {
            return 1;
        }
        if (rgVar instanceof C1633qg) {
            return 2;
        }
        if (rgVar instanceof C1692sg) {
            return 3;
        }
        if (rgVar instanceof C1722tg) {
            return 4;
        }
        return rgVar instanceof C1752ug ? 5 : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseCardView baseCardView;
        C1662rg rgVar = (C1662rg) getItem(i);
        if (view != null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Reusing convertView for rendering of item ");
            sb.append(i);
            Hg.d(str, sb.toString());
            baseCardView = (BaseCardView) view;
        } else if (rgVar instanceof C1603pg) {
            baseCardView = new BannerImageCardView(this.mContext);
        } else if (rgVar instanceof C1633qg) {
            baseCardView = new CaptionedImageCardView(this.mContext);
        } else if (rgVar instanceof C1692sg) {
            baseCardView = new CrossPromotionSmallCardView(this.mContext);
        } else if (rgVar instanceof C1722tg) {
            baseCardView = new ShortNewsCardView(this.mContext);
        } else if (rgVar instanceof C1752ug) {
            baseCardView = new TextAnnouncementCardView(this.mContext);
        } else {
            baseCardView = new DefaultCardView(this.mContext);
        }
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Using view of type: ");
        sb2.append(baseCardView.getClass().getName());
        sb2.append(" for card at position ");
        sb2.append(i);
        sb2.append(": ");
        sb2.append(rgVar.toString());
        Hg.d(str2, sb2.toString());
        baseCardView.setCard(rgVar);
        logCardImpression(rgVar);
        return baseCardView;
    }

    public int getViewTypeCount() {
        return 8;
    }

    public synchronized void replaceFeed(List<C1662rg> list) {
        int i = 0;
        setNotifyOnChange(false);
        if (list == null) {
            clear();
            notifyDataSetChanged();
            return;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Replacing existing feed of ");
        sb.append(getCount());
        sb.append(" cards with new feed containing ");
        sb.append(list.size());
        sb.append(" cards.");
        Hg.a(str, sb.toString());
        int size = list.size();
        int i2 = 0;
        while (i < getCount()) {
            C1662rg rgVar = (C1662rg) getItem(i);
            C1662rg rgVar2 = null;
            if (i2 < size) {
                rgVar2 = (C1662rg) list.get(i2);
            }
            if (rgVar2 == null || !rgVar2.a(rgVar)) {
                remove(rgVar);
            } else {
                i++;
                i2++;
            }
        }
        super.addAll(list.subList(i2, size));
        notifyDataSetChanged();
    }

    public void resetCardImpressionTracker() {
        this.mCardIdImpressions.clear();
    }

    public synchronized void add(C1662rg rgVar) {
        super.add(rgVar);
    }
}
