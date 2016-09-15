public class SpaceAge {
    private enum Planet {
        EARTH   (31557600),
        MERCURY (0.2408467),
        VENUS   (0.61519726),
        MARS    (1.8808158),
        JUPITER (11.862615),
        SATURN  (29.447498),
        URANUS  (84.016846),
        NEPTUNE (164.79132);

        private double orbital; // Relative to Earth years

        Planet(double orbital) {
            this.orbital = orbital;
        }

        private double orbital() {
            return this.orbital;
        }
    }
    private final double ageSeconds;

    public SpaceAge(double seconds) {
        ageSeconds = seconds;
    }

    public double getSeconds() {
        return this.ageSeconds;
    }

    public double onMercury() {
        return onEarth() / Planet.MERCURY.orbital();
    }

    public double onVenus() {
        return onEarth() / Planet.VENUS.orbital();
    }

    public double onEarth() {
        return getSeconds() / Planet.EARTH.orbital();
    }

    public double onMars() {
        return onEarth() / Planet.MARS.orbital();
    }

    public double onJupiter() {
        return onEarth() / Planet.JUPITER.orbital();
    }

    public double onSaturn() {
        return onEarth() / Planet.SATURN.orbital();
    }

    public double onUranus() {
        return onEarth() / Planet.URANUS.orbital();
    }

    public double onNeptune() {
        return onEarth() / Planet.NEPTUNE.orbital();
    }
}
