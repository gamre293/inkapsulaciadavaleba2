public class WeatherForecast {
    private String cityName;
    private double windSpeed;
    private double rainPercentage;
    private boolean willRain;
    private boolean isCloudy;
    private boolean isSunny;

    public WeatherForecast(String cityName, double windSpeed, double rainPercentage, boolean willRain, boolean isCloudy, boolean isSunny) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.willRain = willRain;
        this.isCloudy = isCloudy;
        this.isSunny = isSunny;
    }

    public String getCityName() {
        return cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getRainPercentage() {
        return rainPercentage;
    }

    public boolean isWillRain() {
        return willRain;
    }

    public boolean isCloudy() {
        return isCloudy;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setRainPercentage(double rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public void setWillRain(boolean willRain) {
        this.willRain = willRain;
    }

    public void setCloudy(boolean cloudy) {
        isCloudy = cloudy;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }

    public void printWeatherForecast() {
        System.out.println("Weather Forecast for " + cityName + ":");
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Rain Percentage: " + rainPercentage + "%");
        System.out.println("Will it rain: " + (willRain ? "Yes" : "No"));
        System.out.println("Is it cloudy: " + (isCloudy ? "Yes" : "No"));
        System.out.println("Is it sunny: " + (isSunny ? "Yes" : "No"));
    }

    public boolean recommendForWalk() {
        if (!willRain && isSunny && windSpeed < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        WeatherForecast forecast = new WeatherForecast("Springfield", 15.5, 20.0, false, true, true);
        forecast.printWeatherForecast();
        System.out.println("Recommended for a walk: " + (forecast.recommendForWalk() ? "Yes" : "No"));
    }
}
