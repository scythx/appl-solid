package io.github.raefaldhia.a;

import io.github.raefaldhia.a.models.File;
import io.github.raefaldhia.a.models.Music;
import io.github.raefaldhia.a.models.StreamProgressInfo;

public class Startup {
    public static void main(final String[] args) {
        final StreamProgressInfo
        stramFileInfo = new StreamProgressInfo(new File("Test", 12, 12));
        
        final StreamProgressInfo
        stramMusicInfo = new StreamProgressInfo(new Music("Some name", "Cool", 15, 2222));

        System.out.println(stramFileInfo.CalculateCurrentPercent());
        System.out.println(stramMusicInfo.CalculateCurrentPercent());   
    }
}