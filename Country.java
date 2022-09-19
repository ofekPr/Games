public class Country   {
    private String countryName;
    private Game[] games;

    public Country(String countryName) {
        this.countryName = countryName;
        this.games = new Game[43];
        for (int i = 0; i < this.games.length; i++) {
            this.games[i] = null;
        }
    }

    public Country(Country anotherCountry) {
        this.countryName = anotherCountry.countryName;
        this.games = new Game[anotherCountry.games.length];
        for (int i = 0; i < anotherCountry.games.length; i++) {
            this.games[i] = anotherCountry.games[i];
        }
    }

    public String getCountryName() {  return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }
    public Game[] getGames() { return games; }

    public boolean hasGame(String gameName) {
        for (int i = 0; i < games.length; i++) {
            if (games[i] != null) {
                if (games[i].getGameName().equals(gameName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
