/**
 * Copyright (c) 2013 Armin Töpfer
 *
 * This file is part of ConsensusFixer.
 *
 * ConsensusFixer is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or any later version.
 *
 * ConsensusFixer is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * ConsensusFixer. If not, see <http://www.gnu.org/licenses/>.
 */
package ch.ethz.bsse.cf.utils;

import com.google.common.util.concurrent.AtomicLongMap;
import java.util.Map;

/**
 * @author Armin Töpfer (armin.toepfer [at] gmail.com)
 */
public class Preprocessing {

    private int L;
    private int N = 0;
    private Map<Integer, AtomicLongMap> alignmentReads;

    public Preprocessing(String alignmentPath) {
        alignmentReads = Utils.parseBAMSAM(alignmentPath);
        StatusUpdate.getINSTANCE().println("Uniques\t\t" + alignmentReads.size());
    }

    public Map<Integer, AtomicLongMap> getAlignmentReads() {
        return alignmentReads;
    }
}