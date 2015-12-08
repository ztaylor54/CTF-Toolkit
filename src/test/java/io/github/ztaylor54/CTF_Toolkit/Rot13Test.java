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

public class Rot13Test {
    @Test
    public void upperCaseAToM() {
        String str = "ABCDEFGHIJKLM";
        String rotated = Rot13.rot13(str);
        assertEquals("NOPQRSTUVWXYZ", rotated);
    }

    @Test
    public void upperCaseNToZ() {
        String str = "NOPQRSTUVWXYZ";
        String rotated = Rot13.rot13(str);
        assertEquals("ABCDEFGHIJKLM", rotated);
    }

    @Test
    public void lowerCaseAToM() {
        String str = "abcdefghijklm";
        String rotated = Rot13.rot13(str);
        assertEquals("nopqrstuvwxyz", rotated);
    }

    @Test
    public void lowerCaseNToZ() {
        String str = "nopqrstuvwxyz";
        String rotated = Rot13.rot13(str);
        assertEquals("abcdefghijklm", rotated);
    }
}
