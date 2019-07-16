package com.appboy.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.appboy.ui.R$drawable;
import java.util.ArrayList;
import java.util.List;

public class StarRatingView extends LinearLayout {
    private static final String TAG = Hg.a(StarRatingView.class);
    private float mRating = 0.0f;
    private List<ImageView> mStarRating;

    public StarRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        this.mStarRating = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView(context);
            imageView.setTag(Integer.valueOf(0));
            addView(imageView, new LayoutParams(-2, -2));
            this.mStarRating.add(imageView);
        }
        setRating(this.mRating);
    }

    /* access modifiers changed from: 0000 */
    public List<ImageView> getImageViewList() {
        return this.mStarRating;
    }

    public float getRating() {
        return this.mRating;
    }

    public boolean setRating(float f) {
        if (f < 0.0f || f > 5.0f) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to set rating to ");
            sb.append(f);
            sb.append(". Rating must be between 0 and ");
            sb.append(5);
            Hg.b(str, sb.toString());
            return false;
        }
        this.mRating = f;
        int floor = (int) Math.floor((double) this.mRating);
        for (int i = 0; i < floor; i++) {
            ImageView imageView = (ImageView) this.mStarRating.get(i);
            imageView.setTag(Integer.valueOf(R$drawable.com_appboy_rating_full_star));
            imageView.setImageResource(R$drawable.com_appboy_rating_full_star);
        }
        for (int ceil = (int) Math.ceil((double) this.mRating); ceil < this.mStarRating.size(); ceil++) {
            ImageView imageView2 = (ImageView) this.mStarRating.get(ceil);
            imageView2.setTag(Integer.valueOf(R$drawable.com_appboy_rating_empty_star));
            imageView2.setImageResource(R$drawable.com_appboy_rating_empty_star);
        }
        float f2 = f - ((float) floor);
        if (f2 > 0.0f) {
            ImageView imageView3 = (ImageView) this.mStarRating.get(floor);
            if (f2 < 0.25f) {
                imageView3.setTag(Integer.valueOf(R$drawable.com_appboy_rating_empty_star));
                imageView3.setImageResource(R$drawable.com_appboy_rating_empty_star);
            } else if (f2 < 0.75f) {
                imageView3.setTag(Integer.valueOf(R$drawable.com_appboy_rating_half_star));
                imageView3.setImageResource(R$drawable.com_appboy_rating_half_star);
            } else {
                imageView3.setTag(Integer.valueOf(R$drawable.com_appboy_rating_full_star));
                imageView3.setImageResource(R$drawable.com_appboy_rating_full_star);
            }
        }
        return true;
    }
}
