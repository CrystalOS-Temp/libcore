/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package test.java.lang.Math;

import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Common library for additional constants of the {@code double} type.
 */
public final class DoubleConsts {

    /**
     * Don't let anyone instantiate this class.
     */
    private DoubleConsts() {
    }

    /**
     * Bias used in representing a {@code double} exponent.
     */
    public static final int EXP_BIAS = jdk.internal.math.DoubleConsts.EXP_BIAS;

    /**
     * Bit mask to isolate the exponent field of a {@code double}.
     */
    public static final long EXP_BIT_MASK = jdk.internal.math.DoubleConsts.EXP_BIT_MASK;

    /**
     * Bit mask to isolate the sign bit of a {@code double}.
     */
    public static final long SIGN_BIT_MASK = jdk.internal.math.DoubleConsts.SIGN_BIT_MASK;

    /**
     * Bit mask to isolate the significand field of a {@code double}.
     */
    public static final long SIGNIF_BIT_MASK = jdk.internal.math.DoubleConsts.SIGNIF_BIT_MASK;

    /**
     * The number of logical bits in the significand of a {@code double} number, including the
     * implicit bit.
     */
    public static final int SIGNIFICAND_WIDTH = jdk.internal.math.DoubleConsts.SIGNIFICAND_WIDTH;

    /**
     * The exponent the smallest positive {@code double} subnormal value would have if it could be
     * normalized.
     */
    public static final int MIN_SUB_EXPONENT = jdk.internal.math.DoubleConsts.MIN_SUB_EXPONENT;

    @Test
    public void testDoubleConstants() {
        Assert.assertEquals((SIGN_BIT_MASK | EXP_BIT_MASK | SIGNIF_BIT_MASK), ~0L);
        Assert.assertEquals((SIGN_BIT_MASK & EXP_BIT_MASK), 0L);
        Assert.assertEquals((SIGN_BIT_MASK & SIGNIF_BIT_MASK), 0L);
        Assert.assertEquals((EXP_BIT_MASK & SIGNIF_BIT_MASK), 0L);
    }
}
