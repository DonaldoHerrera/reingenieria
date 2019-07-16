package com.soundcloud.flippernative.api;

public class PlayerJni implements PlayerJniConstants {
    public static int bitRateForFormat(MediaFormat mediaFormat) {
        return PlayerJniJNI.bitRateForFormat(mediaFormat.swigValue());
    }

    public static String errorReasonString(ErrorReason errorReason) {
        return PlayerJniJNI.errorReasonString(errorReason.swigValue());
    }

    public static SWIGTYPE_p_p_char getAd_delivery_connection_type_t_name() {
        long ad_delivery_connection_type_t_name_get = PlayerJniJNI.ad_delivery_connection_type_t_name_get();
        if (ad_delivery_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(ad_delivery_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAd_opportunity_connection_type_t_name() {
        long ad_opportunity_connection_type_t_name_get = PlayerJniJNI.ad_opportunity_connection_type_t_name_get();
        if (ad_opportunity_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(ad_opportunity_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAd_request_connection_type_t_name() {
        long ad_request_connection_type_t_name_get = PlayerJniJNI.ad_request_connection_type_t_name_get();
        if (ad_request_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(ad_request_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_action_t_name() {
        long audio_action_t_name_get = PlayerJniJNI.audio_action_t_name_get();
        if (audio_action_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_action_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_app_state_t_name() {
        long audio_app_state_t_name_get = PlayerJniJNI.audio_app_state_t_name_get();
        if (audio_app_state_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_app_state_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_audio_quality_mode_t_name() {
        long audio_audio_quality_mode_t_name_get = PlayerJniJNI.audio_audio_quality_mode_t_name_get();
        if (audio_audio_quality_mode_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_audio_quality_mode_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_connection_type_t_name() {
        long audio_connection_type_t_name_get = PlayerJniJNI.audio_connection_type_t_name_get();
        if (audio_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_error_app_state_t_name() {
        long audio_error_app_state_t_name_get = PlayerJniJNI.audio_error_app_state_t_name_get();
        if (audio_error_app_state_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_error_app_state_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_error_audio_quality_mode_t_name() {
        long audio_error_audio_quality_mode_t_name_get = PlayerJniJNI.audio_error_audio_quality_mode_t_name_get();
        if (audio_error_audio_quality_mode_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_error_audio_quality_mode_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_error_entity_type_t_name() {
        long audio_error_entity_type_t_name_get = PlayerJniJNI.audio_error_entity_type_t_name_get();
        if (audio_error_entity_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_error_entity_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_error_quality_t_name() {
        long audio_error_quality_t_name_get = PlayerJniJNI.audio_error_quality_t_name_get();
        if (audio_error_quality_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_error_quality_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_interruption_connection_type_t_name() {
        long audio_interruption_connection_type_t_name_get = PlayerJniJNI.audio_interruption_connection_type_t_name_get();
        if (audio_interruption_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_interruption_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_pause_reason_t_name() {
        long audio_pause_reason_t_name_get = PlayerJniJNI.audio_pause_reason_t_name_get();
        if (audio_pause_reason_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_pause_reason_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_performance_app_state_t_name() {
        long audio_performance_app_state_t_name_get = PlayerJniJNI.audio_performance_app_state_t_name_get();
        if (audio_performance_app_state_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_performance_app_state_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_performance_audio_quality_mode_t_name() {
        long audio_performance_audio_quality_mode_t_name_get = PlayerJniJNI.audio_performance_audio_quality_mode_t_name_get();
        if (audio_performance_audio_quality_mode_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_performance_audio_quality_mode_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_performance_entity_type_t_name() {
        long audio_performance_entity_type_t_name_get = PlayerJniJNI.audio_performance_entity_type_t_name_get();
        if (audio_performance_entity_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_performance_entity_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_performance_preloaded_t_name() {
        long audio_performance_preloaded_t_name_get = PlayerJniJNI.audio_performance_preloaded_t_name_get();
        if (audio_performance_preloaded_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_performance_preloaded_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_performance_quality_t_name() {
        long audio_performance_quality_t_name_get = PlayerJniJNI.audio_performance_quality_t_name_get();
        if (audio_performance_quality_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_performance_quality_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_policy_t_name() {
        long audio_policy_t_name_get = PlayerJniJNI.audio_policy_t_name_get();
        if (audio_policy_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_policy_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_quality_t_name() {
        long audio_quality_t_name_get = PlayerJniJNI.audio_quality_t_name_get();
        if (audio_quality_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_quality_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getAudio_trigger_t_name() {
        long audio_trigger_t_name_get = PlayerJniJNI.audio_trigger_t_name_get();
        if (audio_trigger_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(audio_trigger_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getClick_connection_type_t_name() {
        long click_connection_type_t_name_get = PlayerJniJNI.click_connection_type_t_name_get();
        if (click_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(click_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getForeground_connection_type_t_name() {
        long foreground_connection_type_t_name_get = PlayerJniJNI.foreground_connection_type_t_name_get();
        if (foreground_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(foreground_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getImpression_connection_type_t_name() {
        long impression_connection_type_t_name_get = PlayerJniJNI.impression_connection_type_t_name_get();
        if (impression_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(impression_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getItem_interaction_action_t_name() {
        long item_interaction_action_t_name_get = PlayerJniJNI.item_interaction_action_t_name_get();
        if (item_interaction_action_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(item_interaction_action_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getItem_interaction_connection_type_t_name() {
        long item_interaction_connection_type_t_name_get = PlayerJniJNI.item_interaction_connection_type_t_name_get();
        if (item_interaction_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(item_interaction_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getItem_interaction_link_type_t_name() {
        long item_interaction_link_type_t_name_get = PlayerJniJNI.item_interaction_link_type_t_name_get();
        if (item_interaction_link_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(item_interaction_link_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getList_view_interaction_action_t_name() {
        long list_view_interaction_action_t_name_get = PlayerJniJNI.list_view_interaction_action_t_name_get();
        if (list_view_interaction_action_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(list_view_interaction_action_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getList_view_interaction_connection_type_t_name() {
        long list_view_interaction_connection_type_t_name_get = PlayerJniJNI.list_view_interaction_connection_type_t_name_get();
        if (list_view_interaction_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(list_view_interaction_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getOffline_sync_connection_type_t_name() {
        long offline_sync_connection_type_t_name_get = PlayerJniJNI.offline_sync_connection_type_t_name_get();
        if (offline_sync_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(offline_sync_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getOffline_sync_quality_t_name() {
        long offline_sync_quality_t_name_get = PlayerJniJNI.offline_sync_quality_t_name_get();
        if (offline_sync_quality_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(offline_sync_quality_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getPageview_connection_type_t_name() {
        long pageview_connection_type_t_name_get = PlayerJniJNI.pageview_connection_type_t_name_get();
        if (pageview_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(pageview_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getPageview_navigation_type_t_name() {
        long pageview_navigation_type_t_name_get = PlayerJniJNI.pageview_navigation_type_t_name_get();
        if (pageview_navigation_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(pageview_navigation_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getRich_media_stream_action_t_name() {
        long rich_media_stream_action_t_name_get = PlayerJniJNI.rich_media_stream_action_t_name_get();
        if (rich_media_stream_action_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(rich_media_stream_action_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getRich_media_stream_connection_type_t_name() {
        long rich_media_stream_connection_type_t_name_get = PlayerJniJNI.rich_media_stream_connection_type_t_name_get();
        if (rich_media_stream_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(rich_media_stream_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getRich_media_stream_error_connection_type_t_name() {
        long rich_media_stream_error_connection_type_t_name_get = PlayerJniJNI.rich_media_stream_error_connection_type_t_name_get();
        if (rich_media_stream_error_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(rich_media_stream_error_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getRich_media_stream_pause_reason_t_name() {
        long rich_media_stream_pause_reason_t_name_get = PlayerJniJNI.rich_media_stream_pause_reason_t_name_get();
        if (rich_media_stream_pause_reason_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(rich_media_stream_pause_reason_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getRich_media_stream_performance_connection_type_t_name() {
        long rich_media_stream_performance_connection_type_t_name_get = PlayerJniJNI.rich_media_stream_performance_connection_type_t_name_get();
        if (rich_media_stream_performance_connection_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(rich_media_stream_performance_connection_type_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getRich_media_stream_trigger_t_name() {
        long rich_media_stream_trigger_t_name_get = PlayerJniJNI.rich_media_stream_trigger_t_name_get();
        if (rich_media_stream_trigger_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(rich_media_stream_trigger_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getStats_view_metric_t_name() {
        long stats_view_metric_t_name_get = PlayerJniJNI.stats_view_metric_t_name_get();
        if (stats_view_metric_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(stats_view_metric_t_name_get, false);
    }

    public static SWIGTYPE_p_p_char getStats_view_type_t_name() {
        long stats_view_type_t_name_get = PlayerJniJNI.stats_view_type_t_name_get();
        if (stats_view_type_t_name_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_p_char(stats_view_type_t_name_get, false);
    }

    public static long mediaFormatBitrateString(MediaFormat mediaFormat) {
        return PlayerJniJNI.mediaFormatBitrateString(mediaFormat.swigValue());
    }

    public static String mediaFormatString(MediaFormat mediaFormat) {
        return PlayerJniJNI.mediaFormatString(mediaFormat.swigValue());
    }

    public static int sampleRateForFormat(MediaFormat mediaFormat) {
        return PlayerJniJNI.sampleRateForFormat(mediaFormat.swigValue());
    }

    public static String streamingProtocolString(StreamingProtocol streamingProtocol) {
        return PlayerJniJNI.streamingProtocolString(streamingProtocol.swigValue());
    }
}
