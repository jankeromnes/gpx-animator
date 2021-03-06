/*
 *  Copyright 2019 Martin Ždila, Freemap Slovakia
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

import com.drew.lang.annotations.NotNull;

import java.util.Locale;
import java.util.Objects;

public final class TrackIcon {

    @NotNull
    private final String name;

    public TrackIcon(@NotNull final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackIcon trackIcon = (TrackIcon) o;
        return Objects.equals(name, trackIcon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public String getFilename() {
        return "/trackicons/"
                .concat(name.toLowerCase(Locale.getDefault()))
                .concat(".png");
    }

}
