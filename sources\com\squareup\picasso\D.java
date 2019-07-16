package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* compiled from: Picasso */
class D extends Handler {
    D(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i != 3) {
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    C6244i iVar = (C6244i) list.get(i2);
                    iVar.f.a(iVar);
                    i2++;
                }
            } else if (i == 13) {
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    C6236a aVar = (C6236a) list2.get(i2);
                    aVar.a.b(aVar);
                    i2++;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown handler message received: ");
                sb.append(message.what);
                throw new AssertionError(sb.toString());
            }
        } else {
            C6236a aVar2 = (C6236a) message.obj;
            if (aVar2.e().p) {
                W.a("Main", "canceled", aVar2.b.d(), "target got garbage collected");
            }
            aVar2.a.a(aVar2.i());
        }
    }
}
