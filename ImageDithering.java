package topCoderAlgos;/*
* This program is based on a concept of real world Image Dithering which
* works by mixing more than one solid unique color elements(pixels) and
* generating new color elements from the same.
* This program checks for unique dithered elements in the screen and
* returns the result*/

public class ImageDithering {
    private int netCount = 0;

    public int count(String dithered, String[] screen) {
        char ditherChar[] = dithered.toCharArray();
        for (String element : screen) {

            char elementToChar[] = element.toCharArray();

            for (int eachChar = 0; eachChar < elementToChar.length; eachChar++)
                for (char eachDither : ditherChar)
                    if (eachDither == elementToChar[eachChar]) netCount++;


        }

        return netCount;
    }
}
