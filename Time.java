package topCoderAlgos;/*
*Class topCoderAlgos.Time takes CPU time and breaks it into
* hours,minutes and seconds.It further presents it
* in human readable format
*/

public class Time  {
    public String convertMachineTime(int seconds) {
        short calHr, calMin, calMinSec;
        calHr = (short) (seconds / (60 * 60));
        calMinSec = (short) (seconds / 60);
        calMin = (short) (calMinSec - (calHr * 60));
        seconds = (short) (seconds % 3600);
        seconds = seconds % 60;

        return String.format("%d:%d:%d", calHr, calMin, seconds);
    }
}

