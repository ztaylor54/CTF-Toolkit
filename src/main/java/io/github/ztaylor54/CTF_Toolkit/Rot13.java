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

public abstract class Rot13 {
    /**
     * An implementation of the ROT13 cipher, one that is commonly used in many CTFs.
     *
     * @param beginningString The string you would like to "encrypt"
     * @return The "encrypted" string
     */
    public static String rot13(String beginningString) {
        String endString = "";
        for (char i : beginningString.toCharArray()) {
            if ((i >= 'A' && i <= 'M') || (i >= 'a' && i <= 'm')) {
                endString += (char) (i + 13);
            } else if ((i >= 'N' && i <= 'Z') || (i >= 'n' && i <= 'z')) {
                endString += (char) (i - 13);
            } else {
                endString += i;
            }
        }
        return endString;
    }
}
