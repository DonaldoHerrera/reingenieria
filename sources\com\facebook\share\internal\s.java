package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.b;
import com.facebook.L;

/* compiled from: LikeActionController */
class s implements b {
    final /* synthetic */ a a;

    s(a aVar) {
        this.a = aVar;
    }

    public void a(L l) {
        this.a.d = l.a();
        a aVar = this.a;
        FacebookRequestError facebookRequestError = aVar.d;
        if (facebookRequestError != null) {
            aVar.a(facebookRequestError);
        } else {
            aVar.a(l);
        }
    }
}
