package defpackage;

import bo.app.bb;
import bo.app.df;
import bo.app.du;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* renamed from: sg reason: default package and case insensitive filesystem */
public final class C1692sg extends C1662rg {
    private static final String n = Hg.a(C1692sg.class);
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private double s;
    private int t;
    private final double u;
    private final String v;
    private String w;
    private String x;
    private Ef y;
    private String z;

    public C1692sg(JSONObject jSONObject, bb bbVar, df dfVar) {
        super(jSONObject, bbVar, dfVar);
        this.o = jSONObject.getString("title");
        this.p = jSONObject.getString("subtitle");
        this.q = jSONObject.getString("caption");
        this.r = jSONObject.getString("image");
        try {
            this.s = jSONObject.getDouble("rating");
            this.t = jSONObject.getInt("reviews");
        } catch (Exception unused) {
            this.s = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.t = 0;
        }
        String str = "package";
        if (jSONObject.has(str)) {
            this.w = jSONObject.getString(str);
        }
        String str2 = "kindle_id";
        if (jSONObject.has(str2)) {
            this.x = jSONObject.getString(str2);
        }
        this.u = jSONObject.getDouble("price");
        String str3 = "display_price";
        if (jSONObject.has(str3)) {
            this.z = jSONObject.getString(str3);
        }
        this.v = jSONObject.getString(ImagesContract.URL);
        String str4 = "store";
        if (du.a(jSONObject, str4) != null) {
            try {
                String a = du.a(jSONObject, str4);
                if (a != null) {
                    this.y = Ef.valueOf(Ef.c(a));
                } else {
                    this.y = Ef.GOOGLE_PLAY_STORE;
                }
            } catch (Exception e) {
                Hg.b(n, "Caught exception creating cross promotion small card Json.", e);
                this.y = Ef.GOOGLE_PLAY_STORE;
            }
        }
    }

    public String A() {
        return this.o;
    }

    public String k() {
        return this.v;
    }

    public Ef o() {
        return this.y;
    }

    public String p() {
        return this.q;
    }

    public String q() {
        return this.z;
    }

    public String r() {
        return this.r;
    }

    public String s() {
        return this.x;
    }

    public String t() {
        return this.w;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CrossPromotionSmallCard{mId='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", mViewed='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", mCreated='");
        sb.append(this.g);
        sb.append('\'');
        sb.append(", mUpdated='");
        sb.append(this.h);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.o);
        sb.append('\'');
        sb.append(", mSubtitle='");
        sb.append(this.p);
        sb.append('\'');
        sb.append(", mCaption='");
        sb.append(this.q);
        sb.append('\'');
        sb.append(", mImageUrl='");
        sb.append(this.r);
        sb.append('\'');
        sb.append(", mRating=");
        sb.append(this.s);
        sb.append(", mReviewCount=");
        sb.append(this.t);
        sb.append(", mPrice=");
        sb.append(this.u);
        sb.append(", mPackage=");
        sb.append(this.w);
        sb.append(", mUrl='");
        sb.append(this.v);
        sb.append('\'');
        sb.append(", mAppStore='");
        sb.append(this.y);
        sb.append('\'');
        sb.append(", mKindleId='");
        sb.append(this.x);
        sb.append('\'');
        sb.append(", mDisplayPrice='");
        sb.append(this.z);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }

    public double w() {
        return this.u;
    }

    public double x() {
        return this.s;
    }

    public int y() {
        return this.t;
    }

    public String z() {
        return this.p;
    }
}
