package io.github.ztaylor54.CTF_Toolkit;

/*
CTF Toolkit - Useful Tools for CTF Competitions

Copyright (C) 2015 by Zachary Taylor <ztaylor54@gmail.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest {
    @Test
    public void constructor() {
        CaesarCipher caesarCipher = new CaesarCipher();
    }
    
    @Test
    public void rot26() {
        String str = "rot26 this";
        String rotated = CaesarCipher.caesar(26, str);
        assertEquals("rot26 this", rotated);
    }

    @Test
    public void rot13() {
        String str = "ROT13 this";
        String rotated = CaesarCipher.caesar(13, str);
        assertEquals("EBG13 guvf", rotated);
    }

    @Test
    public void rot256() {
        String str = "ROT256 this";
        String rotated = CaesarCipher.caesar(256, str);
        assertEquals("NKP256 pdeo", rotated);
    }
}
