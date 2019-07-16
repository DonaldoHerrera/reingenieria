package com.soundcloud.android.foundation.events;

import com.comscore.streaming.AdType;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bk\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u0000 °\u00012\u00020\u0001:\u0014«\u0001¬\u0001­\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001Bç\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:¢\u0006\u0002\u0010;J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010MJ\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010bJ\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010MJ\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\u0011\u0010\u0001\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0002\u0010[J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jô\u0003\u0010¢\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:HÆ\u0001¢\u0006\u0003\u0010£\u0001J\u0016\u0010¤\u0001\u001a\u00020\u00052\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001HÖ\u0003J\b\u0010d\u001a\u00020\tH\u0016J\n\u0010§\u0001\u001a\u00020\u001eHÖ\u0001J\t\u0010¨\u0001\u001a\u00020\tH\u0016J\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010©\u0001\u001a\u000207H\u0016J\n\u0010ª\u0001\u001a\u00020\tHÖ\u0001R\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010.\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010&\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bB\u0010?R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bK\u0010?R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010JR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010JR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010JR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bT\u0010?R\u0013\u0010,\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bU\u0010?R\u0013\u0010-\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bV\u0010?R\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u00108\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010JR\u0015\u00106\u001a\u0004\u0018\u000107¢\u0006\n\n\u0002\u0010\\\u001a\u0004\bZ\u0010[R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b]\u0010?R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b^\u0010JR\u0016\u0010_\u001a\n `*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u000207X\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010c\u001a\u0004\b\u0004\u0010bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bf\u0010?R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0013\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bi\u0010JR\u0013\u0010'\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bj\u0010?R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bk\u0010?R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bl\u0010JR\u0013\u0010/\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bm\u0010?R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bn\u0010?R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bo\u0010?R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bp\u0010JR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0013\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bs\u0010JR\u0015\u0010!\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010N\u001a\u0004\bt\u0010MR\u0013\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bu\u0010JR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bx\u0010y¨\u0006µ\u0001"}, d2 = {"Lcom/soundcloud/android/foundation/events/UIEvent;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "kind", "Lcom/soundcloud/android/foundation/events/UIEvent$Kind;", "isFromOverflow", "", "trigger", "Lcom/soundcloud/android/foundation/events/UIEvent$Trigger;", "creatorName", "", "creatorUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "playableTitle", "playableUrn", "playableType", "pageUrn", "originScreen", "attributingActivity", "Lcom/soundcloud/android/foundation/events/AttributingActivity;", "module", "Lcom/soundcloud/android/foundation/events/Module;", "linkType", "clickName", "Lcom/soundcloud/android/foundation/events/UIEvent$ClickName;", "clickCategory", "Lcom/soundcloud/android/foundation/events/UIEvent$ClickCategory;", "clickSource", "clickSourceUrn", "clickSourceQueryUrn", "clickSourceQueryPosition", "", "clickVersion", "queryUrn", "queryPosition", "clickObjectUrn", "clickTargetUrn", "clickTarget", "Lcom/soundcloud/android/foundation/events/UIEvent$ClickTarget;", "adUrn", "monetizationType", "monetizableTrackUrn", "promoterUrn", "adTrackingUrls", "", "clickthroughsKind", "clickthroughsUrl", "adArtworkUrl", "playQueueRepeatMode", "shareLinkType", "Lcom/soundcloud/android/foundation/events/UIEvent$ShareLinkType;", "action", "Lcom/soundcloud/android/foundation/events/UIEvent$Action;", "playerInterface", "Lcom/soundcloud/android/foundation/events/UIEvent$PlayerInterface;", "commentedAt", "", "commentUrn", "commentType", "Lcom/soundcloud/android/foundation/events/UIEvent$CommentType;", "(Lcom/soundcloud/android/foundation/events/UIEvent$Kind;Ljava/lang/Boolean;Lcom/soundcloud/android/foundation/events/UIEvent$Trigger;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/events/AttributingActivity;Lcom/soundcloud/android/foundation/events/Module;Ljava/lang/String;Lcom/soundcloud/android/foundation/events/UIEvent$ClickName;Lcom/soundcloud/android/foundation/events/UIEvent$ClickCategory;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Integer;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Integer;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/events/UIEvent$ClickTarget;Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/foundation/events/UIEvent$ShareLinkType;Lcom/soundcloud/android/foundation/events/UIEvent$Action;Lcom/soundcloud/android/foundation/events/UIEvent$PlayerInterface;Ljava/lang/Long;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/events/UIEvent$CommentType;)V", "getAction", "()Lcom/soundcloud/android/foundation/events/UIEvent$Action;", "getAdArtworkUrl", "()Ljava/lang/String;", "getAdTrackingUrls", "()Ljava/util/List;", "getAdUrn", "getAttributingActivity", "()Lcom/soundcloud/android/foundation/events/AttributingActivity;", "getClickCategory", "()Lcom/soundcloud/android/foundation/events/UIEvent$ClickCategory;", "getClickName", "()Lcom/soundcloud/android/foundation/events/UIEvent$ClickName;", "getClickObjectUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getClickSource", "getClickSourceQueryPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClickSourceQueryUrn", "getClickSourceUrn", "getClickTarget", "()Lcom/soundcloud/android/foundation/events/UIEvent$ClickTarget;", "getClickTargetUrn", "getClickVersion", "getClickthroughsKind", "getClickthroughsUrl", "getCommentType", "()Lcom/soundcloud/android/foundation/events/UIEvent$CommentType;", "getCommentUrn", "getCommentedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreatorName", "getCreatorUrn", "defaultId", "kotlin.jvm.PlatformType", "defaultTimestamp", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKind", "()Lcom/soundcloud/android/foundation/events/UIEvent$Kind;", "getLinkType", "getModule", "()Lcom/soundcloud/android/foundation/events/Module;", "getMonetizableTrackUrn", "getMonetizationType", "getOriginScreen", "getPageUrn", "getPlayQueueRepeatMode", "getPlayableTitle", "getPlayableType", "getPlayableUrn", "getPlayerInterface", "()Lcom/soundcloud/android/foundation/events/UIEvent$PlayerInterface;", "getPromoterUrn", "getQueryPosition", "getQueryUrn", "getShareLinkType", "()Lcom/soundcloud/android/foundation/events/UIEvent$ShareLinkType;", "getTrigger", "()Lcom/soundcloud/android/foundation/events/UIEvent$Trigger;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/soundcloud/android/foundation/events/UIEvent$Kind;Ljava/lang/Boolean;Lcom/soundcloud/android/foundation/events/UIEvent$Trigger;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/events/AttributingActivity;Lcom/soundcloud/android/foundation/events/Module;Ljava/lang/String;Lcom/soundcloud/android/foundation/events/UIEvent$ClickName;Lcom/soundcloud/android/foundation/events/UIEvent$ClickCategory;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Integer;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Integer;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/events/UIEvent$ClickTarget;Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/foundation/events/UIEvent$ShareLinkType;Lcom/soundcloud/android/foundation/events/UIEvent$Action;Lcom/soundcloud/android/foundation/events/UIEvent$PlayerInterface;Ljava/lang/Long;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/events/UIEvent$CommentType;)Lcom/soundcloud/android/foundation/events/UIEvent;", "equals", "other", "", "hashCode", "id", "timestamp", "toString", "Action", "ClickCategory", "ClickName", "ClickTarget", "CommentType", "Companion", "Kind", "PlayerInterface", "ShareLinkType", "Trigger", "events_release"}, mv = {1, 1, 15})
/* compiled from: UIEvent.kt */
public final class K extends J {
    public static final f a = new f(null);
    private final C3508cda A;
    private final d B;
    private final String C;
    private final String D;
    private final C3508cda E;
    private final C3508cda F;
    private final List<String> G;
    private final String H;
    private final String I;
    private final String J;
    private final String K;
    private final i L;
    private final a M;
    private final h N;
    private final Long O;
    private final C3508cda P;
    private final e Q;
    private final long b;
    private final String c;
    private final g d;
    private final Boolean e;
    private final j f;
    private final String g;
    private final C3508cda h;
    private final String i;
    private final C3508cda j;
    private final String k;
    private final C3508cda l;
    private final String m;
    private final C3704f n;
    private final v o;
    private final String p;
    private final c q;
    private final b r;
    private final String s;
    private final C3508cda t;
    private final C3508cda u;
    private final Integer v;
    private final String w;
    private final C3508cda x;
    private final Integer y;
    private final C3508cda z;

    /* compiled from: UIEvent.kt */
    public enum a {
        SHARE_REQUEST("share::request"),
        SHARE_PROMPT("share::prompt"),
        REPOST_ADD("repost::add"),
        REPOST_REMOVE("repost::remove"),
        LIKE_ADD("like::add"),
        LIKE_REMOVE("like::remove"),
        FOLLOW_ADD("follow::add"),
        FOLLOW_REMOVE("follow::remove"),
        NAVIGATION("item_navigation"),
        SHARE("share");
        
        private final String l;

        private a(String str) {
            this.l = str;
        }

        public final String a() {
            return this.l;
        }
    }

    /* compiled from: UIEvent.kt */
    public enum b {
        PLAYBACK("playback"),
        PLAYER("player_interaction"),
        ENGAGEMENT("engagement");
        
        private final String e;

        private b(String str) {
            this.e = str;
        }

        public final String a() {
            return this.e;
        }
    }

    /* compiled from: UIEvent.kt */
    public enum c {
        SHARE_REQUEST("share::request"),
        SHARE_PROMPT("share::prompt"),
        SHARE("share"),
        REPOST("repost::add"),
        UNREPOST("repost::remove"),
        LIKE("like::add"),
        UNLIKE("like::remove"),
        SHUFFLE("shuffle:on"),
        SWIPE_SKIP("swipe_skip"),
        SYSTEM_SKIP("system_skip"),
        BUTTON_SKIP("button_skip"),
        VIDEO_AD_FULLSCREEN("ad::full_screen"),
        VIDEO_AD_SHRINK("ad::exit_full_screen"),
        VIDEO_AD_MUTE("ad::mute"),
        VIDEO_AD_UNMUTE("ad::unmute"),
        SKIP_AD_CLICK("ad::skip"),
        FOLLOW_ADD("follow::add"),
        FOLLOW_REMOVE("follow::remove"),
        PLAYER_CLICK_OPEN("click_player::max"),
        PLAYER_CLICK_CLOSE("click_player::min"),
        PLAYER_SWIPE_OPEN("swipe_player::max"),
        PLAYER_SWIPE_CLOSE("swipe_player::min"),
        PLAY_QUEUE_OPEN("play_queue::max"),
        PLAY_QUEUE_CLOSE("play_queue::min"),
        PLAY_QUEUE_TRACK_REORDER("track_in_play_queue::reorder"),
        PLAY_QUEUE_TRACK_REMOVE("track_in_play_queue::remove"),
        PLAY_QUEUE_TRACK_REMOVE_UNDO("track_in_play_queue::remove_undo"),
        PLAY_QUEUE_REPEAT_ON("repeat::on"),
        PLAY_QUEUE_REPEAT_OFF("repeat::off"),
        PLAY_NEXT("play_next"),
        ITEM_NAVIGATION("item_navigation"),
        SHUFFLE_ON("shuffle::on"),
        SHUFFLE_OFF("shuffle::off"),
        SWIPE_FORWARD("swipe_forward"),
        SWIPE_BACKWARD("swipe_backward"),
        CLICK_FORWARD("click_forward"),
        CLICK_BACKWARD("click_backward"),
        PLAY("play"),
        PAUSE("pause"),
        SCRUB_FORWARD("scrub_forward"),
        SCRUB_BACKWARD("scrub_backward"),
        COMMENTS_OPEN("comments::view"),
        COMMENT_ADD("comment::add"),
        COMMENT_DELETE("comment::remove"),
        STREAMING_QUALITY_AUTO_CLICK("streaming_setting::auto"),
        STREAMING_QUALITY_HIGH_CLICK("streaming_setting::hq"),
        STREAMING_QUALITY_STANDARD_CLICK("streaming_setting::standard");
        
        private final String W;

        private c(String str) {
            this.W = str;
        }

        public final String a() {
            return this.W;
        }
    }

    /* compiled from: UIEvent.kt */
    public enum d {
        INSTAGRAM("instagram-story");
        
        private final String c;

        private d(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    /* compiled from: UIEvent.kt */
    public enum e {
        NEW_COMMENT("new_comment"),
        REPLY("response");
        
        private final String d;

        private e(String str) {
            this.d = str;
        }

        public final String a() {
            return this.d;
        }
    }

    /* compiled from: UIEvent.kt */
    public static final class f {
        private f() {
        }

        @NXa
        public final K a(boolean z, C3708j jVar, C3710l lVar) {
            C3708j jVar2 = jVar;
            C3710l lVar2 = lVar;
            C7471uYa.b(jVar2, "userMetadata");
            C7471uYa.b(lVar2, "eventContextMetadata");
            K k = new K(z ? g.FOLLOW : g.UNFOLLOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(L.b(k, lVar2), jVar2), null, null, null, null, null, null, null, null, null, null, null, null, null, z ? c.FOLLOW_ADD : c.FOLLOW_REMOVE, b.ENGAGEMENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z ? a.FOLLOW_ADD : a.FOLLOW_REMOVE, null, null, null, null, -24577, 247, null);
        }

        @NXa
        public final K b(boolean z) {
            K k = new K(g.PLAYER_CLOSE, null, z ? j.MANUAL : j.AUTO, null, null, null, null, null, null, null, null, null, null, c.PLAYER_CLICK_CLOSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8198, 255, null);
            return k;
        }

        @NXa
        public final K c(boolean z) {
            K k = new K(g.PLAYER_OPEN, null, z ? j.MANUAL : j.AUTO, null, null, null, null, null, null, null, null, null, null, c.PLAYER_CLICK_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8198, 255, null);
            return k;
        }

        @NXa
        public final K d(C3508cda cda, String str, C3508cda cda2, List<String> list, I i) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(list, "muteUrls");
            K k = new K(g.VIDEO_AD_MUTE, null, null, null, null, null, null, null, null, i != null ? i.b() : null, null, null, null, c.VIDEO_AD_MUTE, null, null, null, null, null, null, null, null, null, null, null, cda.toString(), str, cda2, null, list, null, null, null, null, null, null, null, null, null, null, -771760642, 255, null);
            return k;
        }

        @NXa
        public final K e() {
            K k = new K(g.PLAYER_CLOSE, null, j.MANUAL, null, null, null, null, null, null, null, null, null, null, c.PLAYER_SWIPE_CLOSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8198, 255, null);
            return k;
        }

        @NXa
        public final K f() {
            K k = new K(g.PLAYER_OPEN, null, j.MANUAL, null, null, null, null, null, null, null, null, null, null, c.PLAYER_SWIPE_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8198, 255, null);
            return k;
        }

        @NXa
        public final K g() {
            K k = new K(g.START_STATION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return k;
        }

        public /* synthetic */ f(C7264rYa rya) {
            this();
        }

        @NXa
        public final K g(Yca yca) {
            C7471uYa.b(yca, "screen");
            K k = new K(g.STREAMING_QUALITY_STANDARD_CLICK, null, null, null, null, null, null, null, null, yca.a(), null, null, null, c.STREAMING_QUALITY_STANDARD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8706, 255, null);
            return k;
        }

        @NXa
        public final K b(C3710l lVar) {
            C3710l lVar2 = lVar;
            C7471uYa.b(lVar2, "contextMetadata");
            K k = new K(g.SHUFFLE, null, null, null, null, null, null, null, null, null, null, null, null, c.SHUFFLE, b.PLAYBACK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -24578, 255, null);
            return L.b(k, lVar2);
        }

        @NXa
        public final K c(C3508cda cda, String str, C3508cda cda2, List<String> list, I i) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(list, "exitFullScreenUrls");
            K k = new K(g.VIDEO_AD_SHRINK, null, null, null, null, null, null, null, null, i != null ? i.b() : null, null, null, null, c.VIDEO_AD_SHRINK, null, null, null, null, null, null, null, null, null, null, null, cda.toString(), str, cda2, null, list, null, null, null, null, null, null, null, null, null, null, -771760642, 255, null);
            return k;
        }

        @NXa
        public final K e(C3508cda cda, String str, C3508cda cda2, List<String> list, I i) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(list, "unMuteUrls");
            K k = new K(g.VIDEO_AD_UNMUTE, null, null, null, null, null, null, null, null, i != null ? i.b() : null, null, null, null, c.VIDEO_AD_UNMUTE, null, null, null, null, null, null, null, null, null, null, null, cda.toString(), str, cda2, null, list, null, null, null, null, null, null, null, null, null, null, -771760642, 255, null);
            return k;
        }

        @NXa
        public final K f(Yca yca) {
            C7471uYa.b(yca, "screen");
            return b(com.soundcloud.android.foundation.events.C3710l.a.a(C3710l.a, yca, false, 2, (Object) null));
        }

        @NXa
        public final K a(boolean z, C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar, h hVar) {
            C3710l lVar2 = lVar;
            C3708j jVar2 = jVar;
            C7471uYa.b(cda, "resourceUrn");
            C7471uYa.b(lVar2, "contextMetadata");
            C7471uYa.b(jVar2, "playable");
            C7471uYa.b(hVar, "playerInterface");
            K k = new K(z ? g.LIKE : g.UNLIKE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(L.b(L.b(k, lVar2), jVar2), promotedSourceInfo), null, null, null, null, null, null, null, null, null, null, null, null, null, z ? c.LIKE : c.UNLIKE, b.ENGAGEMENT, null, null, null, null, null, null, null, cda, null, null, null, null, null, null, null, null, null, null, null, null, z ? a.LIKE_ADD : a.LIKE_REMOVE, hVar, null, null, null, -4218881, AdType.BRANDED_ON_DEMAND_PRE_ROLL, null);
        }

        @NXa
        public final K d() {
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.SCRUB_FORWARD, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, h.FULLSCREEN, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K f(h hVar) {
            h hVar2 = hVar;
            C7471uYa.b(hVar, "playerInterface");
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.SWIPE_FORWARD, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar2, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K b(C3508cda cda, String str, C3508cda cda2, List<String> list, I i) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(list, "fullScreenUrls");
            K k = new K(g.VIDEO_AD_FULLSCREEN, null, null, null, null, null, null, null, null, i != null ? i.b() : null, null, null, null, c.VIDEO_AD_FULLSCREEN, null, null, null, null, null, null, null, null, null, null, null, cda.toString(), str, cda2, null, list, null, null, null, null, null, null, null, null, null, null, -771760642, 255, null);
            return k;
        }

        @NXa
        public final K c() {
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.SCRUB_BACKWARD, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, h.FULLSCREEN, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K e(h hVar) {
            h hVar2 = hVar;
            C7471uYa.b(hVar, "playerInterface");
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.SWIPE_BACKWARD, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar2, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K d(h hVar) {
            h hVar2 = hVar;
            C7471uYa.b(hVar, "playerInterface");
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.PLAY, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar2, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K a(boolean z, C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar) {
            C3710l lVar2 = lVar;
            C3708j jVar2 = jVar;
            C7471uYa.b(cda, "resourceUrn");
            C7471uYa.b(lVar2, "contextMetadata");
            C7471uYa.b(jVar2, "entityMetadata");
            K k = new K(z ? g.REPOST : g.UNREPOST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(L.b(L.b(k, lVar2), jVar2), promotedSourceInfo), null, null, null, null, null, null, null, null, null, null, null, null, null, z ? c.REPOST : c.UNREPOST, b.ENGAGEMENT, null, null, null, null, null, null, null, cda, null, null, null, null, null, null, null, null, null, null, null, null, z ? a.REPOST_ADD : a.REPOST_REMOVE, null, null, null, null, -4218881, 247, null);
        }

        @NXa
        public final K e(Yca yca) {
            C7471uYa.b(yca, "screen");
            K k = new K(g.PLAY_QUEUE_TRACK_REORDER, null, null, null, null, null, null, null, null, yca.a(), null, null, null, c.PLAY_QUEUE_TRACK_REORDER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8706, 255, null);
            return k;
        }

        @NXa
        public final K b(h hVar) {
            h hVar2 = hVar;
            C7471uYa.b(hVar, "playerInterface");
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.CLICK_FORWARD, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar2, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K c(h hVar) {
            h hVar2 = hVar;
            C7471uYa.b(hVar, "playerInterface");
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.PAUSE, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar2, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K d(Yca yca) {
            C7471uYa.b(yca, "screen");
            K k = new K(g.PLAY_QUEUE_TRACK_REMOVE_UNDO, null, null, null, null, null, null, null, null, yca.a(), null, null, null, c.PLAY_QUEUE_TRACK_REMOVE_UNDO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8706, 255, null);
            return k;
        }

        @NXa
        public final K e(C3508cda cda, C3710l lVar) {
            C3710l lVar2 = lVar;
            C3508cda cda2 = cda;
            C7471uYa.b(cda, "itemUrn");
            C7471uYa.b(lVar2, "contextMetadata");
            K k = new K(g.NAVIGATION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(k, lVar2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cda2, null, null, null, null, null, null, null, null, null, null, null, null, a.NAVIGATION, null, null, null, null, -4194305, 247, null);
        }

        @NXa
        public final K b(C3508cda cda, String str, List<String> list, String str2) {
            String str3 = str;
            String str4 = str;
            List<String> list2 = list;
            String str5 = str2;
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str3, "monetizationType");
            C7471uYa.b(list, "trackingClickUrls");
            C7471uYa.b(str2, "clickThroughUrl");
            g gVar = g.AD_CLICKTHROUGH;
            String cda2 = cda.toString();
            StringBuilder sb = new StringBuilder();
            sb.append("clickthrough::");
            sb.append(str3);
            K k = new K(gVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cda2, str4, null, null, list2, sb.toString(), str5, null, null, null, null, null, null, null, null, 436207614, 255, null);
            return k;
        }

        @NXa
        public final K c(C3508cda cda, String str, List<String> list, String str2) {
            String str3 = str;
            List<String> list2 = list;
            String str4 = str2;
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(list, "clickUrls");
            C7471uYa.b(str2, "clickThroughUrl");
            K k = new K(g.AD_CLICKTHROUGH, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cda.toString(), str3, null, null, list2, "clickthrough::display", str4, null, null, null, null, null, null, null, null, 436207614, 255, null);
            return k;
        }

        @NXa
        public final K d(C3508cda cda, C3710l lVar) {
            C3710l lVar2 = lVar;
            C3508cda cda2 = cda;
            C7471uYa.b(cda, "itemUrn");
            C7471uYa.b(lVar2, "contextMetadata");
            K k = new K(g.MORE_PLAYLISTS_BY_USER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(k, lVar2), null, null, null, null, null, null, null, null, null, null, null, null, null, c.ITEM_NAVIGATION, null, null, null, null, null, null, null, null, cda2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4202497, 255, null);
        }

        @NXa
        public final K a(C3710l lVar) {
            C3710l lVar2 = lVar;
            C7471uYa.b(lVar2, "eventContextMetadata");
            K k = new K(g.ADD_TO_PLAYLIST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return L.b(k, lVar2);
        }

        @NXa
        public final K c(Yca yca) {
            C7471uYa.b(yca, "screen");
            K k = new K(g.PLAY_QUEUE_TRACK_REMOVE, null, null, null, null, null, null, null, null, yca.a(), null, null, null, c.PLAY_QUEUE_TRACK_REMOVE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8706, 255, null);
            return k;
        }

        @NXa
        public final K a(C3508cda cda, String str, C3508cda cda2, List<String> list, I i) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(list, "skipUrls");
            K k = new K(g.SKIP_AD_CLICK, null, null, null, null, null, null, null, null, i != null ? i.b() : null, null, null, null, c.SKIP_AD_CLICK, null, null, null, null, null, null, null, null, null, null, null, cda.toString(), str, cda2, null, list, null, null, null, null, null, null, null, null, null, null, -771760642, 255, null);
            return k;
        }

        @NXa
        public final K b(C3508cda cda, C3508cda cda2) {
            C3508cda cda3 = cda;
            C3508cda cda4 = cda2;
            C7471uYa.b(cda, "trackUrn");
            C7471uYa.b(cda2, "commentUrn");
            K k = new K(g.COMMENT_DELETE, null, null, null, null, null, null, null, null, null, null, null, null, c.COMMENT_DELETE, null, null, null, null, null, null, null, null, cda3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cda4, null, -4202498, 191, null);
            return k;
        }

        @NXa
        public final K b() {
            K k = new K(g.PLAY_QUEUE_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, c.PLAY_QUEUE_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8194, 255, null);
            return k;
        }

        @NXa
        public final K c(C3508cda cda, C3710l lVar) {
            C3710l lVar2 = lVar;
            C3508cda cda2 = cda;
            C7471uYa.b(cda, "clickObjectUrn");
            C7471uYa.b(lVar2, "contextMetadata");
            K k = new K(g.ITEM_NAVIGATION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(k, lVar2), null, null, null, null, null, null, null, null, null, null, null, null, null, c.ITEM_NAVIGATION, null, null, null, null, null, null, null, null, cda2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4202497, 255, null);
        }

        @NXa
        public final K a(h hVar) {
            h hVar2 = hVar;
            C7471uYa.b(hVar, "playerInterface");
            K k = new K(g.PLAYER_INTERACTION, null, null, null, null, null, null, null, null, null, null, null, null, c.CLICK_BACKWARD, b.PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar2, null, null, null, -24578, 239, null);
            return k;
        }

        @NXa
        public final K b(Yca yca) {
            C7471uYa.b(yca, "screen");
            K k = new K(g.STREAMING_QUALITY_HIGH_CLICK, null, null, null, null, null, null, null, null, yca.a(), null, null, null, c.STREAMING_QUALITY_HIGH_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8706, 255, null);
            return k;
        }

        @NXa
        public final K c(C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar) {
            C7471uYa.b(cda, "resourceUrn");
            C7471uYa.b(lVar, "contextMetadata");
            C7471uYa.b(jVar, "playable");
            return a(c.SHARE_REQUEST, cda, lVar, promotedSourceInfo, jVar, a.SHARE_REQUEST);
        }

        @NXa
        public final K a(C3508cda cda, String str, C3508cda cda2, List<String> list, String str2, I i) {
            String str3 = str;
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str3, "monetizationType");
            C7471uYa.b(list, "clickUrls");
            C7471uYa.b(str2, "clickThroughUrl");
            g gVar = g.AD_CLICKTHROUGH;
            String cda3 = cda.toString();
            String b = i != null ? i.b() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("clickthrough::");
            sb.append(str3);
            K k = new K(gVar, null, null, null, null, null, null, null, null, b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cda3, str, cda2, null, list, sb.toString(), str2, null, null, null, null, null, null, null, null, 301989374, 255, null);
            return k;
        }

        @NXa
        public final K b(C3508cda cda, C3710l lVar) {
            C3710l lVar2 = lVar;
            C3508cda cda2 = cda;
            C7471uYa.b(lVar2, "contextMetadata");
            K k = new K(g.DISCOVERY_CARD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(k, lVar2), null, null, null, null, null, null, null, null, null, null, null, null, null, c.ITEM_NAVIGATION, null, null, null, null, null, null, null, null, cda2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4202497, 255, null);
        }

        @NXa
        public final K a(C3508cda cda, String str, C3508cda cda2, List<String> list, String str2, String str3, I i) {
            String str4 = str;
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str4, "monetizationType");
            C7471uYa.b(cda2, "monetizableTrackUrn");
            C7471uYa.b(list, "clickUrls");
            g gVar = g.AD_CLICKTHROUGH;
            String cda3 = cda.toString();
            String b = i != null ? i.b() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("clickthrough::");
            sb.append(str4);
            K k = new K(gVar, null, null, null, null, null, null, null, null, b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cda3, str, cda2, null, list, sb.toString(), str2, str3, null, null, null, null, null, null, null, 301989374, 254, null);
            return k;
        }

        @NXa
        public final K b(C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar) {
            C3508cda cda2 = cda;
            C7471uYa.b(cda2, "resourceUrn");
            C3710l lVar2 = lVar;
            C7471uYa.b(lVar2, "contextMetadata");
            C3708j jVar2 = jVar;
            C7471uYa.b(jVar2, "playable");
            return K.a(a(c.SHARE_PROMPT, cda2, lVar2, promotedSourceInfo, jVar2, a.SHARE_PROMPT), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, i.SOUNDCLOUD, null, null, null, null, null, -1, 251, null);
        }

        @NXa
        public final K a(C3508cda cda, String str, List<String> list, String str2) {
            String str3 = str;
            List<String> list2 = list;
            String str4 = str2;
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(list, "clickUrls");
            C7471uYa.b(str2, "clickThroughUrl");
            K k = new K(g.AD_CLICKTHROUGH, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cda.toString(), str3, null, null, list2, "clickthrough::app_install", str4, null, null, null, null, null, null, null, null, 436207614, 255, null);
            return k;
        }

        @NXa
        public final K a(C3508cda cda, C3710l lVar) {
            C3710l lVar2 = lVar;
            C3508cda cda2 = cda;
            C7471uYa.b(cda, "trackUrn");
            C7471uYa.b(lVar2, "contextMetadata");
            K k = r1;
            K k2 = new K(g.COMMENTS_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, c.COMMENTS_OPEN, null, null, null, null, null, null, null, null, cda2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4202498, 255, null);
            return L.b(k, lVar2);
        }

        @NXa
        public final K a(C3508cda cda, C3508cda cda2) {
            C3508cda cda3 = cda;
            C3508cda cda4 = cda2;
            C7471uYa.b(cda, "commentUrn");
            C7471uYa.b(cda2, "userUrn");
            K k = new K(g.COMMENTS_AVATAR_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, c.ITEM_NAVIGATION, null, null, null, null, null, null, null, null, cda3, cda4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -12591106, 255, null);
            return k;
        }

        @NXa
        public final K a(C3508cda cda, long j, boolean z) {
            C7471uYa.b(cda, "trackUrn");
            K k = new K(g.COMMENT_ADD, null, null, null, null, null, null, null, null, null, null, null, null, c.COMMENT_ADD, null, null, null, null, null, null, null, null, cda, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Long.valueOf(j), null, z ? e.REPLY : e.NEW_COMMENT, -4202498, 95, null);
            return k;
        }

        @NXa
        public final K a() {
            K k = new K(g.PLAY_QUEUE_CLOSE, null, null, null, null, null, null, null, null, null, null, null, null, c.PLAY_QUEUE_CLOSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8194, 255, null);
            return k;
        }

        public final K a(Yca yca) {
            C7471uYa.b(yca, "screen");
            K k = new K(g.STREAMING_QUALITY_AUTO_CLICK, null, null, null, null, null, null, null, null, yca.a(), null, null, null, c.STREAMING_QUALITY_AUTO_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8706, 255, null);
            return k;
        }

        @NXa
        public final K a(C3708j jVar) {
            C3708j jVar2 = jVar;
            C7471uYa.b(jVar2, "metadata");
            K k = new K(g.CREATE_PLAYLIST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return L.b(k, jVar2);
        }

        @NXa
        public final K a(boolean z) {
            K k = new K(g.PLAY_QUEUE_SHUFFLE, null, null, null, null, null, null, null, null, Yca.PLAY_QUEUE.a(), null, null, null, z ? c.SHUFFLE_ON : c.SHUFFLE_OFF, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8706, 255, null);
            return k;
        }

        @NXa
        public final K a(Yca yca, String str) {
            C7471uYa.b(yca, "screen");
            String str2 = str;
            C7471uYa.b(str2, "repeatMode");
            K k = new K(g.PLAY_QUEUE_REPEAT, null, null, null, null, null, null, null, null, yca.a(), null, null, null, Cxb.a(str) ^ true ? c.PLAY_QUEUE_REPEAT_ON : c.PLAY_QUEUE_REPEAT_OFF, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Cxb.a(str) ^ true ? str2 : null, null, null, null, null, null, null, -8706, 253, null);
            return k;
        }

        @NXa
        public final K a(C3508cda cda, String str, C3710l lVar) {
            C3710l lVar2 = lVar;
            C3508cda cda2 = cda;
            String str2 = str;
            C7471uYa.b(cda, "urn");
            C7471uYa.b(str, "lastScreen");
            C7471uYa.b(lVar2, "eventContextMetadata");
            K k = new K(g.PLAY_NEXT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(k, lVar2), null, null, null, null, null, null, null, null, null, str2, null, null, null, c.PLAY_NEXT, b.ENGAGEMENT, null, null, null, null, null, null, null, cda2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4219393, 255, null);
        }

        @NXa
        public final K a(C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar) {
            C3508cda cda2 = cda;
            C7471uYa.b(cda2, "resourceUrn");
            C3710l lVar2 = lVar;
            C7471uYa.b(lVar2, "contextMetadata");
            C3708j jVar2 = jVar;
            C7471uYa.b(jVar2, "playable");
            return K.a(a(c.SHARE, cda2, lVar2, promotedSourceInfo, jVar2, a.SHARE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, d.INSTAGRAM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 255, null);
        }

        private final K a(c cVar, C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar, a aVar) {
            c cVar2 = cVar;
            C3508cda cda2 = cda;
            a aVar2 = aVar;
            K k = new K(g.SHARE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 255, null);
            return K.a(L.b(L.b(L.b(k, promotedSourceInfo), lVar), jVar), null, null, null, null, null, null, null, null, null, null, null, null, null, cVar2, b.ENGAGEMENT, null, null, null, null, null, null, null, cda2, null, null, null, null, null, null, null, null, null, null, null, null, aVar2, null, null, null, null, -4218881, 247, null);
        }
    }

    /* compiled from: UIEvent.kt */
    public enum g {
        FOLLOW("follow"),
        UNFOLLOW("unfollow"),
        LIKE("like"),
        UNLIKE("unlike"),
        REPOST("repost"),
        UNREPOST("unrepost"),
        ADD_TO_PLAYLIST("add_to_playlist"),
        CREATE_PLAYLIST("create_playlist"),
        COMMENT("comment"),
        SHARE("share"),
        SHUFFLE("shuffle"),
        PLAY_QUEUE_SHUFFLE("play_queue_shuffle"),
        SWIPE_SKIP("swipe_skip"),
        SYSTEM_SKIP("system_skip"),
        BUTTON_SKIP("button_skip"),
        NAVIGATION("navigation"),
        ITEM_NAVIGATION("item_navigation"),
        PLAYER_OPEN("player_open"),
        PLAYER_CLOSE("player_close"),
        VIDEO_AD_FULLSCREEN("video_ad_fullscreen"),
        VIDEO_AD_SHRINK("video_ad_shrink"),
        VIDEO_AD_MUTE("video_ad_mute"),
        VIDEO_AD_UNMUTE("video_ad_unmute"),
        AD_CLICKTHROUGH("ad_click_through"),
        SKIP_AD_CLICK("skip_ad_click"),
        START_STATION("start_station"),
        PLAY_QUEUE_OPEN("play_queue_open"),
        PLAY_QUEUE_CLOSE("play_queue_close"),
        PLAY_QUEUE_TRACK_REORDER("play_queue_track_reorder"),
        PLAY_QUEUE_TRACK_REMOVE("play_queue_track_remove"),
        PLAY_QUEUE_TRACK_REMOVE_UNDO("play_queue_track_remove_undo"),
        PLAY_QUEUE_REPEAT("play_queue_repeat"),
        PLAY_NEXT("play_next"),
        RECOMMENDED_PLAYLISTS("playlist_discovery"),
        MORE_PLAYLISTS_BY_USER("more_playlists_by_user"),
        DISCOVERY_CARD("discovery_card"),
        PLAYER_INTERACTION("player_interaction"),
        COMMENTS_OPEN("comments_open"),
        COMMENTS_AVATAR_CLICK("comments_avatar_click"),
        COMMENT_ADD("comments_add"),
        COMMENT_DELETE("comments_delete"),
        STREAMING_QUALITY_AUTO_CLICK("streaming_quality_auto_click"),
        STREAMING_QUALITY_HIGH_CLICK("streaming_quality_high_click"),
        STREAMING_QUALITY_STANDARD_CLICK("streaming_quality_standard_click"),
        HEADER_PLAY_TOGGLE("header_play_toggle");
        
        private final String U;

        private g(String str) {
            this.U = str;
        }
    }

    /* compiled from: UIEvent.kt */
    public enum h {
        FULLSCREEN("fullscreen"),
        MINI("mini"),
        NOTIFICATION_OR_HEADSET("notification-or-headset"),
        WIDGET("widget"),
        OTHER("other");
        
        private final String g;

        private h(String str) {
            this.g = str;
        }

        public final String a() {
            return this.g;
        }
    }

    /* compiled from: UIEvent.kt */
    public enum i {
        SOUNDCLOUD("soundcloud");
        
        private final String c;

        private i(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    /* compiled from: UIEvent.kt */
    public enum j {
        AUTO("auto"),
        MANUAL("manual");
        
        private final String d;

        private j(String str) {
            this.d = str;
        }

        public final String a() {
            return this.d;
        }
    }

    public /* synthetic */ K(g gVar, Boolean bool, j jVar, String str, C3508cda cda, String str2, C3508cda cda2, String str3, C3508cda cda3, String str4, C3704f fVar, v vVar, String str5, c cVar, b bVar, String str6, C3508cda cda4, C3508cda cda5, Integer num, String str7, C3508cda cda6, Integer num2, C3508cda cda7, C3508cda cda8, d dVar, String str8, String str9, C3508cda cda9, C3508cda cda10, List list, String str10, String str11, String str12, String str13, i iVar, a aVar, h hVar, Long l2, C3508cda cda11, e eVar, int i2, int i3, C7264rYa rya) {
        int i4 = i2;
        int i5 = i3;
        Boolean bool2 = (i4 & 2) != 0 ? null : bool;
        this(gVar, bool2, (i4 & 4) != 0 ? null : jVar, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : cda, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : cda2, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? null : cda3, (i4 & 512) != 0 ? null : str4, (i4 & 1024) != 0 ? null : fVar, (i4 & 2048) != 0 ? null : vVar, (i4 & 4096) != 0 ? null : str5, (i4 & 8192) != 0 ? null : cVar, (i4 & 16384) != 0 ? null : bVar, (i4 & 32768) != 0 ? null : str6, (i4 & 65536) != 0 ? null : cda4, (i4 & 131072) != 0 ? null : cda5, (i4 & 262144) != 0 ? null : num, (i4 & 524288) != 0 ? null : str7, (i4 & 1048576) != 0 ? null : cda6, (i4 & 2097152) != 0 ? null : num2, (i4 & 4194304) != 0 ? null : cda7, (i4 & 8388608) != 0 ? null : cda8, (i4 & 16777216) != 0 ? null : dVar, (i4 & 33554432) != 0 ? null : str8, (i4 & 67108864) != 0 ? null : str9, (i4 & 134217728) != 0 ? null : cda9, (i4 & 268435456) != 0 ? null : cda10, (i4 & 536870912) != 0 ? null : list, (i4 & 1073741824) != 0 ? null : str10, (i4 & Integer.MIN_VALUE) != 0 ? null : str11, (i5 & 1) != 0 ? null : str12, (i5 & 2) != 0 ? null : str13, (i5 & 4) != 0 ? null : iVar, (i5 & 8) != 0 ? null : aVar, (i5 & 16) != 0 ? null : hVar, (i5 & 32) != 0 ? null : l2, (i5 & 64) != 0 ? null : cda11, (i5 & 128) != 0 ? null : eVar);
    }

    @NXa
    public static final K a(Yca yca) {
        return a.c(yca);
    }

    @NXa
    public static final K a(Yca yca, String str) {
        return a.a(yca, str);
    }

    @NXa
    public static final K a(C3508cda cda, C3710l lVar) {
        return a.a(cda, lVar);
    }

    @NXa
    public static final K a(C3508cda cda, String str, C3710l lVar) {
        return a.a(cda, str, lVar);
    }

    @NXa
    public static final K a(h hVar) {
        return a.a(hVar);
    }

    public static /* synthetic */ K a(K k2, g gVar, Boolean bool, j jVar, String str, C3508cda cda, String str2, C3508cda cda2, String str3, C3508cda cda3, String str4, C3704f fVar, v vVar, String str5, c cVar, b bVar, String str6, C3508cda cda4, C3508cda cda5, Integer num, String str7, C3508cda cda6, Integer num2, C3508cda cda7, C3508cda cda8, d dVar, String str8, String str9, C3508cda cda9, C3508cda cda10, List list, String str10, String str11, String str12, String str13, i iVar, a aVar, h hVar, Long l2, C3508cda cda11, e eVar, int i2, int i3, Object obj) {
        b bVar2;
        String str14;
        String str15;
        C3508cda cda12;
        C3508cda cda13;
        C3508cda cda14;
        C3508cda cda15;
        Integer num3;
        Integer num4;
        String str16;
        String str17;
        C3508cda cda16;
        C3508cda cda17;
        Integer num5;
        Integer num6;
        C3508cda cda18;
        C3508cda cda19;
        C3508cda cda20;
        C3508cda cda21;
        d dVar2;
        d dVar3;
        String str18;
        String str19;
        String str20;
        String str21;
        C3508cda cda22;
        C3508cda cda23;
        C3508cda cda24;
        C3508cda cda25;
        List list2;
        List list3;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        i iVar2;
        i iVar3;
        a aVar2;
        a aVar3;
        h hVar2;
        h hVar3;
        Long l3;
        Long l4;
        C3508cda cda26;
        K k3 = k2;
        int i4 = i2;
        int i5 = i3;
        g gVar2 = (i4 & 1) != 0 ? k3.d : gVar;
        Boolean bool2 = (i4 & 2) != 0 ? k3.e : bool;
        j jVar2 = (i4 & 4) != 0 ? k3.f : jVar;
        String str28 = (i4 & 8) != 0 ? k3.g : str;
        C3508cda cda27 = (i4 & 16) != 0 ? k3.h : cda;
        String str29 = (i4 & 32) != 0 ? k3.i : str2;
        C3508cda cda28 = (i4 & 64) != 0 ? k3.j : cda2;
        String str30 = (i4 & 128) != 0 ? k3.k : str3;
        C3508cda cda29 = (i4 & 256) != 0 ? k3.l : cda3;
        String str31 = (i4 & 512) != 0 ? k3.m : str4;
        C3704f fVar2 = (i4 & 1024) != 0 ? k3.n : fVar;
        v vVar2 = (i4 & 2048) != 0 ? k3.o : vVar;
        String str32 = (i4 & 4096) != 0 ? k3.p : str5;
        c cVar2 = (i4 & 8192) != 0 ? k3.q : cVar;
        b bVar3 = (i4 & 16384) != 0 ? k3.r : bVar;
        if ((i4 & 32768) != 0) {
            bVar2 = bVar3;
            str14 = k3.s;
        } else {
            bVar2 = bVar3;
            str14 = str6;
        }
        if ((i4 & 65536) != 0) {
            str15 = str14;
            cda12 = k3.t;
        } else {
            str15 = str14;
            cda12 = cda4;
        }
        if ((i4 & 131072) != 0) {
            cda13 = cda12;
            cda14 = k3.u;
        } else {
            cda13 = cda12;
            cda14 = cda5;
        }
        if ((i4 & 262144) != 0) {
            cda15 = cda14;
            num3 = k3.v;
        } else {
            cda15 = cda14;
            num3 = num;
        }
        if ((i4 & 524288) != 0) {
            num4 = num3;
            str16 = k3.w;
        } else {
            num4 = num3;
            str16 = str7;
        }
        if ((i4 & 1048576) != 0) {
            str17 = str16;
            cda16 = k3.x;
        } else {
            str17 = str16;
            cda16 = cda6;
        }
        if ((i4 & 2097152) != 0) {
            cda17 = cda16;
            num5 = k3.y;
        } else {
            cda17 = cda16;
            num5 = num2;
        }
        if ((i4 & 4194304) != 0) {
            num6 = num5;
            cda18 = k3.z;
        } else {
            num6 = num5;
            cda18 = cda7;
        }
        if ((i4 & 8388608) != 0) {
            cda19 = cda18;
            cda20 = k3.A;
        } else {
            cda19 = cda18;
            cda20 = cda8;
        }
        if ((i4 & 16777216) != 0) {
            cda21 = cda20;
            dVar2 = k3.B;
        } else {
            cda21 = cda20;
            dVar2 = dVar;
        }
        if ((i4 & 33554432) != 0) {
            dVar3 = dVar2;
            str18 = k3.C;
        } else {
            dVar3 = dVar2;
            str18 = str8;
        }
        if ((i4 & 67108864) != 0) {
            str19 = str18;
            str20 = k3.D;
        } else {
            str19 = str18;
            str20 = str9;
        }
        if ((i4 & 134217728) != 0) {
            str21 = str20;
            cda22 = k3.E;
        } else {
            str21 = str20;
            cda22 = cda9;
        }
        if ((i4 & 268435456) != 0) {
            cda23 = cda22;
            cda24 = k3.F;
        } else {
            cda23 = cda22;
            cda24 = cda10;
        }
        if ((i4 & 536870912) != 0) {
            cda25 = cda24;
            list2 = k3.G;
        } else {
            cda25 = cda24;
            list2 = list;
        }
        if ((i4 & 1073741824) != 0) {
            list3 = list2;
            str22 = k3.H;
        } else {
            list3 = list2;
            str22 = str10;
        }
        String str33 = (i4 & Integer.MIN_VALUE) != 0 ? k3.I : str11;
        if ((i5 & 1) != 0) {
            str23 = str33;
            str24 = k3.J;
        } else {
            str23 = str33;
            str24 = str12;
        }
        if ((i5 & 2) != 0) {
            str25 = str24;
            str26 = k3.K;
        } else {
            str25 = str24;
            str26 = str13;
        }
        if ((i5 & 4) != 0) {
            str27 = str26;
            iVar2 = k3.L;
        } else {
            str27 = str26;
            iVar2 = iVar;
        }
        if ((i5 & 8) != 0) {
            iVar3 = iVar2;
            aVar2 = k3.M;
        } else {
            iVar3 = iVar2;
            aVar2 = aVar;
        }
        if ((i5 & 16) != 0) {
            aVar3 = aVar2;
            hVar2 = k3.N;
        } else {
            aVar3 = aVar2;
            hVar2 = hVar;
        }
        if ((i5 & 32) != 0) {
            hVar3 = hVar2;
            l3 = k3.O;
        } else {
            hVar3 = hVar2;
            l3 = l2;
        }
        if ((i5 & 64) != 0) {
            l4 = l3;
            cda26 = k3.P;
        } else {
            l4 = l3;
            cda26 = cda11;
        }
        return k2.a(gVar2, bool2, jVar2, str28, cda27, str29, cda28, str30, cda29, str31, fVar2, vVar2, str32, cVar2, bVar2, str15, cda13, cda15, num4, str17, cda17, num6, cda19, cda21, dVar3, str19, str21, cda23, cda25, list3, str22, str23, str25, str27, iVar3, aVar3, hVar3, l4, cda26, (i5 & 128) != 0 ? k3.Q : eVar);
    }

    @NXa
    public static final K a(C3708j jVar) {
        return a.a(jVar);
    }

    @NXa
    public static final K a(C3710l lVar) {
        return a.a(lVar);
    }

    @NXa
    public static final K a(boolean z2) {
        return a.a(z2);
    }

    @NXa
    public static final K a(boolean z2, C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar) {
        return a.a(z2, cda, lVar, promotedSourceInfo, jVar);
    }

    @NXa
    public static final K a(boolean z2, C3508cda cda, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar, h hVar) {
        return a.a(z2, cda, lVar, promotedSourceInfo, jVar, hVar);
    }

    @NXa
    public static final K a(boolean z2, C3708j jVar, C3710l lVar) {
        return a.a(z2, jVar, lVar);
    }

    @NXa
    public static final K b(Yca yca) {
        return a.d(yca);
    }

    @NXa
    public static final K b(C3508cda cda, C3710l lVar) {
        return a.c(cda, lVar);
    }

    @NXa
    public static final K b(h hVar) {
        return a.b(hVar);
    }

    @NXa
    public static final K b(boolean z2) {
        return a.b(z2);
    }

    @NXa
    public static final K c(Yca yca) {
        return a.e(yca);
    }

    @NXa
    public static final K c(C3508cda cda, C3710l lVar) {
        return a.d(cda, lVar);
    }

    @NXa
    public static final K c(h hVar) {
        return a.c(hVar);
    }

    @NXa
    public static final K c(boolean z2) {
        return a.c(z2);
    }

    @NXa
    public static final K d(C3508cda cda, C3710l lVar) {
        return a.e(cda, lVar);
    }

    @NXa
    public static final K d(h hVar) {
        return a.d(hVar);
    }

    @NXa
    public static final K e(h hVar) {
        return a.e(hVar);
    }

    @NXa
    public static final K f(h hVar) {
        return a.f(hVar);
    }

    @NXa
    public static final K h() {
        return a.a();
    }

    @NXa
    public static final K i() {
        return a.b();
    }

    @NXa
    public static final K j() {
        return a.c();
    }

    @NXa
    public static final K k() {
        return a.d();
    }

    @NXa
    public static final K l() {
        return a.e();
    }

    @NXa
    public static final K m() {
        return a.f();
    }

    public final String A() {
        return this.w;
    }

    public final String B() {
        return this.H;
    }

    public final String C() {
        return this.I;
    }

    public final e D() {
        return this.Q;
    }

    public final C3508cda E() {
        return this.P;
    }

    public final Long F() {
        return this.O;
    }

    public final String G() {
        return this.g;
    }

    public final C3508cda H() {
        return this.h;
    }

    public final String I() {
        return this.p;
    }

    public final v J() {
        return this.o;
    }

    public final C3508cda K() {
        return this.E;
    }

    public final String L() {
        return this.D;
    }

    public final String M() {
        return this.m;
    }

    public final C3508cda N() {
        return this.l;
    }

    public final String O() {
        return this.K;
    }

    public final String P() {
        return this.i;
    }

    public final String Q() {
        return this.k;
    }

    public final C3508cda R() {
        return this.j;
    }

    public final h S() {
        return this.N;
    }

    public final C3508cda T() {
        return this.F;
    }

    public final Integer U() {
        return this.y;
    }

    public final C3508cda V() {
        return this.x;
    }

    public final i W() {
        return this.L;
    }

    public final j X() {
        return this.f;
    }

    public final Boolean Y() {
        return this.e;
    }

    public final g Z() {
        return this.d;
    }

    public final K a(g gVar, Boolean bool, j jVar, String str, C3508cda cda, String str2, C3508cda cda2, String str3, C3508cda cda3, String str4, C3704f fVar, v vVar, String str5, c cVar, b bVar, String str6, C3508cda cda4, C3508cda cda5, Integer num, String str7, C3508cda cda6, Integer num2, C3508cda cda7, C3508cda cda8, d dVar, String str8, String str9, C3508cda cda9, C3508cda cda10, List<String> list, String str10, String str11, String str12, String str13, i iVar, a aVar, h hVar, Long l2, C3508cda cda11, e eVar) {
        g gVar2 = gVar;
        Boolean bool2 = bool;
        j jVar2 = jVar;
        String str14 = str;
        C3508cda cda12 = cda;
        String str15 = str2;
        C3508cda cda13 = cda2;
        String str16 = str3;
        C3508cda cda14 = cda3;
        String str17 = str4;
        C3704f fVar2 = fVar;
        v vVar2 = vVar;
        String str18 = str5;
        c cVar2 = cVar;
        b bVar2 = bVar;
        String str19 = str6;
        C3508cda cda15 = cda4;
        C3508cda cda16 = cda5;
        Integer num3 = num;
        String str20 = str7;
        C3508cda cda17 = cda6;
        Integer num4 = num2;
        C3508cda cda18 = cda7;
        C3508cda cda19 = cda8;
        d dVar2 = dVar;
        String str21 = str8;
        String str22 = str9;
        C3508cda cda20 = cda9;
        C3508cda cda21 = cda10;
        List<String> list2 = list;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        i iVar2 = iVar;
        a aVar2 = aVar;
        h hVar2 = hVar;
        Long l3 = l2;
        C3508cda cda22 = cda11;
        e eVar2 = eVar;
        g gVar3 = gVar2;
        C7471uYa.b(gVar2, "kind");
        K k2 = new K(gVar2, bool2, jVar2, str14, cda12, str15, cda13, str16, cda14, str17, fVar2, vVar2, str18, cVar2, bVar2, str19, cda15, cda16, num3, str20, cda17, num4, cda18, cda19, dVar2, str21, str22, cda20, cda21, list2, str23, str24, str25, str26, iVar2, aVar2, hVar2, l3, cda22, eVar2);
        return k2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0196, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.Q, (java.lang.Object) r3.Q) != false) goto L_0x019b;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K) {
                K k2 = (K) obj;
                if (C7471uYa.a((Object) this.d, (Object) k2.d)) {
                    if (C7471uYa.a((Object) this.e, (Object) k2.e)) {
                        if (C7471uYa.a((Object) this.f, (Object) k2.f)) {
                            if (C7471uYa.a((Object) this.g, (Object) k2.g)) {
                                if (C7471uYa.a((Object) this.h, (Object) k2.h)) {
                                    if (C7471uYa.a((Object) this.i, (Object) k2.i)) {
                                        if (C7471uYa.a((Object) this.j, (Object) k2.j)) {
                                            if (C7471uYa.a((Object) this.k, (Object) k2.k)) {
                                                if (C7471uYa.a((Object) this.l, (Object) k2.l)) {
                                                    if (C7471uYa.a((Object) this.m, (Object) k2.m)) {
                                                        if (C7471uYa.a((Object) this.n, (Object) k2.n)) {
                                                            if (C7471uYa.a((Object) this.o, (Object) k2.o)) {
                                                                if (C7471uYa.a((Object) this.p, (Object) k2.p)) {
                                                                    if (C7471uYa.a((Object) this.q, (Object) k2.q)) {
                                                                        if (C7471uYa.a((Object) this.r, (Object) k2.r)) {
                                                                            if (C7471uYa.a((Object) this.s, (Object) k2.s)) {
                                                                                if (C7471uYa.a((Object) this.t, (Object) k2.t)) {
                                                                                    if (C7471uYa.a((Object) this.u, (Object) k2.u)) {
                                                                                        if (C7471uYa.a((Object) this.v, (Object) k2.v)) {
                                                                                            if (C7471uYa.a((Object) this.w, (Object) k2.w)) {
                                                                                                if (C7471uYa.a((Object) this.x, (Object) k2.x)) {
                                                                                                    if (C7471uYa.a((Object) this.y, (Object) k2.y)) {
                                                                                                        if (C7471uYa.a((Object) this.z, (Object) k2.z)) {
                                                                                                            if (C7471uYa.a((Object) this.A, (Object) k2.A)) {
                                                                                                                if (C7471uYa.a((Object) this.B, (Object) k2.B)) {
                                                                                                                    if (C7471uYa.a((Object) this.C, (Object) k2.C)) {
                                                                                                                        if (C7471uYa.a((Object) this.D, (Object) k2.D)) {
                                                                                                                            if (C7471uYa.a((Object) this.E, (Object) k2.E)) {
                                                                                                                                if (C7471uYa.a((Object) this.F, (Object) k2.F)) {
                                                                                                                                    if (C7471uYa.a((Object) this.G, (Object) k2.G)) {
                                                                                                                                        if (C7471uYa.a((Object) this.H, (Object) k2.H)) {
                                                                                                                                            if (C7471uYa.a((Object) this.I, (Object) k2.I)) {
                                                                                                                                                if (C7471uYa.a((Object) this.J, (Object) k2.J)) {
                                                                                                                                                    if (C7471uYa.a((Object) this.K, (Object) k2.K)) {
                                                                                                                                                        if (C7471uYa.a((Object) this.L, (Object) k2.L)) {
                                                                                                                                                            if (C7471uYa.a((Object) this.M, (Object) k2.M)) {
                                                                                                                                                                if (C7471uYa.a((Object) this.N, (Object) k2.N)) {
                                                                                                                                                                    if (C7471uYa.a((Object) this.O, (Object) k2.O)) {
                                                                                                                                                                        if (C7471uYa.a((Object) this.P, (Object) k2.P)) {
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String f() {
        String str = this.c;
        C7471uYa.a((Object) str, "defaultId");
        return str;
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        g gVar = this.d;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        Boolean bool = this.e;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        j jVar = this.f;
        int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        C3508cda cda = this.h;
        int hashCode5 = (hashCode4 + (cda != null ? cda.hashCode() : 0)) * 31;
        String str2 = this.i;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C3508cda cda2 = this.j;
        int hashCode7 = (hashCode6 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        String str3 = this.k;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C3508cda cda3 = this.l;
        int hashCode9 = (hashCode8 + (cda3 != null ? cda3.hashCode() : 0)) * 31;
        String str4 = this.m;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C3704f fVar = this.n;
        int hashCode11 = (hashCode10 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        v vVar = this.o;
        int hashCode12 = (hashCode11 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        String str5 = this.p;
        int hashCode13 = (hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31;
        c cVar = this.q;
        int hashCode14 = (hashCode13 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        b bVar = this.r;
        int hashCode15 = (hashCode14 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str6 = this.s;
        int hashCode16 = (hashCode15 + (str6 != null ? str6.hashCode() : 0)) * 31;
        C3508cda cda4 = this.t;
        int hashCode17 = (hashCode16 + (cda4 != null ? cda4.hashCode() : 0)) * 31;
        C3508cda cda5 = this.u;
        int hashCode18 = (hashCode17 + (cda5 != null ? cda5.hashCode() : 0)) * 31;
        Integer num = this.v;
        int hashCode19 = (hashCode18 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.w;
        int hashCode20 = (hashCode19 + (str7 != null ? str7.hashCode() : 0)) * 31;
        C3508cda cda6 = this.x;
        int hashCode21 = (hashCode20 + (cda6 != null ? cda6.hashCode() : 0)) * 31;
        Integer num2 = this.y;
        int hashCode22 = (hashCode21 + (num2 != null ? num2.hashCode() : 0)) * 31;
        C3508cda cda7 = this.z;
        int hashCode23 = (hashCode22 + (cda7 != null ? cda7.hashCode() : 0)) * 31;
        C3508cda cda8 = this.A;
        int hashCode24 = (hashCode23 + (cda8 != null ? cda8.hashCode() : 0)) * 31;
        d dVar = this.B;
        int hashCode25 = (hashCode24 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str8 = this.C;
        int hashCode26 = (hashCode25 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.D;
        int hashCode27 = (hashCode26 + (str9 != null ? str9.hashCode() : 0)) * 31;
        C3508cda cda9 = this.E;
        int hashCode28 = (hashCode27 + (cda9 != null ? cda9.hashCode() : 0)) * 31;
        C3508cda cda10 = this.F;
        int hashCode29 = (hashCode28 + (cda10 != null ? cda10.hashCode() : 0)) * 31;
        List<String> list = this.G;
        int hashCode30 = (hashCode29 + (list != null ? list.hashCode() : 0)) * 31;
        String str10 = this.H;
        int hashCode31 = (hashCode30 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.I;
        int hashCode32 = (hashCode31 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.J;
        int hashCode33 = (hashCode32 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.K;
        int hashCode34 = (hashCode33 + (str13 != null ? str13.hashCode() : 0)) * 31;
        i iVar = this.L;
        int hashCode35 = (hashCode34 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        a aVar = this.M;
        int hashCode36 = (hashCode35 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        h hVar = this.N;
        int hashCode37 = (hashCode36 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Long l2 = this.O;
        int hashCode38 = (hashCode37 + (l2 != null ? l2.hashCode() : 0)) * 31;
        C3508cda cda11 = this.P;
        int hashCode39 = (hashCode38 + (cda11 != null ? cda11.hashCode() : 0)) * 31;
        e eVar = this.Q;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode39 + i2;
    }

    public final a n() {
        return this.M;
    }

    public final List<String> o() {
        return this.G;
    }

    public final String p() {
        return this.C;
    }

    public final C3704f q() {
        return this.n;
    }

    public final b r() {
        return this.r;
    }

    public final c s() {
        return this.q;
    }

    public final C3508cda t() {
        return this.z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UIEvent(kind=");
        sb.append(this.d);
        sb.append(", isFromOverflow=");
        sb.append(this.e);
        sb.append(", trigger=");
        sb.append(this.f);
        sb.append(", creatorName=");
        sb.append(this.g);
        sb.append(", creatorUrn=");
        sb.append(this.h);
        sb.append(", playableTitle=");
        sb.append(this.i);
        sb.append(", playableUrn=");
        sb.append(this.j);
        sb.append(", playableType=");
        sb.append(this.k);
        sb.append(", pageUrn=");
        sb.append(this.l);
        sb.append(", originScreen=");
        sb.append(this.m);
        sb.append(", attributingActivity=");
        sb.append(this.n);
        sb.append(", module=");
        sb.append(this.o);
        sb.append(", linkType=");
        sb.append(this.p);
        sb.append(", clickName=");
        sb.append(this.q);
        sb.append(", clickCategory=");
        sb.append(this.r);
        sb.append(", clickSource=");
        sb.append(this.s);
        sb.append(", clickSourceUrn=");
        sb.append(this.t);
        sb.append(", clickSourceQueryUrn=");
        sb.append(this.u);
        sb.append(", clickSourceQueryPosition=");
        sb.append(this.v);
        sb.append(", clickVersion=");
        sb.append(this.w);
        sb.append(", queryUrn=");
        sb.append(this.x);
        sb.append(", queryPosition=");
        sb.append(this.y);
        sb.append(", clickObjectUrn=");
        sb.append(this.z);
        sb.append(", clickTargetUrn=");
        sb.append(this.A);
        sb.append(", clickTarget=");
        sb.append(this.B);
        sb.append(", adUrn=");
        sb.append(this.C);
        sb.append(", monetizationType=");
        sb.append(this.D);
        sb.append(", monetizableTrackUrn=");
        sb.append(this.E);
        sb.append(", promoterUrn=");
        sb.append(this.F);
        sb.append(", adTrackingUrls=");
        sb.append(this.G);
        sb.append(", clickthroughsKind=");
        sb.append(this.H);
        sb.append(", clickthroughsUrl=");
        sb.append(this.I);
        sb.append(", adArtworkUrl=");
        sb.append(this.J);
        sb.append(", playQueueRepeatMode=");
        sb.append(this.K);
        sb.append(", shareLinkType=");
        sb.append(this.L);
        sb.append(", action=");
        sb.append(this.M);
        sb.append(", playerInterface=");
        sb.append(this.N);
        sb.append(", commentedAt=");
        sb.append(this.O);
        sb.append(", commentUrn=");
        sb.append(this.P);
        sb.append(", commentType=");
        sb.append(this.Q);
        sb.append(")");
        return sb.toString();
    }

    public final String u() {
        return this.s;
    }

    public final Integer v() {
        return this.v;
    }

    public final C3508cda w() {
        return this.u;
    }

    public final C3508cda x() {
        return this.t;
    }

    public final d y() {
        return this.B;
    }

    public final C3508cda z() {
        return this.A;
    }

    public K(g gVar, Boolean bool, j jVar, String str, C3508cda cda, String str2, C3508cda cda2, String str3, C3508cda cda3, String str4, C3704f fVar, v vVar, String str5, c cVar, b bVar, String str6, C3508cda cda4, C3508cda cda5, Integer num, String str7, C3508cda cda6, Integer num2, C3508cda cda7, C3508cda cda8, d dVar, String str8, String str9, C3508cda cda9, C3508cda cda10, List<String> list, String str10, String str11, String str12, String str13, i iVar, a aVar, h hVar, Long l2, C3508cda cda11, e eVar) {
        g gVar2 = gVar;
        C7471uYa.b(gVar, "kind");
        this.d = gVar2;
        this.e = bool;
        this.f = jVar;
        this.g = str;
        this.h = cda;
        this.i = str2;
        this.j = cda2;
        this.k = str3;
        this.l = cda3;
        this.m = str4;
        this.n = fVar;
        this.o = vVar;
        this.p = str5;
        this.q = cVar;
        this.r = bVar;
        this.s = str6;
        this.t = cda4;
        this.u = cda5;
        this.v = num;
        this.w = str7;
        this.x = cda6;
        this.y = num2;
        this.z = cda7;
        this.A = cda8;
        this.B = dVar;
        this.C = str8;
        this.D = str9;
        this.E = cda9;
        this.F = cda10;
        this.G = list;
        this.H = str10;
        this.I = str11;
        this.J = str12;
        this.K = str13;
        this.L = iVar;
        this.M = aVar;
        this.N = hVar;
        this.O = l2;
        this.P = cda11;
        this.Q = eVar;
        this.b = J.c();
        this.c = J.b();
    }
}
