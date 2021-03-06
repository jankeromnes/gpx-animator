/*
 *  Copyright 2013 Martin Ždila, Freemap Slovakia
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package sk.freemap.gpxAnimator;

import java.io.Serializable;

public class LatLon implements Serializable {

    private static final long serialVersionUID = 7961146252499979058L;

    private final double lat;

    private final double lon;

    private final long time;

    public LatLon(final double lat, final double lon, final long time) {
        this.lat = lat;
        this.lon = lon;
        this.time = time;
    }

    public final double getLat() {
        return lat;
    }

    public final double getLon() {
        return lon;
    }

    public final long getTime() {
        return time;
    }

}
