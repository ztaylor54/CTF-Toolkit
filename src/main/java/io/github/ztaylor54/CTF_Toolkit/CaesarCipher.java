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

public class CaesarCipher {
    /**
     * An implementation of the Caesar cipher, one that is commonly used in many CTFs.
     *
     * @param beginningString The string you would like to "encrypt"
     * @return The "encrypted" string
     */
    public static String caesar(int amount, String beginningString) {
        String endString = "";
        amount = amount % 26;
        if (amount == 0) return beginningString;
        for (char i : beginningString.toCharArray()) {
            if (Character.isAlphabetic(i)) {
                char newCharacter = (char) (i + amount);
                if ((Character.isLowerCase(i) && !Character.isLowerCase(newCharacter))) {
                    newCharacter = (char) ('a' - 1 + (newCharacter - 'z'));
                } else if ((Character.isUpperCase(i) && !Character.isUpperCase(newCharacter))) {
                    newCharacter = (char) ('A' - 1 + (newCharacter - 'Z'));
                }
                endString += newCharacter;
            } else {
                endString += i;
            }
        }
        return endString;
    }
}
