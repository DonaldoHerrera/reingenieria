package com.soundcloud.flippernative.api;

public final class item_interaction_action_t_value {
    public static final item_interaction_action_t_value FOLLOW_ADD = new item_interaction_action_t_value("FOLLOW_ADD");
    public static final item_interaction_action_t_value FOLLOW_REMOVE = new item_interaction_action_t_value("FOLLOW_REMOVE");
    public static final item_interaction_action_t_value ITEM_NAVIGATION = new item_interaction_action_t_value("ITEM_NAVIGATION");
    public static final item_interaction_action_t_value LIKE_ADD = new item_interaction_action_t_value("LIKE_ADD");
    public static final item_interaction_action_t_value LIKE_REMOVE = new item_interaction_action_t_value("LIKE_REMOVE");
    public static final item_interaction_action_t_value PLAYLIST_REMOVE = new item_interaction_action_t_value("PLAYLIST_REMOVE");
    public static final item_interaction_action_t_value REPOST_ADD = new item_interaction_action_t_value("REPOST_ADD");
    public static final item_interaction_action_t_value REPOST_REMOVE = new item_interaction_action_t_value("REPOST_REMOVE");
    public static final item_interaction_action_t_value SHARE = new item_interaction_action_t_value("SHARE");
    public static final item_interaction_action_t_value SHARE_PROMPT = new item_interaction_action_t_value("SHARE_PROMPT");
    public static final item_interaction_action_t_value SHARE_REQUEST = new item_interaction_action_t_value("SHARE_REQUEST");
    public static final item_interaction_action_t_value TRACK_TO_PLAYLIST_ADD = new item_interaction_action_t_value("TRACK_TO_PLAYLIST_ADD");
    public static final item_interaction_action_t_value TRACK_TO_PLAYLIST_REMOVE = new item_interaction_action_t_value("TRACK_TO_PLAYLIST_REMOVE");
    private static int swigNext = 0;
    private static item_interaction_action_t_value[] swigValues = {ITEM_NAVIGATION, LIKE_ADD, LIKE_REMOVE, FOLLOW_ADD, FOLLOW_REMOVE, REPOST_ADD, REPOST_REMOVE, TRACK_TO_PLAYLIST_ADD, TRACK_TO_PLAYLIST_REMOVE, PLAYLIST_REMOVE, SHARE, SHARE_PROMPT, SHARE_REQUEST};
    private final String swigName;
    private final int swigValue;

    private item_interaction_action_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static item_interaction_action_t_value swigToEnum(int i) {
        item_interaction_action_t_value[] item_interaction_action_t_valueArr = swigValues;
        if (i < item_interaction_action_t_valueArr.length && i >= 0 && item_interaction_action_t_valueArr[i].swigValue == i) {
            return item_interaction_action_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            item_interaction_action_t_value[] item_interaction_action_t_valueArr2 = swigValues;
            if (i2 >= item_interaction_action_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(item_interaction_action_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (item_interaction_action_t_valueArr2[i2].swigValue == i) {
                return item_interaction_action_t_valueArr2[i2];
            } else {
                i2++;
            }
        }
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    private item_interaction_action_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private item_interaction_action_t_value(String str, item_interaction_action_t_value item_interaction_action_t_value) {
        this.swigName = str;
        this.swigValue = item_interaction_action_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
