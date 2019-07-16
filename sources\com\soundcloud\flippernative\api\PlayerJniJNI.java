package com.soundcloud.flippernative.api;

import java.io.PrintStream;

public class PlayerJniJNI {
    static {
        try {
            System.loadLibrary("flipper_shared_android");
        } catch (UnsatisfiedLinkError e) {
            try {
                System.loadLibrary("flipper_shared_androidd");
            } catch (UnsatisfiedLinkError unused) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("Native code library failed to load. \n");
                sb.append(e);
                printStream.println(sb.toString());
                System.exit(1);
            }
        }
        swig_module_init();
    }

    public static final native long AnyEvent_SWIGUpcast(long j);

    public static final native long AudioFormat_codec_get(long j, AudioFormat audioFormat);

    public static final native void AudioFormat_codec_set(long j, AudioFormat audioFormat, long j2, CodecInfo codecInfo);

    public static final native int AudioFormat_container_get(long j, AudioFormat audioFormat);

    public static final native void AudioFormat_container_set(long j, AudioFormat audioFormat, int i);

    public static final native int AudioFormat_estimatedBitrate_get(long j, AudioFormat audioFormat);

    public static final native void AudioFormat_estimatedBitrate_set(long j, AudioFormat audioFormat, int i);

    public static final native long BaseAnyEvent_SWIGUpcast(long j);

    public static final native long BaseAnyEvent_clone(long j, BaseAnyEvent baseAnyEvent);

    public static final native String BaseAnyEvent_toJson(long j, BaseAnyEvent baseAnyEvent);

    public static final native long BaseAudioPerformanceEvent_SWIGUpcast(long j);

    public static final native long BaseAudioPerformanceEvent_clone(long j, BaseAudioPerformanceEvent baseAudioPerformanceEvent);

    public static final native String BaseAudioPerformanceEvent_toJson(long j, BaseAudioPerformanceEvent baseAudioPerformanceEvent);

    public static final native long CodecFrame_data_get(long j, CodecFrame codecFrame);

    public static final native void CodecFrame_data_set(long j, CodecFrame codecFrame, long j2, VectorChar vectorChar);

    public static final native long CodecFrame_pts_get(long j, CodecFrame codecFrame);

    public static final native void CodecFrame_pts_set(long j, CodecFrame codecFrame, long j2);

    public static final native int CodecInfo_codec_get(long j, CodecInfo codecInfo);

    public static final native void CodecInfo_codec_set(long j, CodecInfo codecInfo, int i);

    public static final native long CodecInfo_sampleRate_get(long j, CodecInfo codecInfo);

    public static final native void CodecInfo_sampleRate_set(long j, CodecInfo codecInfo, long j2);

    public static final native void CustomLogger_change_ownership(CustomLogger customLogger, long j, boolean z);

    public static final native void CustomLogger_director_connect(CustomLogger customLogger, long j, boolean z, boolean z2);

    public static final native void CustomLogger_log(long j, CustomLogger customLogger, int i, String str);

    public static final native String Error_Category_AUDIO_BACKEND_FAILED_TO_OPEN_get();

    public static final native void Error_Category_AUDIO_BACKEND_FAILED_TO_OPEN_set(String str);

    public static final native String Error_Category_FAILED_TO_LOAD_KEY_get();

    public static final native void Error_Category_FAILED_TO_LOAD_KEY_set(String str);

    public static final native String Error_Category_FAILED_TO_OPEN_DECODER_get();

    public static final native void Error_Category_FAILED_TO_OPEN_DECODER_set(String str);

    public static final native String Error_Category_HLS_STREAM_NETWORK_get();

    public static final native void Error_Category_HLS_STREAM_NETWORK_set(String str);

    public static final native String Error_Category_MP3_EXTRACTOR_get();

    public static final native void Error_Category_MP3_EXTRACTOR_set(String str);

    public static final native String Error_Category_OFFLINE_PLAYBACK_FAILED_TO_OPEN_get();

    public static final native void Error_Category_OFFLINE_PLAYBACK_FAILED_TO_OPEN_set(String str);

    public static final native String Error_Category_PLAYLIST_INCOMPLETE_get();

    public static final native void Error_Category_PLAYLIST_INCOMPLETE_set(String str);

    public static final native void Error_appendDebugInfo(long j, Error error, String str);

    public static final native String Error_category(long j, Error error);

    public static final native int Error_code(long j, Error error);

    public static final native String Error_debugInfo(long j, Error error);

    public static final native int Error_errorReason(long j, Error error);

    public static final native String Error_file(long j, Error error);

    public static final native int Error_line(long j, Error error);

    public static final native void Error_prependDebugInfo(long j, Error error, String str);

    public static final native String Error_sinkName(long j, Error error);

    public static final native int L_DEBUG_get();

    public static final native void MediaCodecDelegate_change_ownership(MediaCodecDelegate mediaCodecDelegate, long j, boolean z);

    public static final native void MediaCodecDelegate_close(long j, MediaCodecDelegate mediaCodecDelegate);

    public static final native long MediaCodecDelegate_decode(long j, MediaCodecDelegate mediaCodecDelegate, long j2, VectorChar vectorChar, long j3, boolean z);

    public static final native void MediaCodecDelegate_director_connect(MediaCodecDelegate mediaCodecDelegate, long j, boolean z, boolean z2);

    public static final native boolean MediaCodecDelegate_isOutputEOS(long j, MediaCodecDelegate mediaCodecDelegate);

    public static final native boolean MediaCodecDelegate_open(long j, MediaCodecDelegate mediaCodecDelegate, String str);

    public static final native void MediaCodecDelegate_start(long j, MediaCodecDelegate mediaCodecDelegate);

    public static final native void MediaCodecDelegate_stop(long j, MediaCodecDelegate mediaCodecDelegate);

    public static final native String MediaType_getMediaMimeType(long j, MediaType mediaType);

    public static final native int MediaType_getStreamingProtocol(long j, MediaType mediaType);

    public static final native int Normal_get();

    public static final native long PlayerConfigurationBuilder_build(long j, PlayerConfigurationBuilder playerConfigurationBuilder);

    public static final native long PlayerConfigurationBuilder_setAndroidUseOboeSink(long j, PlayerConfigurationBuilder playerConfigurationBuilder, boolean z);

    public static final native long PlayerConfigurationBuilder_setCacheFileName(long j, PlayerConfigurationBuilder playerConfigurationBuilder, String str);

    public static final native long PlayerConfigurationBuilder_setCacheKey(long j, PlayerConfigurationBuilder playerConfigurationBuilder, String str);

    public static final native long PlayerConfigurationBuilder_setCachePath(long j, PlayerConfigurationBuilder playerConfigurationBuilder, String str);

    public static final native long PlayerConfigurationBuilder_setCrashOnHang(long j, PlayerConfigurationBuilder playerConfigurationBuilder, boolean z);

    public static final native long PlayerConfigurationBuilder_setForceEncryptedHls(long j, PlayerConfigurationBuilder playerConfigurationBuilder, boolean z);

    public static final native long PlayerConfigurationBuilder_setLogfilePath(long j, PlayerConfigurationBuilder playerConfigurationBuilder, String str);

    public static final native long PlayerConfigurationBuilder_setMaxCacheSize(long j, PlayerConfigurationBuilder playerConfigurationBuilder, long j2);

    public static final native long PlayerConfigurationBuilder_setMinFreeSpacePercentage(long j, PlayerConfigurationBuilder playerConfigurationBuilder, byte b);

    public static final native long PlayerConfigurationBuilder_setNativeBufferSize(long j, PlayerConfigurationBuilder playerConfigurationBuilder, long j2);

    public static final native long PlayerConfigurationBuilder_setProgressUpdateInterval(long j, PlayerConfigurationBuilder playerConfigurationBuilder, long j2);

    public static final native long PlayerConfigurationBuilder_setTracerEndpoint(long j, PlayerConfigurationBuilder playerConfigurationBuilder, String str);

    public static final native boolean PlayerConfiguration_androidUseOboeSink_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_androidUseOboeSink_set(long j, PlayerConfiguration playerConfiguration, boolean z);

    public static final native String PlayerConfiguration_cacheFileName_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_cacheFileName_set(long j, PlayerConfiguration playerConfiguration, String str);

    public static final native String PlayerConfiguration_cacheKey_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_cacheKey_set(long j, PlayerConfiguration playerConfiguration, String str);

    public static final native String PlayerConfiguration_cachePath_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_cachePath_set(long j, PlayerConfiguration playerConfiguration, String str);

    public static final native boolean PlayerConfiguration_crashOnHang_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_crashOnHang_set(long j, PlayerConfiguration playerConfiguration, boolean z);

    public static final native boolean PlayerConfiguration_forceEncryptedHls_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_forceEncryptedHls_set(long j, PlayerConfiguration playerConfiguration, boolean z);

    public static final native String PlayerConfiguration_logfilePath_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_logfilePath_set(long j, PlayerConfiguration playerConfiguration, String str);

    public static final native long PlayerConfiguration_maxCacheSize_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_maxCacheSize_set(long j, PlayerConfiguration playerConfiguration, long j2);

    public static final native byte PlayerConfiguration_minFreeSpacePercentage_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_minFreeSpacePercentage_set(long j, PlayerConfiguration playerConfiguration, byte b);

    public static final native long PlayerConfiguration_nativeBufferSize_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_nativeBufferSize_set(long j, PlayerConfiguration playerConfiguration, long j2);

    public static final native long PlayerConfiguration_progressUpdateInterval_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_progressUpdateInterval_set(long j, PlayerConfiguration playerConfiguration, long j2);

    public static final native String PlayerConfiguration_tracerEndpoint_get(long j, PlayerConfiguration playerConfiguration);

    public static final native void PlayerConfiguration_tracerEndpoint_set(long j, PlayerConfiguration playerConfiguration, String str);

    public static final native void PlayerListener_change_ownership(PlayerListener playerListener, long j, boolean z);

    public static final native void PlayerListener_director_connect(PlayerListener playerListener, long j, boolean z, boolean z2);

    public static final native void PlayerListener_onBufferingChanged(long j, PlayerListener playerListener, long j2, state_change state_change);

    public static final native void PlayerListener_onDurationChanged(long j, PlayerListener playerListener, long j2, state_change state_change);

    public static final native void PlayerListener_onError(long j, PlayerListener playerListener, long j2, error_message error_message);

    public static final native void PlayerListener_onPerformanceEvent(long j, PlayerListener playerListener, long j2, audio_performance audio_performance);

    public static final native void PlayerListener_onProgressChanged(long j, PlayerListener playerListener, long j2, state_change state_change);

    public static final native void PlayerListener_onSeekingStatusChanged(long j, PlayerListener playerListener, long j2, state_change state_change);

    public static final native void PlayerListener_onStateChanged(long j, PlayerListener playerListener, long j2, state_change state_change);

    public static final native String Player_Version_String_get();

    public static final native void Player_destroy(long j, Player player);

    public static final native void Player_enableCaching(long j, Player player, boolean z);

    public static final native long Player_getPlayerBuildNumber(long j, Player player);

    public static final native String Player_getPlayerVersion(long j, Player player);

    public static final native long Player_getSupportedMediaTypes();

    public static final native double Player_getVolume(long j, Player player);

    public static final native boolean Player_isMuted(long j, Player player);

    public static final native void Player_mute(long j, Player player);

    public static final native boolean Player_openEncrypted__SWIG_0(long j, Player player, String str, byte[] bArr, byte[] bArr2, long j2, int i);

    public static final native boolean Player_openEncrypted__SWIG_1(long j, Player player, String str, byte[] bArr, byte[] bArr2, long j2);

    public static final native boolean Player_openEncrypted__SWIG_2(long j, Player player, String str, byte[] bArr, byte[] bArr2);

    public static final native boolean Player_open__SWIG_0(long j, Player player, String str, long j2);

    public static final native boolean Player_open__SWIG_1(long j, Player player, String str);

    public static final native void Player_pause(long j, Player player);

    public static final native void Player_play(long j, Player player);

    public static final native void Player_prefetch(long j, Player player, String str);

    public static final native void Player_seek(long j, Player player, long j2);

    public static final native void Player_setCustomLogger(long j, CustomLogger customLogger);

    public static final native void Player_setLogLevel(int i);

    public static final native void Player_setMediaCodecDelegate(long j, Player player, long j2, MediaCodecDelegate mediaCodecDelegate);

    public static final native void Player_setVolume(long j, Player player, double d);

    public static final native void Player_stop(long j, Player player);

    public static final native void Player_unmute(long j, Player player);

    public static final native long PropertyAnyEvent_const_get_value(long j, PropertyAnyEvent propertyAnyEvent);

    public static final native long PropertyAnyEvent_get_value(long j, PropertyAnyEvent propertyAnyEvent);

    public static final native boolean PropertyAnyEvent_hasValue(long j, PropertyAnyEvent propertyAnyEvent);

    public static final native void PropertyAnyEvent_set_value(long j, PropertyAnyEvent propertyAnyEvent, long j2, AnyEvent anyEvent);

    public static final native long PropertyAppState_const_get_value(long j, PropertyAppState propertyAppState);

    public static final native long PropertyAppState_get_value(long j, PropertyAppState propertyAppState);

    public static final native boolean PropertyAppState_hasValue(long j, PropertyAppState propertyAppState);

    public static final native void PropertyAppState_set_value(long j, PropertyAppState propertyAppState, long j2, audio_performance_app_state_t audio_performance_app_state_t);

    public static final native long PropertyInt64_const_get_value(long j, PropertyInt64 propertyInt64);

    public static final native long PropertyInt64_get_value(long j, PropertyInt64 propertyInt64);

    public static final native boolean PropertyInt64_hasValue(long j, PropertyInt64 propertyInt64);

    public static final native void PropertyInt64_set_value(long j, PropertyInt64 propertyInt64, long j2);

    public static final native long PropertyPreloaded_const_get_value(long j, PropertyPreloaded propertyPreloaded);

    public static final native long PropertyPreloaded_get_value(long j, PropertyPreloaded propertyPreloaded);

    public static final native boolean PropertyPreloaded_hasValue(long j, PropertyPreloaded propertyPreloaded);

    public static final native void PropertyPreloaded_set_value(long j, PropertyPreloaded propertyPreloaded, long j2, audio_performance_preloaded_t audio_performance_preloaded_t);

    public static final native String PropertyRequiredSecureUri_const_get_value(long j, PropertyRequiredSecureUri propertyRequiredSecureUri);

    public static final native long PropertyRequiredSecureUri_get_unprotected_value(long j, PropertyRequiredSecureUri propertyRequiredSecureUri);

    public static final native long PropertyRequiredSecureUri_get_value(long j, PropertyRequiredSecureUri propertyRequiredSecureUri);

    public static final native void PropertyRequiredSecureUri_set_value(long j, PropertyRequiredSecureUri propertyRequiredSecureUri, String str);

    public static final native long PropertySecureUri_SWIGUpcast(long j);

    public static final native String PropertySecureUri_const_get_value(long j, PropertySecureUri propertySecureUri);

    public static final native long PropertySecureUri_get_unprotected_value(long j, PropertySecureUri propertySecureUri);

    public static final native long PropertySecureUri_get_value(long j, PropertySecureUri propertySecureUri);

    public static final native void PropertySecureUri_set_value(long j, PropertySecureUri propertySecureUri, String str);

    public static final native String PropertyString_const_get_value(long j, PropertyString propertyString);

    public static final native long PropertyString_get_value(long j, PropertyString propertyString);

    public static final native boolean PropertyString_hasValue(long j, PropertyString propertyString);

    public static final native void PropertyString_set_value(long j, PropertyString propertyString, String str);

    public static void SwigDirector_CustomLogger_log(CustomLogger customLogger, int i, String str) {
        customLogger.log(LoggingLevel.swigToEnum(i), str);
    }

    public static void SwigDirector_MediaCodecDelegate_close(MediaCodecDelegate mediaCodecDelegate) {
        mediaCodecDelegate.close();
    }

    public static long SwigDirector_MediaCodecDelegate_decode(MediaCodecDelegate mediaCodecDelegate, long j, long j2, boolean z) {
        return VectorChar.getCPtr(mediaCodecDelegate.decode(new VectorChar(j, false), j2, z));
    }

    public static boolean SwigDirector_MediaCodecDelegate_isOutputEOS(MediaCodecDelegate mediaCodecDelegate) {
        return mediaCodecDelegate.isOutputEOS();
    }

    public static boolean SwigDirector_MediaCodecDelegate_open(MediaCodecDelegate mediaCodecDelegate, String str) {
        return mediaCodecDelegate.open(str);
    }

    public static void SwigDirector_MediaCodecDelegate_start(MediaCodecDelegate mediaCodecDelegate) {
        mediaCodecDelegate.start();
    }

    public static void SwigDirector_MediaCodecDelegate_stop(MediaCodecDelegate mediaCodecDelegate) {
        mediaCodecDelegate.stop();
    }

    public static void SwigDirector_PlayerListener_onBufferingChanged(PlayerListener playerListener, long j) {
        playerListener.onBufferingChanged(new state_change(j, true));
    }

    public static void SwigDirector_PlayerListener_onDurationChanged(PlayerListener playerListener, long j) {
        playerListener.onDurationChanged(new state_change(j, true));
    }

    public static void SwigDirector_PlayerListener_onError(PlayerListener playerListener, long j) {
        playerListener.onError(new error_message(j, true));
    }

    public static void SwigDirector_PlayerListener_onPerformanceEvent(PlayerListener playerListener, long j) {
        playerListener.onPerformanceEvent(new audio_performance(j, true));
    }

    public static void SwigDirector_PlayerListener_onProgressChanged(PlayerListener playerListener, long j) {
        playerListener.onProgressChanged(new state_change(j, true));
    }

    public static void SwigDirector_PlayerListener_onSeekingStatusChanged(PlayerListener playerListener, long j) {
        playerListener.onSeekingStatusChanged(new state_change(j, true));
    }

    public static void SwigDirector_PlayerListener_onStateChanged(PlayerListener playerListener, long j) {
        playerListener.onStateChanged(new state_change(j, true));
    }

    public static final native String UriStringSanitizer_sanitize(String str);

    public static final native void VectorChar_add(long j, VectorChar vectorChar, short s);

    public static final native long VectorChar_capacity(long j, VectorChar vectorChar);

    public static final native void VectorChar_clear(long j, VectorChar vectorChar);

    public static final native short VectorChar_get(long j, VectorChar vectorChar, int i);

    public static final native boolean VectorChar_isEmpty(long j, VectorChar vectorChar);

    public static final native void VectorChar_reserve(long j, VectorChar vectorChar, long j2);

    public static final native void VectorChar_set(long j, VectorChar vectorChar, int i, short s);

    public static final native long VectorChar_size(long j, VectorChar vectorChar);

    public static final native void VectorMediaType_add(long j, VectorMediaType vectorMediaType, long j2, MediaType mediaType);

    public static final native long VectorMediaType_capacity(long j, VectorMediaType vectorMediaType);

    public static final native void VectorMediaType_clear(long j, VectorMediaType vectorMediaType);

    public static final native long VectorMediaType_get(long j, VectorMediaType vectorMediaType, int i);

    public static final native boolean VectorMediaType_isEmpty(long j, VectorMediaType vectorMediaType);

    public static final native void VectorMediaType_reserve(long j, VectorMediaType vectorMediaType, long j2);

    public static final native void VectorMediaType_set(long j, VectorMediaType vectorMediaType, int i, long j2, MediaType mediaType);

    public static final native long VectorMediaType_size(long j, VectorMediaType vectorMediaType);

    public static final native int ad_delivery_connection_type_t_get_value(long j, ad_delivery_connection_type_t ad_delivery_connection_type_t);

    public static final native long ad_delivery_connection_type_t_name_get();

    public static final native String ad_delivery_connection_type_t_toString(long j, ad_delivery_connection_type_t ad_delivery_connection_type_t);

    public static final native int ad_delivery_connection_type_t_value_get(long j, ad_delivery_connection_type_t ad_delivery_connection_type_t);

    public static final native void ad_delivery_connection_type_t_value_set(long j, ad_delivery_connection_type_t ad_delivery_connection_type_t, int i);

    public static final native int ad_opportunity_connection_type_t_get_value(long j, ad_opportunity_connection_type_t ad_opportunity_connection_type_t);

    public static final native long ad_opportunity_connection_type_t_name_get();

    public static final native String ad_opportunity_connection_type_t_toString(long j, ad_opportunity_connection_type_t ad_opportunity_connection_type_t);

    public static final native int ad_opportunity_connection_type_t_value_get(long j, ad_opportunity_connection_type_t ad_opportunity_connection_type_t);

    public static final native void ad_opportunity_connection_type_t_value_set(long j, ad_opportunity_connection_type_t ad_opportunity_connection_type_t, int i);

    public static final native int ad_request_connection_type_t_get_value(long j, ad_request_connection_type_t ad_request_connection_type_t);

    public static final native long ad_request_connection_type_t_name_get();

    public static final native String ad_request_connection_type_t_toString(long j, ad_request_connection_type_t ad_request_connection_type_t);

    public static final native int ad_request_connection_type_t_value_get(long j, ad_request_connection_type_t ad_request_connection_type_t);

    public static final native void ad_request_connection_type_t_value_set(long j, ad_request_connection_type_t ad_request_connection_type_t, int i);

    public static final native int audio_action_t_get_value(long j, audio_action_t audio_action_t);

    public static final native long audio_action_t_name_get();

    public static final native String audio_action_t_toString(long j, audio_action_t audio_action_t);

    public static final native int audio_action_t_value_get(long j, audio_action_t audio_action_t);

    public static final native void audio_action_t_value_set(long j, audio_action_t audio_action_t, int i);

    public static final native int audio_app_state_t_get_value(long j, audio_app_state_t audio_app_state_t);

    public static final native long audio_app_state_t_name_get();

    public static final native String audio_app_state_t_toString(long j, audio_app_state_t audio_app_state_t);

    public static final native int audio_app_state_t_value_get(long j, audio_app_state_t audio_app_state_t);

    public static final native void audio_app_state_t_value_set(long j, audio_app_state_t audio_app_state_t, int i);

    public static final native int audio_audio_quality_mode_t_get_value(long j, audio_audio_quality_mode_t audio_audio_quality_mode_t);

    public static final native long audio_audio_quality_mode_t_name_get();

    public static final native String audio_audio_quality_mode_t_toString(long j, audio_audio_quality_mode_t audio_audio_quality_mode_t);

    public static final native int audio_audio_quality_mode_t_value_get(long j, audio_audio_quality_mode_t audio_audio_quality_mode_t);

    public static final native void audio_audio_quality_mode_t_value_set(long j, audio_audio_quality_mode_t audio_audio_quality_mode_t, int i);

    public static final native int audio_connection_type_t_get_value(long j, audio_connection_type_t audio_connection_type_t);

    public static final native long audio_connection_type_t_name_get();

    public static final native String audio_connection_type_t_toString(long j, audio_connection_type_t audio_connection_type_t);

    public static final native int audio_connection_type_t_value_get(long j, audio_connection_type_t audio_connection_type_t);

    public static final native void audio_connection_type_t_value_set(long j, audio_connection_type_t audio_connection_type_t, int i);

    public static final native int audio_error_app_state_t_get_value(long j, audio_error_app_state_t audio_error_app_state_t);

    public static final native long audio_error_app_state_t_name_get();

    public static final native String audio_error_app_state_t_toString(long j, audio_error_app_state_t audio_error_app_state_t);

    public static final native int audio_error_app_state_t_value_get(long j, audio_error_app_state_t audio_error_app_state_t);

    public static final native void audio_error_app_state_t_value_set(long j, audio_error_app_state_t audio_error_app_state_t, int i);

    public static final native int audio_error_audio_quality_mode_t_get_value(long j, audio_error_audio_quality_mode_t audio_error_audio_quality_mode_t);

    public static final native long audio_error_audio_quality_mode_t_name_get();

    public static final native String audio_error_audio_quality_mode_t_toString(long j, audio_error_audio_quality_mode_t audio_error_audio_quality_mode_t);

    public static final native int audio_error_audio_quality_mode_t_value_get(long j, audio_error_audio_quality_mode_t audio_error_audio_quality_mode_t);

    public static final native void audio_error_audio_quality_mode_t_value_set(long j, audio_error_audio_quality_mode_t audio_error_audio_quality_mode_t, int i);

    public static final native int audio_error_entity_type_t_get_value(long j, audio_error_entity_type_t audio_error_entity_type_t);

    public static final native long audio_error_entity_type_t_name_get();

    public static final native String audio_error_entity_type_t_toString(long j, audio_error_entity_type_t audio_error_entity_type_t);

    public static final native int audio_error_entity_type_t_value_get(long j, audio_error_entity_type_t audio_error_entity_type_t);

    public static final native void audio_error_entity_type_t_value_set(long j, audio_error_entity_type_t audio_error_entity_type_t, int i);

    public static final native int audio_error_quality_t_get_value(long j, audio_error_quality_t audio_error_quality_t);

    public static final native long audio_error_quality_t_name_get();

    public static final native String audio_error_quality_t_toString(long j, audio_error_quality_t audio_error_quality_t);

    public static final native int audio_error_quality_t_value_get(long j, audio_error_quality_t audio_error_quality_t);

    public static final native void audio_error_quality_t_value_set(long j, audio_error_quality_t audio_error_quality_t, int i);

    public static final native int audio_interruption_connection_type_t_get_value(long j, audio_interruption_connection_type_t audio_interruption_connection_type_t);

    public static final native long audio_interruption_connection_type_t_name_get();

    public static final native String audio_interruption_connection_type_t_toString(long j, audio_interruption_connection_type_t audio_interruption_connection_type_t);

    public static final native int audio_interruption_connection_type_t_value_get(long j, audio_interruption_connection_type_t audio_interruption_connection_type_t);

    public static final native void audio_interruption_connection_type_t_value_set(long j, audio_interruption_connection_type_t audio_interruption_connection_type_t, int i);

    public static final native int audio_pause_reason_t_get_value(long j, audio_pause_reason_t audio_pause_reason_t);

    public static final native long audio_pause_reason_t_name_get();

    public static final native String audio_pause_reason_t_toString(long j, audio_pause_reason_t audio_pause_reason_t);

    public static final native int audio_pause_reason_t_value_get(long j, audio_pause_reason_t audio_pause_reason_t);

    public static final native void audio_pause_reason_t_value_set(long j, audio_pause_reason_t audio_pause_reason_t, int i);

    public static final native long audio_performance_SWIGUpcast(long j);

    public static final native long audio_performance_anonymous_id_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_anonymous_id_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_app_state_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_app_state_set(long j, audio_performance audio_performance, long j2, PropertyAppState propertyAppState);

    public static final native int audio_performance_app_state_t_get_value(long j, audio_performance_app_state_t audio_performance_app_state_t);

    public static final native long audio_performance_app_state_t_name_get();

    public static final native String audio_performance_app_state_t_toString(long j, audio_performance_app_state_t audio_performance_app_state_t);

    public static final native int audio_performance_app_state_t_value_get(long j, audio_performance_app_state_t audio_performance_app_state_t);

    public static final native void audio_performance_app_state_t_value_set(long j, audio_performance_app_state_t audio_performance_app_state_t, int i);

    public static final native long audio_performance_app_version_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_app_version_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_audio_quality_mode_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_audio_quality_mode_set(long j, audio_performance audio_performance, long j2);

    public static final native int audio_performance_audio_quality_mode_t_get_value(long j, audio_performance_audio_quality_mode_t audio_performance_audio_quality_mode_t);

    public static final native long audio_performance_audio_quality_mode_t_name_get();

    public static final native String audio_performance_audio_quality_mode_t_toString(long j, audio_performance_audio_quality_mode_t audio_performance_audio_quality_mode_t);

    public static final native int audio_performance_audio_quality_mode_t_value_get(long j, audio_performance_audio_quality_mode_t audio_performance_audio_quality_mode_t);

    public static final native void audio_performance_audio_quality_mode_t_value_set(long j, audio_performance_audio_quality_mode_t audio_performance_audio_quality_mode_t, int i);

    public static final native long audio_performance_bitrate_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_bitrate_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_client_id_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_client_id_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_connection_type_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_connection_type_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_details_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_details_set(long j, audio_performance audio_performance, long j2, PropertyAnyEvent propertyAnyEvent);

    public static final native long audio_performance_entity_type_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_entity_type_set(long j, audio_performance audio_performance, long j2);

    public static final native int audio_performance_entity_type_t_get_value(long j, audio_performance_entity_type_t audio_performance_entity_type_t);

    public static final native long audio_performance_entity_type_t_name_get();

    public static final native String audio_performance_entity_type_t_toString(long j, audio_performance_entity_type_t audio_performance_entity_type_t);

    public static final native int audio_performance_entity_type_t_value_get(long j, audio_performance_entity_type_t audio_performance_entity_type_t);

    public static final native void audio_performance_entity_type_t_value_set(long j, audio_performance_entity_type_t audio_performance_entity_type_t, int i);

    public static final native long audio_performance_exp_android_listening_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_exp_android_listening_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_exp_creator_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_exp_creator_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_exp_creator_subs_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_exp_creator_subs_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_exp_mweb_listening_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_exp_mweb_listening_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_exp_v2_listening_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_exp_v2_listening_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_exp_widget_listening_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_exp_widget_listening_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_format_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_format_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_host_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_host_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_latency_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_latency_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_page_name_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_page_name_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_page_urn_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_page_urn_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_player_build_number_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_player_build_number_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_player_type_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_player_type_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_player_variant_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_player_variant_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_player_version_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_player_version_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_preloaded_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_preloaded_set(long j, audio_performance audio_performance, long j2, PropertyPreloaded propertyPreloaded);

    public static final native int audio_performance_preloaded_t_get_value(long j, audio_performance_preloaded_t audio_performance_preloaded_t);

    public static final native long audio_performance_preloaded_t_name_get();

    public static final native String audio_performance_preloaded_t_toString(long j, audio_performance_preloaded_t audio_performance_preloaded_t);

    public static final native int audio_performance_preloaded_t_value_get(long j, audio_performance_preloaded_t audio_performance_preloaded_t);

    public static final native void audio_performance_preloaded_t_value_set(long j, audio_performance_preloaded_t audio_performance_preloaded_t, int i);

    public static final native long audio_performance_preset_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_preset_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_protocol_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_protocol_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_quality_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_quality_set(long j, audio_performance audio_performance, long j2);

    public static final native int audio_performance_quality_t_get_value(long j, audio_performance_quality_t audio_performance_quality_t);

    public static final native long audio_performance_quality_t_name_get();

    public static final native String audio_performance_quality_t_toString(long j, audio_performance_quality_t audio_performance_quality_t);

    public static final native int audio_performance_quality_t_value_get(long j, audio_performance_quality_t audio_performance_quality_t);

    public static final native void audio_performance_quality_t_value_set(long j, audio_performance_quality_t audio_performance_quality_t, int i);

    public static final native long audio_performance_referrer_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_referrer_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native String audio_performance_schemaVersion();

    public static final native long audio_performance_track_urn_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_track_urn_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_ts_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_ts_set(long j, audio_performance audio_performance, long j2, PropertyInt64 propertyInt64);

    public static final native long audio_performance_type_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_type_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native long audio_performance_url_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_url_set(long j, audio_performance audio_performance, long j2, PropertySecureUri propertySecureUri);

    public static final native long audio_performance_user_get(long j, audio_performance audio_performance);

    public static final native void audio_performance_user_set(long j, audio_performance audio_performance, long j2, PropertyString propertyString);

    public static final native int audio_policy_t_get_value(long j, audio_policy_t audio_policy_t);

    public static final native long audio_policy_t_name_get();

    public static final native String audio_policy_t_toString(long j, audio_policy_t audio_policy_t);

    public static final native int audio_policy_t_value_get(long j, audio_policy_t audio_policy_t);

    public static final native void audio_policy_t_value_set(long j, audio_policy_t audio_policy_t, int i);

    public static final native int audio_quality_t_get_value(long j, audio_quality_t audio_quality_t);

    public static final native long audio_quality_t_name_get();

    public static final native String audio_quality_t_toString(long j, audio_quality_t audio_quality_t);

    public static final native int audio_quality_t_value_get(long j, audio_quality_t audio_quality_t);

    public static final native void audio_quality_t_value_set(long j, audio_quality_t audio_quality_t, int i);

    public static final native int audio_trigger_t_get_value(long j, audio_trigger_t audio_trigger_t);

    public static final native long audio_trigger_t_name_get();

    public static final native String audio_trigger_t_toString(long j, audio_trigger_t audio_trigger_t);

    public static final native int audio_trigger_t_value_get(long j, audio_trigger_t audio_trigger_t);

    public static final native void audio_trigger_t_value_set(long j, audio_trigger_t audio_trigger_t, int i);

    public static final native int bitRateForFormat(int i);

    public static final native int click_connection_type_t_get_value(long j, click_connection_type_t click_connection_type_t);

    public static final native long click_connection_type_t_name_get();

    public static final native String click_connection_type_t_toString(long j, click_connection_type_t click_connection_type_t);

    public static final native int click_connection_type_t_value_get(long j, click_connection_type_t click_connection_type_t);

    public static final native void click_connection_type_t_value_set(long j, click_connection_type_t click_connection_type_t, int i);

    public static final native void delete_AnyEvent(long j);

    public static final native void delete_AudioFormat(long j);

    public static final native void delete_BaseAnyEvent(long j);

    public static final native void delete_BaseAudioPerformanceEvent(long j);

    public static final native void delete_CodecFrame(long j);

    public static final native void delete_CodecInfo(long j);

    public static final native void delete_CustomLogger(long j);

    public static final native void delete_Error(long j);

    public static final native void delete_Error_Category(long j);

    public static final native void delete_MediaCodecDelegate(long j);

    public static final native void delete_MediaType(long j);

    public static final native void delete_Player(long j);

    public static final native void delete_PlayerConfiguration(long j);

    public static final native void delete_PlayerConfigurationBuilder(long j);

    public static final native void delete_PlayerListener(long j);

    public static final native void delete_PropertyAnyEvent(long j);

    public static final native void delete_PropertyAppState(long j);

    public static final native void delete_PropertyInt64(long j);

    public static final native void delete_PropertyPreloaded(long j);

    public static final native void delete_PropertyRequiredSecureUri(long j);

    public static final native void delete_PropertySecureUri(long j);

    public static final native void delete_PropertyString(long j);

    public static final native void delete_UriStringSanitizer(long j);

    public static final native void delete_VectorChar(long j);

    public static final native void delete_VectorMediaType(long j);

    public static final native void delete_ad_delivery_connection_type_t(long j);

    public static final native void delete_ad_opportunity_connection_type_t(long j);

    public static final native void delete_ad_request_connection_type_t(long j);

    public static final native void delete_audio_action_t(long j);

    public static final native void delete_audio_app_state_t(long j);

    public static final native void delete_audio_audio_quality_mode_t(long j);

    public static final native void delete_audio_connection_type_t(long j);

    public static final native void delete_audio_error_app_state_t(long j);

    public static final native void delete_audio_error_audio_quality_mode_t(long j);

    public static final native void delete_audio_error_entity_type_t(long j);

    public static final native void delete_audio_error_quality_t(long j);

    public static final native void delete_audio_interruption_connection_type_t(long j);

    public static final native void delete_audio_pause_reason_t(long j);

    public static final native void delete_audio_performance(long j);

    public static final native void delete_audio_performance_app_state_t(long j);

    public static final native void delete_audio_performance_audio_quality_mode_t(long j);

    public static final native void delete_audio_performance_entity_type_t(long j);

    public static final native void delete_audio_performance_preloaded_t(long j);

    public static final native void delete_audio_performance_quality_t(long j);

    public static final native void delete_audio_policy_t(long j);

    public static final native void delete_audio_quality_t(long j);

    public static final native void delete_audio_trigger_t(long j);

    public static final native void delete_click_connection_type_t(long j);

    public static final native void delete_error_message(long j);

    public static final native void delete_foreground_connection_type_t(long j);

    public static final native void delete_impression_connection_type_t(long j);

    public static final native void delete_item_interaction_action_t(long j);

    public static final native void delete_item_interaction_connection_type_t(long j);

    public static final native void delete_item_interaction_link_type_t(long j);

    public static final native void delete_list_view_interaction_action_t(long j);

    public static final native void delete_list_view_interaction_connection_type_t(long j);

    public static final native void delete_offline_sync_connection_type_t(long j);

    public static final native void delete_offline_sync_quality_t(long j);

    public static final native void delete_pageview_connection_type_t(long j);

    public static final native void delete_pageview_navigation_type_t(long j);

    public static final native void delete_property_error(long j);

    public static final native void delete_rich_media_stream_action_t(long j);

    public static final native void delete_rich_media_stream_connection_type_t(long j);

    public static final native void delete_rich_media_stream_error_connection_type_t(long j);

    public static final native void delete_rich_media_stream_pause_reason_t(long j);

    public static final native void delete_rich_media_stream_performance_connection_type_t(long j);

    public static final native void delete_rich_media_stream_trigger_t(long j);

    public static final native void delete_serializable_event(long j);

    public static final native void delete_state_change(long j);

    public static final native void delete_stats_view_metric_t(long j);

    public static final native void delete_stats_view_type_t(long j);

    public static final native String errorReasonString(int i);

    public static final native int error_message_bitRate_get(long j, error_message error_message);

    public static final native void error_message_bitRate_set(long j, error_message error_message, int i);

    public static final native String error_message_category_get(long j, error_message error_message);

    public static final native void error_message_category_set(long j, error_message error_message, String str);

    public static final native String error_message_cdn_get(long j, error_message error_message);

    public static final native void error_message_cdn_set(long j, error_message error_message, String str);

    public static final native String error_message_errorMessage_get(long j, error_message error_message);

    public static final native void error_message_errorMessage_set(long j, error_message error_message, String str);

    public static final native String error_message_format_get(long j, error_message error_message);

    public static final native void error_message_format_set(long j, error_message error_message, String str);

    public static final native int error_message_line_get(long j, error_message error_message);

    public static final native void error_message_line_set(long j, error_message error_message, int i);

    public static final native String error_message_playerVariant_get(long j, error_message error_message);

    public static final native void error_message_playerVariant_set(long j, error_message error_message, String str);

    public static final native String error_message_sourceFile_get(long j, error_message error_message);

    public static final native void error_message_sourceFile_set(long j, error_message error_message, String str);

    public static final native int error_message_streamingProtocol_get(long j, error_message error_message);

    public static final native void error_message_streamingProtocol_set(long j, error_message error_message, int i);

    public static final native String error_message_uri_get(long j, error_message error_message);

    public static final native void error_message_uri_set(long j, error_message error_message, String str);

    public static final native int foreground_connection_type_t_get_value(long j, foreground_connection_type_t foreground_connection_type_t);

    public static final native long foreground_connection_type_t_name_get();

    public static final native String foreground_connection_type_t_toString(long j, foreground_connection_type_t foreground_connection_type_t);

    public static final native int foreground_connection_type_t_value_get(long j, foreground_connection_type_t foreground_connection_type_t);

    public static final native void foreground_connection_type_t_value_set(long j, foreground_connection_type_t foreground_connection_type_t, int i);

    public static final native int impression_connection_type_t_get_value(long j, impression_connection_type_t impression_connection_type_t);

    public static final native long impression_connection_type_t_name_get();

    public static final native String impression_connection_type_t_toString(long j, impression_connection_type_t impression_connection_type_t);

    public static final native int impression_connection_type_t_value_get(long j, impression_connection_type_t impression_connection_type_t);

    public static final native void impression_connection_type_t_value_set(long j, impression_connection_type_t impression_connection_type_t, int i);

    public static final native int item_interaction_action_t_get_value(long j, item_interaction_action_t item_interaction_action_t);

    public static final native long item_interaction_action_t_name_get();

    public static final native String item_interaction_action_t_toString(long j, item_interaction_action_t item_interaction_action_t);

    public static final native int item_interaction_action_t_value_get(long j, item_interaction_action_t item_interaction_action_t);

    public static final native void item_interaction_action_t_value_set(long j, item_interaction_action_t item_interaction_action_t, int i);

    public static final native int item_interaction_connection_type_t_get_value(long j, item_interaction_connection_type_t item_interaction_connection_type_t);

    public static final native long item_interaction_connection_type_t_name_get();

    public static final native String item_interaction_connection_type_t_toString(long j, item_interaction_connection_type_t item_interaction_connection_type_t);

    public static final native int item_interaction_connection_type_t_value_get(long j, item_interaction_connection_type_t item_interaction_connection_type_t);

    public static final native void item_interaction_connection_type_t_value_set(long j, item_interaction_connection_type_t item_interaction_connection_type_t, int i);

    public static final native int item_interaction_link_type_t_get_value(long j, item_interaction_link_type_t item_interaction_link_type_t);

    public static final native long item_interaction_link_type_t_name_get();

    public static final native String item_interaction_link_type_t_toString(long j, item_interaction_link_type_t item_interaction_link_type_t);

    public static final native int item_interaction_link_type_t_value_get(long j, item_interaction_link_type_t item_interaction_link_type_t);

    public static final native void item_interaction_link_type_t_value_set(long j, item_interaction_link_type_t item_interaction_link_type_t, int i);

    public static final native int list_view_interaction_action_t_get_value(long j, list_view_interaction_action_t list_view_interaction_action_t);

    public static final native long list_view_interaction_action_t_name_get();

    public static final native String list_view_interaction_action_t_toString(long j, list_view_interaction_action_t list_view_interaction_action_t);

    public static final native int list_view_interaction_action_t_value_get(long j, list_view_interaction_action_t list_view_interaction_action_t);

    public static final native void list_view_interaction_action_t_value_set(long j, list_view_interaction_action_t list_view_interaction_action_t, int i);

    public static final native int list_view_interaction_connection_type_t_get_value(long j, list_view_interaction_connection_type_t list_view_interaction_connection_type_t);

    public static final native long list_view_interaction_connection_type_t_name_get();

    public static final native String list_view_interaction_connection_type_t_toString(long j, list_view_interaction_connection_type_t list_view_interaction_connection_type_t);

    public static final native int list_view_interaction_connection_type_t_value_get(long j, list_view_interaction_connection_type_t list_view_interaction_connection_type_t);

    public static final native void list_view_interaction_connection_type_t_value_set(long j, list_view_interaction_connection_type_t list_view_interaction_connection_type_t, int i);

    public static final native long mediaFormatBitrateString(int i);

    public static final native String mediaFormatString(int i);

    public static final native long new_AnyEvent__SWIG_0();

    public static final native long new_AnyEvent__SWIG_1(long j, AnyEvent anyEvent);

    public static final native long new_AudioFormat();

    public static final native long new_BaseAnyEvent();

    public static final native long new_BaseAudioPerformanceEvent();

    public static final native long new_CodecFrame();

    public static final native long new_CodecInfo();

    public static final native long new_CustomLogger();

    public static final native long new_Error_Category();

    public static final native long new_Error__SWIG_0(int i, int i2, String str, String str2, String str3, int i3, String str4);

    public static final native long new_Error__SWIG_1(int i, int i2, String str, String str2, String str3, int i3);

    public static final native long new_Error__SWIG_2(int i, int i2, String str, String str2, String str3);

    public static final native long new_Error__SWIG_3(int i, int i2, String str, String str2);

    public static final native long new_Error__SWIG_4(int i, int i2, String str);

    public static final native long new_Error__SWIG_5(int i, int i2);

    public static final native long new_Error__SWIG_6(int i);

    public static final native long new_Error__SWIG_7();

    public static final native long new_MediaCodecDelegate();

    public static final native long new_MediaType__SWIG_0();

    public static final native long new_MediaType__SWIG_1(String str, int i);

    public static final native long new_PlayerConfigurationBuilder();

    public static final native long new_PlayerConfiguration__SWIG_0(String str, String str2, long j, byte b, long j2, boolean z, String str3);

    public static final native long new_PlayerConfiguration__SWIG_1(String str, String str2, long j, byte b, long j2, boolean z);

    public static final native long new_PlayerConfiguration__SWIG_2(String str, String str2, long j, byte b, long j2);

    public static final native long new_PlayerConfiguration__SWIG_3(String str, String str2, long j, byte b, long j2, boolean z, String str3, boolean z2, boolean z3);

    public static final native long new_PlayerConfiguration__SWIG_4();

    public static final native long new_PlayerListener();

    public static final native long new_Player__SWIG_0();

    public static final native long new_Player__SWIG_1(long j, PlayerConfiguration playerConfiguration, long j2, PlayerListener playerListener);

    public static final native long new_PropertyAnyEvent();

    public static final native long new_PropertyAppState();

    public static final native long new_PropertyInt64();

    public static final native long new_PropertyPreloaded();

    public static final native long new_PropertyRequiredSecureUri();

    public static final native long new_PropertySecureUri();

    public static final native long new_PropertyString();

    public static final native long new_UriStringSanitizer();

    public static final native long new_VectorChar__SWIG_0();

    public static final native long new_VectorChar__SWIG_1(long j);

    public static final native long new_VectorMediaType__SWIG_0();

    public static final native long new_VectorMediaType__SWIG_1(long j);

    public static final native long new_ad_delivery_connection_type_t__SWIG_0(int i);

    public static final native long new_ad_delivery_connection_type_t__SWIG_1();

    public static final native long new_ad_opportunity_connection_type_t__SWIG_0(int i);

    public static final native long new_ad_opportunity_connection_type_t__SWIG_1();

    public static final native long new_ad_request_connection_type_t__SWIG_0(int i);

    public static final native long new_ad_request_connection_type_t__SWIG_1();

    public static final native long new_audio_action_t__SWIG_0(int i);

    public static final native long new_audio_action_t__SWIG_1();

    public static final native long new_audio_app_state_t__SWIG_0(int i);

    public static final native long new_audio_app_state_t__SWIG_1();

    public static final native long new_audio_audio_quality_mode_t__SWIG_0(int i);

    public static final native long new_audio_audio_quality_mode_t__SWIG_1();

    public static final native long new_audio_connection_type_t__SWIG_0(int i);

    public static final native long new_audio_connection_type_t__SWIG_1();

    public static final native long new_audio_error_app_state_t__SWIG_0(int i);

    public static final native long new_audio_error_app_state_t__SWIG_1();

    public static final native long new_audio_error_audio_quality_mode_t__SWIG_0(int i);

    public static final native long new_audio_error_audio_quality_mode_t__SWIG_1();

    public static final native long new_audio_error_entity_type_t__SWIG_0(int i);

    public static final native long new_audio_error_entity_type_t__SWIG_1();

    public static final native long new_audio_error_quality_t__SWIG_0(int i);

    public static final native long new_audio_error_quality_t__SWIG_1();

    public static final native long new_audio_interruption_connection_type_t__SWIG_0(int i);

    public static final native long new_audio_interruption_connection_type_t__SWIG_1();

    public static final native long new_audio_pause_reason_t__SWIG_0(int i);

    public static final native long new_audio_pause_reason_t__SWIG_1();

    public static final native long new_audio_performance();

    public static final native long new_audio_performance_app_state_t__SWIG_0(int i);

    public static final native long new_audio_performance_app_state_t__SWIG_1();

    public static final native long new_audio_performance_audio_quality_mode_t__SWIG_0(int i);

    public static final native long new_audio_performance_audio_quality_mode_t__SWIG_1();

    public static final native long new_audio_performance_entity_type_t__SWIG_0(int i);

    public static final native long new_audio_performance_entity_type_t__SWIG_1();

    public static final native long new_audio_performance_preloaded_t__SWIG_0(int i);

    public static final native long new_audio_performance_preloaded_t__SWIG_1();

    public static final native long new_audio_performance_quality_t__SWIG_0(int i);

    public static final native long new_audio_performance_quality_t__SWIG_1();

    public static final native long new_audio_policy_t__SWIG_0(int i);

    public static final native long new_audio_policy_t__SWIG_1();

    public static final native long new_audio_quality_t__SWIG_0(int i);

    public static final native long new_audio_quality_t__SWIG_1();

    public static final native long new_audio_trigger_t__SWIG_0(int i);

    public static final native long new_audio_trigger_t__SWIG_1();

    public static final native long new_click_connection_type_t__SWIG_0(int i);

    public static final native long new_click_connection_type_t__SWIG_1();

    public static final native long new_error_message();

    public static final native long new_foreground_connection_type_t__SWIG_0(int i);

    public static final native long new_foreground_connection_type_t__SWIG_1();

    public static final native long new_impression_connection_type_t__SWIG_0(int i);

    public static final native long new_impression_connection_type_t__SWIG_1();

    public static final native long new_item_interaction_action_t__SWIG_0(int i);

    public static final native long new_item_interaction_action_t__SWIG_1();

    public static final native long new_item_interaction_connection_type_t__SWIG_0(int i);

    public static final native long new_item_interaction_connection_type_t__SWIG_1();

    public static final native long new_item_interaction_link_type_t__SWIG_0(int i);

    public static final native long new_item_interaction_link_type_t__SWIG_1();

    public static final native long new_list_view_interaction_action_t__SWIG_0(int i);

    public static final native long new_list_view_interaction_action_t__SWIG_1();

    public static final native long new_list_view_interaction_connection_type_t__SWIG_0(int i);

    public static final native long new_list_view_interaction_connection_type_t__SWIG_1();

    public static final native long new_offline_sync_connection_type_t__SWIG_0(int i);

    public static final native long new_offline_sync_connection_type_t__SWIG_1();

    public static final native long new_offline_sync_quality_t__SWIG_0(int i);

    public static final native long new_offline_sync_quality_t__SWIG_1();

    public static final native long new_pageview_connection_type_t__SWIG_0(int i);

    public static final native long new_pageview_connection_type_t__SWIG_1();

    public static final native long new_pageview_navigation_type_t__SWIG_0(int i);

    public static final native long new_pageview_navigation_type_t__SWIG_1();

    public static final native long new_property_error__SWIG_0(String str);

    public static final native long new_rich_media_stream_action_t__SWIG_0(int i);

    public static final native long new_rich_media_stream_action_t__SWIG_1();

    public static final native long new_rich_media_stream_connection_type_t__SWIG_0(int i);

    public static final native long new_rich_media_stream_connection_type_t__SWIG_1();

    public static final native long new_rich_media_stream_error_connection_type_t__SWIG_0(int i);

    public static final native long new_rich_media_stream_error_connection_type_t__SWIG_1();

    public static final native long new_rich_media_stream_pause_reason_t__SWIG_0(int i);

    public static final native long new_rich_media_stream_pause_reason_t__SWIG_1();

    public static final native long new_rich_media_stream_performance_connection_type_t__SWIG_0(int i);

    public static final native long new_rich_media_stream_performance_connection_type_t__SWIG_1();

    public static final native long new_rich_media_stream_trigger_t__SWIG_0(int i);

    public static final native long new_rich_media_stream_trigger_t__SWIG_1();

    public static final native long new_state_change();

    public static final native long new_stats_view_metric_t__SWIG_0(int i);

    public static final native long new_stats_view_metric_t__SWIG_1();

    public static final native long new_stats_view_type_t__SWIG_0(int i);

    public static final native long new_stats_view_type_t__SWIG_1();

    public static final native int offline_sync_connection_type_t_get_value(long j, offline_sync_connection_type_t offline_sync_connection_type_t);

    public static final native long offline_sync_connection_type_t_name_get();

    public static final native String offline_sync_connection_type_t_toString(long j, offline_sync_connection_type_t offline_sync_connection_type_t);

    public static final native int offline_sync_connection_type_t_value_get(long j, offline_sync_connection_type_t offline_sync_connection_type_t);

    public static final native void offline_sync_connection_type_t_value_set(long j, offline_sync_connection_type_t offline_sync_connection_type_t, int i);

    public static final native int offline_sync_quality_t_get_value(long j, offline_sync_quality_t offline_sync_quality_t);

    public static final native long offline_sync_quality_t_name_get();

    public static final native String offline_sync_quality_t_toString(long j, offline_sync_quality_t offline_sync_quality_t);

    public static final native int offline_sync_quality_t_value_get(long j, offline_sync_quality_t offline_sync_quality_t);

    public static final native void offline_sync_quality_t_value_set(long j, offline_sync_quality_t offline_sync_quality_t, int i);

    public static final native int pageview_connection_type_t_get_value(long j, pageview_connection_type_t pageview_connection_type_t);

    public static final native long pageview_connection_type_t_name_get();

    public static final native String pageview_connection_type_t_toString(long j, pageview_connection_type_t pageview_connection_type_t);

    public static final native int pageview_connection_type_t_value_get(long j, pageview_connection_type_t pageview_connection_type_t);

    public static final native void pageview_connection_type_t_value_set(long j, pageview_connection_type_t pageview_connection_type_t, int i);

    public static final native int pageview_navigation_type_t_get_value(long j, pageview_navigation_type_t pageview_navigation_type_t);

    public static final native long pageview_navigation_type_t_name_get();

    public static final native String pageview_navigation_type_t_toString(long j, pageview_navigation_type_t pageview_navigation_type_t);

    public static final native int pageview_navigation_type_t_value_get(long j, pageview_navigation_type_t pageview_navigation_type_t);

    public static final native void pageview_navigation_type_t_value_set(long j, pageview_navigation_type_t pageview_navigation_type_t, int i);

    public static final native int rich_media_stream_action_t_get_value(long j, rich_media_stream_action_t rich_media_stream_action_t);

    public static final native long rich_media_stream_action_t_name_get();

    public static final native String rich_media_stream_action_t_toString(long j, rich_media_stream_action_t rich_media_stream_action_t);

    public static final native int rich_media_stream_action_t_value_get(long j, rich_media_stream_action_t rich_media_stream_action_t);

    public static final native void rich_media_stream_action_t_value_set(long j, rich_media_stream_action_t rich_media_stream_action_t, int i);

    public static final native int rich_media_stream_connection_type_t_get_value(long j, rich_media_stream_connection_type_t rich_media_stream_connection_type_t);

    public static final native long rich_media_stream_connection_type_t_name_get();

    public static final native String rich_media_stream_connection_type_t_toString(long j, rich_media_stream_connection_type_t rich_media_stream_connection_type_t);

    public static final native int rich_media_stream_connection_type_t_value_get(long j, rich_media_stream_connection_type_t rich_media_stream_connection_type_t);

    public static final native void rich_media_stream_connection_type_t_value_set(long j, rich_media_stream_connection_type_t rich_media_stream_connection_type_t, int i);

    public static final native int rich_media_stream_error_connection_type_t_get_value(long j, rich_media_stream_error_connection_type_t rich_media_stream_error_connection_type_t);

    public static final native long rich_media_stream_error_connection_type_t_name_get();

    public static final native String rich_media_stream_error_connection_type_t_toString(long j, rich_media_stream_error_connection_type_t rich_media_stream_error_connection_type_t);

    public static final native int rich_media_stream_error_connection_type_t_value_get(long j, rich_media_stream_error_connection_type_t rich_media_stream_error_connection_type_t);

    public static final native void rich_media_stream_error_connection_type_t_value_set(long j, rich_media_stream_error_connection_type_t rich_media_stream_error_connection_type_t, int i);

    public static final native int rich_media_stream_pause_reason_t_get_value(long j, rich_media_stream_pause_reason_t rich_media_stream_pause_reason_t);

    public static final native long rich_media_stream_pause_reason_t_name_get();

    public static final native String rich_media_stream_pause_reason_t_toString(long j, rich_media_stream_pause_reason_t rich_media_stream_pause_reason_t);

    public static final native int rich_media_stream_pause_reason_t_value_get(long j, rich_media_stream_pause_reason_t rich_media_stream_pause_reason_t);

    public static final native void rich_media_stream_pause_reason_t_value_set(long j, rich_media_stream_pause_reason_t rich_media_stream_pause_reason_t, int i);

    public static final native int rich_media_stream_performance_connection_type_t_get_value(long j, rich_media_stream_performance_connection_type_t rich_media_stream_performance_connection_type_t);

    public static final native long rich_media_stream_performance_connection_type_t_name_get();

    public static final native String rich_media_stream_performance_connection_type_t_toString(long j, rich_media_stream_performance_connection_type_t rich_media_stream_performance_connection_type_t);

    public static final native int rich_media_stream_performance_connection_type_t_value_get(long j, rich_media_stream_performance_connection_type_t rich_media_stream_performance_connection_type_t);

    public static final native void rich_media_stream_performance_connection_type_t_value_set(long j, rich_media_stream_performance_connection_type_t rich_media_stream_performance_connection_type_t, int i);

    public static final native int rich_media_stream_trigger_t_get_value(long j, rich_media_stream_trigger_t rich_media_stream_trigger_t);

    public static final native long rich_media_stream_trigger_t_name_get();

    public static final native String rich_media_stream_trigger_t_toString(long j, rich_media_stream_trigger_t rich_media_stream_trigger_t);

    public static final native int rich_media_stream_trigger_t_value_get(long j, rich_media_stream_trigger_t rich_media_stream_trigger_t);

    public static final native void rich_media_stream_trigger_t_value_set(long j, rich_media_stream_trigger_t rich_media_stream_trigger_t, int i);

    public static final native int sampleRateForFormat(int i);

    public static final native long serializable_event_clone(long j, serializable_event serializable_event);

    public static final native String serializable_event_toJson(long j, serializable_event serializable_event);

    public static final native boolean state_change_buffering_get(long j, state_change state_change);

    public static final native void state_change_buffering_set(long j, state_change state_change, boolean z);

    public static final native long state_change_duration_get(long j, state_change state_change);

    public static final native void state_change_duration_set(long j, state_change state_change, long j2);

    public static final native String state_change_effectiveUri_get(long j, state_change state_change);

    public static final native void state_change_effectiveUri_set(long j, state_change state_change, String str);

    public static final native long state_change_error_get(long j, state_change state_change);

    public static final native void state_change_error_set(long j, state_change state_change, long j2, Error error);

    public static final native int state_change_format_get(long j, state_change state_change);

    public static final native void state_change_format_set(long j, state_change state_change, int i);

    public static final native long state_change_position_get(long j, state_change state_change);

    public static final native void state_change_position_set(long j, state_change state_change, long j2);

    public static final native int state_change_reason_get(long j, state_change state_change);

    public static final native void state_change_reason_set(long j, state_change state_change, int i);

    public static final native boolean state_change_rebuffering_get(long j, state_change state_change);

    public static final native void state_change_rebuffering_set(long j, state_change state_change, boolean z);

    public static final native boolean state_change_seekingInProgress_get(long j, state_change state_change);

    public static final native void state_change_seekingInProgress_set(long j, state_change state_change, boolean z);

    public static final native int state_change_state_get(long j, state_change state_change);

    public static final native void state_change_state_set(long j, state_change state_change, int i);

    public static final native int state_change_streamingProtocol_get(long j, state_change state_change);

    public static final native void state_change_streamingProtocol_set(long j, state_change state_change, int i);

    public static final native String state_change_uri_get(long j, state_change state_change);

    public static final native void state_change_uri_set(long j, state_change state_change, String str);

    public static final native int stats_view_metric_t_get_value(long j, stats_view_metric_t stats_view_metric_t);

    public static final native long stats_view_metric_t_name_get();

    public static final native String stats_view_metric_t_toString(long j, stats_view_metric_t stats_view_metric_t);

    public static final native int stats_view_metric_t_value_get(long j, stats_view_metric_t stats_view_metric_t);

    public static final native void stats_view_metric_t_value_set(long j, stats_view_metric_t stats_view_metric_t, int i);

    public static final native int stats_view_type_t_get_value(long j, stats_view_type_t stats_view_type_t);

    public static final native long stats_view_type_t_name_get();

    public static final native String stats_view_type_t_toString(long j, stats_view_type_t stats_view_type_t);

    public static final native int stats_view_type_t_value_get(long j, stats_view_type_t stats_view_type_t);

    public static final native void stats_view_type_t_value_set(long j, stats_view_type_t stats_view_type_t, int i);

    public static final native String streamingProtocolString(int i);

    private static final native void swig_module_init();
}
