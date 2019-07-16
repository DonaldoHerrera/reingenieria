package defpackage;

import bo.app.bb;
import bo.app.df;
import bo.app.du;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* renamed from: pg reason: default package and case insensitive filesystem */
public final class C1603pg extends C1662rg {
    private final String n;
    private final String o;
    private final String p;
    private final float q;

    public C1603pg(JSONObject jSONObject, bb bbVar, df dfVar) {
        super(jSONObject, bbVar, dfVar);
        this.n = jSONObject.getString("image");
        this.o = du.a(jSONObject, ImagesContract.URL);
        this.p = du.a(jSONObject, "domain");
        this.q = (float) jSONObject.optDouble("aspect_ratio", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public String k() {
        return this.o;
    }

    public float o() {
        return this.q;
    }

    public String p() {
        return this.n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BannerImageCard{mId='");
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
        sb.append(", mImageUrl='");
        sb.append(this.n);
        sb.append('\'');
        sb.append(", mUrl='");
        sb.append(this.o);
        sb.append('\'');
        sb.append(", mDomain='");
        sb.append(this.p);
        sb.append('\'');
        sb.append(", mAspectRatio='");
        sb.append(this.q);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
