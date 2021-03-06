/**
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.video.kit.demo.utils;

/**
 * Constant class
 */
public class Constants {
    /**
     * The current data
     */
    public static final String VIDEO_PLAY_DATA = "video_play_data";

    /**
     * The delay time
     */
    public static final long DELAY_MILLIS_500 = 500;

    public static final long DELAY_MILLIS_3000 = 3000;

    public static final long DELAY_MILLIS_1000 = 1000;

    /**
     * Under the vertical screen SurfaceView height
     */
    public static final float HEIGHT_DP = 300;

    /**
     * present Current Position
     */
    public static final int PLAYING_WHAT = 1;

    /**
     * After the completion of the play status update button
     */
    public static final int UPDATE_PLAY_STATE = 4;

    /**
     * Receive the onError news out of the current page
     */
    public static final int PLAY_ERROR_FINISH = 5;

    /**
     * Switch bitrate
     */
    public static final int PLAYER_SWITCH_STOP_REQUEST_STREAM = 7;

    /**
     * Setting
     */
    public static final int MSG_SETTING = 8;

    /**
     * Switch speed
     */
    public static final int PLAYER_SWITCH_PLAY_SPEED = 9;

    /**
     * Switch bitrate
     */
    public static final int PLAYER_SWITCH_BITRATE = 10;

    /**
     * Smooth/Designated cutting rate
     */
    public static final int PLAYER_SWITCH_AUTO_DESIGNATED = 11;

    /**
     * Set the bandwidth adaptive switch
     */
    public static final int PLAYER_SWITCH_BANDWIDTH_MODE = 12;

    /**
     * Switch the audio and video
     */
    public static final int PLAYER_SWITCH_PLAY_MODE = 13;

    /**
     * Set the looping
     */
    public static final int PLAYER_SWITCH_LOOP_PLAY_MODE = 14;

    /**
     * Set the mute
     */
    public static final int PLAYER_SWITCH_VIDEO_MUTE_MODE = 15;

    /**
     * Set the video type
     */
    public static final int PLAYER_SWITCH_VIDEO_MODE = 0;

    /**
     * Set the play View
     */
    public static final int PLAYER_SWITCH_VIDEO_VIEW = 1;

    /**
     * Set the mute
     */
    public static final int PLAYER_SWITCH_VIDEO_MUTE = 3;

    /**
     * Set the play mode
     */
    public static final int PLAYER_SWITCH_VIDEO_PLAY = 4;

    /**
     * Set the bandwidth adaptive
     */
    public static final int PLAYER_SWITCH_BANDWIDTH = 5;

    /**
     * Set the bitrate
     */
    public static final int PLAYER_SWITCH_INIT_BANDWIDTH = 6;

    /**
     * Set off the logo
     */
    public static final int PLAYER_SWITCH_CLOSE_LOGO = 7;

    /**
     * Close the logo under the influence of all the sources or sources
     */
    public static final int PLAYER_SWITCH_CLOSE_LOGO_EFFECT = 8;

    /**
     * The first options dialog
     */
    public static final int DIALOG_INDEX_ONE = 0;

    /**
     * The second options dialog
     */
    public static final int DIALOG_INDEX_TWO = 1;

    /**
     * Set play type live
     */
    public static final int VIDEO_TYPE_LIVE = 1;

    /**
     * Set play type demand
     */
    public static final int VIDEO_TYPE_ON_DEMAND = 0;

    /**
     * Url type
     */
    public static class UrlType {
        /**
         * A single play address
         */
        public static final int URL = 0;

        /**
         * Multiple play address
         */
        public static final int URL_MULTIPLE = 1;

        /**
         * Huawei managed video address
         */
        public static final int URL_JSON = 2;
    }
}
