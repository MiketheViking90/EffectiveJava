package chap4.item18;

public class Musician implements Singer, Songwriter {

    @Override
    public void sing(Song song) {
        System.out.println(song.getName(););
    }

    @Override
    public Song compose() {
        return new Song("Let it Be");
    }

}
