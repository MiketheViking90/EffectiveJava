package chap4.item18;

import lombok.Getter;

public final class Song {

    @Getter
    private final String name;

    public Song(String name) {
        this.name = name;
    }

}
