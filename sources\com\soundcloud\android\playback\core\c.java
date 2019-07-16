package com.soundcloud.android.playback.core;

import java.util.Iterator;
import java.util.List;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010(\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/playback/core/Kits;", "", "Lcom/soundcloud/android/playback/core/Kit;", "defaultPlayer", "Lcom/soundcloud/android/playback/core/PlayerType;", "getDefaultPlayer", "()Lcom/soundcloud/android/playback/core/PlayerType;", "kits", "", "getKits", "()Ljava/util/List;", "iterator", "", "playback-core_release"}, mv = {1, 1, 15})
/* compiled from: Kit.kt */
public interface c extends Iterable<b>, MYa {

    /* compiled from: Kit.kt */
    public static final class a {
        public static Iterator<b> a(c cVar) {
            return cVar.c().iterator();
        }
    }

    List<b> c();

    m d();
}
