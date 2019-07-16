package com.facebook;

import com.facebook.GraphRequest.b;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GraphRequest */
class F implements b {
    final /* synthetic */ b a;
    final /* synthetic */ GraphRequest b;

    F(GraphRequest graphRequest, b bVar) {
        this.b = graphRequest;
        this.a = bVar;
    }

    public void a(L l) {
        JSONObject b2 = l.b();
        JSONObject optJSONObject = b2 != null ? b2.optJSONObject("__debug__") : null;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                String optString2 = optJSONObject2 != null ? optJSONObject2.optString(C1325gg.TYPE) : null;
                String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                if (!(optString == null || optString2 == null)) {
                    O o = O.GRAPH_API_DEBUG_INFO;
                    if (optString2.equals("warning")) {
                        o = O.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!ia.b(optString3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(optString);
                        sb.append(" Link: ");
                        sb.append(optString3);
                        optString = sb.toString();
                    }
                    W.a(o, GraphRequest.a, optString);
                }
            }
        }
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(l);
        }
    }
}
