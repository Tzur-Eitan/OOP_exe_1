public enum Season {
    WINTER, SPRING, SUMMER, FALL;
    // TODO: Add auxiliary functions.
    public static Season getNext(Season season) {
        Season[] seasons = Season.values();
        int i = 0;
        for (; seasons[i] != season; i++){
        }
        i++;
        i %= seasons.length;
        return seasons[i];
    }
}
