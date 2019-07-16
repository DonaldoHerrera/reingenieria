package com.soundcloud.android.payments;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.C0370l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.payments.Fa.i;
import com.soundcloud.android.payments.Fa.p;
import com.soundcloud.android.view.LoadingButton;

@EVa(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0016\u0018\u0000 92\u00020\u0001:\u00029:B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0012J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J\b\u0010 \u001a\u00020\u0019H\u0012J\b\u0010!\u001a\u00020\u0019H\u0016J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0012J \u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0012J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J\u0018\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u00100\u001a\u00020\u0019H\u0016J \u00101\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*2\u0006\u00102\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020*H\u0016J\b\u00103\u001a\u00020\u0019H\u0016J\u0012\u00104\u001a\u00020\u00192\b\b\u0001\u00105\u001a\u00020\u001fH\u0016J\u001c\u00106\u001a\u00020\u00192\b\b\u0001\u00105\u001a\u00020\u001f2\b\b\u0001\u00107\u001a\u00020\u001fH\u0016J\u0018\u00108\u001a\u00020\u00192\u0006\u0010/\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u001fH\u0012R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/soundcloud/android/payments/ConversionView;", "", "resources", "Landroid/content/res/Resources;", "formatter", "Lcom/soundcloud/android/payments/ProductInfoFormatter;", "(Landroid/content/res/Resources;Lcom/soundcloud/android/payments/ProductInfoFormatter;)V", "buyButton", "Lcom/soundcloud/android/view/LoadingButton;", "closeButton", "Landroid/widget/ImageView;", "description", "Landroid/widget/TextView;", "featuresView", "Landroid/view/View;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "moreButton", "Landroid/widget/Button;", "priceInfo", "restrictionsView", "title", "adjustTopMargin", "", "bindViews", "parentView", "conversionRestrictionsDialog", "Lcom/soundcloud/android/payments/ConversionRestrictionsDialog;", "trialDays", "", "enableBuyButton", "enableMoreOption", "setupContentView", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "listener", "Lcom/soundcloud/android/payments/ConversionView$Listener;", "setupListener", "setupPromoRestrictions", "duration", "", "promoPrice", "regularPrice", "setupRestrictions", "showDetails", "price", "showLoadingState", "showPromo", "promoDays", "showRetryState", "showTitleWithCheckboxes", "titleCopy", "showTitleWithDescription", "descriptionCopy", "showTrialDays", "Companion", "Listener", "payments_release"}, mv = {1, 1, 15})
/* compiled from: ConversionView.kt */
public class H {
    public static final a a = new a(null);
    private C0370l b;
    private TextView c;
    private TextView d;
    private LoadingButton e;
    private Button f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private View j;
    private Guideline k;
    private final Resources l;
    private final Ba m;

    /* compiled from: ConversionView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: ConversionView.kt */
    public interface b {
        void h();

        void i();

        void onClose();
    }

    public H(Resources resources, Ba ba) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(ba, "formatter");
        this.l = resources;
        this.m = ba;
    }

    private void b(String str, int i2) {
        LoadingButton loadingButton = this.e;
        if (loadingButton != null) {
            loadingButton.setActionText(this.m.a(i2));
            TextView textView = this.h;
            if (textView != null) {
                textView.setText(this.m.a(str, i2));
                c(i2);
                return;
            }
            C7471uYa.b("priceInfo");
            throw null;
        }
        C7471uYa.b("buyButton");
        throw null;
    }

    private void c(int i2) {
        TextView textView = this.i;
        String str = "restrictionsView";
        if (textView != null) {
            textView.setOnClickListener(new M(this, i2));
            TextView textView2 = this.i;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    private void d() {
        Guideline guideline = this.k;
        String str = "guideline";
        if (guideline != null) {
            LayoutParams layoutParams = guideline.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.c = 0.05f;
                Guideline guideline2 = this.k;
                if (guideline2 != null) {
                    guideline2.setLayoutParams(layoutParams2);
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            } else {
                throw new OVa("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    private void e() {
        LoadingButton loadingButton = this.e;
        String str = "buyButton";
        if (loadingButton != null) {
            loadingButton.setEnabled(true);
            LoadingButton loadingButton2 = this.e;
            if (loadingButton2 != null) {
                loadingButton2.setLoading(false);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    public static final /* synthetic */ C0370l a(H h2) {
        C0370l lVar = h2.b;
        if (lVar != null) {
            return lVar;
        }
        C7471uYa.b("fragmentManager");
        throw null;
    }

    public void a(AppCompatActivity appCompatActivity, b bVar) {
        C7471uYa.b(appCompatActivity, "activity");
        C7471uYa.b(bVar, CastExtraArgs.LISTENER);
        C0370l supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        C7471uYa.a((Object) supportFragmentManager, "activity.supportFragmentManager");
        this.b = supportFragmentManager;
        View findViewById = appCompatActivity.findViewById(16908290);
        C7471uYa.a((Object) findViewById, "activity.findViewById(android.R.id.content)");
        a(findViewById);
        a(bVar);
    }

    public void c() {
        LoadingButton loadingButton = this.e;
        String str = "buyButton";
        if (loadingButton != null) {
            loadingButton.setEnabled(true);
            LoadingButton loadingButton2 = this.e;
            if (loadingButton2 != null) {
                loadingButton2.a();
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    private void a(View view) {
        View findViewById = view.findViewById(i.conversion_title);
        C7471uYa.a((Object) findViewById, "parentView.findViewById(R.id.conversion_title)");
        this.c = (TextView) findViewById;
        View findViewById2 = view.findViewById(i.conversion_description);
        C7471uYa.a((Object) findViewById2, "parentView.findViewById(…d.conversion_description)");
        this.d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(i.conversion_buy);
        C7471uYa.a((Object) findViewById3, "parentView.findViewById(R.id.conversion_buy)");
        this.e = (LoadingButton) findViewById3;
        View findViewById4 = view.findViewById(i.conversion_restrictions);
        C7471uYa.a((Object) findViewById4, "parentView.findViewById(….conversion_restrictions)");
        this.i = (TextView) findViewById4;
        View findViewById5 = view.findViewById(i.conversion_price_info);
        C7471uYa.a((Object) findViewById5, "parentView.findViewById(…id.conversion_price_info)");
        this.h = (TextView) findViewById5;
        View findViewById6 = view.findViewById(i.close_button);
        C7471uYa.a((Object) findViewById6, "parentView.findViewById(R.id.close_button)");
        this.g = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(i.conversion_features);
        C7471uYa.a((Object) findViewById7, "parentView.findViewById(R.id.conversion_features)");
        this.j = findViewById7;
        View findViewById8 = view.findViewById(i.conversion_more_products);
        C7471uYa.a((Object) findViewById8, "parentView.findViewById(…conversion_more_products)");
        this.f = (Button) findViewById8;
        View findViewById9 = view.findViewById(i.top_guide);
        C7471uYa.a((Object) findViewById9, "parentView.findViewById(R.id.top_guide)");
        this.k = (Guideline) findViewById9;
    }

    /* access modifiers changed from: private */
    public G b(int i2) {
        if (i2 > 0) {
            return G.c(i2);
        }
        return G.Qb();
    }

    public void b() {
        LoadingButton loadingButton = this.e;
        String str = "buyButton";
        if (loadingButton != null) {
            loadingButton.setEnabled(false);
            LoadingButton loadingButton2 = this.e;
            if (loadingButton2 != null) {
                loadingButton2.setLoading(true);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    public void a(int i2, int i3) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(i2);
            TextView textView2 = this.d;
            String str = "description";
            if (textView2 != null) {
                textView2.setText(i3);
                TextView textView3 = this.d;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b("title");
            throw null;
        }
    }

    public void a(int i2) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(i2);
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setVisibility(8);
                d();
                View view = this.j;
                if (view != null) {
                    view.setVisibility(0);
                } else {
                    C7471uYa.b("featuresView");
                    throw null;
                }
            } else {
                C7471uYa.b("description");
                throw null;
            }
        } else {
            C7471uYa.b("title");
            throw null;
        }
    }

    private void a(b bVar) {
        LoadingButton loadingButton = this.e;
        if (loadingButton != null) {
            loadingButton.setOnClickListener(new I(bVar));
            ImageView imageView = this.g;
            if (imageView != null) {
                imageView.setOnClickListener(new J(bVar));
                Button button = this.f;
                if (button != null) {
                    button.setOnClickListener(new K(bVar));
                } else {
                    C7471uYa.b("moreButton");
                    throw null;
                }
            } else {
                C7471uYa.b("closeButton");
                throw null;
            }
        } else {
            C7471uYa.b("buyButton");
            throw null;
        }
    }

    public void a(String str, int i2) {
        C7471uYa.b(str, "price");
        b(str, i2);
        e();
    }

    public void a(String str, int i2, String str2) {
        C7471uYa.b(str, "promoPrice");
        C7471uYa.b(str2, "regularPrice");
        LoadingButton loadingButton = this.e;
        if (loadingButton != null) {
            loadingButton.setActionText(this.l.getString(p.conversion_buy_promo));
            String c2 = this.m.c(i2);
            C7471uYa.a((Object) c2, "formatter.promoDuration(promoDays)");
            a(c2, str, str2);
            e();
            return;
        }
        C7471uYa.b("buyButton");
        throw null;
    }

    private void a(String str, String str2, String str3) {
        TextView textView = this.i;
        String str4 = "restrictionsView";
        if (textView != null) {
            textView.setText(this.l.getString(p.conversion_restrictions_promo, new Object[]{str3}));
            TextView textView2 = this.i;
            if (textView2 != null) {
                textView2.setOnClickListener(new L(this, str, str2, str3));
                TextView textView3 = this.i;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                } else {
                    C7471uYa.b(str4);
                    throw null;
                }
            } else {
                C7471uYa.b(str4);
                throw null;
            }
        } else {
            C7471uYa.b(str4);
            throw null;
        }
    }

    public void a() {
        Button button = this.f;
        if (button != null) {
            button.setVisibility(0);
        } else {
            C7471uYa.b("moreButton");
            throw null;
        }
    }
}
