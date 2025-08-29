public class Song {
    public static void main(String[] args) {
        /*This code is dedicated for my love one.
        I love you so much babyyy*/
        
        // Lines of the song
        String[] lyrics = {
            //Verse 1
            "You are the candle, love's the flame",
            "",
            "A fire that burns through wind and rain",
            "Shine your light on this heart of mine",
            "'Til the end of time",
            "You came to me like the dawn through the night",
            "Just shinin' like the sun",
            "Out of my dreams and into my life",
            "You are the one, you are the one",
            "",
            //Chorus
            "Said I loved you, but I lied",
            "'Cause this is more than love I feel inside",
            "Said I loved you, but I was wrong",
            "'Cause love could never ever feel so strong",
            "Said I loved you, but I lied",
            "",
            //Verse 2
            "With all my soul I've tried in vain",
    "How can mere words my heart explain",
    "This taste of heaven so deep, so true",
    "I've found in you",
    "So many reasons in so many ways",
    "My life has just begun, yeah",
    "Need you forever and I need you to stay",
    "You are the one, you are the one",
    "",
    //Chorus
    "Said I loved you, but I lied",
    "'Cause this is more than love I feel inside",
    "Said I loved you, but I was wrong",
    "'Cause love could never ever feel so strong",
    "I said I loved you, but I lied",
    "",
    //Bridge
    "You came to me like the dawn through the night",
    "Just shinin' like the sun",
    "Out of my dreams and into my life",
    "You are the one, you are the one",
    "",
    //Chorus
    "Said I loved you, but I lied (said I loved you, but I lied)",
    "'Cause this is more than love I feel inside (said I loved you, but I lied)",
    "Said I loved you, but I was wrong (said I loved you, but I'm wrong)",
    "'Cause love could never ever feel so strong",
    //Outro
    "Said I loved you (said I loved you)",
    "'Cause this is more than love I feel inside",
    "Said I loved you, but I lied"
        };

        // Set delays for each lines (in milliseconds)
        int[] delays = {
            3930, 2090, 6100, 6790, 5220, 4730, 7280, 4400, 7420, 3460, 5710, 6460, 5600, 6290, 4170, 4530, 6240, 6040, 6100, 5710, 4750, 7250, 5070, 6860, 3350, 5620, 6250, 5790, 6380, 4380, 25660, 4540, 7230, 4900, 5740, 3150, 5780, 6220, 6190, 5660, 3050, 6310
        };

        try {
            for (int i = 0; i < lyrics.length; i++) {
                System.out.println(lyrics[i]);
                Thread.sleep(delays[i]); // Pause before the next line occur
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}